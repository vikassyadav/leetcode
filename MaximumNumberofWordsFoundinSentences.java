// leetcode 2114 
public class MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordFound(s));
    }
//  takes 10ms runtime 
    private static int mostWordFound(String[] sentence) {
        int max=0;
        for (String sentences : sentence) {
            
            // int len = sentences.split(" ").length;         // conside single space
            int len = sentences.split("\\s+").length;     // consider multiple space
            max=Math.max(max, len);
        }
        return max;
     }

     //other method tales 3ms runtime
     public int mostWordsFounds(String[] sentences) {
        int ans = 0;
        // take sentence[i] from array of String take string
        for(int i =0;i<sentences.length;i++) {
            String temp = sentences[i];
            int count =1;
        //    count length of sentences[i] and from that count space
            for(int j =0;j<temp.length();j++) {
                if(temp.charAt(j) == ' ') {         //this condition fails when there is multiple space for that we to consider edge case and remove Extra space from string
                    count++;
                     
                }
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}

/*
Use split("\\s+") to split a string on one or more whitespace characters, treating consecutive whitespace characters as a single delimiter.

Use split(" ") to split a string specifically on individual space characters.
 */