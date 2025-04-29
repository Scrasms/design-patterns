package state.routine;

import java.util.List;

// Context class that delegates state-specific work to the DailyRoutineState classes
public class Student {
    private DailyRoutineState routine;
    private String grade;
    private boolean rested;

    public Student() {
        routine = new HomeState(this);
        grade = "F";
        rested = true;
    }

    public void setRoutine(DailyRoutineState routine) {
        this.routine = routine;
    }

    public String getGrade() {
        return grade;
    }

    public boolean getRested() {
        return rested;
    }

    public void setRested(boolean rested) {
        this.rested = rested;
    }

    public void improveGrade() {
        if (grade == "A") return;
        List<String> possible = List.of("A", "B", "C", "D", "E", "F");
        grade = possible.get((possible.indexOf(grade) - 1));
    }

    public void work() {
        System.out.println(routine.work());
    }

    public void eat() {
        System.out.println(routine.eat());
    }

    public void sleep() {
        System.out.println(routine.sleep());
    }

    public void travel() {
        System.out.println(routine.travel());
    }

    public String reportRoutine() {
        return routine.reportRoutine();
    }

    public static void main(String[] args) {
        Student kevin = new Student();

        // Home
        kevin.sleep();
        kevin.work();
        kevin.eat();
        kevin.travel();

        // School
        kevin.work();
        kevin.eat();
        kevin.work();
        kevin.sleep();
        kevin.travel();

        // Cafe
        kevin.work();
        kevin.eat();
        kevin.sleep();
        kevin.travel();

        // Home again
        kevin.work();
        kevin.work();
        kevin.eat();
        kevin.travel();

        // Goes to work instead of school since Kevin's grade is now A
        kevin.work();
        kevin.eat();
        kevin.work();
        kevin.sleep();
        kevin.travel();
    }
}
