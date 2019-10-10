package com.gildedrose;


public class AgedBrieItem extends GildedRoseItem {

	public AgedBrieItem(Item item) {
		super(item);
	}
	
	@Override
	public void updateQuality() {
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
