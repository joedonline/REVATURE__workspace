import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { People } from './people';

@Injectable({
  providedIn: 'root'
})
export class HttpServiceService {

  constructor(private http : HttpClient) { }

  getAllPeople() : Observable<any> {
    return this.http.get<People[]>(`https://swapi.co/api/people/?page=2`);
  }

  async promiseGetAllComics() : Promise<any> {
    const data = await this.http.get<any>(`https://swapi.co/api/people/?page=1`).toPromise();
    return await data;
  }
}
