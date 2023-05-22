package com.ssafy.plan.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.plan.model.PlanDto;

@Mapper
public interface PlanMapper {
	Long addPlan(PlanDto planDto) throws SQLException;
	void deletePlan(Long id) throws SQLException;
	void updatePlan(PlanDto planDto) throws SQLException;
	PlanDto findPlanById(Long id) throws SQLException;
	List<PlanDto> findPlansByUserId(String userId) throws SQLException;
	List<PlanDto> findAll() throws SQLException;
}
