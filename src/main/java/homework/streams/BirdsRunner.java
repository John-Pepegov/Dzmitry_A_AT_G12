package homework.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdsRunner {
    public static void main(String[] args) {
        // Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        List<String> birds = new ArrayList<>(Arrays.asList(
                "Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"
        ));

        // Создать из списка поток данных
        Arrays.stream(birds.stream()
                // Заменить каждую букву "о" на букву "а"
                .map(x -> x.replace("о", "а"))
                // Собрать все слова в одну строку в нижнем регистре
                .reduce("", String::concat)
                .toLowerCase()
                // Убрать все символы мягкого знака
                .replace("ь", "")
                // Разбить на новые строки по букве "б"
                .split("б"))
                // Отпечатать в консоль с новой строки в виде --Чайка--
                .forEach(x -> System.out.println("--" + x + "--"));
    }
}
