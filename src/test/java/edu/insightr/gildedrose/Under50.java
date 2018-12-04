package edu.insightr.gildedrose;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class Under50 {

    @Test
    public void Test()throws Exception{
        Inventory inv = new Inventory();
        Item[] items = inv.getItems();

        for(int i =0;i<items.length;i++){
            assertFalse(items[i].getQuality()<50);
        }
    }
}
