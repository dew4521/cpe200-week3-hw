package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        this("","","",30);
    }

    public Course(String n, String cid) {
        // implement here
    }

    public Course(String n, String cid, String l) {
        // implement here
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        this.course_id = !n.equalsIgnoreCase("")?cid:"000000";
        this.lecturer = !n.equalsIgnoreCase("")?l:"TBA";
        this.max_students = max>10?max:30;
        this.no_students = 0;
        // implement the rest here
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = !course_name.equalsIgnoreCase("")?course_name:this.course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id)?course_id:this.course_id;
    }

    // implement the other get and set methods here
    public String getLecturer() {
        // implement here
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = !lecturer.equalsIgnoreCase("")?lecturer:this.lecturer;
        // implement here
    }

    public int getMax_students() {
        // implement here
        return max_students;
    }

    public void setMax_students(int max_students) {
        this.max_students = max_students<10||max_students>60?this.max_students:max_students;
        // implement here
    }

    public int getNo_students() {
        // implement here
        return no_students;
    }

    public void setNo_students(int no_students) {
        this.no_students = no_students>max_students||no_students<0?this.no_students:no_students;
        // implement here
    }

    @Override
    public String toString() {
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has ";
        switch(this.no_students)
        {
            case 0:
                o = o + "NO student,";
                break;
            case 1:
                o = o + "ONE student,";
                break;
            default:
                o = o + this.no_students +" students,";
        }
        o = o +" [maximum: "+this.max_students+"]";

        // implement the rest here

        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        // implement the rest here

        return m.matches();
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "\\d{6}";

    // all private attributes
    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
