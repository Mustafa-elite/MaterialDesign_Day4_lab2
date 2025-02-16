package com.example.lab4a;

public class Mobile {

    private String mobileName;
    private String mobileDescription;
    private int image,icon;

    public Mobile(String mobileName, String mobileDescription, int image, int icon) {
        this.mobileName = mobileName;
        this.mobileDescription = mobileDescription;
        this.image = image;
        this.icon = icon;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileDescription() {
        return mobileDescription;
    }

    public void setMobileDescription(String mobileDescription) {
        this.mobileDescription = mobileDescription;
    }


}
