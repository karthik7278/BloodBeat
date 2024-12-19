package com.example.bloodbeat.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bloodbeat.Modal.Donor;
import com.example.bloodbeat.Repository.DonorRepository;

@Service
public class DonorService {
	@Autowired
	private DonorRepository donorRepository;

	public Donor saveDonor(Donor donor) {
		return donorRepository.save(donor);
	}

	public List<Donor> getAllDonors() {
		return donorRepository.findAll();
	}

	public Donor getDonorById(Long id) {
		return donorRepository.findById(id).orElse(null);
	}

	public void deleteDonor(Long id) {
		donorRepository.deleteById(id);
	}

	public Donor updateDonor(Donor donor) {
		return donorRepository.save(donor);
	}

	public long getDonorCount() {
		return donorRepository.count();
	}

	
}



