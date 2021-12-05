import java.util.Scanner;

class LibraryMember
{
    long memberId;
    String memberName;
    String address;
    long phoneNumber;
    Scanner sc = new Scanner(System.in);

    LibraryMember()
    {
        memberId = -1;
        memberName = null;
        address = null;
        phoneNumber = -1;
    }

    void read()
    {
        System.out.println("\nEnter id: ");
        memberId = sc.nextLong();

        sc.nextLine();
        System.out.println("\nEnter name: ");
        memberName = sc.nextLine();

        System.out.println("\nEnter addresss: ");
        address = sc.nextLine();

        System.out.println("\nEnter phone number: ");
        phoneNumber = sc.nextLong();
    }

    void display()
    {
        System.out.println("Id: "+ memberId);
        System.out.println("Name: "+ memberName);
        System.out.println("Address: "+ address);
        System.out.println("Phone number: "+ phoneNumber);
    }

    long getId()
    {
        return memberId;
    }
}

class Student extends LibraryMember
{
    long rollNumber;
    String stream;
    LibraryMember obj = new LibraryMember();

    Student()
    {
        rollNumber = -1;
        stream = null;
    }

    void read()
    {
        obj.read();

        System.out.println("\nEnter roll number: ");
        rollNumber = obj.sc.nextLong();

        obj.sc.nextLine();
        System.out.println("\nEnter stream: ");
        stream = obj.sc.nextLine();
    }

    void display()
    {
        obj.display();
        System.out.println("Roll number: "+ rollNumber);
        System.out.println("Stream: "+ stream);
    }

    long getId()
    {
        long num = obj.getId();
        return num;
    }
}

class Faculty extends LibraryMember
{
    long facultyId;
    LibraryMember obj = new LibraryMember();

    Faculty()
    {
        facultyId = -1;
    }

    void read()
    {
        obj.read();

        System.out.println("\nEnter faculty Id: ");
        facultyId = obj.sc.nextLong();
    }

    void display()
    {
        obj.display();
        System.out.println("Roll number: "+ facultyId);
    }

    long getId()
    {
        long num = obj.getId();
        return num;
    }
}

public class Driver1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of members: ");
        int c=0,n = sc.nextInt();

        LibraryMember[] arr= new LibraryMember[n];

        System.out.println("Enter member details: ");
        for (int i=0; i<n; i++)
        {
            System.out.println("Press 1 for student and 0 for faculty");
            c = sc.nextInt();
            if (c==1)
            {
                arr[i] = new Student();
                arr[i].read();
                //arr[i].display();
            }
            else
            {
                arr[i] = new Faculty();
                arr[i].read();
                //arr[i].display();
            }
        }
        
        while(c!=3)
        {
            System.out.println("Press 1 for search and 2 for display and 3 to exit");
            c = sc.nextInt();

            switch(c){
                case 1: {
                    System.out.println("Enter the value to be searched: ");
                    long enteredValue = sc.nextInt();
                    for(int i=0; i<n; i++)
                    {
                        long num = arr[i].getId();
                        if (num == enteredValue)
                            System.out.println("Yes Found");
                    }
                }break;

                case 2:{
                    System.out.println("Enter the value to be searched: ");
                    long enteredValue = sc.nextInt();
                    for(int i=0; i<n; i++)
                    {
                        long num = arr[i].getId();
                        if (num == enteredValue)
                            arr[i].display();
                    }
                }break;
                case 3: break;
                default: System.out.println("Invalid Input");
            }
        }
    }
}