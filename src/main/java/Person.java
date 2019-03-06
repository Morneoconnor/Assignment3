public class Person implements IPerson{
    PersonModel obj = new PersonModel();

    public String PersonName()
    {
        String name = "Morne";
        obj.setName(name);
        return obj.getName();

    }
    public int WorkExperience()
    {
        int years = 2;
        obj.setYears(years);
        return obj.getYears();
    }
}
