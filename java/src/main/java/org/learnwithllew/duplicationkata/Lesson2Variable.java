package org.learnwithllew.duplicationkata;

public class Lesson2Variable extends Song
{
  public void singBottlesOfBeer()
  {
	
    String nbBottles = "100";
	String string = " bottles of beer on the wall";
	sing(nbBottles+string);  
    
    String string2 = " bottles of beer";
	sing(nbBottles +string2);   
    String string1 = "Take one down, pass it around";
	sing(string1);
    nbBottles="99";
    sing(nbBottles +string);
    sing(nbBottles +string);
    
    sing(nbBottles +string2);    
    sing(string1);
    
    sing("98" +string);
  }
}
