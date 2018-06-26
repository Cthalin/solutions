public class Program {
    public static String alternatingCaps(String s) {
        String result="";
        int length=s.length();
        int t=0;
        for(int i=0;i<length-3;i++){
            if(t%2==0){
                s = s.substring(0,i)+s.substring(i,i+1).toUpperCase()+s.substring(i+2,length-1);
                t++;
            }else{
                s = s.substring(0,i)+s.substring(i,i+1).toLowerCase()+s.substring(i+2,length-1);
                t++;
            }
        }
        return s;
    }

    public static String alternatingCapsSecond(String s) {
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
        System.out.println(result);
        result=(double)Math.round(result*100);
        return result/100;
    }

    public static String makeTitle(String s) {
        String[] words=s.split(" ");
        System.out.println(words[1]);
        for(int i=0;i<words.length;i++){
            words[i]=words[i].toUpperCase();


        }
        System.out.println(words[1]);

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
