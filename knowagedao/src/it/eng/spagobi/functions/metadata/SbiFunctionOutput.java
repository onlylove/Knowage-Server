package it.eng.spagobi.functions.metadata;

// Generated 10-mag-2016 14.47.57 by Hibernate Tools 3.4.0.CR1

import it.eng.spagobi.commons.metadata.SbiHibernateModel;

/**
 * SbiFunctionOutput generated by hbm2java
 */
public class SbiFunctionOutput extends SbiHibernateModel {

	private SbiFunctionOutputId id;
	private SbiCatalogFunction sbiCatalogFunction;
	private Integer outType;

	public SbiFunctionOutput() {
	}

	public SbiFunctionOutput(SbiFunctionOutputId id, SbiCatalogFunction sbiCatalogFunction, Integer outType) {
		this.id = id;
		this.sbiCatalogFunction = sbiCatalogFunction;
		this.outType = outType;
	}

	public SbiFunctionOutputId getId() {
		return this.id;
	}

	public void setId(SbiFunctionOutputId id) {
		this.id = id;
	}

	public SbiCatalogFunction getSbiCatalogFunction() {
		return this.sbiCatalogFunction;
	}

	public void setSbiCatalogFunction(SbiCatalogFunction sbiCatalogFunction) {
		this.sbiCatalogFunction = sbiCatalogFunction;
	}

	public Integer getOutType() {
		return this.outType;
	}

	public void setOutType(Integer outType) {
		this.outType = outType;
	}
}