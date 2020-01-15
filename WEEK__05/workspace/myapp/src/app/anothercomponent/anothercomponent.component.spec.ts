import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnothercomponentComponent } from './anothercomponent.component';

describe('AnothercomponentComponent', () => {
  let component: AnothercomponentComponent;
  let fixture: ComponentFixture<AnothercomponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnothercomponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnothercomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
