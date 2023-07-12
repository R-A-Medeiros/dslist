package com.dev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dslist.dto.GameListDTO;
import com.dev.dslist.dto.GameMinDTO;
import com.dev.dslist.services.GameListService;
import com.dev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
//	@GetMapping(value = "/{id}")
//	public GameDTO findById(@PathVariable Long id){
//		GameDTO result = gameService.findById(id);
//		return result;
//	}
	
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
}
