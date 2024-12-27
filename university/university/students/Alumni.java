package university.students;

import university.UniversityMember;

public class Alumni implements UniversityMember { // Alumni class
    private String name;
    private Integer id;
    private Integer phoneNumber;

    public Alumni(String name, Integer id, Integer phoneNumber) { // constructor
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
        return "Alumni";
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