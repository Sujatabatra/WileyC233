import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoCompComponent } from './demo-comp.component';

describe('DemoCompComponent', () => {
  let component: DemoCompComponent;
  let fixture: ComponentFixture<DemoCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DemoCompComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DemoCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
