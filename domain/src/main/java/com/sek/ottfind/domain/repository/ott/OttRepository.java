package com.sek.ottfind.domain.repository.ott;

import com.sek.ottfind.domain.entity.Ott;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OttRepository extends JpaRepository<Ott, Long>, OttRepositoryCustom  {
}
