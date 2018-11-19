package Remove_Array_List;

import java.util.*;


public class Array_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> x=new ArrayList();
        ArrayList<Human> y=new ArrayList();
        
        x.add("Apple");
        x.add("Pear");
        x.add("Peach");
        
        y.add(new Human("Smith, Joe",45));
        y.add(new Human("Andrews, Amy",22));
        y.add(new Human("Cyrus Mir",19));
        
        for(String a:x){
            System.out.println(x);
        }
        
        for(Human p:y){
            System.out.println(p.getName());
        }
            
        System.out.println("Remove Pear From ArrayList x.");
        x.remove(1);
        
        System.out.println("Inserting Caleb Widogast in Position 2 of y.");
        y.add(2,new Human("Caleb Widogast",36));
        
        for(Human p:y){
            System.out.println(p.getName());
        }
        
        for(String a:x){
            System.out.println(x);
        }
        System.out.println("Edit Amy's age");
        Human temp=y.get(1);
        temp.setAge(16);
        y.set(1,temp);
        
        
        
        }
        
    }
    

