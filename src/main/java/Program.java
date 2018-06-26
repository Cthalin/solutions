public class Program {

    public static String alternatingCaps(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
               arr[i]=Character.toUpperCase(arr[i]);
            }else{
                arr[i]=Character.toLowerCase(arr[i]);
            }
        }
        String result = new String(arr);
        return result;
    }

    public static boolean letterCheck(String[] s) {
        s[0]=s[0].toLowerCase();
        s[1]=s[1].toLowerCase();
        char[] check=s[1].toCharArray();
        for(char c:check){
            if(s[0].indexOf(c)==-1) return false;
        }
        return true;
    }

    public static double mean(int[] nums) {
        int sum=0;
        for(int i:nums) sum=sum+i;
        double result=(double)sum/nums.length;
        result=(double)Math.round(result*100);
        return result/100;
    }

    public static String makeTitle(String s) {
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            //jedes wort teilen und capitalizen
            String letter = words[i].substring(0,1);
            letter=letter.toUpperCase();
            StringBuilder sb = new StringBuilder(letter);
            sb.append(words[i].substring(1,words[i].length()));
            words[i]=sb.toString();

        }

        StringBuilder builder = new StringBuilder();
        for (String string : words) {
            if (builder.length() > 0) {
                builder.append(" ");
            }
            builder.append(string);
        }
        String string = builder.toString();
        return string;
    }
}
