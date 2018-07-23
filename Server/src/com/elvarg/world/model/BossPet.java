package com.elvarg.world.model;

import java.util.HashMap;
import java.util.Map;

public enum BossPet {

	CHAOS_ELEMENTAL(2054, 2055, 11995),
	VENENATIS(6504, 495, 13177),
	CALLISTO(6609, 497, 13178),
	SNAKELING(2043, 2130, 12921),
	SNAKELING_MAGMA(2043, 2131, 12939),
	SNAKELING_TANZ(2043, 2132, 12940),
	DARK_CORE(-1, 318, 12816),
	HERON(-1, 6715, 13320),
	OLMLET(-1, 7520, 20851),
	;
	
	BossPet(int bossNpcId, int petNpcId, int itemId) {
		this.bossNpcId = bossNpcId;
		this.petNpcId = petNpcId;
		this.itemId = itemId;
	}
	
	private final int 
	bossNpcId, 
	petNpcId,
	itemId;
	
	public int getBossId() {
		return bossNpcId;
	}

	public int getPetId() {
		return petNpcId;
	}

	public int getItemId() {
		return itemId;
	}
	
	private static Map<Integer, BossPet> pets = new HashMap<Integer, BossPet>();

	public static BossPet getForId(int id) {
		return pets.get(id);
	}

	static {
		for(BossPet pet : BossPet.values()) {
			pets.put(pet.getBossId(), pet);
			pets.put(pet.getPetId(), pet);
			pets.put(pet.getItemId(), pet);
		}
	}
}
