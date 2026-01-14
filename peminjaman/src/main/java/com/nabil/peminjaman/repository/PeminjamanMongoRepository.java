package com.nabil.peminjaman.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.nabil.peminjaman.cqrs.query.model.PeminjamanDocument;
public interface PeminjamanMongoRepository extends MongoRepository<PeminjamanDocument, String> {}