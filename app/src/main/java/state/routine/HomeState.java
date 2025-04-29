package state.routine;

// Concrete State
public class HomeState implements DailyRoutineState {
    private Student student;

    public HomeState(Student student) {
        this.student = student;
    }

    public String work() {
        if (student.getGrade() != "A") {
            student.improveGrade();
            student.setRested(false);
            return "Did homework at home. Grade is now: " + student.getGrade();
        }
        return "Played games at home";
    }

    public String eat() {
        student.setRested(true);
        return "Ate instant noodles at home";
    }

    public String sleep() {
        if (!student.getRested()) {
            student.setRested(true);
            return "Slept at home";
        }
        return "Couldn't sleep at home";
    }

    public String travel() {
        if (student.getGrade() != "A") {
            student.setRoutine(new SchoolState(student));
            return "Went to school";
        }

        student.setRoutine(new WorkState(student));
        return "Went to work";
    }

    public String reportRoutine() {
        return "Home";
    }
}
