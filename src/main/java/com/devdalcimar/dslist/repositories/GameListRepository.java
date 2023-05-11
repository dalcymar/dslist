package com.devdalcimar.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdalcimar.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
