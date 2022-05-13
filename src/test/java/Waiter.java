public class Waiter extends Chef {
    /*(2 pont) Származtasson egy Waiter osztályt a Chef osztályból,
     melynek modifyPrice metódusával lehessen módosítani a Chef fogásainak árait.
     */
    public static void modifyPrice(String recipe, int price){
        for(Chef chef : receptek){
            if(chef.getRecipe().equals(chef.recipe)){
                newRecipe(recipe, price);
                receptek.set(receptek.indexOf(chef),new Chef(recipe, price));
                return;
            }
        }
    }
}
