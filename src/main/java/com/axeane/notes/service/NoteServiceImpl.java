package com.axeane.notes.service;

import com.axeane.notes.entity.Note;
import com.axeane.notes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    private NoteRepository repository;

    @Autowired
    public void setProductRepository(NoteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Note getNoteById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void saveNote(Note note) {
        repository.save(note);
    }

    @Override
    public void updateNote(Integer id, String message, boolean done) {
        Note updated = repository.getOne(id);
        updated.setDone(done);
        updated.setMessage(message);
        repository.save(updated);
    }

    @Override
    public void deleteNote(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Note> findAllByOrderByDateAsc() {
        return repository.findAllByOrderByDateAsc();
    }

    @Override
    public List<Note> findAllByOrderByDateDesc() {
        return repository.findAllByOrderByDateDesc();
    }
}
