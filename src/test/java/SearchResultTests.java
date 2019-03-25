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
        int[] tabel = {4, 5, 6, 7};
        final int KEY = 4;
        final int EXPECTED = 0;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(true, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void elementIsLastElementOfSequence() {
        int[] tabel = {4, 5, 6, 7};
        final int KEY = 7;
        final int EXPECTED = tabel.length - 1;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(true, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void elementIsMiddleElementOfSequence() {
        int[] tabel = {3, 4, 5, 6, 7};
        final int KEY = 5;
        final int EXPECTED = 2;

        SearchResult result = BinarySearch.search(KEY, tabel);
        Assertions.assertEquals(true, result.isFound());
        Assertions.assertEquals(EXPECTED, result.getPosition());
    }

    @Test
    public void elementNotInSequence() {
        int[] tabel = {3, 4, 5, 6, 7};
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
