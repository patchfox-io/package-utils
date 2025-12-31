package io.patchfox.package_utils.util;


/**
 * Container for two objects which should be handled as a single unit,
 * which may or may not be of the same type
 * 
 * @param <L>
 * @param <R>
 */
public class Pair<L,R> {

    private final L left;
    private final R right;

    /**
     * Builds a new Pair object
     * 
     * @param left
     * @param right
     */
    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Getter for the Left object
     * @return
     */
    public L getLeft() { return left; }

    /**
     * Getter for the Right object
     * @return
     */
    public R getRight() { return right; }

    @Override
    public int hashCode() { return left.hashCode() ^ right.hashCode(); }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) return false;
        Pair pairo = (Pair) o;
        return this.left.equals(pairo.getLeft()) && this.right.equals(pairo.getRight());
    }

    @Override
    public String toString() {
        return "Pair<" + this.left + ", " + this.right + ">";
    }

}
