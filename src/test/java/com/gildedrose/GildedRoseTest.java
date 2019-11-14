package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;

public class GildedRoseTest {
	
	private static final String NO_NAME = "noname";

	@Test
	public void should_be_nothing_when_no_item(){
		// given (arrange)
		Item[] items = new Item[]{};
		GildedRose gildedRose = new GildedRose(items);
		
		// when (act)
		gildedRose.updateQuality();
		
		// then (assert)
		assertEquals(0, items.length);
	}
	
	@Test
	public void quality_of_noname_is_0_when_quality_is_0(){
		Item[] items = new Item[]{new Item(NO_NAME, 0, 0)};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(0, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}
	
	@Test
	public void quality_of_noname_is_0_when_quality_is_1(){
		Item[] items = new Item[]{new Item(NO_NAME, 0, 1)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(0, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}

	@Test
	public void quality_of_noname_is_1_when_quality_is_3(){
		Item[] items = new Item[]{new Item(NO_NAME, 0, 3)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(1, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}
	
	@Test
	public void quality_of_noname_is_2_when_quality_is_3_and_sellin_1(){
		Item[] items = new Item[]{new Item(NO_NAME, 1, 3)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(2, items[0].quality);
		assertEquals(0, items[0].sellIn);
	}
	
	@Test
	public void quality_of_SULFURAS_is_0_when_quality_is_0(){
		Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(0, items[0].quality);
		assertEquals(0, items[0].sellIn);
	}

	@Test
	public void quality_of_SULFURAS_is_1_when_quality_is_1(){
		Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 1)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(1, items[0].quality);
		assertEquals(0, items[0].sellIn);
	}
	
	@Test
	public void quality_of_SULFURAS_is_1_when_quality_is_1_and_sellin_is_minus_1(){
		Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 1)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(1, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}

	@Test
	public void quality_of_BRIE_is_2_when_quality_is_0(){
		Item[] items = new Item[]{new Item("Aged Brie", 0, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(2, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}
	
	@Test
	public void quality_of_BRIE_is_1_when_quality_is_0_and_sellin_is_1(){
		Item[] items = new Item[]{new Item("Aged Brie", 1, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(1, items[0].quality);
		assertEquals(0, items[0].sellIn);
	}
	
	@Test
	public void quality_of_BRIE_is_51_when_quality_is_51(){
		Item[] items = new Item[]{new Item("Aged Brie", 0, 51)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(51, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}
	
	@Test
	public void quality_of_BRIE_is_51_when_quality_is_49(){
		Item[] items = new Item[]{new Item("Aged Brie", 0, 49)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(50, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}
	
	@Test
	public void quality_of_BACKSTAGE_is_0_when_quality_is_0(){
		Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(0, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}
	
	
	@Test
	public void quality_of_BACKSTAGE_is_1_when_sellin_is_12(){
		Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 12, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(1, items[0].quality);
		assertEquals(11, items[0].sellIn);
	}
	
	
	@Test
	public void quality_of_BACKSTAGE_is_0_when_quality_is_49(){
		Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(0, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}
	
	@Test
	public void quality_of_BACKSTAGE_is_0_when_quality_is_51(){
		Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 51)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(0, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}
}
