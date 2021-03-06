package com.mrisk.rule.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mrisk.rule.application.repository.RuleRepository;
import com.mrisk.rule.domain.Rule;

@Service
public class RuleDboRepository implements RuleRepository {

	@Override
	public List<Rule> findAllRules() {
		// TODO go to DB 
		
		return new ArrayList<>();
	}

}
