package streampractice;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class CollectionsUsingStreamsTest {


    @Test
    public void isPresentReturnsIfElementPresent() {

        List<String> list = Arrays.asList("a", "b", "c");

        CollectionsUsingStreams collectionsUsingStreams = new CollectionsUsingStreams();

        boolean result = collectionsUsingStreams.isPresent(list, "c");

        Assert.assertTrue(result);
    }

    @Test
    public void removeFromListAndReturnFilteredList() {

        List<String> list = Arrays.asList("a", "b", "c");

        CollectionsUsingStreams collectionsUsingStreams = new CollectionsUsingStreams();

        List<String> newList = collectionsUsingStreams.removeFromList(list, "c");

        Assert.assertThat(newList.size(), is(2));
        Assert.assertFalse(newList.contains("c"));
    }


}