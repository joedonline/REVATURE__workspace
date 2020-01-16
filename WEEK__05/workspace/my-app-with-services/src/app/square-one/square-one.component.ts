import { Component, OnInit, OnChanges } from '@angular/core';
import { CounterService } from '../counter.service';

@Component({
  selector: 'app-square-one',
  templateUrl: './square-one.component.html',
  styleUrls: ['./square-one.component.scss']
})
export class SquareOneComponent implements OnInit, OnChanges {

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
