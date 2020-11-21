package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.Editorial;
import com.colegio.entity.Pais;
import com.colegio.service.EditorialService;
import com.colegio.service.PaisService;

@RestController
@RequestMapping("/api/colegio/editorial")
public class EditorialController {
	@Autowired
	private EditorialService service;
	
	@GetMapping
	public ResponseEntity<List<Editorial>> lista(){
		return ResponseEntity.ok(service.listaEditorial());
	}
	
	@PostMapping
	public ResponseEntity<Editorial> inserta(@RequestBody Editorial obj){
		return ResponseEntity.ok(service.insertarEditorial(obj));
	}
}
