package com.taoh.nlw3.happy.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.taoh.nlw3.happy.dto.OrphanageDTO;
import com.taoh.nlw3.happy.services.OrphanageService;

@RestController
@RequestMapping(value= "/orphanages")
public class OrphanageResources {

	@Autowired
	private OrphanageService service;
	
	@GetMapping
	public ResponseEntity<List<OrphanageDTO>> listAll(){
		List<OrphanageDTO> list = service.showAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<OrphanageDTO> findById(@PathVariable Long id){
		OrphanageDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<OrphanageDTO> insert(@RequestBody OrphanageDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	

}
