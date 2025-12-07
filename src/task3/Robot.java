package task3;

public class Robot extends Participant {
    private final int maxRunDistance;
    private final int maxJumpHeight;
    private int batteryLevel; // дополнительный параметр для робота

    public Robot(String name, int maxRunDistance, int maxJumpHeight, int batteryLevel) {
        super(name);
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public boolean run(int distance) {
        if (batteryLevel <= 0) {
            System.out.println(name + " не может бежать: разряжен аккумулятор");
            return false;
        }

        boolean success = distance <= maxRunDistance;
        if (success) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
            batteryLevel -= 10; // расход батареи
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров. Максимум: " + maxRunDistance);
            batteryLevel -= 5; // тоже расход при попытке
        }
        return success;
    }

    @Override
    public boolean jump(int height) {
        if (batteryLevel <= 0) {
            System.out.println(name + " не может прыгать: разряжен аккумулятор");
            return false;
        }

        boolean success = height <= maxJumpHeight;
        if (success) {
            System.out.println(name + " успешно перепрыгнул стену высотой " + height + " метров");
            batteryLevel -= 15; // прыжок требует больше энергии
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " метров. Максимум: " + maxJumpHeight);
            batteryLevel -= 8; // тоже расход при попытке
        }
        return success;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
