package com.human;

public class human {

/**
     * accessor
     */
    int getHeight()
    {
        return this.height;
    }

    /**
     * pass argument
     */
    void growHeight(int h)
    {
        this.height = this.height + h;
    }

    int height;
}
