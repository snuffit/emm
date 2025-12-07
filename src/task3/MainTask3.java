package task3;

public class MainTask3 {
    public static void main(String[] args) {
        System.out.println("=== ПОДГОТОВКА К СОРЕВНОВАНИЯМ ===\n");

        Participant[] participants = {
                new Human("Алексей", 1000, 2),
                new Human("Мария", 800, 1),
                new Kot("Барсик", 200, 3),
                new Kot("Мурка", 150, 2),
                new Robot("R2D2", 5000, 1, 100),
                new Robot("T-1000", 10000, 5, 50)
        };

        Obstacle[] obstacles = {
                new RunningTrack(500),
                new Wall(1),
                new RunningTrack(800),
                new Wall(2),
                new RunningTrack(1200),
                new Wall(3)
        };

        System.out.println("Участники соревнований:");
        for (Participant participant : participants) {
            System.out.println("- " + participant.getName());
        }

        System.out.println("\nПрепятствия:");
        for (Obstacle obstacle : obstacles) {
            System.out.println("- " + obstacle.getInfo());
        }

        System.out.println("\n=== НАЧАЛО СОРЕВНОВАНИЙ ===\n");

        for (Participant participant : participants) {
            System.out.println("\n" + participant.getName() + " начинает прохождение препятствий:");
            boolean canContinue = true;

            for (int i = 0; i < obstacles.length && canContinue; i++) {
                canContinue = obstacles[i].overcome(participant);

                if (!canContinue) {
                    System.out.println("❌ " + participant.getName() + " выбывает из соревнований!");
                    break;
                } else {
                    System.out.println("✅ " + participant.getName() + " успешно прошел препятствие " + (i + 1));
                }
            }

            if (canContinue) {
                System.out.println("\n🎉 " + participant.getName() + " успешно прошел все препятствия!");
            }

            System.out.println("-----------------------------");
        }

        System.out.println("\n=== СОРЕВНОВАНИЯ ЗАВЕРШЕНЫ ===");
    }
}
