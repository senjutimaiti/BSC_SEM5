class Employee
{
    private String name;
    private String address;
    private long panNumber;
    private float baseSalary;

    /*parameterized constructor*/
    protected Employee(String name, String address, long panNumber, float baseSalary)
    {
        this.setName(name);
        this.setAddress(address);
        this.setPanNumber(panNumber);
        this.setBaseSalary(baseSalary);
    }

    /*setters*/
    protected void setName(String name)
    {
        this.name = name;
    }
    protected void setAddress(String address)
    {
        this.address = address;
    }
    protected void setPanNumber(long panNumber)
    {
        this.panNumber = panNumber;
    }
    protected void setBaseSalary(float baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    /*getters*/
    protected String getName()
    {
        return this.name;
    }
    protected String getAddress()
    {
        return this.address;
    }
    protected long getPanNumber()
    {
        return this.panNumber;
    }
    protected float getBaseSalary()
    {
        return this.baseSalary;
    }

    protected float getGrossSalary()
    {
        float grossSalary = getBaseSalary();
        return grossSalary;
    }

    protected void showDetails()
    {
        System.out.println("\nName: "+getName());
        System.out.println("\nAddress: "+getAddress());
        System.out.println("\nPan Number: "+getPanNumber());
        System.out.println("\nBase Salary: "+getBaseSalary()+"\n");
    }
}

class Manager extends Employee
{
    private float commission;
    private String department;

    Manager(float commission, String department, String name, String address, long panNumber, float baseSalary)
    {
        super(name, address, panNumber, baseSalary);
        this.setCommision(commission);
        this.setDepartment(department);
    }

    /*setters*/
    protected void setCommision(float commission)
    {
        this.commission = commission;
    }
    protected void setDepartment(String department)
    {
        this.department = department;
    }

    /*getters*/
    protected float getCommission()
    {
        return this.commission;
    }
    protected String getDepartment()
    {
        return this.department;
    }

    /*Overriding methods*/

    @Override
    protected float getGrossSalary()
    {
        float grossSalary = super.getBaseSalary() + getCommission();
        return grossSalary;
    }

    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("\nCommission: " + getCommission());
        System.out.println("\nDepartment: " + getDepartment()+"\n");
    }

}

class ProjectLeader extends Employee
{
    private int projectId;
    private int projectAllowance;

    protected ProjectLeader(int projectId, int projectAllowance, String name, String address, long panNumber, float baseSalary)
    {
        super(name, address, panNumber, baseSalary);
        this.setProjectId(projectId);
        this.setProjectAllowance(projectAllowance);
    }

    /*setters*/
    protected void setProjectId(int projectId)
    {
        this.projectId = projectId;
    }
    protected void setProjectAllowance(int projectAllowance)
    {
        this.projectAllowance = projectAllowance;
    }

    /*getters*/
    protected int getProjectId()
    {
        return this.projectId;
    }
    protected int getProjectAllowance()
    {
        return this.projectAllowance;
    }

    /*Overriding methods*/

    @Override
    protected float getGrossSalary()
    {
        float grossSalary = super.getBaseSalary();
        return grossSalary;
    }

    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("\nProjectId: " + getProjectId());
        System.out.println("\nProjectAllowance: " +getProjectAllowance()+"\n");
    }

}

/*Driver code*/
public class A18
{
    public static void main(String[] args)
    {
        System.out.println("\nPrinting project leader details\n");
        ProjectLeader object = new ProjectLeader(1, 10, "harsh", "45/6 Random Address", 1234567890, 56000.0f);
        object.showDetails();

        System.out.println("\nPrinting manager details\n");
        Manager object1 = new Manager(30000.0f, "Developmment", "Arjun", "23/1 Random Address", 4567321289L, 87000.0f);
        object1.showDetails();
    }

}
