import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DataService } from '../data.service';
import { User } from './user';

@Component({
  selector: 'app-tchat-room',
  templateUrl: './tchat-room.component.html',
  styles: [
  ]
})
export class TchatRoomComponent implements OnInit {
  user: User | undefined;

  constructor( 
    private router : Router, 
    private data : DataService
    ){}

    ngOnInit() {
      this.data.getUserList().subscribe(user => {
        this.user = user;
      });
    }
}
