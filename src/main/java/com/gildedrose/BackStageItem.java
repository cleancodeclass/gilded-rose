package com.gildedrose;

public class BackStageItem {

	private Item item;

	public BackStageItem(Item item) {
		this.item = item;
	}

	void updateQualityBackstagePasses() {
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
