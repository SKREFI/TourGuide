package com.skrefi.tourguide;

public class Place {
    //The name of the Location
    private String mName;
    //Link to the web site
    private String mLink;
    //A short description
    private String mDescription;
    //Main image
    private int mImageRes = NO_IMAGE_PROVIDED;


    //Constant for no image being provided for the object
    private static final int NO_IMAGE_PROVIDED = -1;

    //Without the image (Not planing to make somethign without an image but let it be here just in case
    public Place(int ImageRes, String name, String link, String description) {
        mImageRes = ImageRes;
        mName = name;
        mLink = link;
        mDescription = description;
    }

    //With the image
    public Place(String name, String link, String description, int imageRes) {
        mName = name;
        mLink = link;
        mDescription = description;
        mImageRes = imageRes;
    }

    public int getImageRes() {
        return mImageRes;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getName() {
        return mName;
    }

    public String getLink() {
        return mLink;
    }
}
