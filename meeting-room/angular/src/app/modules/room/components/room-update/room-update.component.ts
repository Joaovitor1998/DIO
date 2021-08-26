import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Room } from '../../room';
import { RoomService } from '../../room.service';

@Component({
  selector: 'app-room-update',
  templateUrl: './room-update.component.html',
  styleUrls: ['./room-update.component.css']
})
export class RoomUpdateComponent implements OnInit {

  id: number = 0;
  room: Room = Object();
  submitted = false;

  constructor(private activeRouter: ActivatedRoute,
    private router: Router,
    private roomService: RoomService) { }

  ngOnInit(): void {
    this.room = new Room();
    this.id = this.activeRouter.snapshot.params["id"];
    this.roomService.getRoom(this.id).subscribe(
      data => {console.log(data);
      this.room = data;},
    error => console.log(error)
    );
  }

  updateRoom(){
    this.roomService.updateRoom(this.id, this.room).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
    this.room = new Room();
    this.gotoList();
  }

  onSubmit(){
    this.updateRoom();
  }

  gotoList(){
    this.router.navigate(["/rooms"]);
  }

}
