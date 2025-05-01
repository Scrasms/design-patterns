package adapter.linear;

// Service class that is incompatible with the Client class
public class Vector3D {
    private int[] coords = new int[3];

    public Vector3D(int x, int y, int z) {
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
    }

    public int getX() {
        return coords[0];
    }

    public int getY() {
        return coords[1];
    }

    public int getZ() {
        return coords[2];
    }

    // Returns the dot product of the current vector with the given vector u
    public int dotProduct3D(Vector3D u) {
        return getX() * u.getX() + getY() * u.getY() + getZ() * u.getZ();
    }


    // Returns the cross product of the current vector with the given vector u
    public Vector3D crossProduct3D(Vector3D u) {
        int crossX = (getY() * u.getZ()) - (getZ() * u.getY());
        int crossY = (getZ() * u.getX()) - (getX() * u.getZ());
        int crossZ = (getX() * u.getY()) - (getY() * u.getX());

        return new Vector3D(crossX, crossY, crossZ);
    }

    public String toString() {
        return "<" + getX() + "," + getY() + "," + getZ() + ">";
    }
}
