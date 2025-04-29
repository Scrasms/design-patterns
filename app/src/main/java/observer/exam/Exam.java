package observer.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Student> students = new ArrayList<>();

    public void addTaker(Student student) {
        if (!students.contains(student)) students.add(student);
    }

    public void removeTaker(Student student) {
        if (students.contains(student)) students.remove(student);
    }

    public void notifyTaker() {
        List<String> difficulties = List.of("easy", "medium", "final");
        int num = (int) (Math.random() * 3);

        students.stream()
                .forEach(s -> s.update(difficulties.get(num)));
    }

    public void takerReaction() {
        students.stream()
                .forEach(s -> s.stateOfMind());
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        Student sam = new Sam();
        exam.addTaker(sam);
        exam.addTaker(new Josh());
        exam.addTaker(new Kevin());

        for (int i = 1; i < 11; i++) {
            System.out.println("Q" + i + ":");
            exam.notifyTaker();
            exam.takerReaction();
        }

        exam.removeTaker(sam);
        System.out.println("\nSam is sick and was left the exam early\n");
        for (int i = 11; i < 21; i++) {
            System.out.println("Q" + i + ":");
            exam.notifyTaker();
            exam.takerReaction();
        }
    }
}
