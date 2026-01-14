package com.nabil.anggota.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.nabil.anggota.cqrs.query.model.AnggotaDocument;

public interface AnggotaMongoRepository extends MongoRepository<AnggotaDocument, String> { }