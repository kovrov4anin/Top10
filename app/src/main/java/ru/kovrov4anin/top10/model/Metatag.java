
package ru.kovrov4anin.top10.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metatag {

    @SerializedName("viewport")
    @Expose
    private String viewport;
    @SerializedName("moddate")
    @Expose
    private String moddate;
    @SerializedName("creator")
    @Expose
    private String creator;
    @SerializedName("creationdate")
    @Expose
    private String creationdate;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("producer")
    @Expose
    private String producer;
    @SerializedName("og:image")
    @Expose
    private String ogImage;
    @SerializedName("og:type")
    @Expose
    private String ogType;
    @SerializedName("twitter:card")
    @Expose
    private String twitterCard;
    @SerializedName("twitter:title")
    @Expose
    private String twitterTitle;
    @SerializedName("twitter:site")
    @Expose
    private String twitterSite;
    @SerializedName("twitter:description")
    @Expose
    private String twitterDescription;
    @SerializedName("og:title")
    @Expose
    private String ogTitle;
    @SerializedName("og:url")
    @Expose
    private String ogUrl;
    @SerializedName("og:description")
    @Expose
    private String ogDescription;
    @SerializedName("twitter:image")
    @Expose
    private String twitterImage;
    @SerializedName("fullbanner")
    @Expose
    private String fullbanner;

    public String getViewport() {
        return viewport;
    }

    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    public String getModdate() {
        return moddate;
    }

    public void setModdate(String moddate) {
        this.moddate = moddate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getOgImage() {
        return ogImage;
    }

    public void setOgImage(String ogImage) {
        this.ogImage = ogImage;
    }

    public String getOgType() {
        return ogType;
    }

    public void setOgType(String ogType) {
        this.ogType = ogType;
    }

    public String getTwitterCard() {
        return twitterCard;
    }

    public void setTwitterCard(String twitterCard) {
        this.twitterCard = twitterCard;
    }

    public String getTwitterTitle() {
        return twitterTitle;
    }

    public void setTwitterTitle(String twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    public String getTwitterSite() {
        return twitterSite;
    }

    public void setTwitterSite(String twitterSite) {
        this.twitterSite = twitterSite;
    }

    public String getTwitterDescription() {
        return twitterDescription;
    }

    public void setTwitterDescription(String twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    public String getOgTitle() {
        return ogTitle;
    }

    public void setOgTitle(String ogTitle) {
        this.ogTitle = ogTitle;
    }

    public String getOgUrl() {
        return ogUrl;
    }

    public void setOgUrl(String ogUrl) {
        this.ogUrl = ogUrl;
    }

    public String getOgDescription() {
        return ogDescription;
    }

    public void setOgDescription(String ogDescription) {
        this.ogDescription = ogDescription;
    }

    public String getTwitterImage() {
        return twitterImage;
    }

    public void setTwitterImage(String twitterImage) {
        this.twitterImage = twitterImage;
    }

    public String getFullbanner() {
        return fullbanner;
    }

    public void setFullbanner(String fullbanner) {
        this.fullbanner = fullbanner;
    }

}
