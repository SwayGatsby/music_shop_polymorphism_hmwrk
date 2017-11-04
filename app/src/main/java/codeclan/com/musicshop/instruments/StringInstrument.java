package codeclan.com.musicshop.instruments;

/**
 * Created by user on 04/11/2017.
 */

public class StringInstrument extends Instrument {
    private int numOfStrings;
    private String playMethod;

    public StringInstrument(String name, double buyPrice, double sellPrice, int numOfStrings, String playMethod) {
        super(name, buyPrice, sellPrice);
        this.numOfStrings = numOfStrings;
        this.playMethod = playMethod;
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


