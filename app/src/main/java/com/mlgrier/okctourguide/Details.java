package com.mlgrier.okctourguide;

/**
 * Created by mlgrier on 8/29/16.
 */
public class Details {

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = 0;

    public Details(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Details(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    // Get the default translation of the word.
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Create a new word object
    public int getImageResourceId() { return mImageResourceId; }

    // Returns whether or not there is an image for this word.
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

}
