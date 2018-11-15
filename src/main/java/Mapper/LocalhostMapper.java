package Mapper;

import entity.All;
import entity.BottomLost;
import entity.ScrapyLost;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface LocalhostMapper {

/*  @Insert("${sql}")
  void insertlog(@Param("sql") String sql);

  @Select("${sql}")
  List<Outblogger> getbogideney(@Param("sql") String sql);*/

    @Select("${sql}")
     List<All>  findAllWeibo(@Param("sql") String sql);

    @Select("${sql}")
    public List<BottomLost> queryBottomLost(@Param("sql") String sql);

    @Update("${sql}")

    public List<BottomLost> updateBottomLost(@Param("sql") String sql);

    @Select("${sql}")
    public List<ScrapyLost> queryScrapyLost(@Param("sql") String sql);

    @Update("${sql}")
     int updateScrapyLost(@Param("sql") String sql);

}
