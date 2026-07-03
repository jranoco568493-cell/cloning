
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Employee;


public class EmployeeDAO {
    //ARRAY LIST
    private static List<Employee> database = new ArrayList<>();
    
    //CREATE
    public void add(Employee emp){
        int size = database.size();
        int currentId =/*condition*/ size <= 0 ?/*true*/ 1 :/*else*/ database.get(size - 1).getId() + 1;
        
        Employee employee = new Employee(currentId, emp.getName(), emp.getPosition(),emp.getSalary() );
        database.add(employee);
    }
    
    
    //READ (all)
    public List<Employee> getAll(){
        return database;
    }
    
    //READ (one)
    public Employee getItem(int id){
        for (Employee emp : database) {
            
            if (emp.getId() == id) {
                return emp;
            }
                            
        }
        return null;
    }
    
    //UPDATE
    public void update(Employee updatedemp){
         for (Employee emp : database) {
            
            if (emp.getId() == updatedemp.getId()) {
                int index = database.indexOf(emp);
                database.set(index, updatedemp);
            }
                            
        }
    }
    //DELETE
    public void delete(int id){
        for (Employee emp : database) {
            
            if (emp.getId() == id) {
                int index = database.indexOf(emp);
                database.remove(index);
                break;
            }                  
        }         
    } 
   
}
