public class Pizza {
    //Code by Jacob - start

    private int id;
    private int price;
    private String name;
    private String ingredient;
    private boolean completed;


    public Pizza(int id, int price, String name, String ingredient) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.ingredient = ingredient;
        this.completed = false;
    }

    @Override
    public String toString() {

        StringBuilder dot = new StringBuilder();
        for (int i = 0; i < 80 - (name.length() + ingredient.length()); i++) {
            dot.append(".");
        }
        return id + ".\t" + name + ": " + ingredient +
                dot + price + ",-";
    }
    //Code by Jacob - end

    //Code by Balthazar - start
    public String getName() {
        return name;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    //Code by Balthazar - end
}
