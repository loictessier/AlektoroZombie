package Entities;

/**
 * Created by steven on 10/10/14.
 */
public class Player extends MovableEntity{

    static Player singleton = null;

    private Player() {
        super();
    }

    public Player getInstance() {
        if(singleton == null) {
            singleton = new Player();
        }
        return singleton;
    }
}
