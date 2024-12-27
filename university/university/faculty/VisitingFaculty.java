package university.faculty;

import university.UniversityMember;

public class VisitingFaculty implements UniversityMember {
    private String name;
    private Integer id;
    private Integer phoneNumber;

    public VisitingFaculty(String name, Integer id, Integer phoneNumber) {
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
        return "Visiting Faculty";
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