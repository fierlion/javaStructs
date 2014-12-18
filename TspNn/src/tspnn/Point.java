
package tspnn;

/**
 * @author rfoote
 */
public class Point {
    int x; 
    int y;

    public Point(int xIn, int yIn) {
	x = xIn;
	y = yIn;
    }

    @Override
    public String toString() {
	return String.format("(%d, %d)", x,y);
    }

    public int distanceFrom (Point other) {
	int dx = this.x - other.x;
	int dy = this.y - other.y;
	double dxSq = Math.pow(dx,2);
	double dySq = Math.pow(dy,2);
	double dDist = Math.sqrt(dxSq + dySq);
	//round dist to nearest int and return
	return (int)Math.round(dDist);
    }
}
