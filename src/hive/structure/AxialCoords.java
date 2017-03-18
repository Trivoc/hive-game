package hive.structure;

/**
 * Created by trivo on 2017-03-18.
 */
public class AxialCoords {
    private int x;
    private int y;

    //Axial coordinates, x increases in "southeast" direction, y decreases vertically
    //    __    __
    //   /  \__/  \
    //   \__/  \__/
    //      \__/

    public AxialCoords(int x, int y){
        this.x = x;
        this.y = y;
    }

    public AxialCoords(AxialCoords coords){
        this.x = coords.getX();
        this.y = coords.getY();
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
