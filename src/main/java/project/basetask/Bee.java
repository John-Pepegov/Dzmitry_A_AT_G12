package project.basetask;

public class Bee {
    //-- создать класс Bee и в нем
    //-- строковое поле gender
    //-- длинное целочисленное поле weight
    //-- конструктор, принимающий пол и массу и инициализирующий соответствующие поля
    //-- геттеры и сеттеры на каждое поле
    //-- невозвратный метод printBeeDetails, который делит 500 кг на массу пчелы и печатает в консоль информацию о ней в виде "Я легче лося в <> раз"
    private String gender;
    private int weight;

    public Bee(String gender, int weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + 500 / weight + " раз");
    }
}