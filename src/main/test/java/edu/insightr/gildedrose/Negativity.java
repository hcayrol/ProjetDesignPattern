package edu.insightr.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class Negativity {

    @Test
    public void CheckQuality() throws Exception{
        Inventory inv = new Inventory();
        Item[] items = inv.getItems();
        Item itemtest = new Item("nouveau",20,0);
        items[3]=itemtest;

        assertThat(items[3].getQuality(),is(0));
        inv.updateQuality();
        assertThat(items[3].getQuality(),is(0));

    }

}
