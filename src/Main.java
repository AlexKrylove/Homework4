public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю ты уже большой!");
        }
        if (age < 18) {
            System.out.println("Ты ещё слишком мал!");
        }

        System.out.println("Task2");
        int age1 = 7;
        if (age1 >= 7) {
            System.out.println("Ребенок ходит в школу если ему " + age1 + " лет и больше");
        }
        int age2 = 18;
        if (age2 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст " + age2 + " лет и больше");
        }
        int age3 = 24;
        if (age3 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу, если ему " + age3 + " года и больше");
        }

        System.out.println("Task3");
        int capacityWagon = 11;
        if (capacityWagon > 60 && capacityWagon <= 102) {
            System.out.println("Придется постоять");
        }
        if (capacityWagon < 60) {
            System.out.println("Тебе повезло, в вагоне есть где присесть");
        }
        if (capacityWagon >102) {
            System.out.println("Мест нету, иди в другой вагон");
        }



    }
}