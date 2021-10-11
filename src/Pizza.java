public class Pizza {
    //Code of Jacob (start)
    public int id;
    public int price;
    public String name;


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
}
