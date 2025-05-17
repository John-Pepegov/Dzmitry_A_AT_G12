package classwork.cw_19_04_25;

public enum EColors {
    RED(123), GREEN(456), BLUE(789);

    final int number;

    EColors(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        System.out.println(EColors.RED);
    }
}
