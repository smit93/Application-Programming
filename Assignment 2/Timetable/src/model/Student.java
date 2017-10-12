package model;

import javafx.beans.property.*;
import javafx.collections.*;

/**
 *
 * @author 11819164
 */
public class Student {

    private University university;
    private StringProperty number = new SimpleStringProperty();
    private StringProperty name = new SimpleStringProperty();
    private StringProperty attendance = new SimpleStringProperty();
    private BooleanProperty scholarship = new SimpleBooleanProperty();
    ;
    private ObservableList<Activity> activities = FXCollections.observableArrayList();

    public Student(University university, String number, String name, String attendance, boolean scholarship) {
        this.university = university;
        this.number.set(number);
        this.name.set(name);
        this.attendance.set(attendance);
        this.scholarship.set(scholarship);
    }

    public University getUniversity() {
        return university;
    }

    public String getNumber() {
        return number.get();
    }

    public String getName() {
        return name.get();
    }

    public String getAttendance() {
        if (attendance.get().equals("ft")) {
            return "Full Time";
        } else {
            return "Part Time";
        }
    }

    public String getScholarship() {
        if (scholarship.get()) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public ObservableList<Activity> getActivities() {
        return activities;
    }

    public boolean isEnrolledIn(Activity activity) {
        return activities.contains(activity);
    }

    public boolean matches(String number) {
        return this.number.get().equals(number);
    }

    public void enrol(Activity activity) {

        Activity a = act(activity.getSubjectNumber(), activity.getGroup());

        if (isEnrolledIn(a)) {
            withdraw(a);
        }

        activities.add(activity);
        activity.enrol();

    }

    public void withdraw(Activity activity) {
        activities.remove(activity);
        activity.withdraw();
    }

    public void withdrawActivities() {

        for (Activity activity : activities) {
            activity.withdraw();
        }
    }

    private Activity act(int subjectNumber, String group) {
        for (Activity activity : activities) {
            if (activity.matches(subjectNumber, group)) {
                return activity;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return number.get() + " - " + name.get();
    }
}
