package homework.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdList {
    public static void main(String[] args) {
        // Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        List<String> birds = new ArrayList<>(Arrays.asList(
                "Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"
        ));

        // Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
        System.out.println("Птицы в формате --имя--:");
        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        System.out.println("---------------------");

        // Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        int counter = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for (String bird : birds) {
            int vowelCount = 0;
            for (char ch : bird.toCharArray()) {
                if (vowels.indexOf(ch) >= 0) {
                    vowelCount++;
                }
            }
            if (vowelCount > 1) {
                counter++;
            }
        }
        System.out.println("Птиц с более чем одной гласной: " + counter);

        System.out.println("---------------------");

        // Проитерировать список по индексу и отпечатать слова в консоль через пробел
        System.out.print("Через пробел (по индексу): ");
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        System.out.println("---------------------");

        // Заменить 3-й элемент списка на Синица (индексация с 0)
        birds.set(2, "Синица");

        // Проитерировать список через for-each и отпечатать слова в консоль через пробел
        System.out.print("После замены: ");
        for (String bird : birds) {
            System.out.print(bird + " ");
        }
        System.out.println();
    }
}
