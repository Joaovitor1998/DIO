import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RoomCreateComponent } from './components/room-create/room-create.component';
import { RoomListComponent } from './components/room-list/room-list.component';
import { RoomDetailComponent } from './components/room-detail/room-detail.component';
import { RoomUpdateComponent } from './components/room-update/room-update.component';



@NgModule({
  declarations: [
    RoomCreateComponent,
    RoomListComponent,
    RoomDetailComponent,
    RoomUpdateComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ]
})
export class RoomModule { }
