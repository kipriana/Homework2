public class Main {
    public static void main(String[] args) {

        task1to3();
        task4();
        task5();
        task6to7();
        task8();
    }
    public static void task1to3 () {
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
public static void task4 () {
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

public static void task5 () {
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
public static void task6to7 () {
        System.out.println("Task 6");
        var firstBoxersWeight = 78.2;
        var secondBoxersWeight = 82.7;
        var totalWeight = firstBoxersWeight + secondBoxersWeight;
        System.out.println("Total weight of the two fighters is " + totalWeight + " kg.");
        var weightDifference = secondBoxersWeight - firstBoxersWeight;
        System.out.println("The second fighter is " + weightDifference + " kg heavier than the first one.");

        System.out.println("Task 7");
        weightDifference = secondBoxersWeight - firstBoxersWeight;
        System.out.println("The second fighter is " + weightDifference + " kg heavier than the first one.");
        weightDifference = secondBoxersWeight % firstBoxersWeight;
        System.out.println("The second fighter is " + weightDifference + " kg heavier than the first one.");
    }

public static void task8 () {
        System.out.println("Task 8");
        var volumeOfWork = 640;
        var headcount = volumeOfWork / 8;
        System.out.println("The total headcount is " + headcount + ".");
        var newHeadcount = headcount + 94;
        var newVolumeOfWork = newHeadcount * 8;
        System.out.println("If the headcount is " + newHeadcount + ", then " + newVolumeOfWork + " hours of work can be shared.");
    }
}