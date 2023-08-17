package com.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.VoterListEntity;
import com.springboot.repository.VoterRepository;

@Service
public class VoterListService {
	
	@Autowired
	private VoterRepository voterRepository;
	
	public VoterListEntity saveVoterList(VoterListEntity voterList) {
		return voterRepository.save(voterList);
	}
	
	public List<VoterListEntity> getAllVoterDetails(VoterListEntity voterList){
		return voterRepository.findAll();
	}
	
	public VoterListEntity getVoterById(int id) {
		return voterRepository.findById(id).get();
	}
	
	public List<VoterListEntity> getVoterName(String name){
		return voterRepository.findByfullName(name);
	}
	
	public List<VoterListEntity> getVoterFatherName(String name){
		return voterRepository.findByfatherName(name);
	}
	
	public VoterListEntity updateById(VoterListEntity voterList) {
		
		return voterRepository.save(voterList);
	}
	
	public void deleteById(int id) {
		voterRepository.deleteById(id);
	}
	
	public List<VoterListEntity> getVoterByNum(String vNum){
		return voterRepository.findByvoterNum(vNum);
	}
}
