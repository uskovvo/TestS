import lombok.Getter;
import lombok.Setter;

public class Fitter {

    @Getter @Setter
    private String department;

    public Fitter(){
        this.department = employeeDep();
    }

    private String employeeDep(){
        System.out.println("Укажите отдел, где:" +
                           "\n\t" + "0 - Цех" +
                           "\n\t" + "1 - Склад" + "\n");
        int dep = CheckData.isDigit();
        switch (dep) {
            case 0: department = "цех";
            break;
            case 1: department = "склад";
            break;
            default:
                System.out.println("Не корректный ввод, повторите");
                employeeDep();
        }
        return department;
    }

    @Override
    public String toString() {
        return "Монтажник в отделе " + department;
    }
}
