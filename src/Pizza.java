public class Pizza {
    //Code by Timmie & Jacob - start

    private int id;
    private int price;
    private String name;


    public Pizza(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ".\t" + name + ":....................." +
                price + ",-";
    }
    //Code by Timmie & Jacob - end

    //Code by Balthazar - start
    public String getName() {
        return name;
    }
    //Code by Balthazar - end
}
