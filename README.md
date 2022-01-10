# sort-o_AllBread

### TNPG: AllBread (Samantha Hua, Ivina Wang, Jack Chen)
### APCS pd07
### Time Spent: 1.2 hrs 
### Song of the week: [No need to be upset 10 hrs](https://www.youtube.com/watch?v=eY52Zsg-KVI)

#### BubbleSort 
* Best Case Scenario
  * Array ordered from least to greatest 
  * With a sorted array, no swaps are necessary however comparisions are still executed. This is the best case because it limits the amount of memory used to perform the sort.
  * In our array of 5 elements, this creates the least number of swaps (0) but requires 20 comparisons
* Worst Case Scenario
  * Array ordered from greatest to least
  * Every time the element on the left is greater than the element on the right, a swap is performed. An array sorted in decreasing value necessitates the largest number of swaps because every number on the left is greater than the one on the right.
  * In our array of 5 elements, this creates the most number of swaps (10) but requires 20 comparisons
* We tested an array of 5 elements with unordered numbers. The number of swaps required was between the swaps neccessary for the best and worst cases which goes to show that there is a distinct best and worst case for BubbleSort
#### InsertionSort
* Best Case Scenario
  * Array ordered from least to greatest
  * In our array of 5 elements, this creates the least number of swaps (0) and comparisons (4)
* Worst Case Scenario 
  * Array ordered from greatest to least
  * In our array of 5 elements, this creates the greatest number of swaps (10) and comparisons (10)
* Similar to BubbleSort for unordered case
#### SelectionSort
* No Best or Worst Case 
  * No matter the order of the array, the same number of swaps (4) and comparisons (10) were made

