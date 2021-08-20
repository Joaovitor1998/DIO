import { Injectable } from '@angular/core';
import { CourseListComponent } from '../components/course-list/course-list.component';
import { Course } from '../components/courses/courses';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  retrieveAll(): Course[]{
    return COURSES;
  }

  retrieveById(id: string){
    let checkId = parseInt(id);
    return COURSES.find((courseIterator: Course) => courseIterator.id == checkId);
  }

  save(course: Course){
    if(course.id){
      const index = COURSES.findIndex((courseIterator: Course) => courseIterator.id === course.id);
      COURSES[index] = course;
    }
  }
}

var COURSES: Course[] =  [
  {
    id: 1,
    name: 'Angular',
    imgUrl: "./assets/images/angular.png",
    price: 99.99,
    code: "XPS-4567S",
    duration: 120,
    rating: 5,
    description: "Curso de Angular para iniciantes.",
    development: "Front End"
  },
  {
    id: 2,
    name: 'Java',
    imgUrl: "./assets/images/java.png",
    price: 91.99,
    code: "ISS-4877S",
    duration: 120,
    rating: 4.5,
    description: "Curso de Java para iniciantes.",
    development: "Back End"
  },
  {
    id: 3,
    name: 'HTML',
    imgUrl: "/assets/images/html.png",
    price: 140,
    code: "STU-9967S",
    duration: 120,
    rating: 3,
    description: "Curso de HTML para iniciantes.",
    development: "Front End"
  },
  {
    id: 4,
    name: 'PostgreSQL',
    imgUrl: "/assets/images/postgresql.png",
    price: 198,
    code: "SSE-9S85T",
    duration: 79,
    rating: 1.5,
    description: "Curso de PostgreSQL para iniciantes.",
    development: "Banco de Dados"
  },
  {
    id: 5,
    name: 'Gradle',
    imgUrl: "/assets/images/gradle.png",
    price: 274,
    code: "ASD-9485T",
    duration: 48,
    rating: 3.5,
    description: "Curso de Gradle para iniciantes.",
    development: "Sistema de Automação de Compilação"
  },
  {
    id: 6,
    name: 'Hibernate',
    imgUrl: "/assets/images/hibernate.png",
    price: 170,
    code: "LKO-9775T",
    duration: 110,
    rating: 4,
    description: "Curso de Hibernate para iniciantes.",
    development: "Framework"
  },
  {
    id: 7,
    name: 'JavaScript',
    imgUrl: "/assets/images/javascript.png",
    price: 230,
    code: "JWQ-P5P65T",
    duration: 140,
    rating: 4.5,
    description: "Curso de JavaScript para iniciantes.",
    development: "Front End"
  },
  {
    id: 8,
    name: 'Spring Boot',
    imgUrl: "/assets/images/spring.png",
    price: 199,
    code: "PTO-5541GO",
    duration: 79,
    rating: 5,
    description: "Curso de Spring Boot para iniciantes.",
    development: "Back End"
  }
]
