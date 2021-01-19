package leecode;

public class CalculateTime {
    public int calculateTime(String keyboard, String word)
    {
        int[] index = new int[26];
        for (int i = 0; i < keyboard.length(); ++i)
        {
            index[keyboard.charAt(i) - 'a'] = i;
        }

        int sum = 0;
        int last = 0;
        for (char c : word.toCharArray())
        {
            sum += Math.abs(index[c - 'a'] - last);
            last = index[c - 'a'];
        }

        return sum;
    }

    public static void main(String[] args) {
        CalculateTime ct = new CalculateTime();
        int rs = ct.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba");
        System.out.println(rs);
    }
}
