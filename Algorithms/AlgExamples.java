import java.util.*;
import java.time.*;
import java.math.*;


public class AlgExamples {

   public static void main(String args[]){
      Node<Integer> node = new Node<Integer>(new Integer(15));

      return;
      
   }

   private static class Node<T> {
      private T val;
      private int branchNumbers;
      private ArrayList<Node<T>> children;

      public Node(){
	 val = null;
	 branchNumbers = 0;
	 children = new ArrayList<Node<T>>();
      }

      public Node(T v){
	 val = v;
	 branchNumbers = 0;
	 children = new ArrayList<Node<T>>();
      }
   
      public Node(Node<T> n){
	 val = n.getValue();
	 branchNumbers = n.getBranchNumbers();
	 children = n.getChildren();
      }

      public T getValue(){return val;}
      public int getBranchNumbers(){return branchNumbers;}
      public ArrayList<Node<T>> getChildren(){return children;}

      public void addChild(Node<T> n){
	 children.add(n);
	 branchNumbers++;
      }

      public Node<T> popChild(int i){
	 Node<T> ret = children.get(i);
	 children.remove(i);
	 return ret;
      }
      
   }

   private static class BinaryTree<T> {
      private final Node<T> root;
      private int height;
      private int size;

      public BinaryTree(Node<T> n){
	 root = n;
      }

      public void InsertNode(Node<T> n){
	 double s = (double) size-1;
	 s = log2(s);
	 
      }
   }
}
