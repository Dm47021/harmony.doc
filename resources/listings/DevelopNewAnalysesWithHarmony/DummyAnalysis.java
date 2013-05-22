package fr.labri.harmony.dummy;

import java.util.Properties;

import fr.labri.harmony.core.analysis.AbstractAnalysis;
import fr.labri.harmony.core.config.model.AnalysisConfiguration;
import fr.labri.harmony.core.dao.Dao;
import fr.labri.harmony.core.log.HarmonyLogger;
import fr.labri.harmony.core.model.Source;

public class DummyAnalysis extends AbstractAnalysis {

	public DummyAnalysis() {
		super();
	}

	public DummyAnalysis(AnalysisConfiguration config, Dao dao,
			Properties properties) {
		super(config, dao, properties);
	}

	@Override
	public void runOn(Source arg0) {
		HarmonyLogger.info("Hello, I am Dummy!");

	}

}
