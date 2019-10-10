package com.gildedrose;

class GildedRose {

	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	private static final int MAX_QUALITY = 50;
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			if (item.name.equals(AGED_BRIE)) {
				updateQualityForAgedBrie(item);
			} else if (item.name.equals(BACKSTAGE_PASSES)) {
				updateQualityForBackstagePass(item);
			} else if (item.name.equals(SULFURAS)) {
				updateQualityForSulfuras(item);
			} else {
				updateQualityForNormalItem(item);
			}

			if (item.name.equals(SULFURAS)) {
			} else {
				item.sellIn = item.sellIn - 1;
			}
		}
	}

	protected void updateQualityForNormalItem(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}
		if (item.sellIn < 1) {
			if (item.quality > 0) {
				item.quality = item.quality - 1;
			}
		}
	}

	protected void updateQualityForSulfuras(Item item) {
		if (item.quality > 0) {
		}
		if (item.sellIn < 0) {
			if (item.quality > 0) {
			}
		}
	}

	protected void updateQualityForBackstagePass(Item item) {
		if (item.quality < MAX_QUALITY) {
			item.quality = item.quality + 1;

			if (item.sellIn < 11) {
				if (item.quality < MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}

			if (item.sellIn < 6) {
				if (item.quality < MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}
		}
		if (item.sellIn < 1) {
			item.quality = item.quality - item.quality;
		}
	}

	protected void updateQualityForAgedBrie(Item item) {
		if (item.quality < MAX_QUALITY) {
			item.quality = item.quality + 1;
		}
		if (item.sellIn < 1) {
			if (item.quality < MAX_QUALITY) {
				item.quality = item.quality + 1;
			}
		}
	}
}
