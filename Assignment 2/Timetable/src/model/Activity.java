package model;

import javafx.beans.property.*;

/**
 *
 * @author 11819164
 */
public class Activity {

    private Subject subject;
    private StringProperty group = new SimpleStringProperty();
    private IntegerProperty number = new SimpleIntegerProperty();
    private StringProperty day = new SimpleStringProperty();
    private IntegerProperty start = new SimpleIntegerProperty();
    private IntegerProperty duration = new SimpleIntegerProperty();
    private StringProperty room = new SimpleStringProperty();
    private IntegerProperty capacity = new SimpleIntegerProperty();
    private IntegerProperty enrolled = new SimpleIntegerProperty();

    public Activity(Subject subject, String group, int number, String day, int start, int duration, String room, int capacity) {
        this.subject = subject;
        this.group.set(group);
        this.number.set(number);
        this.day.set(day);
        this.start.set(start);
        this.duration.set(duration);
        this.room.set(room);
        this.capacity.set(capacity);
        enrolled.set(0);
    }

    public IntegerProperty enrolledProperty() {
        return enrolled;
    }

    public Subject getSubject() {
        return subject;
    }

    public final int getSubjectNumber() {
        return subject.getNumber();
    }

    public final String getGroup() {
        return group.get();
    }

    public int getNumber() {
        return number.get();
    }

    public final String getDay() {
        return day.get();
    }

    public final int getStart() {
        return start.get();
    }

    public final int getDuration() {
        return duration.get();
    }

    public final String getRoom() {
        return room.get();
    }

    public final int getCapacity() {
        return capacity.get();
    }

    public final int getEnrolled() {
        return enrolled.get();
    }

    public boolean canEnrol() {
        return enrolled.get() < capacity.get();
    }

    public void enrol() {
        enrolled.set(getEnrolled() + 1);
    }

    public void withdraw() {
        enrolled.setValue(getEnrolled() - 1);
    }

    public boolean matches(int subjectNumber, String group) {
        return subject.matches(subjectNumber) && group.equals(this.group.get());
    }

    @Override
    public String toString() {

        return String.format("%d %s %d %s %s %02d:00 %dhrs %d/%d", subject.getNumber(), getGroup(), getNumber(), getDay(), getRoom(), getStart(), getDuration(), getEnrolled(), getCapacity());
    }
}
