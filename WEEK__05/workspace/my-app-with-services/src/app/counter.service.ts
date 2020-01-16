import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CounterService {

  counter : number = 0;
  countByTen: number = 10;

  constructor() {
    // not yet implemented
  }

  logCounter(): void {
    console.log(`Service counter: ${this.counter}`);
  }

}
