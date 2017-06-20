package sorters;

import java.util.ArrayList;

public class Sorters {

   public static class BubbleSorter {
   
      public ArrayList<Integer> sort(ArrayList<Integer> list){

	 for(int i = 0; i < list.size(); i++){
	    for(int j = 1; j < list.size()-i; j++){
	       if(list.get(j-1) > list.get(j)){
		  Integer temp = list.get(j);
		  list.set(j, list.get(j-1));
		  list.set(j-1, temp);
	       }
	    }
	 }
   
	 return list;
      }
   }

   public static class SelectionSorter {

      public ArrayList<Integer> sort(ArrayList<Integer> list){
	 for(int i = 0; i < list.size(); i++){
	    int listMinIndex = i;
	    for(int j = i+1; j < list.size(); j++){
	       if(list.get(j) < list.get(listMinIndex)){
		  listMinIndex = j;
	       }
	    }
	    Integer temp = list.get(i);
	    list.set(i, list.get(listMinIndex));
	    list.set(listMinIndex, temp);
	 }
	 return list;
      }
   }

   public static class InsertionSorter {

      public ArrayList<Integer> sort(ArrayList<Integer> list){
	 for(int i = 1; i < list.size(); i++){
	    Integer x = list.get(i);
	    int j = i-1;
	    while(j >= 0 && list.get(j) > x){
	       list.set(j+1, list.get(j));
	       j--;
	    }
	    list.set(j+1, x);
	 }
	 return list;
      }
   }

   public static class MergeSorter {
      
      public ArrayList<Integer> sort(ArrayList<Integer> list){

	 //Recursively split list until each list is only 1 element
	 if(list.size() > 1){
	    ArrayList<Integer> firstHalf  = new ArrayList<Integer>(list.subList(0, list.size()/2));
	    ArrayList<Integer> secondHalf  = new ArrayList<Integer>(list.subList(list.size()/2, list.size()));

	    //Recursive call, firstHalf & secondHalf returned as sorted lists
	    MergeSorter temp = new MergeSorter(); 
	    firstHalf = temp.sort(firstHalf);
	    secondHalf = temp.sort(secondHalf);
	   
	    //Return the merge the two halves and return sorted list
	    return merge(firstHalf, secondHalf);

	 //Return single element lists
	 } else {
	    return list;
	 }
	 //Exits final recursion when original firstHalf and secondHalf are remerged into full sorted list
      }
      
      private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	 int i = 0, j = 0;
	 
	 ArrayList<Integer> merged = new ArrayList<Integer>();

	 //Merge lists into merged until one list runs out
	    //e.g.   a.size() > 0, b.size() > 0	   -->	 a.size() == 0 || b.size() == 0
	 while(i < a.size() && j < b.size()){
	    if(a.get(i) <= b.get(j)){
	       merged.add(a.get(i));
	       i++;
	    } else {
	       merged.add(b.get(j));
	       j++;
	    }
	 }
	 //Merge the leftovers from "other" list
	    //e.g.   a.size() = 0, b.size() = 5	   -->	 a.size() == b.size() == 0
	 while(i < a.size()){
	    merged.add(a.get(i++));
	 }
	 while(j < b.size()){
	    merged.add(b.get(j++));
	 }
	 return merged;
      }
   }

   public static class PancakeSorter{

      public ArrayList<Integer> sort(ArrayList<Integer> list){

	 for(int i = 0; i < list.size(); i++){
	    int largestPancakeIndex = 0;     //Always start at top;
	    for(int j = 1; j < list.size() - i; j++){
	       if(list.get(j) > list.get(largestPancakeIndex)){
		  largestPancakeIndex = j;
	       }
	    }
	    //Swap largestPancake to index 0
	    Integer temp = list.get(largestPancakeIndex);
	    list.set(largestPancakeIndex, list.get(0));
	    list.set(0, temp);
	    //Swap largestPancake, index 0, to "bottom" - i
	    temp = list.get(list.size()-i-1); //-1 to zero align numbering
	    list.set(list.size()-i-1, list.get(0));
	    list.set(0, temp);

	 }
	 return list;
      }
   }
}


