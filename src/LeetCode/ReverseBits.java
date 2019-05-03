package LeetCode;

public class ReverseBits {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int b = 0;
            int num = 32;
            while (num > 0)
            {
                b = (b << 1) | (n & 1);
                n >>= 1;
                num--;
            }
            return (b);
        }
}

