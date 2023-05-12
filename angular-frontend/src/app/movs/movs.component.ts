import { Component, OnInit } from '@angular/core';
import { MovsService } from '../movs.service';
import { Movs } from '../movs';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-movs',
  templateUrl: './movs.component.html',
  styleUrls: ['./movs.component.css']
})
export class MovsComponent implements OnInit {
  
  public movs!: Movs[];
  constructor(private movsService: MovsService){}

  ngOnInit(): void {
    this.movsService.getMovs().subscribe(
      (data: Movs[]) =>{
        console.log(data);
        this.movs = data;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

}
