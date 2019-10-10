package com.gildedrose;


public class BackstagePassItem {

	private Item item;

	public BackstagePassItem(Item item) {
		this.item = item;
	}

	protected void updateQualityForBackstagePass() {
		if (item.quality < GildedRose.MAX_QUALITY) {
			item.quality = item.quality + 1;
	
			if (item.sellIn < 11) {
				if (item.quality < GildedRose.MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}
	
			if (item.sellIn < 6) {
				if (item.quality < GildedRose.MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}
		}
		if (item.sellIn < 1) {
			item.quality = item.quality - item.quality;
		}
	}

}
