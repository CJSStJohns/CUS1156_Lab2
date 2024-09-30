import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWords
{
   
   public static int countUnique(ArrayList<String> list)
   {
      HashSet<String> uniqueWords = new HashSet<>(list);
      return uniqueWords.size();
   }
   
   public static void giveIntro() {
       System.out.println("Project:    Lab 2-Git");
       System.out.println("Class:      UniqueWords.java");
       System.out.println("Author:     Christopher Joshua Sanon");
       System.out.println("Date:       September 30th, 2024");    	  	
       System.out.println("This program reads an input file with family");
       System.out.println("information and provides information about the");
       System.out.println("maternal line, paternal line, children, and siblings of");
       System.out.println("various people.");
       System.out.println();
   }

   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<>();
      words.add("apple");
      words.add("orange");
      words.add("blackboard");
      words.add("apple");
      words.add("orange");
      words.add("sun");
      words.add("moon");
   
      int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
