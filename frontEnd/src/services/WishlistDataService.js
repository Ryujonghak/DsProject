import http from "@/http-common";
class WishlistDataService {

    getAll() {
        return http.get('/wishlist');
    }

    get(username, moviecd) {
        return http.get(`/wishlist/${username}/${moviecd}`);
    }

    getUsernameMovie(username) {
        return http.get(`/wishlist/${username}`);
    }

    create(data) {
        console.log(data);
        return http.post('/wishlist', data);
    }

    delete(wid) {
        return http.delete(`/wishlist/${wid}`);
    }
}

export default new WishlistDataService();