import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EntranceMov, ExitMov, Movs } from './movs';

@Injectable({
  providedIn: 'root'
})
export class MovsService {

  private baseUrl = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  public getMovs(): Observable<Movs[]>{
    return this.http.get<Movs[]>(`${this.baseUrl}/api/Movs`);
  }

  // ajouter un mouvement d'entrée
  public addEntranceMov(movIn: EntranceMov): Observable<EntranceMov> {
    return this.http.post<EntranceMov>(`${this.baseUrl}/api/addEntranceMov`, movIn);
  }

    // ajouter un mouvement de sortie
    public addExitMov(movOut: ExitMov): Observable<ExitMov> {
      return this.http.post<ExitMov>(`${this.baseUrl}/api/addExitMov`, movOut);
    }
}
