package structural_patterns.adapter.round;

/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundpeg) {
        return this.getRadius() >= roundpeg.getRadius();
    }
}
