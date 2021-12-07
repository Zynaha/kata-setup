package org.learnwithllew.duplicationkata;

public class Lesson2Variable extends Song
{
  public void singBottlesOfBeer()
  {
	
    String nbBottles = "100";
    String nbBottles1 = "100";
	sing(nbBottles+" bottles of beer on the wall");  
    
    sing(nbBottles +" bottles of beer");   
    sing("Take one down, pass it around");
    nbBottles="99";
    sing(nbBottles +" bottles of beer on the wall");
    sing("99 bottles of beer on the wall");
    
    sing("99 bottles of beer");    
    sing("Take one down, pass it around");
    
    sing("98 bottles of beer on the wall");
  }
}
