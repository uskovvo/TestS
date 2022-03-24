import lombok.Getter;
import lombok.Setter;

public class DeveloperJava {
    @Getter @Setter
    private int experience;

    @Getter @Setter
    private String devEnvironment;

    public DeveloperJava(){
        this.experience = devExperience();
        this.devEnvironment = devEnvironment();
    }

    private int devExperience(){
        System.out.println("Укажите стаж");
        return CheckData.isDigit();
    }

    private String devEnvironment(){
        System.out.println("Укажите среду разработки");
        return CheckData.inputData();
    }

    @Override
    public String toString() {
        return "\n\t\t" + "стаж: " + experience + " лет" +
                "\n\t\t" + "среда разработки: " + devEnvironment;
    }
}
