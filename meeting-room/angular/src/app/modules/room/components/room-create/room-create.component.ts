import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Room } from '../../room';
import { RoomService } from '../../room.service';

@Component({
  selector: 'app-room-create',
  templateUrl: './room-create.component.html',
  styleUrls: ['./room-create.component.css']
})
export class RoomCreateComponent implements OnInit {

  room: Room = new Room();
  submitted = false;

  updateForm: FormGroup = new FormGroup({});

  constructor(private roomService: RoomService,
    private router: Router,
    private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.generateForm();
  }

  generateForm(){
    this.updateForm = this.formBuilder.group({
      name: [null, Validators.required],
      date: [null, Validators.required],
      endHour: [null, Validators.required],
      startHour: [null, Validators.required]
    });
  }

  newRoom(): void{
    this.submitted=false;
    this.room=new Room();
  }

  save(){
    this.roomService.createRoom(this.room).subscribe(
      data=>console.log(data),
      error=>console.log(error));
      this.room= new Room();
      this.gotoList();
  }

  onSubmit(){
    this.submitted = true;
    this.save();
  }

  gotoList(){
    this.router.navigate(['/rooms']);
  }

}
