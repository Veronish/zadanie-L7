//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Emploee emploee1 = new Emploee();
        emploee1.printInfo();

        Emploee[] emploeeArray = new Emploee[5];
        emploeeArray[0] = new Emploee("ivan dyrow", "direktor", "post@mail.mail", "12343567", 300, 19);
        emploeeArray[1] = new Emploee("petr dyrow", "zam-direktor", "post13@mail.mail", "34443567", 250, 18);
        emploeeArray[2] = new Emploee("ivanna ymbvn", "secretar", "post17@mail.mail", "119655567", 50, 20);
        emploeeArray[3] = new Emploee("sveta light", "bibliotekar", "post16@mail.mail", "125468467", 40, 21);
        emploeeArray[4] = new Emploee("katya brown", "stajer", "post11@mail.mail", "9672343569", 3, 21);

        emploeeArray[3].printInfo();


        Park park1 = new Park();
        Park.Attractions attractions1 = new Park.Attractions("Name1","11-12",15);
        Park.Attractions attractions2 = new Park.Attractions("Namw2","from 9 to 17", 20);

        System.out.println(attractions1.getNameAttr());
        attractions1.setNameAttr("Pomogite");
        System.out.println(attractions1.getNameAttr());
    }

}