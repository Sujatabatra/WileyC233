import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppFirstChildComponent } from './app-first-child.component';

describe('AppFirstChildComponent', () => {
  let component: AppFirstChildComponent;
  let fixture: ComponentFixture<AppFirstChildComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppFirstChildComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppFirstChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
