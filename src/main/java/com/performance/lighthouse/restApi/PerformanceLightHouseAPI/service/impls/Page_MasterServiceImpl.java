package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Page_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.Page_MasterRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Page_MasterService;

@Service
public class Page_MasterServiceImpl implements Page_MasterService {
	
	private Page_MasterRepository pageMasterrepo;
	
	@Autowired
	public Page_MasterServiceImpl(Page_MasterRepository pageMasterrepo) {
		this.pageMasterrepo = pageMasterrepo;
	}

	@Override
	public List<Page_Master> findAllPages() {
		
		return pageMasterrepo.findAll();
	}

	@Override
	public Page_Master savePage(Page_Master page) {
	
		return pageMasterrepo.save(page);
	}

	@Override
	public Page_Master getPageByName(String pgName) {
		
		return pageMasterrepo.findPageByName(pgName);
	}

}
