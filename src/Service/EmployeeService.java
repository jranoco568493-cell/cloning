
package Service;

import java.util.List;
import model.Employee;
import dao.EmployeeDAO;
import javax.swing.table.DefaultTableModel;

public class EmployeeService {
    
    private static final EmployeeDAO employeeDAO = new EmployeeDAO();
    
    
    public boolean registerEmployee(Employee emp){
        if (emp.getName().equals("") || emp.getSalary() <= 0) {
            return false;
        }
        
        employeeDAO.add(emp);
        return true;
        
    }
    
    public List<Employee> fetchAllRecords(){
        return employeeDAO.getAll();
    }
    
    public Employee fetchOneRecords(int id){
        return employeeDAO.getItem(id);
    }
    
    public boolean modifyEmployee(Employee emp){
        boolean isNotFound = true;
        
        for (Employee e : fetchAllRecords()) {
            if(e.getId() == emp.getId()){
                isNotFound = false;
                break;
            }
        }
        if (emp.getId() <= 0 || emp.getName().equals("") || emp.getSalary() <= 0 || isNotFound) {
            return false;
        }
        
        employeeDAO.update(emp);
        return true;
    }
    
    public void removeEmployee(int id){
        employeeDAO.delete(id);
    }
    
    //CONVERT LIST TABLE (GET TABLE DATA)
    public DefaultTableModel getTableModel(){
        String columns[] = {"ID", "Name", "Position", "Salary"};
        Object[][] data = new Object[fetchAllRecords().size()][4];
        
        for (int i = 0; i < fetchAllRecords().size(); i++) {
            Employee emp = fetchAllRecords().get(i);
            data[i][0] = emp.getId();
            data[i][1] = emp.getName();
            data[i][2] = emp.getPosition();
            data[i][3] = emp.getSalary();
        }
        
        return new DefaultTableModel(data, columns);
    }

    public Employee fetchAllRecords(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Employee fetchOneRecord(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
