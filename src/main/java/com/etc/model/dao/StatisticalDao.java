package com.etc.model.dao;

import java.util.List;
import java.util.Map;

public interface StatisticalDao {
    List<Map<String,Object>> groupByType();
}
