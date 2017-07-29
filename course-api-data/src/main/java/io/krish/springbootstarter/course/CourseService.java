package io.krish.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // This annotation marks this calls as a business service ,it is a singleton
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	public Course getCourse(String id){
		 return courseRepository.findOne(id);
		
	}
	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}
	public void updateCourse(Course topic, String id) {
		courseRepository.save(topic);
		}
	
	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
	
	
	

}
