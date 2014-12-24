package com.snr.adtl.agents;

import java.util.List;

import com.snr.adtl.model.OHLC;

public interface FeatureAgent {

	public Action getAction(List<OHLC> data);
}
