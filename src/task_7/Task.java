package task_7;

public class Task {
    public static void main(String[] args) {
        Human[] arrHuman = new Human[4];
        arrHuman[0] = new Citizen("Vova", 18, "ukrainian");
        arrHuman[1] = new Human("Kostya", 22);
        arrHuman[2] = new StaffMember("Alina", 20, "ukrainian", "PHP programmer", 2000, 15);
        arrHuman[3] = new HourlyEployee("Andrii", 23, "ukrainian", "Java programmer", 3, 800);

        arrHuman[2].setAge(19);
        arrHuman[0].setName("Igor");

        for (Human s : arrHuman) {
            System.out.println(s);
        }
    }
}
