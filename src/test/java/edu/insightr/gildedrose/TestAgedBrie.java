package java.edu.insightr.gildedrose;

import edu.insightr.gildedrose.Inventory;
import edu.insightr.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestAgedBrie {

    @Test
    public void checkQUality() throws Exception{
        Inventory inv = new Inventory();
        Item[] items = inv.getItems();

        Item conjured = items[1];
        assertThat(conjured.getName(), is("Aged Brie"));
        assertThat(conjured.getQuality(),is(0));
        inv.updateQuality();
        assertThat(conjured.getQuality(),is(1));
    }

}
