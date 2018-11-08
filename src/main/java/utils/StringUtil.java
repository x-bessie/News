package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 基于关键词的检索设置
 * 传入搜索参数的设置
 */
public class StringUtil {
    public static void main(String[] args) {
        //(北京|东城区|雄安)+((造谣|炒作)+(丑闻|事故))+报道
        //getKeyWord("(报纸|微博)+(造谣|炒作|不实报道)");
/*		StringUtil su = new StringUtil();
		su.analysisMatch("抄袭|假学术|假研究+捏造", "", "");*/
/*		String j = "(abcdefghijklmnopqrstxwyzv";
		System.out.println(j.charAt(0));
		char c = j.charAt(0);
		char f = '(';
		System.out.println(f == c);*/

        List<String> list = parse("丑闻 事故");
        for(String str:list){
            System.out.println(str);
        }

    }



    /**
     * 传入“（XX+XX）| XX”格式的字符串
     * @param formula
     * @return
     */
    public static List<String> parse(String formula){
        Stack<String> stack = new Stack<String>();
        int i = 0;
        for(i = 0; i< formula.length();i++){
            Character c = formula.charAt(i);
            if(c == '('){
                stack.push("(");
            }else if(c == ')'){
                stack.pop();
            }else if(c == '+'){
                if(stack.size() == 0)
                    break;
            }else if(c == '|'){
                if(stack.size() == 0)
                    break;
            }
        }
        if(i != 0 && i< formula.length()){
            String b = formula.substring(0, i).trim();
            //如果有括号，去除括号
            if(b != null && b != "" && b.charAt(0) == '(' && b.charAt(b.length() - 1) == ')'){
                b = b.substring(1, b.length() - 1);
            }
            List<String> formatBefore = new ArrayList<String>();
            formatBefore = parse(b);

            String e = formula.substring(i + 1).trim();
            List<String> formatLast = new ArrayList<String>();
            formatLast = parse(e);

            return operation(formatBefore, formatLast, formula.charAt(i));
        }else{
            String b = formula;
            //如果有括号，去除括号
            if(b != null && b != "" && b.charAt(0) == '(' && b.charAt(b.length() - 1) == ')'){
                b = b.substring(1, b.length() - 1).trim();
                return parse(b);
            }else {
                List<String> list = new ArrayList<String>();
                list.add(formula);
                return list;
            }
        }
    }

    /**
     * 两个列表的操作
     * @param b 前一个列表
     * @param e 后一个列表
     * @param oper  操作符
     * @return
     */
    public static List<String> operation(List<String> b, List<String> e, char oper){
        if(oper == '+'){
            return listAnd(b, e);
        }else{
            return listOr(b, e);
        }
    }

    //与列表
    public static List<String> listAnd(List<String> b, List<String> e){
        List<String> list = new ArrayList<String>();
        for (String bstr : b) {
            for(String estr: e){
                list.add(bstr + "+" + estr);
            }
        }
        return list;
    }

    //合并列表
    public static List<String> listOr(List<String> b, List<String> e){
        List<String> list = new ArrayList<String>();
        for(String bstr:b){
            list.add(bstr);
        }
        for(String estr:e){
            list.add(estr);
        }
        return list;
    }
}