package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassRoom {

    private ArrayList<Instructor> instructors = ZipCodeWilmington.getInstructorList();
    private ArrayList<Student> students = TechConnect.getStudentList();
    private Map<String, Person> roster = new HashMap<String, Person>(instructors.size() + students.size());

    public Map<String, Person> getRoster() {
        for (Instructor i : instructors) {
            roster.put(i.getName(), i);
        }
        for (Student s : students) {
            roster.put(s.getName(), s);
        }
        return roster;
    }

}
