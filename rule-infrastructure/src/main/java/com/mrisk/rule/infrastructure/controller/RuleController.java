package com.mrisk.rule.infrastructure.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrisk.rule.application.service.RuleService;
import com.mrisk.rule.infrastructure.dto.RuleDTO;
import com.mrisk.rule.infrastructure.utils.Converter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class RuleController {

	private final RuleService ruleService;
	
	
	@GetMapping(value = "/find/rules", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RuleDTO>> findAllRules() {
		return new ResponseEntity<>(ruleService.getAllRules().stream()
				.map(x -> Converter.getMapper().map(x, RuleDTO.class)).collect(Collectors.toList()), HttpStatus.OK);
	}

}
