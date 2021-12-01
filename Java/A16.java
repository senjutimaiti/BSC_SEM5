import java.util.Scanner;

class LibraryMember2
{
    long memberId;
    String memberName;
    String address;
    long phoneNumber;
    Scanner sc = new Scanner(System.in);

    LibraryMember2()
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

    String getName()
    {
        return memberName;
    }
}

class Student2 extends LibraryMember2
{
    long rollNumber;
    String stream;
    //LibraryMember2 obj = new LibraryMember2();

    Student2()
    {
        rollNumber = -1;
        stream = null;
    }

    void read()
    {
        super.read();

        System.out.println("\nEnter roll number: ");
        rollNumber = super.sc.nextLong();

        super.sc.nextLine();
        System.out.println("\nEnter stream: ");
        stream = super.sc.nextLine();
    }

    void display()
    {
        super.display();
        System.out.println("Roll number: "+ rollNumber);
        System.out.println("Stream: "+ stream);
    }

    String getName()
    {
        String num = super.getName();
        return num;
    }
}

class Faculty2 extends LibraryMember2
{
    long facultyId;
    //LibraryMember2 obj = new LibraryMember2();

    Faculty2()
    {
        facultyId = -1;
    }

    void read()
    {
        super.read();

        System.out.println("\nEnter faculty Id: ");
        facultyId = super.sc.nextLong();
    }

    void display()
    {
        super.display();
        System.out.println("Roll number: "+ facultyId);
    }

    String getName()
    {
        String num = super.getName();
        return num;
    }
}

public class A16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of members: ");
        int c=0,temp,n = sc.nextInt();

        LibraryMember2[] arr= new LibraryMember2[n];

        System.out.println("Enter member details: ");
        for (int i=0; i<n; i++)
        {
            System.out.println("Press 1 for student and 0 for faculty");
            c = sc.nextInt();
            if (c==1)
            {
                arr[i] = new Student2();
                arr[i].read();
                //arr[i].display();
            }
            else
            {
                arr[i] = new Faculty2();
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
                    String enteredValue = sc.next();
                    temp=0;
                    for(int i=0; i<n; i++)
                    {
                        String num = arr[i].getName();
                        if (num.equals(enteredValue)){
                            System.out.println("Found");
                            temp++;
                            break;
                        }
                    }
                    if(temp==0)
                        System.out.println("Not Found");
                }break;

                case 2:{
                    System.out.println("Enter the value to be searched: ");
                    String enteredValue = sc.next();
                    temp=0;
                    for(int i=0; i<n; i++)
                    {
                        String num = arr[i].getName();
                        if (num.equals(enteredValue)){
                            arr[i].display();
                            temp++;
                        }
                    }
                    if(temp==0)
                        System.out.println("Not Found");
                }break;
                case 3: break;
                default: System.out.println("Invalid Input");
            }
        }
        sc.close();
    }
}