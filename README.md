
## Team Consonants
* Oscar, Ari, Eric 


### Tests Performed 
* Our tests are first a random element to be found set as equal random chocies for both arrasy to find, ran on a changing size 
* and trials for best average return
* This returns the time before and after each method, and thus all trials for the array, to give us the length it was running at

* These are then followed by the worst case scenario for both methods, the last element being the target.
* Of course also having manipulatable trials and sizes of arrays.
* As well returning times in the same manner as the former
### Results :

#### Random Targets  
- total time for 100,000 trials
| Length of Array | Binary Time (milliseconds) | Linear Time (milliseconds) |
| ----------- | ----------- | ----------- |
| 10 | 0.0 | 1 |
| 100 | 0.0 | 2 |
| 1000 | 5 | 14 |
| 10000 | 6 | 85 |
| 100000 | 31 | 9631 |

#### Worst Target
- total time for 100,000 trials
| Length of Array | Binary Time (milliseconds) | Linear Time (milliseconds) |
| ----------- | ----------- | ----------- |
| 10 | 39 | 97 |
| 100 | 26 | 100 |
| 1000 | 33 | 200 |
| 10000 | 16 | 1650 |
| 100000 | 29 | 21794|


### Conclusions
* Both when given Worst case, and when given a random to find, binary is consistenly much better than linear
