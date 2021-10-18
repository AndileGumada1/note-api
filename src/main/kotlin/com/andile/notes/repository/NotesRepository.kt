package com.andile.notes.repository;

import com.andile.notes.model.Notes
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface NotesRepository: JpaRepository<Notes, Long> {
}
