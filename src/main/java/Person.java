public class Person {
    private String name;
    private static int personCounter;
    public Person()
    {
        personCounter++;
    }
    public Person(String name)
    {
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public String DisplayName(String name)
    {
        return "Hi " + name;
    }
    public static int NumberOfPersons()
    {
        return personCounter;
    }


}
