package klasy.zadanie1;

public class Programista {

    private String name;
    private String surname;
    private String language;
    private double salary;

    public Programista(String name, String surname, String language, double salary) {
        this.name = name;
        this.surname = surname;
        this.language = language;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLanguage() {
        return language;
    }

    public double getSalary() {
        return salary;
    }

}
