package com.gildedrose;


public class AgedBrieItem {

	private Item item;

	public AgedBrieItem(Item item) {
		this.item = item;
	}

	protected void updateQualityForAgedBrie() {
		if (item.quality < GildedRose.MAX_QUALITY) {
			item.quality = item.quality + 1;
		}
		if (item.sellIn < 1) {
			if (item.quality < GildedRose.MAX_QUALITY) {
				item.quality = item.quality + 1;
			}
		}
	}

}
