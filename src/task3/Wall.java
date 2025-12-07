package task3;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        System.out.println("\n" + participant.getName() + " пытается перепрыгнуть стену высотой " + height + " метров");
        return participant.jump(height);
    }

    @Override
    public String getInfo() {
        return "Стена высотой " + height + " метров";
    }

    public int getHeight() {
        return height;
    }
}
