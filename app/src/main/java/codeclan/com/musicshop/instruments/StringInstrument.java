package codeclan.com.musicshop.instruments;

/**
 * Created by user on 04/11/2017.
 */

public class StringInstrument extends Instrument {
    private int numOfStrings;
    private String playMethod;
    private StringInstrumentType type;

    public StringInstrument(StringInstrumentType type, double buyPrice, double sellPrice, int numOfStrings, String playMethod) {
        super(buyPrice, sellPrice);
        this.numOfStrings = numOfStrings;
        this.playMethod = playMethod;
        this.type = type;
    }

    public StringInstrumentType getType(){
        return this.type;
    }

    public String play(){
        return "String sound";
    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }

    public String getPlayMethod() {
        return playMethod;
    }
}


