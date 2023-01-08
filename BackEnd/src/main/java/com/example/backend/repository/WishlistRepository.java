package com.example.backend.repository;

import com.example.backend.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
    List<Wishlist> findAllByUsernameAndAndMoviecd(String username, String moviecd);

    List<Wishlist> findAllByUsername(String username);

}
