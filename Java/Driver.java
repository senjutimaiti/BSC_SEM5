abstract class employee2
{
    private String name;
    private String address;
    private double salary;

    employee2(String name, String address, double salary)
    {
        this.setname(name);
        this.setaddress(address);
        this.setsalary(salary);
    }

    protected void setname(String name){
    	this.name = name;
    }
    protected void setaddress(String address){
    	this.address = address;
    }
    protected void setsalary(double salary){
    	this.salary = salary;
    }

    protected String getname(){
    	return this.name;
    }
    protected String getaddress(){
    	return this.address;
    }
    protected double getsalary(){
    	return this.salary;
    }

    abstract double netsalary();
    abstract void printDetails();
}

class manager2 extends employee2
{
	manager2(String name, String address, double salary){
		super(name,address,salary);
	}
    double netsalary()
    {
    	double sal = super.getsalary();
    	return (0.15*sal+0.14*sal+0.12*sal+sal);        
    }

    void printDetails()
    {
    	double net = this.netsalary();
    	String Name = super.getname();
    	String Address = super.getaddress();
    	double Salary = super.getsalary();
        System.out.println(Name+" "+Address+" "+Salary+" "+net);
    }
}

class clerk extends employee2
{
	clerk(String name, String address, double salary){
		super(name,address,salary);
	}
    double netsalary()
    {
    	double sal = super.getsalary();
    	return (0.15*sal+0.14*sal+0.12*sal+sal);        
    }

    void printDetails()
    {
    	double net = this.netsalary();
    	String Name = super.getname();
    	String Address = super.getaddress();
    	double Salary = super.getsalary();
        System.out.println(Name+" "+Address+" "+Salary+" "+net);
    }
}

public class Driver
{
    public static void main(String[] args)
    {
        manager2 ob = new manager2("Bruno","London",1000);
        ob.printDetails();

        clerk obj = new clerk("David","England",2000);
        obj.printDetails();
    }
}