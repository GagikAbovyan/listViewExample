package ru.startandroid.week2homework1;

public class Food {
    private final String uriPhoto;
    private final String title;
    private final String info;
    private final String star;
    private final String wiki;


    public Food(String uriPhoto, String title, String info, String star, String wiki) {
        this.uriPhoto = uriPhoto;
        this.title = title;
        this.info = info;
        this.star = star;
        this.wiki = wiki;
    }

    public String getUriPhoto() {
        return uriPhoto;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public String getStar() {
        return star;
    }

    public String getWiki() {
        return wiki;
    }
}
