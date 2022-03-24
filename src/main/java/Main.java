import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int input;
    private static Employee employee;
    private static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите действие, где:" +
                    "\n\t" + "0 - добавить сотрудника" +
                    "\n\t" + "1 - инфо по всем сотрудникам" + "\n");

            input = CheckData.isDigit();
            switch (input) {
                case 0:
                    employee = new Employee();
                    employee.addEmployee(employee);
                    break;
                case 1:
                    Employee.getEmployeeList().forEach(employee1 -> {
                        System.out.println(employee1.toString());
                    });
                    break;
            }
        }
    }
}
