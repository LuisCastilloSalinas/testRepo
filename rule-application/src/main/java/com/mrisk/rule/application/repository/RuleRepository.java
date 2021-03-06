package com.mrisk.rule.application.repository;

import java.util.List;

import com.mrisk.rule.domain.Rule;

public interface RuleRepository {

	List<Rule> findAllRules();
}
