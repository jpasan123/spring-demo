package com.example.restdbdemo3.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepostrity extends JpaRepository<Lecturer,Integer> {
}


