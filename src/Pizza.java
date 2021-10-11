public class Pizza {
    //Code of Jacob (start)
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
    //Code of Jacob (end)
    //code of Balthazar (start)

    public String getName() {
        return name;
    }
    //code of Balthazar (end)
}
