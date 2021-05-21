package com.shalithagamage.gnews.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Headlines {

    @SerializedName("totalArticles")
    @Expose
    private String totalArticles;

    @SerializedName("articles")
    @Expose
    private List<Articles> articles;

    public String getTotalArticles() {
        return totalArticles;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setTotalArticles(String totalArticles) {
        this.totalArticles = totalArticles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }
}
