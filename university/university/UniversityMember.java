package university;

public interface UniversityMember { // universitymember interface
    String getName();
    String getRole();
    Integer getId();
    Integer getPhoneNumber();

    default String getFullDetails() { // default method to get a formatted string with all details
        return String.format("Member's name is: %s\nRole: %s\nID: %d\nPhone Number: %d",
                getName(), getRole(), getId(), getPhoneNumber());
    }
}


