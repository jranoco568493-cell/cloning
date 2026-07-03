
package model;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    
    //CONSTRUCTOR DEFAULT
    public Employee(){
        this.id = 0;
        this.name = "";
        this.position = "";
        this.salary = 0;
        
    }
    
    
    //Paramerized COSNTRUCTOR
    public Employee(int id, String name, String position, double salary){
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        
    }
    
    //Getters
    public double getSalary(){
        return salary;
    }   
    public String getPosition(){
        return position;
    }   
    public String getName(){
        return name;
    }    
    public int getId(){
        return id;
    }
    
    //setter
    
    public void setId(int id){
        this.id = id;
    }    
    public void setName(String name){
        this.name = name;
    }    
    public void setPosition(String position){
        this.position = position;
    }    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    
}
