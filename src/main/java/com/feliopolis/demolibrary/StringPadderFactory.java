package com.feliopolis.demolibrary;

public class StringPadderFactory {

    private StringPadderFactory() {
    }

    public static StringPadder createStringPadder() {
        return new StringPadderImpl();
    }
}
