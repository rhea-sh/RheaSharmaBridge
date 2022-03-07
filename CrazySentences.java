/*
Name: Rhea Sharma & Sulagna Nandi
Date:
Teacher:
Assignment: create 5 randomly generated sentences by shuffling 5 arraylists
*/

//import statements
import java.util.*;

//CrazySentences class
public class CrazySentences 
{
   //main method
   public static void main (String[] args)
   {
      //1-D arrays
      String[] articleArray = {"a", "the", "one"};
      String[] nounArray = {"cat", "sock", "magazine", "virus", "supermarket", "blobfish", "nation", "monarch", "hamster", "phone"};
      String[] verbArray = {"rides", "influences", "limpers", "confesses", "rubs", "whimpers", "whispers", "duels"};
      String[] propositionArray = {"through", "below", "near", "past", "without", "against", "because of", "upon"};
      String[] adjectiveArray = {"towering", "fearful", "lavish", "slippery", "tangy", "quirky", "toothsome", "crabby"};
   
      //ArrayLists
      ArrayList article = new ArrayList ();
      ArrayList noun = new ArrayList ();
      ArrayList verb = new ArrayList ();
      ArrayList proposition = new ArrayList ();
      ArrayList adjective = new ArrayList ();
   
      //assigning elements from 1-D arrays into their corresponding ArrayLists
      article.addAll (Arrays.asList (articleArray));
      noun.addAll (Arrays.asList (nounArray));
      verb.addAll (Arrays.asList (verbArray));
      proposition.addAll (Arrays.asList (propositionArray));
      adjective.addAll (Arrays.asList (adjectiveArray));
     
      
      //sentence 1
      Collections.shuffle (article); // shuffling the article list
      System.out.print (article.get(0) + " "); 
      
      Collections.shuffle (noun); // shuffling the noun list
      System.out.print (noun.get(0) + " ");
      
      Collections.shuffle (verb); // shuffling the verb list
      System.out.print (verb.get(0) + " ");
      
      Collections.shuffle (proposition); // shuffling the proposition list
      System.out.print (proposition.get(0) + " ");
      
      System.out.print (article.get(1) + " "); //already shuffled articles, so just printing the next index
      
      Collections.shuffle (adjective); // shuffling the adjective list
      System.out.print (adjective.get(0) + " ");
      
      System.out.println (noun.get(1) + "."); //already shuffled nouns, so just printing the next index
      
      
      //sentence 2
      Collections.shuffle (article); // shuffling the article list
      System.out.print (article.get(0) + " ");
      
      Collections.shuffle (noun); // shuffling the noun list
      System.out.print (noun.get(0) + " ");
      
      Collections.shuffle (verb); // shuffling the verb list
      System.out.print (verb.get(0) + " ");
      
      Collections.shuffle (proposition); // shuffling the proposition list
      System.out.print (proposition.get(0) + " ");
      
      System.out.print (article.get(1) + " "); //already shuffled articles, so just printing the next index
      
      Collections.shuffle (adjective); // shuffling the adjective list
      System.out.print (adjective.get(0) + " ");
      
      System.out.println (noun.get(1) + "."); //already shuffled nouns, so just printing the next index
      
      
      //sentence 3
      Collections.shuffle (article); // shuffling the article list
      System.out.print (article.get(0) + " ");
      
      Collections.shuffle (noun); // shuffling the noun list
      System.out.print (noun.get(0) + " ");
      
      Collections.shuffle (verb); // shuffling the verb list
      System.out.print (verb.get(0) + " ");
      
      Collections.shuffle (proposition); // shuffling the proposition list
      System.out.print (proposition.get(0) + " ");
      
      System.out.print (article.get(1) + " "); //already shuffled articles, so just printing the next index
      
      Collections.shuffle (adjective); // shuffling the adjective list
      System.out.print (adjective.get(0) + " ");
      
      System.out.println (noun.get(1) + "."); //already shuffled nouns, so just printing the next index
      
      
      //sentence 4
      Collections.shuffle (article); // shuffling the article list
      System.out.print (article.get(0) + " ");
      
      Collections.shuffle (noun); // shuffling the noun list
      System.out.print (noun.get(0) + " ");
      
      Collections.shuffle (verb); // shuffling the verb list
      System.out.print (verb.get(0) + " ");
      
      Collections.shuffle (proposition); // shuffling the proposition list
      System.out.print (proposition.get(0) + " ");
      
      System.out.print (article.get(1) + " "); //already shuffled articles, so just printing the next index
      
      Collections.shuffle (adjective); // shuffling the adjective list
      System.out.print (adjective.get(0) + " ");
      
      System.out.println (noun.get(1) + "."); //already shuffled articles, so just printing the next index
      
      
      //sentence 5
      Collections.shuffle (article); // shuffling the article list
      System.out.print (article.get(0) + " ");
      
      Collections.shuffle (noun); // shuffling the noun list
      System.out.print (noun.get(0) + " ");
      
      Collections.shuffle (verb); // shuffling the verb list
      System.out.print (verb.get(0) + " ");
      
      Collections.shuffle (proposition); // shuffling the proposition list
      System.out.print (proposition.get(0) + " ");
      
      System.out.print (article.get(1) + " "); //already shuffled articles, so just printing the next index
      
      Collections.shuffle (adjective); // shuffling the adjective list
      System.out.print (adjective.get(0) + " ");
      
      System.out.println (noun.get(1) + "."); //already shuffled nouns, so just printing the next index
      
   } //main method
}



