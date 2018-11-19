
package Remove_Array_List;


public class People {

    /**
     * @param args the command line arguments
     */
    static int logicalSize=3;
    
    public static void main(String[] args) {
        Human h[]=new Human[10];
        h[0]=new Human("Andrews, Bob",47);
        h[1]=new Human("Davidson, Greg",24);
        h[2]=new Human("Folley, Anna",35);
        System.out.println("Adding Human Edwards, Dave");
        Human p=new Human("Edwards, Dave",21);
        int loc=findInsertPoint(h,p);
        insert(h,p,loc);
        for (int i = 0; i < logicalSize; i++) {
            System.out.println(h[i].getName());
        }
        System.out.println("Remove Davidson, Greg");
        Human temp=new Human("Davidson, Greg",0);
        loc=search(h,temp);
        delete(h,loc);
    }
    
    public static int search (Object[] a, Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
}

//////////////////////////////////////////////////////////////////////////////////

public static boolean insert(Object array[], Object newItem, int targetIndex)
{
	// Check for a full array and return false if full
	if (logicalSize == array.length)
	   return false;
	// Check for valid target index or return false 
	if (targetIndex < 0 || targetIndex > logicalSize)
	   return false;
	// Shift items down by one position
	for (int i = logicalSize; i > targetIndex; i--)      
	   array[i] = array[i - 1];
	// Add new item, increment logical size,return true                       
	array[targetIndex] = newItem; 
	logicalSize++;
	return true; 
}

//////////////////////////////////////////////////////////////////////////////////
	
public static boolean delete(Object array[], int targetIndex)
{
	if (targetIndex < 0 || targetIndex >= logicalSize)
		   return false;
		 
		// Shift items up by one position
		for (int i = targetIndex; i < logicalSize - 1; i++)       
		   array[i] = array[i + 1];
		 
		// Decrement logical size and return true 
		logicalSize--; 
		return true;                                   
}

/////////////////////////////////////////////////////////////////////////////////
	
public static int findInsertPoint (Object a[], Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   int midpoint=0;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
	   
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)a[midpoint]).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
}

}
