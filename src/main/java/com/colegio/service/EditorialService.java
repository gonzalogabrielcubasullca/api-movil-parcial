package com.colegio.service;

import java.util.List;

import com.colegio.entity.Editorial;

public interface EditorialService {
	public abstract List<Editorial> listaEditorial();
	public abstract Editorial insertarEditorial(Editorial obj);
}
