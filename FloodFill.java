package leetcode.may;

import java.util.Arrays;

public class FloodFill {

	public int[][] helper(int[][] image, int sr, int sc, int newColor, int ck) {

		if (image[sr][sc] == ck && image[sr][sc] != newColor) {
			image[sr][sc] = newColor;

			if (sr + 1 < image.length)
				helper(image, sr + 1, sc, newColor, ck);
			if (sr - 1 >= 0)
				helper(image, sr - 1, sc, newColor, ck);
			if (sc + 1 < image[sr].length)
				helper(image, sr, sc + 1, newColor, ck);
			if (sc - 1 >= 0)
				helper(image, sr, sc - 1, newColor, ck);
			return image;
		} else
			return image;

	}

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		return helper(image, sr, sc, newColor, image[sr][sc]);
	}

	public static void main(String[] args) {
		int[][] image = new int[][] { { 0, 0, 0 }, { 0, 1, 1 } };
		int sr = 1;
		int sc = 1;
		int newColor = 1;
		FloodFill ff = new FloodFill();
		System.out.println(Arrays.deepToString(ff.floodFill(image, sr, sc, newColor)));

	}

}
