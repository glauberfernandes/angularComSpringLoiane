import { Component, OnInit } from '@angular/core';

import { AppMaterialModule } from '../../shared/app-material/app-material.module';
import { Course } from '../model/course';
import { CoursesService } from './../services/courses.service';
import { Observable, catchError, of } from 'rxjs';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-courses',
  standalone: true,
  imports: [AppMaterialModule, CommonModule],
  templateUrl: './courses.component.html',
  styleUrl: './courses.component.css'
})
export class CoursesComponent implements OnInit {
  courses$: Observable<Course[]>;

  readonly displayedColumns = ['name', 'category', 'actions'];

  constructor(private coursesService: CoursesService) {
    this.courses$ = this.coursesService.list().pipe(
      catchError(error => {
        return of([])
      })
    );
  }

  ngOnInit(): void {

  }

}
