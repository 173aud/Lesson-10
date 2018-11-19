package Remove_Array_List;

public class Fruity {
    
    static int logicalSize=5;
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fruit[]=new String[10];
        fruit[0]="Apple";
        fruit[1]="Bannana";
        fruit[2]="Cherry";
        fruit[3]="Kiwi";
        fruit[4]="Pineapple";
        showFruit(fruit);
        //Orange
        int loc=findInsertPoint(fruit,"Orange");
        System.out.println("Adding Orange.");
        insert(fruit,"Orange",loc);
        showFruit(fruit);
        System.out.println("Adding Strawberry and Papaya.");
        loc=findInsertPoint(fruit,"StrawBerry");
        insert(fruit,"Strawberry",loc);
        insert(fruit,"Papaya",findInsertPoint(fruit,"Papaya"));
        showFruit(fruit);
        System.out.println("---------------------------");
        System.out.println("Deleting Cherry");
        loc=search(fruit,"Cherry");
        delete(fruit,loc);
        showFruit(fruit);
    }
    
    public static void showFruit(String a[]){
        for (int i = 0; i < logicalSize; i++) {
           System.out.println(a[i]); 
        }

            
        
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