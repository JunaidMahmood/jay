package model;

/**
 * Created by junaid on 23/03/2017.
 */
public class Coordinates {
    private int x ;
    private int y;

    public  Coordinates (int x , int y){
        this.x = x ;
        this.y = y ;
    }

    public void setX (int x){
        this.x = x ;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
