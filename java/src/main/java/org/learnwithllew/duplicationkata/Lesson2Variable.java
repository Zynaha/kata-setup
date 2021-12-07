package org.learnwithllew.duplicationkata;

public class Lesson2Variable extends Song
{
  public void singBottlesOfBeer()
  {
	
    String nbBottles = "100";
	String string = " bottles of beer on the wall";
	sing(nbBottles+string);  
    
    sing(nbBottles +" bottles of beer");   
    sing("Take one down, pass it around");
    nbBottles="99";
    sing(nbBottles +string);
    sing(nbBottles +string);
    
    sing(nbBottles +" bottles of beer");    
    sing("Take one down, pass it around");
    
    sing("98" +string);
  }
}
