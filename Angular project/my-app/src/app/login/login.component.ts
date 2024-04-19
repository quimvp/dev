import { Component, OnInit, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [NgFor],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit{
  data: any[]=[];

  constructor(private http:HttpClient){}

  ngOnInit(): void{
    this.fetchData();
  }

  fetchData(): void{
    this.http.get<any[]>('https://jsonplaceholder.typicode.com/posts').subscribe((objs) => {
      this.data = objs;
      console.log(this.data)
      // console.log("Data : "+JSON.stringify(objs, null, 2));
    })
  }
}
