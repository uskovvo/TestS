import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    @Getter
    private static final List<Employee> employeeList = new ArrayList<>();

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String surname;

    @Getter @Setter
    private String position;

    @Getter @Setter
    private long salary;

    public Employee(){
        this.position = employeePosition();
        this.name = employeeName();
        this.surname = employeeSurname();
        this.salary = employeeSalary();
    }

    private String employeePosition(){
        System.out.println("Укажите должность сотрудника, где:" +
                "\n\t" + "0 - монтажник" +
                "\n\t" + "1 - электронщик" +
                "\n\t" + "2 - разработчик" +
                "\n\t" + "3 - каменоломщик" );
        int pos = CheckData.isDigit();
        switch (pos){
            case 0: position = new Fitter().toString();
            break;
            case 1: position = new ElectronicsEngineer().toString();
            break;
            case 2: position = new Developer().toString();
            break;
            case 3: position = new Quarry().toString();
            break;
            default:
                System.out.println("Не корректный ввод, повторите");
                employeePosition();
        }
        return position;
    }

    private String employeeName(){
        System.out.println("Укажите имя сотрудника");
        return CheckData.inputData();
    }

    private String employeeSurname(){
        System.out.println("Укажите фамилию сотрудника");
        return CheckData.inputData();
    }

    private long employeeSalary(){
        System.out.println("Укажите зарплату сотрдника");
        return CheckData.isDigit();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
        System.out.println("Сотрудник добавлен");
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "\n\t" + "имя: " + name +
                "\n\t" + "фамилия: " + surname +
                "\n\t" + "должность: " + position +
                "\n\t" + "зарплата: " + salary + " руб.\n";
    }
}
