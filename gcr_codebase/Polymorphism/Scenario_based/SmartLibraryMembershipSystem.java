class LibraryMember {
    String memberName;
    String memberId;
    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }
    double calculateFine(int overdueDays) {
        return 0;
    }
    void printDetails() {
        System.out.println(memberName + "  " + memberId);
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String name, String id) {
        super(name, id);
    }
    double calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String name, String id) {
        super(name, id);
    }
    double calculateFine(int days) {
        return days * 1;
    }
}

class GuestMember extends LibraryMember {
    GuestMember(String name, String id) {
        super(name, id);
    }
    double calculateFine(int days) {
        return days * 5;
    }
}

public class SmartLibraryMembershipSystem {
    static void searchMember(LibraryMember[] members, String id) {
        for (LibraryMember m : members) {
            if (m.memberId.equals(id)) {
                System.out.println("\nMember Found");
                m.printDetails();
                return;
            }
        }
        System.out.println("Member Not Found");
    }

    public static void main(String[] args) {
        LibraryMember[] members = {
                new StudentMember("Rishabh", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Amit", "G301")
        };
        int overdueDays = 5;
        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine = " + m.calculateFine(overdueDays));
            System.out.println();
        }
        searchMember(members, "F201");
    }
}