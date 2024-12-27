package university;

public abstract class UniversityMemberDatabase { // abs class for databse

    private UniversityMember[] members; // arr of uni members
    private int size;

    // constructor to init arr
    public UniversityMemberDatabase(int capacity) {
        members = new UniversityMember[capacity];
        size = 0;
    }

    // method to add member
    public void addMember(UniversityMember member) {
        if (size < members.length) {
            members[size++] = member;
        } else {
            System.out.println("Database is full. Cannot add more members.");
        }
    }

    // method to get member by id
    public UniversityMember getMember(int id) {
        for (int i = 0; i < size; i++) {
            if (members[i].getId() == id) {
                return members[i];
            }
        }
        return null;
    }

    // getter for members arr
    protected UniversityMember[] getMembers() {
        return members;
    }

    // getter for size
    public int getSize() {
        return size;
    }
}
