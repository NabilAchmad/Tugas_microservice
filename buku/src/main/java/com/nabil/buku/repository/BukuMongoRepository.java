package com.nabil.buku.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nabil.buku.cqrs.query.model.BukuDocument;

@Repository
public interface BukuMongoRepository extends MongoRepository<BukuDocument, String> { }