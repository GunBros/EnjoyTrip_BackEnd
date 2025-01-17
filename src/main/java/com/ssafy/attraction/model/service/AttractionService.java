package com.ssafy.attraction.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.attraction.model.AttractionDto;

public interface AttractionService {
	List<AttractionDto> findAttractions(Map<String, Integer> map) throws Exception;
	AttractionDto findAttractionByContentId(String contentId) throws Exception;
}
