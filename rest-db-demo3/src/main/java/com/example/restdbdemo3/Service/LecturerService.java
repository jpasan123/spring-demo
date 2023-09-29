package com.example.restdbdemo3.Service;

import com.example.restdbdemo3.data.Lecturer;
import com.example.restdbdemo3.data.LectureRepostrity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LecturerService {
    @Autowired
    private LectureRepostrity lecRepo;
    public List<Lecturer> getAllLecturers(){
        return lecRepo.findAll();
    }
    public Lecturer getLecturerById(int id){
        Optional<Lecturer> lecObj=lecRepo.findById(id);
        if(lecObj.isPresent()){
            return lecObj.get();
        }
        return null;
    }
    public Lecturer createLecturer(Lecturer lecturer){
        return lecRepo.save(lecturer);
    }
    public Lecturer updateLecturer(Lecturer lecturer){
        return lecRepo.save (lecturer);
    }
    public void deleteLecturerById(int id){
        lecRepo.deleteById(id);
    }
}
