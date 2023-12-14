package bg.smg;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Jacket> jackets = new ArrayList<>();
        jackets.add(new Jacket("Gucci","Spring",79.99));
        jackets.add(new Jacket("Armani","Summer",99.99));
        jackets.add(new Jacket("Northface","Fall",129.99));
        jackets.add(new Jacket("Louis Vuitton","Winter",49.99));
        Collections.sort(jackets);
        for (Jacket jacket : jackets){
            System.out.println(jacket);
            jacket.sell();
        }
    }
}
