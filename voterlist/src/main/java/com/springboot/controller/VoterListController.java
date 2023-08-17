package com.springboot.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.VoterListEntity;
import com.springboot.service.VoterListService;

@RestController
@RequestMapping("/voterlist")
public class VoterListController {
	
	@Autowired
	private VoterListService voterListService;
		
	@PostMapping()
	public VoterListEntity saveVoterList(@RequestBody VoterListEntity voterList) {
		return voterListService.saveVoterList(voterList);
	}
	
	@GetMapping()
	public List<VoterListEntity> getAllVoterList(VoterListEntity voterList){
		return voterListService.getAllVoterDetails(voterList);
	}
	
	@GetMapping("/{id}")
	public VoterListEntity getVoterById(@PathVariable int id) {
		return voterListService.getVoterById(id);
	}
	
	@GetMapping("/fullName/{name}")
	public List<VoterListEntity> getVoterByName(@PathVariable String name){
		return voterListService.getVoterName(name);
	}
	
	@GetMapping("/fatherName/{fname}")
	public List<VoterListEntity> getVoterByFatherName(@PathVariable String fname) {
		return voterListService.getVoterFatherName(fname);
	}
	
	@GetMapping("/voterNumber/{vNum}")
	public List<VoterListEntity> getVoterByVoterNum(@PathVariable String vNum){
		return voterListService.getVoterByNum(vNum);
	}
	
	@PutMapping("/{id}")
	public VoterListEntity updateVoterList(@RequestBody VoterListEntity voterList,@PathVariable int id) {
		voterList.setId(id);
		return voterListService.updateById(voterList);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		voterListService.deleteById(id);
	}

}
