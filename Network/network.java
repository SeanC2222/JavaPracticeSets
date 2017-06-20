import java.util.*;
import java.net.*;
import java.io.*;

class Network {

   public static void main(String args[]) throws IOException{

      PrintWriter	out	 = null;
      BufferedReader	in	 = null;
      Socket		mySock	 = null;
      try{
	 mySock = new Socket("localhost", 3000);
	 in = new BufferedReader(new InputStreamReader(mySock.getInputStream()));
	 out = new PrintWriter(mySock.getOutputStream(), true);

      } catch(IOException e){
	 System.err.println(e);
      }

      String getMessage = new String();
      getMessage = "GET /homepage HTTP/1.1\r\nConnection: close\r\n";

      out.println(getMessage);

      while(true){
	 getMessage = in.readLine();
	 if(getMessage == null){
	    break;
	 } 
	 System.out.println(getMessage);
      }
      return;
   }
}
