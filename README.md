# sort-o_AllBread

### TNPG: AllBread (Samantha Hua, Ivina Wang, Jack Chen)
### APCS pd07
### Time Spent: 3 hrs 
### Song of the week: [No need to be upset 10 hrs](https://www.youtube.com/watch?v=eY52Zsg-KVI)

### Bubblesort 
* Best Case Scenario
  * Array ordered from least to greatest
  * With a sorted array, no swaps are necessary however comparisions are still executed. This is the best case because it limits the amount of memory used to perform the sort.
  * The time complexity of the best case is O(1). We plotted the points in the table and looked at the relationship between Array Lengths and Comparisions. We found that the relationship was linear. 
* Worst Case Scenario
  * Array ordered from greatest to least
  * Every time the element on the left is greater than the element on the right, a swap is performed. An array sorted in decreasing value necessitates the largest number of swaps because every number on the left is greater than the one on the right.
  * The time complexity for the worst case scenario of BubbleSort is O(n^2). We used the same procedure as the BubbleSort Best Case scenario when determining the relationship between array lengths and comparisions. We concluded the relationship was quadratic.
* We also tested an array of 5 elements with unordered numbers. The number of swaps required was between the swaps neccessary for the best and worst cases which goes to show that there is a distinct best and worst case for BubbleSort

**Best Case**
| Array Length| Swaps       | Comparisions|
| ----------- | ----------- | ----------- |
| 10          | 0           |90           |
| 100         | 0           |9900         |
| 1000        | 0           |999000       |
| 10000       | 0           |99990000     |

**Worst Case**
| Array Length| Swaps       | Comparisions|
| ----------- | ----------- | ----------- |
| 10          | 45          |90           |
| 100         | 4950        |9900         |
| 1000        | 499500      |999000       |
| 10000       | 49995000    |99990000     |

### Insertion Sort
* Best Case Scenario
  * Array ordered from least to greatest
  * This is the best case because no swaps are necessary to order the array. The least number of comparisons are performed as well because the sorted region is the entire array so there are less comparisions needed to see if the newly, inserted number from the unsorted region is in the correct place.
  * The time complexity is O(n).
* Worst Case Scenario 
  * Array ordered from greatest to least
  * This is the worst case because it maximizes the number of swaps and comparisions needed as each newly, inserted number is always out of order. This increases the number of swaps and comparisions to sort the array. 
  * Time complexity for the worst case scenario is O(n^2).
* Similar to BubbleSort for the unordered case


**Best Case**
| Array Length| Swaps       | Comparisions|
| ----------- | ----------- | ----------- |
| 10          | 0           |9            |
| 100         | 0           |99           |
| 1000        | 0           |999          |
| 10000       | 0           |9999         |

**Worst Case**
| Array Length| Swaps       | Comparisions|
| ----------- | ----------- | ----------- |
| 10          | 45          |45           |
| 100         | 4950        |4950         |
| 1000        | 499500      |499500       |
| 10000       | 49995000    |49995000     |

### Selection Sort
* No Best or Worst Case 
  * No matter the order of the array, the same number of swaps and comparisons were made
  * This occurs because regardless of the values in the array, the sorting algorithm iterates through the entire array
* Time complexity for the worst is O(n^2).

**Best/Worst Case**
| Array Length| Swaps       | Comparisions|
| ----------- | ----------- | ----------- |
| 10          | 9           |45           |
| 100         | 99          |4950         |
| 1000        | 999         |499500       |
| 10000       | 9999        |49995000     |
