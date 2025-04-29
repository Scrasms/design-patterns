package state.routine;

// Concrete State
public class WorkState implements DailyRoutineState {
    private Student student;

    public WorkState(Student student) {
        this.student = student;
    }

    public String work() {
        student.setRested(false);
        return "Stacked boxes at work";
    }
    public String eat() {
        student.setRested(true);
        return "Drank coffee at work";
    }

    public String sleep() {
        if (!student.getRested()) {
            student.setRested(true);
            return "Took a quick nap at work";
        }
        return "Wasn't tired at work";
    }

    public String travel() {
        student.setRoutine(new HomeState(student));
        return "Went home";
    }

    public String reportRoutine() {
        return "Work";
    }
}
