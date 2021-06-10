package by.olehno.array.entity;

import by.olehno.array.service.ArrayChangeService;
import by.olehno.array.service.ArrayFindService;

public class Cheking {
    public static void main(String[] args) {
        CustomArray array = new CustomArray(new int[]{1,5,7,55,-5,-7});
        ArrayFindService findService = new ArrayFindService();
        findService.FindMaxElement(array);
        findService.CountNegativeElement(array);
        findService.CountPositiveElement(array);
        findService.FindMinElement(array);
        findService.FindAverageValue(array);
        ArrayChangeService changeService = new ArrayChangeService();
        changeService.ChangeElement(array);

    }
}
