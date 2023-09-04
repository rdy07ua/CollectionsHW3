import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String[]> translationMap = new HashMap<>();


        translationMap.put("кіт", new String[]{"cat", "猫", "Katze"});
        translationMap.put("собака", new String[]{"dog", "犬", "Hund"});
        translationMap.put("дівчина", new String[]{"girl", "少女", "Mädchen"});
        translationMap.put("чоловік", new String[]{"man", "男性", "Mann"});
        translationMap.put("диван", new String[]{"sofa", "ソファ", "Sofa"});
        translationMap.put("стіл", new String[]{"table", "テーブル", "Tisch"});
        translationMap.put("стеля", new String[]{"ceiling", "天井", "Decke"});
        translationMap.put("підлога", new String[]{"floor", "床", "Boden"});
        translationMap.put("клавіатура", new String[]{"keyboard", "キーボード", "Tastatur"});
        translationMap.put("панда", new String[]{"panda", "パンダ", "Panda"});

        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть слово для перекладу із списку: кіт, собака, дівчина, чоловік, диван, стіл, стеля, подлога, клавіатура, панда");
        String userInput = scanner.nextLine();


        String[] translations = translationMap.get(userInput);

        if (translations != null) {
            System.out.println("Переклади для слова '" + userInput + "':");
            System.out.println("Англійська: " + translations[0]);
            System.out.println("Японська: " + translations[1]);
            System.out.println("Німецька: " + translations[2]);
        } else {
            System.out.println("Переклад не знайдено.");
        }

    }
}