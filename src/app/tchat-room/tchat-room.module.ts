import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { TchatRoomComponent } from './tchat-room.component';

const navRoute: Routes = [
  {path: 'tchat-room',component : TchatRoomComponent}
];

@NgModule({
  declarations: [
    TchatRoomComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(navRoute)
  ]
})
export class TchatRoomModule { }
