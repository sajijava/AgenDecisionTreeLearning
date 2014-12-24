package com.snr.adtl.agents.impl;

import java.util.List;

import com.snr.adtl.agents.Action;
import com.snr.adtl.agents.FeatureAgent;
import com.snr.adtl.model.OHLC;

public class MACrossOverAgent implements FeatureAgent{
	private final int shortMAPeriod;
	private final int longMAPeriod;
	public MACrossOverAgent(final int shortMAPeriod, final int longMAPeriod){
		this.shortMAPeriod = shortMAPeriod;
		this.longMAPeriod = longMAPeriod;
	}
	@Override
	public Action getAction(List<OHLC> data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
