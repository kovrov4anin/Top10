
package ru.kovrov4anin.top10.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CseImage {

    @SerializedName("src")
    @Expose
    private String src;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

}
