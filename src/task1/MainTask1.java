package task1;

public class MainTask1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван Иванович", "Инженер",
                "ivanov@mailbox.com", "89231231231", 50000, 35);
        employees[1] = new Employee("Петров Петр Петрович", "Менеджер",
                "petrov@mailbox.com", "89231231232", 60000, 42);
        employees[2] = new Employee("Сидорова Анна Сергеевна", "Бухгалтер",
                "sidorova@mailbox.com", "89231231233", 55000, 45);
        employees[3] = new Employee("Кузнецов Алексей Викторович", "Программист",
                "kuznetsov@mailbox.com", "89231231234", 70000, 28);
        employees[4] = new Employee("Смирнова Елена Владимировна", "Директор",
                "smirnova@mailbox.com", "89231231235", 90000, 50);

        System.out.println("=== Сотрудники старше 40 лет ===");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
