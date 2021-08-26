public class testMaxArea {

    public static int maxArea2(int[] height) {
        int maxArea = 0;
        if (height.length >= 2 && height.length <= 3 * Math.pow(10, 4)) {
            for (int i = 0; i < height.length - 1; i++) {
                for (int j = i + 1; j < height.length; j++) {
                    if (height[i] < 0 || height[i] > 3 * Math.pow(10, 4)) {
                        return maxArea;
                    }
                    if (height[j] < 0 || height[j] > 3 * Math.pow(10, 4)) {
                        return maxArea;
                    }
                    int area = Math.min(height[i], height[j]) * (j - i);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.print(maxArea(new int[]{1, 1}));
    }

    public static int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int l = 0;
        int r = height.length - 1;
        int result = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            result = Math.max(area, result);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return result;
    }
//    面积取决于短板。
//            ①因此即使长板往内移动时遇到更长的板，矩形的面积也不会改变；遇到更短的板时，面积会变小。
//            ②因此想要面积变大，只能让短板往内移动(因为移动方向固定了)，当然也有可能让面积变得更小，但只有这样才存在让面积变大的可能性

}
