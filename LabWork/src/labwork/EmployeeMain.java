package labwork;

public class EmployeeMain {  
       public static void main(String[] args) {  
   
          // fetching the employee record based on the employee_id from the database  
          Employee model = retriveEmployeeFromDatabase();  
   
          // creating a view to write Employee details on console  
          EmployeeView view = new EmployeeView();  
   
          EmployeeController controller = new EmployeeController(model, view);  
   
          controller.updateView();  
       }  
   
       private static Employee retriveEmployeeFromDatabase(){  
          Employee Employee = new Employee();  
          Employee.setName("Puja");  
          Employee.setId("1");  
          Employee.setDepartment("BCA");  
          return Employee;  
       }  
    }
