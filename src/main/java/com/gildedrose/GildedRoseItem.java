package com.gildedrose;


public abstract class GildedRoseItem {

	protected Item item;

	public GildedRoseItem(Item item) {
		this.item = item;
	}

	abstract public void updateQuality();

}
