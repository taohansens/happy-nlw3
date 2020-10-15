package com.taoh.nlw3.happy.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taoh.nlw3.happy.dto.OrphanageDTO;
import com.taoh.nlw3.happy.entities.Orphanage;
import com.taoh.nlw3.happy.repositories.OrphanagesRepository;

@Service
public class OrphanageService {

	@Autowired
	private OrphanagesRepository repository;

	@Transactional(readOnly = true)
	public List<OrphanageDTO> showAll() {
		List<Orphanage> list = repository.findAll();
		return list.stream().map(x -> new OrphanageDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public OrphanageDTO insert(OrphanageDTO dto) {
		Orphanage entity = new Orphanage();
		entity.setName(dto.getName());
		entity.setLatitude(dto.getLatitude());
		entity.setLongitude(dto.getLongitude());
		entity.setAbout(dto.getAbout());
		entity.setInstructions(dto.getInstructions());
		entity.setOpening_hours(dto.getOpening_hours());
		entity.setOpen_on_weekends(dto.isOpen_on_weekends());
		entity = repository.save(entity);
		return new OrphanageDTO(entity);
	}

	@Transactional(readOnly = true)
	public OrphanageDTO findById(Long id) {
		Optional<Orphanage> obj = repository.findById(id);
		Orphanage entity = obj.orElseThrow(); //TODO adicionar exception.
		return new OrphanageDTO(entity);
	}
	
	
}
