package com.gildedrose;

public class BackStageItem extends GildedRoseItem {

	public BackStageItem(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
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
