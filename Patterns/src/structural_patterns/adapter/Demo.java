package structural_patterns.adapter;

import structural_patterns.adapter.adapters.SquarePegAdapter;
import structural_patterns.adapter.round.RoundHole;
import structural_patterns.adapter.round.RoundPeg;
import structural_patterns.adapter.square.SquarePeg;

public class Demo {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        if (hole.fits(peg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSquarePegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if (!hole.fits(largeSquarePegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
