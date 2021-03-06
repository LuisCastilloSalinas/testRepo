package com.mrisk.rule.infrastructure.dto;

import lombok.Data;

@Data
public class RuleDTO {

	private Long id;
	private String name;
	private String numberRule;
	private String tableDetail;
	private String ruleType;
	private String component;

}
