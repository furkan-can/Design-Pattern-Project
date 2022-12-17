

public class BeverageOrder implements Command{
    Chef chef;
    String order;

    public BeverageOrder(Chef chef, String order){
        this.chef = chef;
        this.order= order;
    }


    @Override
    public void toOrder() {
    	chef.beverageType = order;
    	chef.getOrder("beverage");
    }
}
