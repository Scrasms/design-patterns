package state.routine;

// Concrete State
public class SchoolState implements DailyRoutineState {
    private Student student;

    public SchoolState(Student student) {
        this.student = student;
    }

    public String work() {
        if (student.getGrade() != "A") {
            student.improveGrade();
            student.setRested(false);
            return "Did homework problems at school. Grade is now: " + student.getGrade();
        }
        return "Talked to my friends at school";
    }
    public String eat() {
        student.setRested(true);
        return "Ate sandwiches at school";
    }

    public String sleep() {
        if (!student.getRested()) {
            student.setRested(true);
            return "Dozed off at school";
        }
        return "Got caught while dozing off at school";
    }

    public String travel() {
        student.setRoutine(new CafeState(student));
        return "Went to the Cafe";
    }

    public String reportRoutine() {
        return "School";
    }
}
