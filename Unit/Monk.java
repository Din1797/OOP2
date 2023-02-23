package Unit;

public class Monk extends character{
    int confession;

    public Monk(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);
    }
    public int getConfession(){
        return 0;
    }
}
