package com.axeane.notes.repository;

import com.axeane.notes.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {
    List<Note> findAllByOrderByDateAsc();
    List<Note> findAllByOrderByDateDesc();
}
