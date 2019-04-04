import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.jupiter.api.*;


public class SearchResultTests {

    @Test
    public void elementInOneElementSequence() {
        int[] tabel = {6};
        final int KEY = 6;
        final int EXPECTED = 0;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(true, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void elementNotInOneElementSequence() {
        int[] tabel = {4};
        final int KEY = 6;
        final int EXPECTED = -1;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(false, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void elementIsFirstElementOfSequence() {
        int[] tabel = {4 ,7,65,68,70,80,90,97,345, 367, 789};
        final int KEY = 4;
        final int EXPECTED = 0;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(true, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void elementIsLastElementOfSequence() {
        int[] tabel = {1, 3, 4,5 ,67,89,96,123,456,678};
        final int KEY = 678;
        final int EXPECTED = tabel.length - 1;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(true, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void elementIsMiddleElementOfSequence() {
        int[] tabel = {0, 2,3 ,5, 6,9,12,18,23,67};
        final int KEY = 6;
        final int EXPECTED = 4;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(true, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void elementNotInSequence() {
        int[] tabel = {3, 4, 5, 6, 7,785,1120};
        final int KEY = 8;
        final int EXPECTED = -1;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(false, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void sequenceOfZeroLength() {
        int[] tabel = {};
        final int KEY = 8;

        Assertions.assertThrows(IllegalArgumentException.class, () -> BinarySearch.search(KEY, tabel));

    }


}
