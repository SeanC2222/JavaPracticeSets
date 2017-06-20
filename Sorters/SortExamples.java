import java.util.*;
import java.time.*;
import java.math.*;

import sorters.Sorters.*;
class SortExamples {

   private final static int _listSize = 10;

   public static void main(String args[]){

//Set up new list & randomized list generator
      ArrayList<Integer> list = new ArrayList<Integer>();

      RandomIntegerList listGenerator = new RandomIntegerList();

//Bubble Sort
      System.out.println("***BubbleSort***");
      list = listGenerator.generateIntegers(_listSize);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("");


      BubbleSorter bsort = new BubbleSorter();
      list = bsort.sort(list);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("\n");

//Selection Sort
      System.out.println("***Selection Sort***");
      list = listGenerator.generateIntegers(_listSize);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("");
  
      SelectionSorter selsort = new SelectionSorter();
      list = selsort.sort(list);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("\n");

//Insertion Sort
      System.out.println("***Insertion Sort***");
      list = listGenerator.generateIntegers(_listSize);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("");
  
      InsertionSorter inssort = new InsertionSorter();
      list = inssort.sort(list);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("\n");

//Merge Sort
      System.out.println("***Merge Sort***");
      list = listGenerator.generateIntegers(_listSize);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("");
  
      MergeSorter msort = new MergeSorter();
      list = msort.sort(list);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("\n");

 //Pancake Sort
      System.out.println("***Pancake Sort***");
      list = listGenerator.generateIntegers(_listSize);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("");
  
      PancakeSorter pansort = new PancakeSorter();
      list = pansort.sort(list);

      for(int i = 0; i < _listSize; i++){
	 System.out.print(list.get(i));
      }
      System.out.println("\n");
      
      return;
   }

   private static class RandomIntegerList {

      public ArrayList<Integer> generateIntegers(int size){

	 ArrayList<Integer> list = new ArrayList<Integer>();

	 Instant now = Instant.now();
	 Random Rand = new Random(now.getNano());

	 for(int i = 0; i < size; i++){
	    list.add( new Integer( Math.abs( Rand.nextInt(10) ) ) );
	 }

	 return list;
      }
   }

};
