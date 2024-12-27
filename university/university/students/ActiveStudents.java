package university.students;

import university.UniversityMember;

public class ActiveStudents implements UniversityMember {
    private String name;
    private Integer id;
    private Integer phoneNumber;

    public ActiveStudents(String name, Integer id, Integer phoneNumber) { // constructor
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Active Student";
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Integer getPhoneNumber() {
        return phoneNumber;
    }
}