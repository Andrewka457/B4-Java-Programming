package day37_a_abstraction.gym;

public abstract class Exercise {

    // In Abstract class - we still can have all the other members as regular class

    String name;


    public Exercise(String name) {
        this.name = name;
    }

    public abstract void doExercise();

    public abstract void burnCalories(int minutes);

    public abstract int calculateCaloriesBurned(int minutes);
}