package com.gildedrose;


public class SulfurasItem  extends GildedRoseItem{


	public SulfurasItem(Item item) {
		super(item);
	}


	@Override
	public void updateQuality() {
		if (item.quality > 0) {
		}
		if (item.sellIn < 0) {
			if (item.quality > 0) {
			}
		}
	}

}
