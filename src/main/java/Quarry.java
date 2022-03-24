import java.util.ArrayList;
import java.util.List;

public class Quarry {
    private final String FIRSTLAW = "Newton's first law";
    private final String SECONDLAW = "Newton's second law";
    private final String THIRDLAW = "Newton's third law";
    private StringBuilder law = new StringBuilder();
    private List<Integer> quarryKnowledge = new ArrayList<>();

    public Quarry(){
        addQuarryKnowledge();
        getKnowledge();
    }
    private void addQuarryKnowledge(){
        System.out.println("Добавить знания каменоломщика, где" +
                           "\n\t" + "0 - Нет" +
                           "\n\t" + "1 - Да" + "\n");
        int value = CheckData.isDigit();
        switch (value){
            case 0: break;
            case 1:
                System.out.println("Укажите номер закона Ньютона");
                int numberLaw = CheckData.isDigit();
                quarryKnowledge.add(numberLaw);
                addQuarryKnowledge();
        }
    }

    public void getKnowledge(){
        quarryKnowledge.forEach(knowledge -> {
            switch(knowledge){
                case 1: law.append(FIRSTLAW + ", ");
                break;
                case 2: law.append(SECONDLAW + ", ");
                break;
                case 3: law.append(THIRDLAW);
                break;
            }
        });
    }

    @Override
    public String toString() {
        return "Каменоломщик со знанием: " + law.toString();
    }
}
