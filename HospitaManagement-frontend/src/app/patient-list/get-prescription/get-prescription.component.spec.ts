import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetPrescriptionComponent } from './get-prescription.component';

describe('GetPrescriptionComponent', () => {
  let component: GetPrescriptionComponent;
  let fixture: ComponentFixture<GetPrescriptionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetPrescriptionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetPrescriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
