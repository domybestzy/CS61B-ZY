import org.junit.Test;

public class IntListTest {

    /**
     * Example test that verifies correctness of the IntList.of static
     * method. The main point of this is to convince you that
     * assertEquals knows how to handle IntLists just fine.
     */

    @Test
    public void testList() {
        Intlist.IntList one = new Intlist.IntList(1, null);
        Intlist.IntList twoOne = new Intlist.IntList(2, one);
        Intlist.IntList threeTwoOne = new Intlist.IntList(3, twoOne);

        Intlist.IntList x = Intlist.IntList.of(3, 2, 1);
        assertEquals(threeTwoOne, x);
    }

    @Test
    public void testdSquareList() {
        Intlist.IntList L = Intlist.IntList.of(1, 2, 3);
        Intlist.IntList.dSquareList(L);
        assertEquals(Intlist.IntList.of(1, 4, 9), L);
    }

    /**
     * Do not use the new keyword in your tests. You can create
     * lists using the handy IntList.of method.
     * <p>
     * Make sure to include test cases involving lists of various sizes
     * on both sides of the operation. That includes the empty of, which
     * can be instantiated, for example, with
     * IntList empty = IntList.of().
     * <p>
     * Keep in mind that dcatenate(A, B) is NOT required to leave A untouched.
     * Anything can happen to A.
     */

    @Test
    public void testSquareListRecursive() {
        Intlist.IntList L = Intlist.IntList.of(1, 2, 3);
        Intlist.IntList res = Intlist.IntList.squareListRecursive(L);
        assertEquals(Intlist.IntList.of(1, 2, 3), L);
        assertEquals(Intlist.IntList.of(1, 4, 9), res);
    }

    @Test
    public void testDcatenate() {
        Intlist.IntList A = Intlist.IntList.of(1, 2, 3);
        Intlist.IntList B = Intlist.IntList.of(4, 5, 6);
        Intlist.IntList exp = Intlist.IntList.of(1, 2, 3, 4, 5, 6);
        assertEquals(exp, Intlist.IntList.dcatenate(A, B));
        assertEquals(Intlist.IntList.of(1, 2, 3, 4, 5, 6), A);
    }

    @Test
    public void testCatenate() {
        Intlist.IntList A = Intlist.IntList.of(1, 2, 3);
        Intlist.IntList B = Intlist.IntList.of(4, 5, 6);
        Intlist.IntList exp = Intlist.IntList.of(1, 2, 3, 4, 5, 6);
        assertEquals(exp, Intlist.IntList.catenate(A, B));
        assertEquals(Intlist.IntList.of(1, 2, 3), A);
    }

}
