package zmienne.i.operatory;

public class Tasks {

    public static void main(String[] args) {

        int age = 30; //years
        double height = 1.7D; //m
        double weight = 45.5; //kg

        System.out.println("Wiek: " + age + "lat");
        System.out.println("Wzrost: " + height + "m");
        System.out.println("Waga: " + weight + "kg");

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI: " + bmi + "kg/m^2");

        int bmiAsInt = (int) bmi;
        System.out.println("BMI jako int: " + bmiAsInt + "kg/m^2");

        int number = 20;
        System.out.println(number + " / 2 : " + number / 2);
        System.out.println(number + " / 3 : " + number / 3);
        System.out.println(number + " / 11 : " + number / 11);
        System.out.println(number + " % 2 : " + number % 2);
        System.out.println(number + " % 3 : " + number % 3);
        System.out.println(number + " % 11 : " + number % 11);

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);


        //Przekręcanie byte
        byte b = (byte) 130;
        System.out.println(b);

        //Przekręcanie short
        short s = (short) 55555;
        System.out.println(s);

        //Przekręcanie int
        int i = Integer.MAX_VALUE + 1;

        //Przekręcanie long
        long l = Long.MAX_VALUE + 1;
        System.out.println(l);

    }

}
