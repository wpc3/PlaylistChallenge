package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int buttonskips = 0;

        for(int i = startIndex; i <playList.length; i++){

            if(playList[i].equals(selection)){
                return buttonskips;
            }
            else buttonskips++;
        }




        return buttonskips;
    }
}
