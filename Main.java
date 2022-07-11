public class Main {

    public static void main(String[] args) {

        var item = "Shirt";
        var size = "XL";
        var price = 19.99;
        var color = "Blue";

        var template = "Clothing item: %s, size %s, color %s, $%.2f";
        var itemString = String.format(template,
                item, size, color, price);
        System.out.println(itemString);
    }
}
