package classwork.cw_29_04_25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PersonRunner {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        // 18-55 women, 18-60 men
        int counter1 = 0;

        for (Person person : people) {
            if ((person.sex == Person.Sex.WOMAN && person.age >= 18 && person.age < 55)
                    || (person.sex == Person.Sex.MAN && person.age >= 18 && person.age < 60)) {
                counter1++;
            }
        }

        System.out.println("Количество потенциально работоспособных людей: " + counter1);
        System.out.println("--------------------------------------");

        long counter2 = people.stream().filter(x -> (x.sex == Person.Sex.WOMAN && x.age >= 18 && x.age < 55)
                || (x.sex == Person.Sex.MAN && x.age >= 18 && x.age < 60)).count();

        System.out.println("Количество потенциально работоспособных людей: " + counter2);
        System.out.println("--------------------------------------");

        List<Person> sortedPeople1 = people.stream()
                .sorted((x, y) -> {
                    if (x.sex == y.sex) {
                        return (x.age - y.age);
                    } else {
                        return x.sex.compareTo(y.sex);
                    }
                })
                .toList();

        System.out.println("Отсортированный лист: " + sortedPeople1);
        System.out.println("--------------------------------------");

        List<Person> sortedPeople2 = people.stream()
                .sorted(
                        Comparator.comparing((Person p) -> p.sex)
                                .thenComparing(p -> p.age)
                )
                .toList();

        System.out.println("Отсортированный лист: " + sortedPeople2);
    }
}
