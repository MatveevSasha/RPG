package fighter;

public interface Fighter {
    int attack();
}
interface FightCallback {
    void fightWin();
    void fightLost();
}
