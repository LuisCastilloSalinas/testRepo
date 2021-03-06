package com.mrisk.rule.domain;


public class Rule {
	
	private Long id;
	private String name; 
	private String numberRule;
	private String tableDetail;
	private String ruleType;
	private String component;
	
	
	public Rule() {
	}



	public Rule(Long id, String name, String numberRule, String tableDetail, String ruleType, String component) {
		super();
		this.id = id;
		this.name = name;
		this.numberRule = numberRule;
		this.tableDetail = tableDetail;
		this.ruleType = ruleType;
		this.component = component;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNumberRule() {
		return numberRule;
	}


	public void setNumberRule(String numberRule) {
		this.numberRule = numberRule;
	}


	public String getTableDetail() {
		return tableDetail;
	}


	public void setTableDetail(String tableDetail) {
		this.tableDetail = tableDetail;
	}


	public String getRuleType() {
		return ruleType;
	}


	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}


	public String getComponent() {
		return component;
	}


	public void setComponent(String component) {
		this.component = component;
	}
	
	
	
	
	

}
