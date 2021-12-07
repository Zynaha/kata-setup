package org.learnwithllew.duplicationkata;

public class Lesson1Straight extends Song {
	public void singCatSong() {
        String[] myStringArray;
        String[] myStringArrayDuplicated;
        myStringArrayDuplicated= new String[] {
        		"But the cat came back",
                "The very next day",
                "Oh the cat came back",
                "We thought he was a goner",
                "But the cat came back, he just wouldn't go away"	
        };
        String string1="We gave the cat to a little kid";
        String string2="We sent the cat out on a boat";
        sing(string1);
        for (int j = 0; j < myStringArrayDuplicated.length; j++) {       	
            sing(myStringArrayDuplicated[j]);           
        }
        sing(string2);
    }
}
