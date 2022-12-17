

public abstract class Burger {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void toService(String type) {
        System.out.println("Your "+type+" will be served after payment.");
    }
}
