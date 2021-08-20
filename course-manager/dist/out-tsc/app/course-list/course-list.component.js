import { __decorate } from "tslib";
import { Component } from '@angular/core';
let CourseListComponent = class CourseListComponent {
    constructor() {
        this.message = "Hello, World!";
        this.courses = [];
    }
    ngOnInit() {
        this.courses = [
            {
                id: 1,
                name: 'Angular',
                imgUrl: "",
                price: 99.99,
                code: "XPS-4567S",
                duration: 120,
                rating: 5.4
            },
            {
                id: 1,
                name: 'jAVA',
                imgUrl: "",
                price: 91.99,
                code: "ISS-4877S",
                duration: 120,
                rating: 5.4
            },
            {
                id: 1,
                name: 'Python',
                imgUrl: "",
                price: 140,
                code: "STU-9967S",
                duration: 120,
                rating: 5.4
            }
        ];
    }
};
CourseListComponent = __decorate([
    Component({
        selector: 'app-course-list',
        templateUrl: './course-list.component.html',
        styleUrls: ['./course-list.component.css']
    })
], CourseListComponent);
export { CourseListComponent };
//# sourceMappingURL=course-list.component.js.map