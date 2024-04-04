from typing import List


class Matric_2352:
    def equalPairs(self, grid: List[List[int]]) -> int:
        count =0
        for i in range(len(grid)):
            for j in range(len(grid)):
                    if all(grid[i][k] == grid[k][j]  for k in range(len(grid))):
                        count+=1
        return count
obj = Matric_2352()
grid = [[3,2,1],[1,7,6],[2,7,7]]
print(obj.equalPairs(grid))