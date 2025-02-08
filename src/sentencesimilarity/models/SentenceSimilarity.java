package sentencesimilarity.models;

import java.awt.List;
import java.util.*;

public class SentenceSimilarity {

    public static Set<String> string2Set(String sentence){
        var newSentence = sentence.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split(" ");
        return new HashSet<>(Arrays.asList(newSentence));
    }

    public static Set<String> intersection(String sentence1 , String sentence2){
        var sentence1Formated = string2Set(sentence1);
        var sentence2Formated = string2Set(sentence2);
        sentence1Formated.retainAll(sentence2Formated);
        return sentence1Formated;
    }

    public static Set<String> union(String sentence1, String sentence2){
        var sentence1Formated = string2Set(sentence1);
        var sentence2Formated = string2Set(sentence2);
        var sentenceUnion = new HashSet<String>();
        sentenceUnion.addAll(sentence1Formated);
        sentenceUnion.addAll(sentence2Formated);
        return sentenceUnion;
    }

    public static float jaccard(String sentence1, String sentence2){
        return (float) intersection(sentence1, sentence2).size() /union(sentence1,sentence2).size();
    }


    public static void main(String[] args) {
        System.out.println(intersection("This a test", "this is another test"));
        System.out.println(union("This a test", "this is another test"));
        System.out.println(jaccard("This a test","this is another test"));
        System.out.println(jaccard("This a test","This a test"));
        System.out.println(jaccard("this is another test",""));
    }
}
