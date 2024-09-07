public class Emploee {

    private String FIO;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Emploee() {
        System.out.println("вызов конструктора класса");
        FIO = "fio";
        position = "doljnost";
        email = "enail@email.mail";
        telephone = "+375444444444";
        salary = 333;
        age = 20;
    }

    public Emploee(String FIO, String position, String email, String telephone, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО сотрудника: " + FIO + "\nДолжность: " + position + "\nПочта: " + email + "\nТелефон: " + telephone + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }

}
