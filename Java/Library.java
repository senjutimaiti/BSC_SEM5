import java.util.Scanner;

class LibraryMember
{
    private int memberId;
    private String memberName;
    private String address;
    private long phoneNumber;

    protected LibraryMember(int memberId, String memberName, String address, long phoneNumber)
    {
        this.setMemberId(memberId);
        this.setMemberName(memberName);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
    }

    private void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }
    private void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }
    private void setAddress(String address)
    {
        this.address = address;
    }
    private void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    protected String getMemberName()
    {
        return this.memberName;
    }

    void displayDetails()
    {
        System.out.println("\nMember Id: " + this.memberId + "\nMember Name: " + this.memberName + "\nAddress: " + this.address + "\nPhone Number: " + this.phoneNumber);
        return;
    }
}

class Student extends LibraryMember
{
    int rollNo;
    String stream;

    protected Student(int memberId, String memberName, String address, long phoneNumber, int rollNo, String stream)
    {
        super(memberId, memberName, address, phoneNumber);

        this.setRollNo(rollNo);
        this.setStream(stream);
    }

    private void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    private void setStream(String stream)
    {
        this.stream = stream;
    }

    @Override
    protected String getMemberName()
    {
        return super.getMemberName();
    }

    @Override
    protected void displayDetails()
    {
        super.displayDetails();

        System.out.println("Roll No: " + rollNo + "\nStream: " + stream+"\n");

        return;
    }
}

class Faculty extends LibraryMember
{
    int facultyId;
    String designation;

    protected Faculty(int memberId, String memberName, String address, long phoneNumber, int facultyId, String designation)
    {
        super(memberId, memberName, address, phoneNumber);

        this.setFacultyId(facultyId);
        this.setDesignation(designation);
    }

    private void setFacultyId(int facultyId)
    {
        this.facultyId = facultyId;
    }
    private void setDesignation(String designation)
    {
        this.designation = designation;
    }

    @Override
    protected String getMemberName()
    {
        return super.getMemberName();
    }

    @Override
    protected void displayDetails()
    {
        super.displayDetails();

        System.out.println("Faculty Id: " + facultyId + "\ndesignation: " + designation+"\n");
        return;
    }
}

public class Library
{
    private static void getMemberDetails(LibraryMember[] listOfLibraryMembers)
    {        
        listOfLibraryMembers[0] = new Faculty(101, "FacultyName", "FacultyAddress", 10L, 90, "Designation");
        listOfLibraryMembers[1] = new Student(101, "StudentName", "StudentAddress", 20L, 400, "Stream");
        return;
    }

    private static boolean searchMember(LibraryMember[] listOfLibraryMembers, String memberName)
    {
        for(int i = 0; i < listOfLibraryMembers.length; i++)
        {
            if(listOfLibraryMembers[i].getMemberName().equals(memberName))
            {
                return true;
            }
        }
        return false;

    }

    private static void operations(LibraryMember[] listOfLibraryMembers)
    {
        int choice;
        String memberName;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Search Member\n2. Display Details\n3. Exit\nEnter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\nEnter member Name: ");
                    memberName = sc.next();

                    if(searchMember(listOfLibraryMembers, memberName) == true)
                        System.out.println("\nMember found\n");
                    else
                        System.out.println("\nMember not found\n");
                break;

                case 2:
                    System.out.println("\nEnter member Name: ");
                    memberName = sc.next();

                    for(int i = 0; i < listOfLibraryMembers.length; i++)
                        if(listOfLibraryMembers[i].getMemberName().equals(memberName))
                            listOfLibraryMembers[i].displayDetails();
                break;

                case 3:
                    sc.close();
                    return;

                default:
                    System.out.println("\nWrong choice");
            }
        }

    }

    public static void main(String[] args) 
    {
        LibraryMember[] listOfLibraryMembers = new LibraryMember[2];

        getMemberDetails(listOfLibraryMembers);
        operations(listOfLibraryMembers);
        
        return;
    }  
}