import { Component, OnInit } from '@angular/core';
import { CounterService } from '../counter.service';

@Component({
  selector: 'app-square-two',
  templateUrl: './square-two.component.html',
  styleUrls: ['./square-two.component.scss']
})
export class SquareTwoComponent implements OnInit {

  constructor(private counterService: CounterService) {}

  localCounter: number = 0;

  incrementLocal(): void {
    this.localCounter++;
  }

  incrementService(): void {
    this.counterService.counter++;
  }

  ngOnInit() {
    console.log(`init of square-one.component.ts`);
    this.counterService.logCounter();
  }

  // listens for changes in the component
  ngOnChanges() {
    console.log(`Something changed! ngOnChanges running...`);
  }

}
