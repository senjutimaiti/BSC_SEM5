class Student2
{
    private String name;
    private String section;

    protected Student2(String name, String section)
    {
        this.setName(name);
        this.setSection(section);
    }

    private void setName(String name)
    {
        this.name = name;
    }
    private void setSection(String section)
    {
        this.section = section;
    }
    protected String getName()
    {
        return this.name;
    }
    protected String getSection()
    {
        return this.section;
    }

    protected boolean isEqual(Student2 o1, Student2 o2)
    {
        if(o1 == o2)
            return true;

        if(o1.getName().equals(o2.getName()) && o1.getSection().equals(o2.getSection()))
            return true;

        return false;
    }
}



public class StudentDriver 
{
    public static void main(String[] args)
    {
        Student2 object1 = new Student2("Bruno","A");
        Student2 object2;

        //object2 = object1;

        //object2 = new Student2("Bruno","A");

        object2 = new Student2("Bruni","B");

        System.out.println(object1.isEqual(object1, object2));

    }
}
