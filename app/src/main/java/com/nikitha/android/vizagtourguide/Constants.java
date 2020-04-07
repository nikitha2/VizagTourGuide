package com.nikitha.android.vizagtourguide;

import android.util.Log;

import java.util.ArrayList;

public class Constants  {
    ArrayList<ListItemsObjects> listitems = new ArrayList<>();
    ListItemsObjects listItemsObjects;
    public Constants() {

    }
    int[] image;
    String[] menu;
    String[] map;
    int[] name;
    final static int slideshowtime=3000;

    public ArrayList<ListItemsObjects> populateDate(String classname){

        switch (classname){
            case "StreetFoodActivity":
                int[] name={R.string.noodlespoint,R.string.murimix,R.string.momopoints,R.string.shawarma,R.string.unclespalov,
                        R.string.juiceshop,R.string.tenatnoodles,R.string.maggi};

                int[] image={ R.drawable.noodlespoint,R.drawable.murimix,R.drawable.momopoints,R.drawable.shawarma,R.drawable.unclespalov,
                        R.drawable.juiceshop,R.drawable.tenatnoodles,R.drawable.maggi};

                String[] menu={"","","","","https://www.zomato.com/visakhapatnam/uncles-pulao-lawsons-bay-vizag/menu","","",""};
                String[] map={"","","",
                        "api=1&query=17.731512,83.340769",
                        "api=1&query=17.731512,83.340769",
                        "api=1&query=17.737344, 83.307660",
                        "api=1&query=17.748444, 83.349548",
                        "api=1&query=17.781912, 83.384323"};
                int[] text={R.string.noodlespointText,R.string.murimixText,R.string.friedMomos,R.string.shawarmaText,R.string.unclespalovText,R.string.juiceshopText,R.string.tenatnoodlesText,R.string.maggiText};

                Log.v("lengths", menu.length+" "+map.length+" "+image.length);
                for(int i=0;i<menu.length;i++){
                    ListItemsObjects listItemsObjects=new ListItemsObjects();
                    listItemsObjects.setMenu(menu[i]);
                    listItemsObjects.setMap(map[i]);
                    listItemsObjects.setImage(image[i]);
                    listItemsObjects.setText(text[i]);
                    listItemsObjects.setName(name[i]);
                    listitems.add(listItemsObjects);
                }
                return listitems;


            case "CoffeeShopsActivity":
                int[] name1={R.string.gypsy,R.string.beanboard,R.string.cofeeDay,R.string.gluttonsgarage,R.string.midtowncafe};
                int[] image1={ R.drawable.gypsy,R.drawable.beanboard,R.drawable.cofeeday,R.drawable.gluttonsgarage,R.drawable.midtowncafe};
                String[] menu1={"https://www.zomato.com/visakhapatnam/gypsy-resto-cafe-rushikonda-vizag",
                                "https://www.tripadvisor.co.uk/Restaurant_Review-g297588-d9763258-Reviews-Bean_Board_Ramanaidu_Studios-Visakhapatnam_Visakhapatnam_District_Andhra_Pradesh.html",
                                "https://www.cafecoffeeday.com/cafe-menu",
                                "https://www.instagram.com/gluttonsgarage/","https://www.swiggy.com/restaurants/the-midtown-cafe-siripuram-vizag-82966"};
                String[] map1={"api=1&query=17.771947, 83.371136",
                               "api=1&query=17.809218, 83.397473",
                                "api=1&query=17.712799, 83.319463",
                                "api=1&query=17.716106, 83.324902",
                                "api=1&query=17.720382, 83.316806"};
                int[] text1={R.string.gypsyText,R.string.beanboardText,R.string.cofeeDayText,R.string.gluttonsgarageText,R.string.midtowncafeText};
                for(int i=0;i<menu1.length;i++){
                    ListItemsObjects listItemsObjects=new ListItemsObjects();
                    listItemsObjects.setMenu(menu1[i]);
                    listItemsObjects.setMap(map1[i]);
                    listItemsObjects.setImage(image1[i]);
                    listItemsObjects.setText(text1[i]);
                    listItemsObjects.setName(name1[i]);
                    listitems.add(listItemsObjects);
                }
                return listitems;

            case "LocalFavActivity":
                int[] name2={R.string.thotlakonda,R.string.rushikondaBeach,R.string.yaradadabeach,R.string.tennetiParkBeach};
                int[] image2={ R.drawable.thotlakonda,R.drawable.rushikondabeach,R.drawable.yaradabeach,R.drawable.tenatiparkbeach};
                String[] map2={"api=1&query=17.826079, 83.410465","api=1&query=17.782516, 83.385114","api=1&query=17.654795, 83.269120","api=1&query=17.747659, 83.350555"};
                int[] text2={R.string.thotlakondaText,R.string.rushikondaBeachText,R.string.yaradadabeachText,R.string.tennetiParkBeachText};
                String[] menu2={"","","",""};
                for(int i=0;i<name2.length;i++){
                    ListItemsObjects listItemsObjects=new ListItemsObjects();
                    listItemsObjects.setMap(map2[i]);
                    listItemsObjects.setMenu(menu2[i]);
                    listItemsObjects.setImage(image2[i]);
                    listItemsObjects.setText(text2[i]);
                    listItemsObjects.setName(name2[i]);
                    listitems.add(listItemsObjects);
                }
                return listitems;

            case "HistoricPlacesActivity":
                int[] name3={R.string.insKursura,R.string.victoryatsea,R.string.aircraftMuseum,R.string.zoo};
                int[] image3={ R.drawable.inskursura,R.drawable.victoryatsea,R.drawable.aircraftmuseum,R.drawable.zoo};
                String[] map3={"api=1&query=17.717323, 83.330188","api=1&query=17.718681, 83.332237","api=1&query=17.717996, 83.329862","api=1&query=17.767937, 83.345423\n"};
                int[] text3={R.string.insKursuraText,R.string.victoryatseaText,R.string.aircraftMuseumText,R.string.zooText};
                String[] menu3={"","","",""};
                for(int i=0;i<name3.length;i++){
                    ListItemsObjects listItemsObjects=new ListItemsObjects();
                    listItemsObjects.setMap(map3[i]);
                    listItemsObjects.setMenu(menu3[i]);
                    listItemsObjects.setImage(image3[i]);
                    listItemsObjects.setText(text3[i]);
                    listItemsObjects.setName(name3[i]);
                    listitems.add(listItemsObjects);
                }
                return listitems;

            default:return null;
        }


    }



}
