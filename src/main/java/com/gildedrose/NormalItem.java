package com.gildedrose;

public class NormalItem extends GildedRoseItem {

	public NormalItem(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}
		if (item.sellIn < 1) {
			if (item.quality > 0) {
				item.quality = item.quality - 1;
			}
		}
	}

}
