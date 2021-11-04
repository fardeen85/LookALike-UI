package com.example.lookalikeui.Pojo;

public class Pojo {


    String img_thumb;
    String content_src;
    String Title;
    String news_desc;

    public Pojo(String img_thumb, String content_src, String title, String news_desc, String newslogo, String newcat, String news_date) {
        this.img_thumb = img_thumb;
        this.content_src = content_src;
        Title = title;
        this.news_desc = news_desc;
        this.newslogo = newslogo;
        this.newcat = newcat;
        this.news_date = news_date;
    }

    String newslogo;
    String newcat;
    String news_date;


    public String getImg_thumb() {
        return img_thumb;
    }

    public void setImg_thumb(String img_thumb) {
        this.img_thumb = img_thumb;
    }

    public String getContent_src() {
        return content_src;
    }

    public void setContent_src(String content_src) {
        this.content_src = content_src;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getNews_desc() {
        return news_desc;
    }

    public void setNews_desc(String news_desc) {
        this.news_desc = news_desc;
    }

    public String getNewslogo() {
        return newslogo;
    }

    public void setNewslogo(String newslogo) {
        this.newslogo = newslogo;
    }

    public String getNewcat() {
        return newcat;
    }

    public void setNewcat(String newcat) {
        this.newcat = newcat;
    }

    public String getNews_date() {
        return news_date;
    }

    public void setNews_date(String news_date) {
        this.news_date = news_date;
    }



}
