public class Main {
    public static void main(String[] args) {
        int age = 5; // Task 4
        if (age >= 18) {
            System.out.println("Поздравляю ты уже большой!");
        } else {
            System.out.println("Ты ещё слишком мал!");
        }

        System.out.println("Task2"); // task 5
        int agePerson = 24;
        if (agePerson >= 7 && agePerson < 18) {
            System.out.println("Ребенок ходит в школу если ему " + agePerson + " лет и больше");
        } if (agePerson >= 18 && agePerson < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст " + agePerson + " лет и больше");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу, если ему " + agePerson + " года и больше");
        }

        System.out.println("Task3"); // task 6
        int capacityWagon = 123;
        if (capacityWagon > 60 && capacityWagon <= 102) {
            System.out.println("Придется постоять");
        }
        if (capacityWagon < 60) {
            System.out.println("Тебе повезло, в вагоне есть где присесть");
        } else {
            System.out.println("Мест нету, иди в другой вагон");
        }

        System.out.println("Task7");
        int childAge =35;
        if (childAge >= 2 && childAge <=6) {
            System.out.println("Человеку " + childAge + " и ему в детский саду");
        } else if (childAge >= 7 && childAge <=18) {
            System.out.println("Человеку " + childAge + " и ему в школу");
        } else if (childAge >= 18 && childAge <= 24) {
            System.out.println("Человеку " + childAge + " и ему пора в Универ");
        } else if (childAge >= 24) {
            System.out.println("Человеку " + childAge + " и ему пора на работу");
        }

    }
}