import { Component, OnInit } from '@angular/core';
import { EntranceMov } from '../movs';
import { MovsService } from '../movs.service';
import { NgForm } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-entrance',
  templateUrl: './entrance.component.html',
  styleUrls: ['./entrance.component.css']
})


export class EntranceComponent implements OnInit{
  public movIn: EntranceMov = new EntranceMov();

  constructor(private movServ: MovsService){

  }  
  
  
  ngOnInit(): void {
  }

  addEntranceMov(registerForm: NgForm){
    //console.log('valeurs : ', JSON.stringify(registerForm.value));
    this.movServ.addEntranceMov(registerForm.value).subscribe(
      (response: EntranceMov) => {
        console.log(response);
        this.movServ.getMovs;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      },
    );
  }
  
}
