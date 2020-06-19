import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookborrowedDetailsComponent } from './bookborrowed-details.component';

describe('BookborrowedDetailsComponent', () => {
  let component: BookborrowedDetailsComponent;
  let fixture: ComponentFixture<BookborrowedDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookborrowedDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookborrowedDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
