package entity;

/**
 *聚合新闻api
 */
public class Classifiy {
//    新闻发布源
    public String author_name;
//    新闻标题
    public String title;
//    新闻链接
    public String url;
//    新闻分类
    public String category;
//    新闻发布时间
    public String date;

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Classifiy{" +
                "author_name='" + author_name + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
