package university;

import university.students.*;
import university.faculty.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Running..");

        // create student database
        StudentsDatabase studentDb = new StudentsDatabase(10);

        // create faculty database
        FacultyDatabase facultyDb = new FacultyDatabase(10);

        // create example instances
        ActiveStudents uniMember1 = new ActiveStudents("A", 1, 123);
        RegularFaculty uniMember2 = new RegularFaculty("B", 2, 456);
        Alumni uniMember3 = new Alumni("C", 3, 789);
        VisitingFaculty uniMember4 = new VisitingFaculty("D", 4, 222);

        // add members to databases
        studentDb.addMember(uniMember1);
        facultyDb.addMember(uniMember2);
        studentDb.addMember(uniMember3);
        facultyDb.addMember(uniMember4);

        // test getFullDetails method
        System.out.println(uniMember1.getFullDetails()+'\n');
        System.out.println(uniMember2.getFullDetails()+'\n');
        System.out.println(uniMember3.getFullDetails()+'\n');
        System.out.println(uniMember4.getFullDetails());

    }
}

