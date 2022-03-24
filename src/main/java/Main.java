import java.util.Map;

public class Main {
    private static int input;
    private static Employee employee;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите действие, где:" +
                    "\n\t" + "0 - добавить сотрудника" +
                    "\n\t" + "1 - инфо по всем сотрудникам" +
                    "\n\t" + "2 - Вывести ФИО и ЗП сотрудников");

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
                case 2:
                    Employee.getMapEmployee()
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.comparingByValue())
                            .forEach(v -> {
                                System.out.println(v.getKey() + " - " + v.getValue());
                            });
            }
        }
    }
}
