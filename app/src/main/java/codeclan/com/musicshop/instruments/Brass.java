package codeclan.com.musicshop.instruments;

/**
 * Created by user on 04/11/2017.
 */

public class Brass extends Instrument {
    BrassInstrumentType type;
    private String family;

    public Brass(BrassInstrumentType type, double buyPrice, double sellPrice, String family) {
        super(buyPrice, sellPrice);
        this.type = type;
        this.family = family;
    }

    public String play(){
        return "Brass sound";
    }

    public String getFamily() {
        return this.family;
    }

    public BrassInstrumentType getInstrumentName(){
        return this.type;
    }

}


