package com.nabil.buku.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nabil.buku.cqrs.command.model.Buku;

@Repository
public interface BukuJpaRepository extends JpaRepository<Buku, Long> { }