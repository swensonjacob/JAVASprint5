package ÖvnUppg5_URLWordCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ÖvnUppg5_URLWordCountB {

    public ÖvnUppg5_URLWordCountB () {

        try{
            URL url = new URL("http://www.puzzlers.org/pub/wordlists/pocket.txt");
            
            BufferedReader words = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            
            Map <Integer, List<String>> letterCountWordListMap 
                    = words.lines()
                    .collect(Collectors.groupingBy(n -> n.length()));
            
            Collection<List<String>> wordsOnly = letterCountWordListMap.
                    values();
            
            Map <Integer, Integer> letterCountMap = wordsOnly.stream()
                    .collect(Collectors
                            .toMap(n -> n.get(0).length(), n -> n.size()));
            
            letterCountMap.forEach((k,v) -> System.out.println(k + " " +v));
           
            
        }
        catch (MalformedURLException e){
            e.printStackTrace();
       }

        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        ÖvnUppg5_URLWordCountB ö = new ÖvnUppg5_URLWordCountB();
    }
}
