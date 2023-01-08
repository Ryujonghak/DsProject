package com.example.backend.service;

import com.example.backend.model.Wishlist;
import com.example.backend.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public List<Wishlist> findAllByUsername(String username) {
        List<Wishlist> wishlistList = wishlistRepository.findAllByUsername(username);

        return wishlistList;
    }

    public List<Wishlist> findAllByOpendtContaining(String opendt) {
        List<Wishlist> wishlistList = wishlistRepository.findAllByOpendtContaining(opendt);

        return wishlistList;
    }

    public List<Wishlist> findAllByUsernameAndAndMoviecd(String username, String moviecd) {
        List<Wishlist> wishlistList = wishlistRepository.findAllByUsernameAndAndMoviecd(username, moviecd);

        return wishlistList;
    }

    public Page<Wishlist> findAllByUsername(String username, Pageable pageable) {
        Page<Wishlist> wishlistPage = wishlistRepository.findAllByUsername(username, pageable);

        return wishlistPage;
    }

    public Page<Wishlist> findAllByOpendtContaining(String opendt, Pageable pageable) {
        Page<Wishlist> wishlistPage = wishlistRepository.findAllByOpendtContaining(opendt, pageable);

        return wishlistPage;
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
