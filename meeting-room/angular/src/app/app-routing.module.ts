import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RoomCreateComponent } from './modules/room/components/room-create/room-create.component';
import { RoomDetailComponent } from './modules/room/components/room-detail/room-detail.component';
import { RoomListComponent } from './modules/room/components/room-list/room-list.component';
import { RoomUpdateComponent } from './modules/room/components/room-update/room-update.component';


const routes: Routes = [
  {path: '', redirectTo: 'rooms', pathMatch: 'full'},
  {path: 'rooms', component: RoomListComponent},
  {path: 'add', component: RoomCreateComponent},
  {path: 'update/:id', component: RoomUpdateComponent},
  {path: 'details/:id', component: RoomDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
