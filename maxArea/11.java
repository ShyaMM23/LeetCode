int maxArea(int* height, int n) {
    int max = 0;
    int i = 0;
    int j = n - 1;
    while (i < j) {
        int h = (height[i] < height[j]) ? height[i] : height[j];
        int currentArea = h * (j - i);
        if (currentArea > max) {
            max = currentArea;
        }
        if (height[i] < height[j]) {
            i++;
        } else {
            j--;
        }
    }
    return max;
}
