package com.student_plan.repository;

import com.student_plan.entity.Lecture;
import com.student_plan.entity.StudentLecture;
import com.student_plan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentLectureRepository extends JpaRepository<StudentLecture, Long> {

    @Query("SELECT studentLecture FROM StudentLecture studentLecture " +
            "JOIN studentLecture.user student WHERE student.id = :id")
    List<StudentLecture> findAllByStudentId();

    @Query("SELECT studentLecture FROM StudentLecture studentLecture " +
            "JOIN studentLecture.lecture lecture WHERE lecture.id =:id ")
    List<StudentLecture> findAllByLectureId();

    void deleteAllByUserId(Long userId);

    Long countByLectureAndUser(Lecture lecture, User user);
}
