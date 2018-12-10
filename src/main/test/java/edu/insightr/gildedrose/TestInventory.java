package edu.insightr.gildedrose;

//import com.sun.tools.corba.se.idl.constExpr.Equal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInventory {
    protected Inventory inv;
    Item[] FormerList;
    @Before
    public void setUp(){
        inv=new Inventory();
        FormerList = inv.getItems();
    }

    @Test
    public void TestUpdatQualityWhenSellInFinished () throws Exception{
        inv.updateQuality();
        Item[] ListItems = inv.getItems();
        for( int i=0;i<ListItems.length;i++){
            if(FormerList[i].getSellIn()== 0){
                int DiffBeforeAfter = (FormerList[i].getQuality())-(ListItems[i].getQuality());
                assertEquals(FormerList[i].getQuality()- 2*(DiffBeforeAfter),ListItems[i].getQuality());
            }
        }

    }
}
