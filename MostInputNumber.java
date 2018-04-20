import java.util.ArrayList; // Imports ArrayList library for use in this project.
import java.util.HashMap; // Imports Hashmaps library for use in this project.
import java.util.Map; //Imports Maps library for this program.
import java.util.Scanner; //Imports Scanner class for use in this program.

public class MostInputNumber { //Beginning of main class
    public static void main(String args[]) { //Beginning of main method.
        Scanner reader = new Scanner(System.in); //Maknig Scanner object.
    Map<Integer, Integer> mappingNumbers = new HashMap<>(); //Makes new hash map.
        int secondMostEntered = 0;
        int temp; //Sets up temp variable

    ArrayList<Integer>  usersNumbers = new ArrayList<>(); //Makes new array list.
    do {
        System.out.println("Enter an integer");
        temp= reader.nextInt(); //User is asked to enter numbers, one at a time. That number is put in a temp variable.
        usersNumbers.add(temp); //This number they entered is then put in a list.
    } while (temp != 0); //Once user enters 0 they will not be prompted for anymore numbers.

    for(int i : usersNumbers) { //For each number in  usersNumbers list.
        Integer counter = mappingNumbers.get(i); //Each number is collected and mapped with a counter..
        if(counter == null) counter = new Integer(0);
        counter++; //The counter for this number is increased
        mappingNumbers.put(i, counter); //Number and counter pair are put in hash map.
    }
    Map.Entry <Integer,Integer> mostEntered = null; //map keeping track of number of times a number appears is declared.
   for(Map.Entry<Integer, Integer> e: mappingNumbers.entrySet()) { //e is used to iterate through the hash map from last for loop.
       if (mostEntered == null || mostEntered.getValue() < e.getValue()) {
           mostEntered = e; //If e is more than what most entered currently is, e's key will become the value of mostEntered.
       } else if (mostEntered.getValue() == e.getValue()) {
           secondMostEntered = e.getValue(); //If there is a tie for most entered number, this variable will hold that second number.
       }
   }

       System.out.println("Number" + " " +  mostEntered.getKey() + " " + "occured most "); //Prints out most commonly seen number

       if (secondMostEntered != 0){
           System.out.println("Number" + " " + secondMostEntered + " " + "Had as many appearances as" + " " +  mostEntered.getKey()); //If a number with as many occurances as the mostEnteredNumber is found, it will be printed here.

   }

        }

    }

