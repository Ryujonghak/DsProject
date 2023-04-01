<template>
  <div>
    <div class="hero common-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1 style="text-align: left">전체영화</h1>
              <ul class="breadcumb" style="text-align: left">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>All Movies</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width2">
          <div class="col-xs-12">
            <div
              class="topbar-filter col-xs-12"
              style="padding-top: 1%; padding-bottom: 1%"
            >
              <label class="switcher col-xs-2.5" style="margin: 0%">
                <input type="checkbox" @click="showNowPlaying" />
                <div class="switcher__indicator"></div>
                <span style="font-size: 100%">상영작만 보기</span>
              </label>

              <div
                class="col-xs-3.5"
                style="padding-left: 3%"
                v-show="allMovies"
              >
                <p class="search-numbers" style="margin-top: 1.5%">
                  <span>{{ movie.totalItems }}</span
                  >개의 영화가 검색되었습니다.
                </p>
              </div>

              <div class="col-xs-6" style="margin-right: 2%" v-show="allMovies">
                <div class="search-movie">
                  <input
                    class="form-control"
                    type="search"
                    placeholder="영화명 검색"
                    v-model="searchMname"
                    @keyup.enter="retrieveMovie()"
                  />
                  <a
                    class="btn-search"
                    type="button"
                    @click="
                      page = 1;
                      retrieveMovie();
                    "
                  >
                    검색
                  </a>
                </div>
              </div>

              <div
                class="col-xs-3.5"
                style="padding-left: 3%"
                v-show="nowPlaying"
              >
                <p class="search-numbers" style="margin-top: 1.5%">
                  <span>{{ nowPlayingMovies.length }}</span
                  >개의 영화가 검색되었습니다.
                </p>
              </div>
              <div
                class="col-xs-6"
                style="margin-right: 2%"
                v-show="nowPlaying"
              >
                <div class="search-movie">
                  <input
                    class="form-control"
                    type="search"
                    placeholder="영화명 검색"
                    v-model="searchMname"
                    @keyup.enter="retrieveMovie()"
                  />
                  <a
                    class="btn-search"
                    type="button"
                    @click="
                      page = 1;
                      retrieveMovie();
                    "
                  >
                    검색
                  </a>
                </div>
              </div>
            </div>

            <!-- All movies -->
            <div class="celebrity-items col-xs-12" v-show="allMovies">
              <div
                class="col-xs-4"
                style="margin-bottom: 5%"
                v-for="(data, index) in movie.MovieDetail"
                :key="index"
              >
                <router-link :to="'/allMovie/' + data.moviecd"
                  ><img
                    :src="data.posterurln"
                    alt="poster"
                    style="margin-bottom: 5%; width: 100%"
                  />
                </router-link>
                <div class="ceb-infor">
                  <h6>
                    <router-link
                      :to="'/allMovie/' + data.moviecd"
                      style="color: white"
                      >{{ data.movienm }}</router-link
                    >
                  </h6>
                  <span style="color: #abb7c4"
                    ><i class="ion-android-star" style="color: #f5b50a"></i>
                    {{ data.raiting }}/10</span
                  >
                </div>
              </div>
            </div>

            <!-- Now playing -->
            <div class="celebrity-items col-xs-12" v-show="nowPlaying">
              <div
                class="col-xs-4"
                style="margin-bottom: 5%"
                v-for="(data, index) in nowPlayingMovies"
                :key="index"
              >
                <router-link :to="'/allMovie/' + data.moviecd"
                  ><img
                    :src="data.posterurln"
                    alt="poster"
                    style="margin-bottom: 5%; width: 100%"
                /></router-link>
                <div class="ceb-infor">
                  <h6>
                    <a href="/movieDetail" style="color: white">{{
                      data.movienm
                    }}</a>
                  </h6>
                  <span style="color: #abb7c4"
                    ><i class="ion-android-star" style="color: #f5b50a"></i>
                    {{ data.raiting }}/10</span
                  >
                </div>
              </div>
            </div>

            <a class="topbutton" href="#">
              <img src="@/assets/images_jung/iconUp_48.png" />
            </a>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import MovieDataService from "@/services/MovieDataService";

/* eslint-disable */
export default {
  mounted() {
    this.retrieveMovie();
  },
  data() {
    return {
      allMovies: true,
      nowPlaying: false,
      movie: [],
      searchMname: "",

      page: 1,
      count: 0,
      pageSize: 100,

      searchStatue: "",
      nowPlayingMovies: [],
    };
  },
  methods: {
    retrieveMovie() {
      MovieDataService.getMovieDetailAll(
        this.searchMname,
        this.page - 1,
        this.pageSize
      )
        .then((response) => {
          const movie = response.data;
          this.movie = movie;
          console.log(response.data);

          let temp = new Array();

          for (let i = 0; i < this.movie.totalItems; i++) {
            if (this.movie.MovieDetail[i].prdtstatnm == "개봉") {
              temp.push(this.movie.MovieDetail[i]);
            }
          }

          this.nowPlayingMovies = temp;
        })
        .catch((e) => {
          console.log(e);
        });
    },
    handlePageChange(value) {
      this.page = value;
      this.retrieveMovie();
    },
    showNowPlaying() {
      this.allMovies = !this.allMovies;
      this.nowPlaying = !this.nowPlaying;
    },
    enterkey() {
      if (window.event.keyCode == 13) {
        this.retrieveMovie();
      }
    },
  },
};
</script>

<style scoped>
.btn-search {
  width: 30px;
  height: 32px;
  font-size: 0;
  line-height: 0;
  border: 0;
  position: absolute;
  top: 3%;
  right: 4%;
  z-index: 3;
  background: white
    url(https://img.megabox.co.kr/static/pc/images/common/btn/btn-search-input.png)
    no-repeat center;
}
.common-hero {
  background: url("@/assets/images_choi/Views/choi/admin/movie-theater03.png") !important;
}
.search-numbers {
  padding: 0;
  margin-top: 2.5%;
  text-align: left;
  font-size: 98%;
}

.form-control {
  width: 50%;
  margin-left: 50%;
}
.search-movie {
  padding-right: 0;
}

.switcher {
  position: relative;
  display: inline-block;
  cursor: pointer;
  padding-left: 60px;
  height: 40px;
  line-height: 40px;
  margin: 5px;
  font-size: 15px;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}
.switcher input {
  display: none;
}

.switcher__indicator::after {
  content: "";
  position: absolute;
  top: 10px;
  left: 0;
  height: 20px;
  width: 20px;
  background-color: #d5d5d5;
  border-radius: 50%;
  transition: all 0.3s ease;
  -webkit-animation-name: pulsein;
  animation-name: pulsein;
  -webkit-animation-duration: 0.3s;
  animation-duration: 0.3s;
}
.switcher__indicator::before {
  content: "";
  position: absolute;
  top: 16px;
  left: 0;
  width: 50px;
  height: 8px;
  background-color: #d5d5d5;
  border-radius: 10px;
  transition: all 0.3s ease;
}
input:checked + .switcher__indicator::after {
  background-color: purple;
  transform: translateX(30px);
  -webkit-animation-name: pulseout;
  animation-name: pulseout;
  -webkit-animation-duration: 0.3s;
  animation-duration: 0.3s;
}
input:checked + .switcher__indicator::before {
  background-color: purple;
}
input:disabled + .switcher__indicator::after,
input:disabled + .switcher__indicator::before {
  background-color: #e5e5e5;
}

@-webkit-keyframes pulsein {
  0%,
  100% {
    top: 10px;
    height: 20px;
    width: 20px;
  }
  50% {
    top: 5px;
    height: 28px;
    width: 26px;
  }
}

@keyframes pulsein {
  0%,
  100% {
    top: 10px;
    height: 20px;
    width: 20px;
  }
  50% {
    top: 5px;
    height: 28px;
    width: 26px;
  }
}
@-webkit-keyframes pulseout {
  0%,
  100% {
    top: 10px;
    height: 40px;
    width: 20px;
  }
  50% {
    top: 5px;
    height: 28px;
    width: 26px;
  }
}
@keyframes pulseout {
  0%,
  100% {
    top: 10px;
    height: 20px;
    width: 20px;
  }
  50% {
    top: 5px;
    height: 28px;
    width: 26px;
  }
}
.i {
  color: #f5b50a;
  font-size: 22px;
}

.topbutton {
  position: fixed;
  bottom: 15px;
  right: 15px;
  width: 40px;
  height: 40px;
  z-index: 1;
  opacity: 0.8;
}
</style>
