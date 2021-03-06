package com.mrisk.rule.infrastructure.utils;

import java.util.Objects;

import org.modelmapper.ModelMapper;

public final class Converter {
	private static ModelMapper modelMapper;

	private Converter() {
	}

	public static ModelMapper getMapper() {
		if (Objects.isNull(modelMapper)) {
			modelMapper = new ModelMapper();
		}
		return modelMapper;
	}
}
