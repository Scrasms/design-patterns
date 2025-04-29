package state.routine;

// Concrete State
public class CafeState implements DailyRoutineState {
    private Student student;

    public CafeState(Student student) {
        this.student = student;
    }

    public String work() {
        if (student.getGrade() != "A") {
            student.improveGrade();
            student.setRested(false);
            return "Studied diligently at the cafe. Grade is now: " + student.getGrade();
        }
        return "Watched cat videos at the cafe";
    }
    public String eat() {
        student.setRested(true);
        return "Ate pancakes at the cafe";
    }

    public String sleep() {
        if (!student.getRested()) {
            student.setRested(true);
            return "Snoozed at the cafe";
        }
        return "Almost got kicked out of the cafe for snoozing";
    }

    public String travel() {
        student.setRoutine(new HomeState(student));
        return "Went home";
    }

    public String reportRoutine() {
        return "Cafe";
    }
}
