package task3;

public class RunningTrack implements Obstacle {
    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        System.out.println("\n" + participant.getName() + " пытается пробежать дорожку длиной " + length + " метров");
        return participant.run(length);
    }

    @Override
    public String getInfo() {
        return "Беговая дорожка длиной " + length + " метров";
    }

    public int getLength() {
        return length;
    }
}
