import { __decorate } from "tslib";
import { Component } from '@angular/core';
let CoursesComponent = class CoursesComponent {
    constructor(id, name, imgUrl, price, code, duration, rating) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
        this.code = code;
        this.duration = duration;
        this.rating = rating;
    }
};
CoursesComponent = __decorate([
    Component({
        selector: 'app-courses',
        templateUrl: './courses.component.html',
        styleUrls: ['./courses.component.css']
    })
], CoursesComponent);
export { CoursesComponent };
//# sourceMappingURL=courses.component.js.map