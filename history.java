public class history{
    private int one;
    private int two;
    private int ans;
    private boolean answer;
    private String form;

    public history(int one, int two, int ans, boolean answer, String sign){
        this.one = one;
        this.two = two;
        this.ans = ans;
        this.answer = answer;
        this.form = String.format("%2d%2s%3d%2s%1s%4d%1s%1s\n", one, sign, two, "=", " ", ans, " ", answer);
    }

    public int one(){
        return one;
    }

    public int two(){
        return two;
    }

    public int ans(){
        return ans;
    }

    public String form(){
        return form;
    }

    public boolean answer(){
        return answer;
    }
}