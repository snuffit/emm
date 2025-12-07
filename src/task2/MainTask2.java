package task2;

public class MainTask2 {
    public static void main(String[] args) {
        System.out.println("=== Тестирование животных ===\n");

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Рыжик");

        System.out.println("=== Тест бега ===");
        dog1.run(150);
        dog2.run(600);
        cat1.run(100);
        cat2.run(250);

        System.out.println("\n=== Тест плавания ===");
        dog1.swim(5);
        dog2.swim(15);
        cat1.swim(10);
        cat3.swim(0);

        System.out.println("\n=== Статистика ===");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак создано: " + Dog.getDogCount());
        System.out.println("Котов создано: " + Cat.getCatCount());

        System.out.println("\n=== Дополнительные тесты ===");
        Dog dog3 = new Dog("Рекс");
        Cat cat4 = new Cat("Васька");

        dog3.run(-50);
        dog3.swim(0);
        cat4.run(0);

        System.out.println("\n=== Итоговая статистика ===");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак создано: " + Dog.getDogCount());
        System.out.println("Котов создано: " + Cat.getCatCount());
    }
}
