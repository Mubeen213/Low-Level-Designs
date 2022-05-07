package com.mubeen;

import java.util.ArrayList;
import java.util.HashMap;

public class BookMyShow {
    private ArrayList<User> users;
    private ArrayList<Theatre> theatres;

    static HashMap<String,ArrayList<Show>> movieMap;

    public BookMyShow(ArrayList<Theatre> theatres){
        this.users = new ArrayList<>();
        this.theatres = theatres;
        this.movieMap = new HashMap<>();
    }

    private void generateMovieMap(){
        for(Theatre theatre: theatres){
            ArrayList<Show> showArray = theatre.getShows();
            for(Show show: showArray){
                if(show!=null){
                    if(movieMap.containsKey(show.getMovie().getName())){
                        movieMap.get(show.getMovie().getName()).add(show);
                    }
                    else{
                        ArrayList<Show> movieShowList = new ArrayList<>();
                        movieShowList.add(show);
                        movieMap.put(show.getMovie().getName(),movieShowList);
                    }
                }
            }
        }
    }

    public static ArrayList<Show> searchShows(String movieName){
        if(movieMap.containsKey(movieName)){
            return movieMap.get(movieName);
        }else{
            return null;
        }
    }
}
