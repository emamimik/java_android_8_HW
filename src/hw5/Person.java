package hw5;

public class Person {

    public static void main(String[] args) {

        Employee[] persArray = {
                new Employee("Ivanov Ivan", "Engineer", "iviva@mailbox.com", "892312312", 100000, 50),
                new Employee("Ivanov Igor", "Engineer", "ivig@mailbox.com", "892312313", 80000, 45),
                new Employee("Ivanov Ilya", "Junior Engineer", "ivil@mailbox.com", "892312314", 50000, 40),
                new Employee("Ivanova Alla", "Workman", "ivial@mailbox.com", "892312315", 40000, 30),
                new Employee("Ivanova Nina", "Courier", "ivin@mailbox.com", "892312316", 30000, 20)
        };

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }

    }
}
