import java.util.ArrayList;

public class Chef {
    /*(4 pont) Implementálja a Chef osztályt, ami éttermi fogások neveit és árait kezeli (recipe, price).
     Az osztálynak rendelkeznie kell egy newRecipe (új fogás hozzáadása adott árral), egy removeRecipe (adott elem törlése)
      és egy getMenu (egy String-ben visszaadja az aktuálisan tárolt fogások adatait: <fogás> <ár> formátumban) metódussal.*/
    protected String recipe;
    protected int price;


    public static ArrayList<Chef> receptek = new ArrayList<>();


    public Chef() {

    }


    public static void newRecipe(String recipe, int price) {
        ArrayList<String> nevek = new ArrayList<>();
        if (receptek.isEmpty()) {
            receptek.add(new Chef(recipe, price));
        } else {
            for (int i = 0; i < receptek.size(); i++) {
                nevek.add(receptek.get(i).getRecipe());
            }
            if (!nevek.toString().contains(recipe)) {
                receptek.add(new Chef(recipe, price));
            }
        }
    }
    public static ArrayList<Chef> removeRecipe(String recipe){
        for(int i = 0; i< receptek.size();i++){
            if(receptek.get(i).recipe == recipe){
                receptek.remove(i);
            }
        }
        return receptek;
    }

    public  String getMenu(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < receptek.size(); i++) {
            builder.append(receptek.get(i).getRecipe()).append(" ").append(receptek.get(i).getPrice());
            if (i < receptek.size() - 1) {
                builder.append("\r\n");
            }
        }
            return builder.toString();
    }



















    public Chef(String recipe, int price) {
        this.recipe = recipe;
        this.price = price;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Chef{" +
                "recipe='" + recipe + '\'' +
                ", price=" + price +
                '}';
    }
}
