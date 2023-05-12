import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Movs } from './movs';

@Injectable({
  providedIn: 'root'
})
export class MovsService {

  private baseUrl = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  public getMovs(): Observable<Movs[]>{
    return this.http.get<Movs[]>(`${this.baseUrl}/api/Movs`);
  }

  // Completer avec le formulaire
  public addEntranceMov(movIn: Movs): Observable<Movs[]> {
    return this.http.get<Movs[]>(`${this.baseUrl}/api/add`);
  }
}
