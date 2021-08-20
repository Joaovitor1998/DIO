import { Component, OnInit } from '@angular/core';

import { Course } from '../courses/courses';
import { CoursesComponent } from '../courses/courses.component';
import { CourseService } from '../../service/course.service';
import { HttpClient } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';

@Component({

  templateUrl: './course-list.component.html',
  styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit {

  filteredCourses: Course[] = [];
  mySubs: Course[] = [];
  myObs$: Observable<Course[]> = new Observable<Course[]>();
  myError$ = new Subject();

  _courses: Course[] = [];
  _filterBy : any;

  constructor(private courseService: CourseService, private httpCl: HttpClient) {}

  ngOnInit(): void {
    this._courses = this.courseService.retrieveAll();
    this.filteredCourses = this._courses;
    this.myObs$ = this.httpCl.get<Course[]>('http://localhost:3000/courses');
  }

  set filter(value: string){
    this._filterBy = value;

    this.filteredCourses = this._courses.filter(
      (course: Course) => course.name.toLocaleLowerCase()
      .indexOf(this._filterBy.toLocaleLowerCase()) > -1);
  }

  get filter(){
    return this._filterBy;
  }

  getCoOb(){
    //this.httpCl.get<Course[]>('http://localhost:3000/courses').subscribe(
    //  data => this.mySubs = data );
    this.myObs$ = this.httpCl.get<Course[]>('http://localhost:3000/courses');
  }

}
