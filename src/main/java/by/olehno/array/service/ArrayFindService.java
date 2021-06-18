package by.olehno.array.service;

import by.olehno.array.entity.CustomArray;

public interface ArrayFindService {
     int FindMaxElement(CustomArray customArray);


    int FindMinElement(CustomArray customArray);


    double FindAverageValue(CustomArray customArray);


    int FindSumElements(CustomArray customArray);


    int CountPositiveElement(CustomArray customArray);


    int CountNegativeElement(CustomArray customArray);

}
