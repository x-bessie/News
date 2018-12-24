package entity;

/**
 * Newsapi 的everything请求
 */
public class Everything {
//    发布作者
    public  String author;
//    新闻标题
    public  String title;
//    新闻链接
    public  String url;
//    新闻发布时间
    public  String publishedAt;
//    新闻图片
    public  String urlToImage;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "Everything{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                '}';
    }
}
