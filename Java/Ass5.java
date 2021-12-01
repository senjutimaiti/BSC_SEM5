import java.util.*;

/*Create a superclass ‘Person’ and two subclasses ‘Pupil’ and ‘Staff’. The following are the instance
variables and methods:
a. For ‘Person’ instance variables: name:String, address:String. Initiate variable through
constructor, incorporate one method setPerson() that updates Person variables , another
method tostring() that shows Person details as “Person[name=?,address=?”.*/


class Person 
{
    protected String name, address;

    Person(String name, String address) 
    {
        this.name = name;
        this.address = address;
    }

    protected void setPerson(String name, String address) 
    {
        this.name = name;
        this.address = address;
    }

    protected void tostring() 
    {
        System.out.println("Person Name = " + name + " Address = " + address);
    }
}

/*b. For ‘Student’ sub class instance variables: program:String, year:String, fees:double. Initiate
both ‘Student’ and ‘Person’ variables through constructor, incorporate one method
setStudent() that updates both student and ‘Person’ data, another method tostring() that shows
‘Person-Student’ details as “Person[name=?,address=?,Program=?,Year=?,Fees=?”.*/
class Pupil extends Person 
{
    private String program;
    private String year;
    private double fees;

    Pupil(String name, String address, String program, String year, double fees) 
    {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    public void setPupil(String name, String address, String program, double year, double fees) 
    {
        setPerson(name, address);
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    @Override
    public void tostring() 
    {
        System.out.println("Person Name = " + name + " Address = " + address + " Program = " + program + " Year = "
                + year + " Fees = " + fees);
    }
}

/*c. For ‘Staff’ subclass instance variables: school:String, pay:double. Initiate both ‘Staff’ and
‘Person’ variables through constructor, incorporate one method setStaff() that updates both
‘staff’ and ‘Person’ data, another method tostring() that shows ‘Person-Staff’ details as
“Person[name=?,address=?,School=?,Pays=?”.*/

class Staff extends Person 
{
    private String school;
    private double pay;

    Staff(String name, String address, String school, double pay) 
    {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public void setStaff(String name, String address, String school, double pay) 
    {
        setPerson(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public void tostring() 
    {
        System.out.println("Person Name = " + name + " Address = " + address + " School = " + school + " Pay = " + pay);
    }
}

class Ass5 
{
    public static void main(String args[]) 
    {
        Pupil Pupil = new Pupil("Sayan", "Rathtala", "BSc. Computer Science", "2020", 30000);
        Staff staff = new Staff("Bob", "Dunlop", "Dummy", 30000);

        Pupil.tostring();
        staff.tostring();

        Pupil.setPupil("Changed Pupil", "New rathtala", "MSc Computer Science", "2020", 60000);
        staff.setStaff("New Staff Name", "New address", "New Dummy", 60000);

        Pupil.tostring();
        staff.tostring();
    }
}

