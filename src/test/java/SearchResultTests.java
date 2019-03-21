import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;


public class SearchResultTests {
    @Test
    public void elementInOneElementSequence(){
        int[] tabel={6};
        int key=6;

        SearchResult result= BinarySearch.search(key,tabel);
        Assert.assertEquals(true ,result.isFound());
        Assert.assertEquals(0,result.getPosition());
    }
    @Test
    public void elementNotInOneElementSequence(){

    }
    @Test
    public void elementIsFirstElementOfSequence(){

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
