import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovsComponent } from './movs.component';

describe('MovsComponent', () => {
  let component: MovsComponent;
  let fixture: ComponentFixture<MovsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MovsComponent]
    });
    fixture = TestBed.createComponent(MovsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
