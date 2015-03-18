package com.example.qudusanimashaun.interactivestory.model;

/**
 * Created by qudusanimashaun on 17/03/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setText(String text) {
        mText = text;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
