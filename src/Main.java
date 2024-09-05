//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Emploee emploee1 = new Emploee();
        emploee1.printInfo();

        Emploee[] emploeeArray = new Emploee[5];
        emploeeArray[0] = new Emploee("ivan dyrow","direktor","post@mail.mail","12343567",300,19);
        emploeeArray[1] = new Emploee("petr dyrow","zam-direktor","post13@mail.mail","34443567",250,18);
        emploeeArray[2] = new Emploee("ivanna ymbvn","secretar","post17@mail.mail","119655567",50,20);
        emploeeArray[3] = new Emploee("sveta light","bibliotekar","post16@mail.mail","125468467",40,21);
        emploeeArray[4] = new Emploee("katya brown","stajer","post11@mail.mail","9672343567",3,21);

        emploeeArray[3].printInfo();


    }

    public static class Emploee {
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
            telephone ="+375444444444";
            salary = 333;
            age = 20;
        }
        public Emploee(String FIO, String position, String email, String telephone, int salary,int age){
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

    public static class Park {
        private String addres;
        private Boolean isOpen;
        private Boolean isForChildren;

        public class Attractions {
            private String nameAttr;
            private String timeWorkAttr;
            private int priseAttr;
        }
    }
}