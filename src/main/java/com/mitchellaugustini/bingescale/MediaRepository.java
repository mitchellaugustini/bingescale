package com.mitchellaugustini.bingescale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Movie, Long> {
}
