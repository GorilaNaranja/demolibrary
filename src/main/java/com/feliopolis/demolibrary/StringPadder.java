package com.feliopolis.demolibrary;

public interface StringPadder {
 
    String padLeft(String stringToPad, int totalLength);

    String padLeft(String stringToPad, int totalLength, char paddingCharacter);

    String padRight(String stringToPad, int totalLength);

    String padRight(String stringToPad, int totalLength, char paddingCharacter);

}
