package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.matchDao;
import com.model.Match;

@Service
public class matchServiceImpl implements matchService {

	@Autowired
	public matchDao dao;

	@Override
	public List<Match> save() {

		return dao.save();
	}

}
