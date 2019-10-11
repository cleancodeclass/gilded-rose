package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;


public class GildedRoseTest {

	@Test
	public void GildedRose_Create() {
		//Gievn
		Item[] item = new Item[] {};
		
		//When
		GildedRose gildedRose = new GildedRose(item);
		
		//then
		assertNotNull(gildedRose);
	}
	
	@Test
	public void NormalItem_판매기간0_품질10() {
		//Gievn
		Item[] items = new Item[] {new Item("Noraml Item",0 ,10)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(-1, items[0].sellIn);
		assertEquals(8, items[0].quality);
	}
	
	@Test
	public void NormalItem_판매기간0_품질0() {
		//Gievn
		Item[] items = new Item[] {new Item("Noraml Item",0 ,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void NormalItem_판매기간0_품질50() {
		//Gievn
		Item[] items = new Item[] {new Item("Noraml Item",0 ,50)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(-1, items[0].sellIn);
		assertEquals(48, items[0].quality);
	}

	@Test
	public void AgedBrie_판매기간0_품질10() {
		//Gievn
		Item[] items = new Item[] {new Item("Aged Brie",0 ,10)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(-1, items[0].sellIn);
		assertEquals(12, items[0].quality);
	}

	@Test
	public void AgedBrie_판매기간0_품질0() {
		//Gievn
		Item[] items = new Item[] {new Item("Aged Brie",0 ,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(-1, items[0].sellIn);
		assertEquals(2, items[0].quality);
	}

	@Test
	public void BackStagePass_판매기간0_품질0() {
		//Gievn
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",0 ,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void BackStagePass_판매기간10_품질0() {
		//Gievn
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",10 ,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(9, items[0].sellIn);
		assertEquals(2, items[0].quality);
	}

	@Test
	public void BackStagePass_판매기간20_품질50() {
		//Gievn
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",20 ,50)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(19, items[0].sellIn);
		assertEquals(50, items[0].quality);
	}

	@Test
	public void BackStagePass_판매기간20_품질10() {
		//Gievn
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",20 ,10)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(19, items[0].sellIn);
		assertEquals(11, items[0].quality);
	}

	@Test
	public void BackStagePass_판매기간10_품질49() {
		//Gievn
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",10 ,49)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(9, items[0].sellIn);
		assertEquals(50, items[0].quality);
	}

	@Test
	public void BackStagePass_판매기간5_품질49() {
		//Gievn
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",5 ,49)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(4, items[0].sellIn);
		assertEquals(50, items[0].quality);
	}

	@Test
	public void Sulfuras_판매기간0_품질10() {
		//Gievn
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",0 ,10)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(0, items[0].sellIn);
		assertEquals(10, items[0].quality);
	}

	@Test
	public void Sulfuras_판매기간0_품질0() {
		//Gievn
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",0 ,0)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(0, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void Sulfuras_판매기간Minus1_품질10() {
		//Gievn
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",-1 ,10)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(-1, items[0].sellIn);
		assertEquals(10, items[0].quality);
	}

	@Test
	public void Sulfuras_판매기간10_품질60() {
		//Gievn
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",10 ,60)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(10, items[0].sellIn);
		assertEquals(60, items[0].quality);
	}

	@Test
	public void AgedBrie_판매기간Minus10_품질60() {
		//Gievn
		Item[] items = new Item[] {new Item("Aged Brie",-10 ,60)};
		GildedRose gildedRose = new GildedRose(items);
		
		//When
		gildedRose.updateQuality();
		
		//then
		assertEquals(-11, items[0].sellIn);
		assertEquals(60, items[0].quality);
	}

}
