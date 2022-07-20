
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<String> parts = new ArrayList<>();
        try {
                //ArrayList<ArrayList> parts = new ArrayList<>();
                Files.lines(Paths.get("literacy.csv"))
                .map(s->s.split(","))
                //.map(s->new ArrayList(s[0].trim(),s[1],s[2],s[3],s[4],Integer.valueOf(s[5])))
                //.forEach(s-> parts.add(s[3]))
                //.forEach(s -> System.out.println(s[5]));
                //.forEach(s-> new ArrayList<>(s[0].trim()),s[2],s[3],s[4],Integer.valueOf(s[5]));
                //.mapToInt(s->Integer.valueOf(s[5]));
                //.sorted((p1,p2)->
                //.sorted()
                //.forEach(s->System.out.println(s));
                //.forEach(s->parts.add(s));
                //.collect(Collectors.toCollection(ArrayList::new));
                //return new ArrayList<>();
                //.sort(s,(p1,p2)->Integer.valueOf(p1[5])-Integer.valueOf(p2[5]));
                .sorted((p1,p2)->{
                    return p1[5].compareTo(p2[5]);})
                .forEach(s->System.out.println((s[3]+" ("+s[4]+"), "+s[2].replace("(%)","").trim()+", "+s[5])));
                //.map(s-> new ArrayList<>())
                //.forEach(s->parts.add(s));

                //.forEach(p->System.out.println(p));
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("error "+e.getMessage());
        }
        //parts.stream().forEach(s->System.out.println(s));
        /*ArrayList<ArrayList> parts2 = new ArrayList<>();
        String[] partes = new String[5];
        parts.stream()
            .map(s->s.split(","))
            //.map(f-> Integer.valueOf(f[5]))
            //.sorted((p1,p2)->{
            //    return p1[5]-p2[5];
            //}).forEach(s->System.out.println(s));
            
            //.forEach(s->System.out.println(s[5]));*/
            //.map(s->new ArrayList<>()).forEach(s->parts2.add(s));
        //parts2.stream().forEach(s->System.out.println(s));
            

        //.forEach(s->parts2.add(s[1]));
        //Collections.sort(parts,(p1,p2)->p1[]);
        //parts.stream().forEach(s-> );
        //Files.lines(Paths.get("literacy.csv"))
                 //*/
    }
    //public int compareTo(String string)
}
