package hive.structure;

/**
 * Created by trivo on 2017-03-18.
 */
public class AxialCoords {
    private int x;
    private int y;

    //Axial coordinates, x increases in "southeast" direction, y decreases vertically
    //        ___
    //    ___/ 0 \___
    //   /-1 \_1_/ 1 \
    //   \_0_/ 0 \_1_/
    //       \_0_/

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AxialCoords that = (AxialCoords) o;

        if (x != that.x) return false;
        return y == that.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
