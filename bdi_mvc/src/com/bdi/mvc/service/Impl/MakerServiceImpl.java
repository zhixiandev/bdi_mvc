package com.bdi.mvc.service.Impl;

import java.util.List;
import java.util.Map;

import com.bdi.mvc.dao.MakerDAO;
import com.bdi.mvc.dao.Impl.MakerDAOImpl;
import com.bdi.mvc.service.MakerService;
import com.bdi.mvc.vo.Maker;

public class MakerServiceImpl implements MakerService {
	private MakerDAO mdao = new MakerDAOImpl();
	@Override
	public List<Maker> getMakerList(Maker mk) {
		return mdao.selectMakerList(mk);
	}

	@Override
	public Maker getMaker(int mnum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> insertMaker(Maker mk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateMaker(Maker mk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteMaker(Maker mk) {
		// TODO Auto-generated method stub
		return null;
	}

}
