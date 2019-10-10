package com.gildedrose;


public class SulfurasItem {

	private Item item;

	public SulfurasItem(Item item) {
		this.item = item;
		// TODO Auto-generated constructor stub
	}


	protected void updateQuality() {
		if (item.quality > 0) {
		}
		if (item.sellIn < 0) {
			if (item.quality > 0) {
			}
		}
	}

}
