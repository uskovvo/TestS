import lombok.Getter;
import lombok.Setter;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Developer {
    private Pattern pattern;
    private Matcher matcher;
    private final CheckData checkData = new CheckData();

    @Getter @Setter
    private String langDev;

    @Getter @Setter
    private String nameUniversity;

    public Developer () {
        this.langDev = isLangJava();
        this.nameUniversity = nameUniversity();
    }

    private String isLangJava(){
        System.out.println("Укажите язык разработки");
        langDev = CheckData.inputData().toLowerCase(Locale.ROOT);
        String regex = "java";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(langDev);
        if(matcher.find()){
            langDev =  langDev + new DeveloperJava().toString();
        }
        return langDev;
    }

    private String nameUniversity(){
        System.out.println("Укажите учебное заведение");
        return CheckData.inputData();
    }

    @Override
    public String toString() {
        return "разработчик" +
                "\n\t\t" + "язык разработки: " + langDev +
                "\n\t\t" + "название ВУЗа: " + nameUniversity + "\n";
    }
}
