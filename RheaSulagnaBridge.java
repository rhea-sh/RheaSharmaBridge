/*
Name: Rhea Sharma & Sulagna Nandi
Date:
Teacher:
Assignment: create 5 randomly generated sentences by shuffling 5 arraylists
*/

//import statements
import java.util.*;
import java.util.Arrays;
import hsa.Console;

//CrazySentences class
public class RheaSulagnaBridge 
{
    //main method
    public static void main (String[] args)
    {
        //1-D arrays
        String[] cardDeck1D = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH", "JH", "QH", "KH", "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "TC", "JC", "QC", "KC", "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS", "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD"};
        //String[] player1 []; 
        
        //ArrayLists
        ArrayList cardDeck = new ArrayList (52);
        ArrayList player1 = new ArrayList (13);
        ArrayList player2 = new ArrayList (13);
        ArrayList player3 = new ArrayList (13);
        ArrayList player4 = new ArrayList (13);

        //assigning elements from 1-D arrays into their corresponding ArrayLists
        cardDeck.addAll (Arrays.asList (cardDeck1D));
      
        //shuffle deck (cardDeck)
        Collections.shuffle (cardDeck); // shuffling the cardDeck list
        System.out.println (cardDeck + " "); 
        
        player1.add (Arrays.asList (cardDeck1D));
        System.out.println (player1 + " "); 
        
        /*
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
        
        */
    } //main method
}




