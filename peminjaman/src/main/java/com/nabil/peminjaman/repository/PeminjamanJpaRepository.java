package com.nabil.peminjaman.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nabil.peminjaman.cqrs.command.model.Peminjaman;
public interface PeminjamanJpaRepository extends JpaRepository<Peminjaman, Long> {}