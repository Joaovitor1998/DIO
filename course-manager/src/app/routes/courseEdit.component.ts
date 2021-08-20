import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { Course } from "../components/courses/courses";
import { CourseService } from "../service/course.service";


@Component({
    templateUrl: './courseEdit.component.html'
})
export class EditCourseComponent implements OnInit{


    course: any;

    constructor(private activatedRoute: ActivatedRoute, private courseService: CourseService){ }

    ngOnInit(): void{
        this.course = this.courseService.retrieveById(
            this.activatedRoute.snapshot.params['id']
        );
        console.log(this.activatedRoute.snapshot.params['id']);
        console.log(typeof(this.activatedRoute.snapshot.params['id']));
    }

    save(): void{
        this.courseService.save(this.course);
    }

}