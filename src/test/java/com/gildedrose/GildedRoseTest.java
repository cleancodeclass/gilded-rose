package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void gildedRose_create_test() {

		//Given
		Item[] items = new Item[] {};
		
		//When
		GildedRose gildedRose = new GildedRose(items);
		
		//Then
		assertNotNull(gildedRose);
		
	}

	@Test
	public void normalItem_판매기간0_품질0() {

		//Given
		Item[] items = new Item[] {new Item("Normal_Item",0,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//Then
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
		
	}


	@Test
	public void agedBrieItem_판매기간0_품질0() {

		//Given
		Item[] items = new Item[] {new Item("Aged Brie",0,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//Then
		assertEquals(-1, items[0].sellIn);
		assertEquals(2, items[0].quality);
		
	}

	@Test
	public void agedBrieItem_판매기간10_품질50() {

		//Given
		Item[] items = new Item[] {new Item("Aged Brie",10,50)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//Then
		assertEquals(9, items[0].sellIn);
		assertEquals(50, items[0].quality);
		
	}

	@Test
	public void backStagePassItem_판매기간0_품질0() {

		//Given
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",0,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//Then
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
		
	}

	@Test
	public void sulfurasItem_판매기간0_품질0() {

		//Given
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",0,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//Then
		assertEquals(0, items[0].sellIn);
		assertEquals(0, items[0].quality);
		
	}

	
}
