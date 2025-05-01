package adapter.linear;

// Client class to test the Adapter pattern
public class Client {
    public static void main(String[] args) {
        // Regular polynomial behaviour
        P2 p = new P2(1, -2, 3);
        System.out.println(p);

        // Regular vector behaviour
        Vector3D v = new Vector3D(1, -2, 3);
        Vector3D u = new Vector3D(4, 2, -7);
        System.out.println(v.dotProduct3D(u));
        System.out.println(v.crossProduct3D(u));

        // Adapted vector to polynomial behaviour
        Polynomial a = new P2ToVector3DAdapter(v);
        Polynomial b = new P2ToVector3DAdapter(u);
        System.out.println(a.getInnerProduct(b));
    }
}
