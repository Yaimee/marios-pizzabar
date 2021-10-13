public class Pizza {
    //Code by Jacob - start

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

        StringBuilder dot = new StringBuilder();
        for (int i = 0; i < 35-name.length(); i++) {
            dot.append(".");
        }
        return id + ".\t" + name + ":" +
                dot + price + ",-";
    }
    //Code by Jacob - end

    //Code by Balthazar - start
    public String getName() {
        return name;
    }
    //Code by Balthazar - end
}
