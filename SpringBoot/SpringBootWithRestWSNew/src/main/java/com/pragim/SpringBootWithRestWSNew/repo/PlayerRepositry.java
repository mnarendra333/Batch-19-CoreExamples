package com.pragim.SpringBootWithRestWSNew.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pragim.SpringBootWithRestWSNew.model.Player;

public interface PlayerRepositry extends JpaRepository<Player, Integer> {

	public Optional<Player> findByName(String name);
}
