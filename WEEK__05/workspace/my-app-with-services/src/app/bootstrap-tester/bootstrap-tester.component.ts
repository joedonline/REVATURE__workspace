import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bootstrap-tester',
  templateUrl: './bootstrap-tester.component.html',
  styleUrls: ['./bootstrap-tester.component.scss']
})
export class BootstrapTesterComponent implements OnInit {

  classesToTest1: string = "btn btn-primary";
  classesToTest2: string = "btn btn-info";

  constructor() { }

  ngOnInit() {
  }

}
