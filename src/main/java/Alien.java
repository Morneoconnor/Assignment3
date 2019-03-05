public class Alien {
    private String name;
    private static int alienCounter;
    public Alien()
    {
        alienCounter++;
    }
    public Alien(String name)
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
    public static int NumberOfAliens()
    {
        return alienCounter;
    }
}
