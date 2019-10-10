package com.gildedrose;

class GildedRose {

	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	static final int MAX_QUALITY = 50;
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			if (item.name.equals(AGED_BRIE)) {
				AgedBrieItem agedBrieItem = new AgedBrieItem(item);
				agedBrieItem.updateQuality();
			} else if (item.name.equals(BACKSTAGE_PASSES)) {
				BackstagePassItem backstagePassItem = new BackstagePassItem(item);
				backstagePassItem.updateQuality();
			} else if (item.name.equals(SULFURAS)) {
				SulfurasItem sulfurasItem = new SulfurasItem(item);
				sulfurasItem.updateQuality();
			} else {
				NormalItem normalItem = new NormalItem(item);
				normalItem.updateQuality();
			}

			if (item.name.equals(SULFURAS)) {
			} else {
				item.sellIn = item.sellIn - 1;
			}
		}
	}
}
