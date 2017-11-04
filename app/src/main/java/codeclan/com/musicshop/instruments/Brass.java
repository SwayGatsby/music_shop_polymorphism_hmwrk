package codeclan.com.musicshop.instruments;

/**
 * Created by user on 04/11/2017.
 */

public class Brass extends Instrument {
    private String type;

    public Brass(String name, double buyPrice, double sellPrice, String type) {
        super(name, buyPrice, sellPrice);
        this.type = type;
    }

    public String play(){
        return "Brass sound";
    }

    public String canGetType() {
        return this.type;
    }


}


