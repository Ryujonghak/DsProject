package com.example.backend.service;

import com.example.backend.model.Wishlist;
import com.example.backend.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {
    @Autowired
    WishlistRepository wishlistRepository;

    public List<Wishlist> findAll() {
        List<Wishlist> wishlistList = wishlistRepository.findAll();

        return wishlistList;
    }

    public List<Wishlist> findAllByUsernameAndAndMoviecd(String username, String moviecd) {
        List<Wishlist> wishlistList = wishlistRepository.findAllByUsernameAndAndMoviecd(username, moviecd);

        return wishlistList;
    }

    public Wishlist save(Wishlist wishlist) {
        Wishlist newWishlist = wishlistRepository.save(wishlist);

        return newWishlist;
    }

    public Boolean removeById(Integer wid) {
        if (wishlistRepository.existsById(wid) == true) {
            wishlistRepository.deleteById(wid);

            return true;
        } else {
            return false;
        }
    }
}
