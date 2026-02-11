bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target) {
    int start=0;
    int end=matrixSize *(*matrixColSize)-1;
    while(start<=end) 
    {
        int mid=start+(end-start)/2;
        int row=mid/(*matrixColSize);
        int col=mid%(*matrixColSize);
        int value=matrix[row][col];
        if (value==target) 
        {
            return true;
        } 
        else if(value<target) 
        {
            start=mid+1;
        } 
        else 
        {
            end=mid-1;
        }
    }
    return false;
}