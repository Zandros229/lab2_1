import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;


public class SearchResultTests {

    @Test
    public void elementInOneElementSequence(){
        int[] tabel={6};
        final int KEY=6;
        final int EXPECTED=-1;

        SearchResult result= BinarySearch.search(KEY,tabel);
        Assert.assertEquals(true ,result.isFound());
        Assert.assertEquals(EXPECTED,result.getPosition());
    }
    @Test
    public void elementNotInOneElementSequence(){
        int[] tabel={4};
        final int KEY=6;
        final int EXPECTED=-1;

        SearchResult result= BinarySearch.search(KEY,tabel);
        Assert.assertEquals(false ,result.isFound());
        Assert.assertEquals(EXPECTED,result.getPosition());
    }
    @Test
    public void elementIsFirstElementOfSequence(){
        int[] tabel={4,5,6,7};
        final int KEY=4;
        final int EXPECTED=0;

        SearchResult result= BinarySearch.search(KEY,tabel);
        Assert.assertEquals(true ,result.isFound());
        Assert.assertEquals(EXPECTED,result.getPosition());
    }
    @Test
    public void elementIsLastElementOfSequence(){

    }
    @Test
    public void elementIsMiddleElementOfSequence(){

    }
    @Test
    public void elementNotInSequence(){

    }


}