

class solution{
    public boolean rotateString(String s, String goal) {
        //your code goes here
        if(s.length()!=goal.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(s.equals(goal)){
                return true;
            }

            char last = s.charAt(s.length()-1);
            s = last + s.substring(0, s.length()-1);


        }

        return false;
    }
}

class main{

    public static void main(String[] args){
        solution sol = new solution();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(sol.rotateString(s, goal));
    }
}