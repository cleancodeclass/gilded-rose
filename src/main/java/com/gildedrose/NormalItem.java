package com.gildedrose;

public class NormalItem {

	private Item item;

	public NormalItem(Item item) {
		this.item = item;
	}

	void updateQualityForNormalItem() {
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
