import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewComponentComponent } from './view-component.component';

describe('ViewComponentComponent', () => {
  let component: ViewComponentComponent;
  let fixture: ComponentFixture<ViewComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
