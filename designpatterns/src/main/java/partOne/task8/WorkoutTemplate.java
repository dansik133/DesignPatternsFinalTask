package partOne.task8;

public abstract class WorkoutTemplate {
    public void changeToWorkoutClothes() {
        System.out.println("Changing to workout clothes");
    }

    public void drinkWater() {
        System.out.println("Drinking water");
    }

    public abstract void doExercise();

    public void takeAShower() {
        System.out.println("Taking a shower");
    }

    public void workout() {
        changeToWorkoutClothes();
        drinkWater();
        doExercise();
        takeAShower();
    }
}
