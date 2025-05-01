package adapter.linear;

// Adapter class wrapping Vector3D (Service class) in a Polynomial interface
// that P2 (the client class) can understand
public class P2ToVector3DAdapter implements Polynomial {
    private Vector3D v;

    public P2ToVector3DAdapter(Vector3D v) {
        this.v = v;
    }

    @Override
    public int getInnerProduct(Polynomial q) {
        return v.dotProduct3D(new Vector3D(q.getA(), q.getB(), q.getC()));
    }

    @Override
    public int getA() {
        return v.getX();
    }

    @Override
    public int getB() {
        return v.getY();
    }

    @Override
    public int getC() {
        return v.getZ();
    }
}
