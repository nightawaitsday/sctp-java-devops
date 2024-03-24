package sg.edu.ntu.fnbapi.service;

import java.util.ArrayList;
import java.util.List;

import sg.edu.ntu.fnbapi.entity.Favourite;
import sg.edu.ntu.fnbapi.entity.Restaurant;

public interface FavouriteService {

    // CREATE
    Favourite createFavourite(Long restaurantId, Long consumerId);

    void removeFavoriteFromConsumer(Long restaurantId, Long consumerId);

}
