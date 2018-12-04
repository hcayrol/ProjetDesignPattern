package edu.insightr.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConjuredItems {

    @Test
    public void CheckQuality() throws Exception{
        Inventory inv = new Inventory();
        Item[] items = inv.getItems();

        Item conjured = items[5];
        assertThat(conjured.getName(), is("Conjured Mana Cake"));
        assertThat(conjured.getQuality(),is(6));
        inv.updateQuality();
        assertThat(conjured.getQuality(),is(4));
    }
}
