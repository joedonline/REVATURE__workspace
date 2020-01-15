import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-my-second-component',
  templateUrl: './mysecondcomponent.component.html',
  styleUrls: ['./mysecondcomponent.component.scss']
})
export class MysecondcomponentComponent implements OnInit {

  x: number = 0;
  myString: string;

  constructor() { }

  incrementNumber(): void {
    this.x++;
  }

  log(str): void {
    console.log(str);
  }

  ngOnInit() {
    this.myString = "HELLO myString";
    console.log("[mysecondcomponent] this.myString", this.myString);
  }

  //ngOnChanges

}
