package com.wawa.foodordermanagement.businesslogic;

import java.util.LinkedList;
import java.util.Queue;

public class OrderRequestQueue {
	

	 public static void main(String[] args) 
	    { 
	        Queue<String> q 
	            = new LinkedList<String>(); 
	  
	        
	        for (int i = 0; i < 5; i++) 
	            q.add(getOrderId()+i); 
	  
	        // Display contents of the queue. 
	        System.out.println("Elements of queue "
	                           + q); 
	  
	        // To remove the head of queue. 
	        String removedele = q.remove(); 
	        System.out.println("removed element-"
	                           + removedele); 
	  
	        System.out.println(q); 
	  
	        // To view the head of queue 
	        String head = q.peek(); 
	        System.out.println("head of queue-"
	                           + head); 
	  
	        // Rest all methods of collection 
	        // interface like size and contains 
	        // can be used with this 
	        // implementation. 
	        int size = q.size(); 
	        System.out.println("Size of queue-"
	                           + size); 
	        
	    }
	 
	 public static String getOrderId() {
		 return "UISN12224";
	 }
	
}
