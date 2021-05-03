package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String string){
        int vowelCount=0;
        for(int i=0;i<string.length();i++)
        {
            String sub = string.substring(i,i+1);
            if(isVowel(sub))
                vowelCount++;
        }
        return vowelCount;
    }
    public boolean isVowel(String string){
        return "aeiouAEIOU".contains(string);
    }
}
