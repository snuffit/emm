package task2;

class Cat extends Animal {
    private static int catCount = 0; // счетчик котов
    private final int maxRunDistance = 200;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance && distance > 0) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимум: " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    public static int getCatCount() {
        return catCount;
    }
}
