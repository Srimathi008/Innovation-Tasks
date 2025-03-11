class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    String departmentName;
    Employee[] employees;

    public Department(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public void info() {
        System.out.println("Department: " + departmentName);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

public class Aggregationeg {
    public static void main(String[] args) {
        Employee[] employeeArray = { new Employee("sri"), new Employee("nithya") };
        Department department = new Department("MD", employeeArray);
        department.info();
    }
}
