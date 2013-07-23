package com.school.portal.service;

import java.util.List;

import com.school.portal.dao.BasicMapper;
import com.school.portal.dao.support.Page;

public abstract class BaseServiceImpl implements BaseService {

	@Override
	public Page queryPage(QueryCondition qc) {
		int total = getBasicMapper().getTotal(qc.getOtherParams());
		List<?> roleList = getBasicMapper().findByPage(Page.getPageNo(qc.getPage(), qc.getRows()), qc.getRows(),qc.getSort(),qc.getOrder(),qc.getOtherParams());
		Page pager = new Page();
		pager.setItems(roleList);
		pager.setTotalRecord(total);
		return pager;
	}

	protected abstract BasicMapper<?, Long> getBasicMapper();
}
