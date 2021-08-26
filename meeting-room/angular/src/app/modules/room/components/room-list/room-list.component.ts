import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Room } from '../../room';
import { RoomService } from '../../room.service';

@Component({
  selector: 'app-room-list',
  templateUrl: './room-list.component.html',
  styleUrls: ['./room-list.component.css']
})
export class RoomListComponent implements OnInit {

  roomList: Observable<Room[]> = new Observable();

  constructor(private roomService: RoomService,
    private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
    console.log("RoomListComponent");
    console.log(this.roomList);
  }

  reloadData(){
    this.roomList = this.roomService.getRoomList();
  }

  deleteRoom(id: number){
    this.roomService.deleteRoom(id).subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error));
  }

  detailRoom(id:number){
    this.router.navigate(['details', id]);
  }

  updateRoom(id:number){
    this.router.navigate(['update', id]);
  }

  createNew(){
    this.router.navigate(['/add']);
  }

}
