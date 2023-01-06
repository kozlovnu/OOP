package Homework.hw004;

public class BeginsWith implements IsGood<String> {

    private String string;
    
    public BeginsWith(String string) {
        this.string = string;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(string);
    }
    
}
