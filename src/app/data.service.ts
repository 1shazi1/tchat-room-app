import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError } from 'rxjs';
import { User } from './tchat-room/user';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http :HttpClient) { }

  getUserList(): Observable<User>{
    return this.http.get<User>('localhost:8080/hello/vyhv');
  }
}