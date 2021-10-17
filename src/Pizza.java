public class Pizza {
    //Code by Jacob - start

    //Attributes of class Pizza
    private int id;
    private int price;
    private String name;
    private String ingredient;
    private boolean completed;

    //Constructor (utilized in class Menu)
    public Pizza(int id, int price, String name, String ingredient) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.ingredient = ingredient;
        this.completed = false;
    }

    @Override
    //Customized toString that prints a formatted version of a Pizza object
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
    //method returns the name of a pizza
    public String getName() {
        return name;
    }

    //method returns the completed boolean of a pizza object
    public boolean getCompleted() {
        return completed;
    }

    //method sets the completed boolean of a pizza object
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    //Code by Balthazar - end
}
