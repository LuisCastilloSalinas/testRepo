package com.mrisk.rule.application.service;

import java.util.List;

import com.mrisk.rule.application.repository.RuleRepository;
import com.mrisk.rule.domain.Rule;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
public class RuleService {

	private final RuleRepository repository;

	public RuleService(RuleRepository repository) {
		this.repository = repository;
	}

	public List<Rule> getAllRules() {
		return repository.findAllRules();
	}

}
