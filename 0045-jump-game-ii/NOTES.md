1. Let current index be i
2. Calculate the Maximum Reachable position, max of  i+nums[i], maxReach
3. If current index is the lastJumped positon, then jump to the next maxreachable.
4. Increment the jumps
5. Iterate till the lastJump reaches end of the array.
Time Complexity - O(N), Space Complexity - O(1)