public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: IBK
  Date: 17/04/2019
  */
  	public static void main(String[] args){
      
      String name1 = "Lucy";
      String name2 = "Rose";
      String adjective1 = "happy";
      String adjective2 = "great";
      String adjective3 = "giddy";
      String verb1 = "fly";
      String noun1 = "Nun";
      String noun2 = "Irn Bru";
      String noun3 = "Drum & Bass";
      String noun4 = "cat";
      String noun5 = "apple";
      String noun6 = "orange";
      String place1 = "Cyprus";
      int number = 7;
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 
      'It is going to be a "+adjective2+" day!' 
       Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. 
       They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". 
       Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". 
       "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      
      System.out.println(story);
      
    }       
}
