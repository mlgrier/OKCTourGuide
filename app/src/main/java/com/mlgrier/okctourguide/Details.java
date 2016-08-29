package com.mlgrier.okctourguide;

/**
 * Created by mlgrier on 8/29/16.
 */
public class Details {

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    //Audio resource ID for the word
    private int mAudioResourceId;

    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = 0;

    public Details(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Details(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    // Return the audio resource ID of the word
    public int getAudioResourceId(){ return mAudioResourceId; }
}
