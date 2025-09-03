/*
Given a list of N cities and the distances between every pair of cities,
find the shortest possible route that visits each city exactly once and
returns to the starting city.
Cities = {A, B, C, D}
Distances:
    A-B: 10
    A-C: 15
    A-D: 20
    B-C: 35
    B-D: 25
    C-D: 30

 */

import java.util.*;

public class TSPPrepOne {

    public static void main(String[] args) {
        String[] cities = {"A", "B", "C", "D"};
        List<String> citiesList = new ArrayList<>(Arrays.asList(cities));
        Map<String, Integer> citiesMap = new HashMap<String, Integer>();
        citiesMap.put("AB", 10);
        citiesMap.put("AC", 15);
        citiesMap.put("AD", 20);
        citiesMap.put("BC", 35);
        citiesMap.put("BD", 25);
        citiesMap.put("CD", 30);

        Map<List<String>, Integer> combinations = new HashMap<>();
        allPossibleRoutes(citiesList,combinations, new ArrayList<>(),0, citiesMap, 0);
        System.out.println(combinations);


    }


    static void allPossibleRoutes( List<String> cities ,Map<List<String> , Integer> routes, List<String> curRoute, int index ,
                                   Map<String, Integer> citiesMap , int currRouteDistance) {

             if(index == cities.size()) {
                 String goBack = curRoute.getLast()+ curRoute.getFirst();
                 char[] charArray = goBack.toCharArray();
                  Arrays.sort(charArray);
                 currRouteDistance+= citiesMap.get(new String(charArray));
                 routes.put(new ArrayList<>(curRoute), Integer.valueOf(currRouteDistance));
                 currRouteDistance = 0 ;
                 return;
             }

             curRoute.add(cities.get(index));
            if(curRoute.size()> 1){
                String path = curRoute.get(index-1)+ curRoute.get(index);
                currRouteDistance+= citiesMap.get(path);
            }
             //Recurse  on same index ..
            for(int i = index; i < cities.size(); i++) {
                String temp = cities.get(i) ;
                //chars[i] = chars[index];
              //  chars[index] = temp;
                allPossibleRoutes(cities,routes,curRoute,index+1,citiesMap,currRouteDistance);


            }


            //Recurse on next Index




    }
}
