/*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Insertion~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    |    Step 1: For j = 2 to A.Length                                         |
    |    Step 2:     Key = A[j]                                                |
    |    Step 3:     //insert A[j] into the sorted sequence A[1....j-1]        |
    |    Step 4:     i = j-1                                                   |
    |    Step 5:     while i>0 and A[i] > Key                                  |
    |    Step 6:         Set A[i+1] = a[i]                                     |
    |    Step 7:         i = i - 1;                                            |
    |    Step 8:     A[i+1] = key                                              |
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Insertion~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
