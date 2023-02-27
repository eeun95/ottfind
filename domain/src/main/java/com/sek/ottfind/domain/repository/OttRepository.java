package com.sek.ottfind.domain.repository;

import com.sek.ottfind.domain.entity.Ott;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OttRepository extends JpaRepository<Ott, Long> {
}
