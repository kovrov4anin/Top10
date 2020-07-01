
package ru.kovrov4anin.top10.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facet {

    @SerializedName("anchor")
    @Expose
    private String anchor;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("label_with_op")
    @Expose
    private String labelWithOp;

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabelWithOp() {
        return labelWithOp;
    }

    public void setLabelWithOp(String labelWithOp) {
        this.labelWithOp = labelWithOp;
    }

}
