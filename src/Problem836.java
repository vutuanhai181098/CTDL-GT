public class Problem836 {
//  https://leetcode.com/problems/rectangle-overlap/submissions/957875918/

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec1[2] > rec2[0] && rec1[3] > rec2[1]);
    }
}
