/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import Searching.*;

/**
 *
 * @author feli8871
 */
public class Student implements Comparable<Student>{
    private String name, adress;
    int id;
    
    Student(String n, String a, int i){
        name=n;
        adress=a;
        id=i;
    }
    
    public String toString(){
        return "Name:\t\t"+name+"\nAdress:\t:"+adress+"\nID:\t\t"+id;
    }
    
    public int getId(){
        return id;
    }
    
    // This variation of compareTo uses the name as the sorting/comparing field. This is instead of id in the original Student Class
    public int compareTo(Student o){
        return name.compareTo(o.name);
    }
    
    public String getName(){
        return name;
    }
    
    
    
    
    
    
    
    
    
}
