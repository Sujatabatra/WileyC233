import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplateInterpolationComponent } from './template-interpolation.component';

describe('TemplateInterpolationComponent', () => {
  let component: TemplateInterpolationComponent;
  let fixture: ComponentFixture<TemplateInterpolationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TemplateInterpolationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplateInterpolationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
