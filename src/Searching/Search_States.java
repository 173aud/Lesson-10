/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import TerminalIO.*;
        
public class Search_States {

    public static void main(String[] args) {
        KeyboardReader k=new KeyboardReader();
        String states[]=fillData();
        String s=k.readLine("Enter the State you are looking for:");
        int l1=linearSearch(states,s);
        int l2=binarySearch(states,s);
        
        System.out.println(s+" found at "+l1+" using a linear method.");
        System.out.println(s+" found at "+l2+" using a binary method.");
    }
    
    public static int linearSearch(String d[], String search){
        int l=-1;
        int counter=0;
        for (int i = 0; i < d.length; i++) {
            if(d[1].compareTo(search)==0){
                counter++;
                return i;
            }
        }
        System.out.println("Compared "+counter+" times.");
        return l;
    }
    
    public static int binarySearch (Object[] a, Object searchValue){
	   int counter=0;
           int left = 0;
	   int right = a.length-1;
	   while (left <= right){
	      counter++;
              int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	      if (result == 0){
                  System.out.println("Binary compared "+counter+" times."); 
                 return midpoint; 
              }
	         
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
           System.out.println("Binary compared "+counter+" times."); 
	   return -1;			   
}
    
    public static String[] fillData(){
String state[] = new String[50];
state[0]="Alabama";
state[1]="Alaska";
state[2]="Arizona";
state[3]="Arkansas";
state[4]="California";
state[5]="Colorado";
state[6]="Connecticut";
state[7]="Delaware";
state[8]="Florida";
state[9]="Georgia";
state[10]="Hawaii";
state[11]="Idaho";
state[12]="Illinois";
state[13]="Indiana";
state[14]="Iowa";
state[15]="Kansas";
state[16]="Kentucky";
state[17]="Louisiana";
state[18]="Maine";
state[19]="Maryland";
state[20]="Massachusetts";
state[21]="Michigan";
state[22]="Minnesota";
state[23]="Mississippi";
state[24]="Missouri";
state[25]="Montana";
state[26]="Nebraska";
state[27]="Nevada";
state[28]="New Hampshire";
state[29]="New Jersey";
state[30]="New Mexico";
state[31]="New York";
state[32]="North Carolina";
state[33]="North Dakota";
state[34]="Ohio";
state[35]="Oklahoma";
state[36]="Oregon";
state[37]="Pennsylvania";
state[38]="Rhode Island";
state[39]="South Carolina";
state[40]="South Dakota";
state[41]="Tennessee";
state[42]="Texas";
state[43]="Utah";
state[44]="Vermont";
state[45]="Virginia";
state[46]="Washington";
state[47]="West Virginia";
state[48]="Wisconsin";
state[49]="Wyoming";
return state;
}






    
}
