/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author feli8871
 */
public class Student implements Comparable{
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
    
    public int compareTo(Object o){
        if(this.id>((Student)o).getId()) return 1;
        if(this.id<((Student)o).getId()) return -1;
        else return 0;
    }
    
    
    
    
    
    
    
    
    
    
    
}
