# Sorting

**Bubblesort.java**

This algorithm gets input from the user until he quits. And then it performs the sorting in ascending order. In ascending
order sorting, the largest number gets sinked to the end of array after each iteration, and hence at the end of all the
iterations, the array is sorted.

**SelectionSort.java**

This algorithm gets input from the user until he quits. And then it performs the sorting in ascending order. It first
finds the smallest element and moves its position to one in the array. Then, it finds the second smallest element and
moves its position to two in the array, and so on, until all the elements are sorted. 

**InsertionSort.java**

This algorithm gets input from the user until he quits. And then it performs the sorting in ascending order. Initially,
the algorithm picks the second element (key) of the input array, and checks whether the current element and the previous
element are in ascending order. In the next iteration, the position of the key iterates, and checks whether the current
(third) element and the previous elements are in ascending order. The iteration continues until all the elements are sorted.

**QuickSort.java**

This algorithm gets input from the user until he quits. And then it performs the sorting in ascending order. Initially, the
algorithm picks the middle element of the array as a pivot element, and checks whether all the elements before the pivot
element are less than the pivot element, and all the elements after the pivot element are greater than the pivot element. 
If not, then the algorithm rearranges in the above menetioned way. After that, the program divides the array into two 
sub-arrays, and apply the algorithm on each array, and the procedure occurs recursively until all the elements are sorted.
