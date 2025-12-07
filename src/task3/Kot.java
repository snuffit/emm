package task3;

public class Kot extends Participant {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Kot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name);
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        boolean success = distance <= maxRunDistance;
        if (success) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров. Максимум: " + maxRunDistance);
        }
        return success;
    }

    @Override
    public boolean jump(int height) {
        boolean success = height <= maxJumpHeight;
        if (success) {
            System.out.println(name + " успешно перепрыгнул стену высотой " + height + " метров");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " метров. Максимум: " + maxJumpHeight);
        }
        return success;
    }
}
