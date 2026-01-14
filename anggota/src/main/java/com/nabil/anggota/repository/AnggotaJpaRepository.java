package com.nabil.anggota.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nabil.anggota.cqrs.command.model.Anggota;

public interface AnggotaJpaRepository extends JpaRepository<Anggota, Long> { }