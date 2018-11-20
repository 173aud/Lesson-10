/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remove_Array_List;

/**
 *
 * @author feli8871
 */
public class Human implements Comparable<Human>{
    private String name;
    private String sex;
    private int age;
    
    public Human(String n, String s, int a){
        name=n;
        sex=s;
        age=a;
        
    }

    @Override
    public int compareTo(Human t) {
        return name.compareTo(t.getName());
    }

    String getName() {
        return name;
    }
    
    public void setAge(int a){
        age=a;
    }

    public int getAge() {
        return age;
    }
    
    public void setSex(String s){
        sex=s;
    }
    
    public String getSex(){
        return sex;
    }
    
}
