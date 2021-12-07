package org.learnwithllew.duplicationkata;


public class Lesson1Straight extends Song {
    public void singCatSong() {
        String[] myStringArray;
        myStringArray = new String[]{"We gave the cat to a little kid",

                "But the cat came back",

                "The very next day",
                "Oh the cat came back",
                "We thought he was a goner",
                "But the cat came back, he just wouldn't go away",
                "We sent the cat out on a boat",

                "But the cat came back",
                "The very next day",
                
                "Oh the cat came back",
                "We thought he was a goner",
                "But the cat came back, he just wouldn't go away"

        };

        for (int j = 0; j < myStringArray.length; j++) {
            sing(myStringArray[j]);
        }
    }
}
