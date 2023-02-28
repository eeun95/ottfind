package com.sek.ottfind.domain.repository;

import com.sek.ottfind.domain.entity.OttContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OttContentRepository extends JpaRepository<OttContent, Long> {
    List<OttContent> findByGenre(String genre);
}
