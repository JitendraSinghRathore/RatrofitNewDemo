package com.example.ratrofitnewdemo;

import java.util.List;

public class Demo {

    /**
     * location : Warsaw, Poland
     * city : Warszawa
     * state : Masovian Voivodeship
     * country : Poland
     * lat : 52.2297
     * lon : 21.0122
     * dateselect : 13-08-2019
     * timeselect : 07:00 PM
     * persons : 2
     * tzone : Europe/Warsaw
     * tzonec : CEST
     * allcuisines : ["American","Italian","Seafood","French","Indian","Mexican","Japanese","British","Chinese","German","Spanish","Pizzeria","Barbecue","Greek","Turkish","Irish","Argentinean","Portuguese","Lebanese","Brazilian","Korean","Australian","Cuban","Moroccan","Persian","Austrian","Russian","Polish","Filipino","Egyptian","Israeli","Sri Lankan","South African","Halal","African","Asian","Bistro","Café","Continental","European","Malaysian","Mediterranean","Pan-Asian","Peruvian","Thai","Vietnamese"]
     * selecteddate : 2019-08-13
     * cday : tuesday
     * restname : false
     * cuisines : ["italian"]
     * restaurants : {"current_page":1,"data":[{"ID":25,"owner_id":120,"name":"Namaste India","url_slug":"namaste-india","address":"Żurawia 5, Warsaw, Poland","timezone":"Europe/Warsaw","latitude":"52.2287","longitude":"21.0201","country":"Poland","state":"mazowieckie","city":"Warszawa","zipcode":"00-001","attachment_id":0,"added_on":"2019-09-10 02:14:57","updated_on":"2019-09-10 02:14:57","account_status":1,"reservation_status":1,"abs_path":null,"distance":0.34141359532915966},{"ID":4,"owner_id":4,"name":"Italian Restaurant","url_slug":"italian-restaurant","address":"John Paul II Avenue 23, Warsaw, Poland","timezone":"Europe/Warsaw","latitude":"52.2364","longitude":"20.9962","country":"Poland","state":"mazowieckie","city":"Warszawa","zipcode":"00-854","attachment_id":13,"added_on":"2019-03-28 07:59:02","updated_on":"2019-03-28 07:59:02","account_status":1,"reservation_status":1,"abs_path":"uploads/2019/04/1554392975patio-960x675.jpg","distance":0.8202400973572198}],"first_page_url":"https://dev.booktable.co/mobapi/search?page=1","from":1,"last_page":1,"last_page_url":"https://dev.booktable.co/mobapi/search?page=1","next_page_url":null,"path":"https://dev.booktable.co/mobapi/search","per_page":10,"prev_page_url":null,"to":2,"total":2}
     * restaurantc : 2
     */

    private String location;
    private String city;
    private String state;
    private String country;
    private String lat;
    private String lon;
    private String dateselect;
    private String timeselect;
    private String persons;
    private String tzone;
    private String tzonec;
    private String selecteddate;
    private String cday;
    private boolean restname;
    private RestaurantsBean restaurants;
    private int restaurantc;
    private List<String> allcuisines;
    private List<String> cuisines;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getDateselect() {
        return dateselect;
    }

    public void setDateselect(String dateselect) {
        this.dateselect = dateselect;
    }

    public String getTimeselect() {
        return timeselect;
    }

    public void setTimeselect(String timeselect) {
        this.timeselect = timeselect;
    }

    public String getPersons() {
        return persons;
    }

    public void setPersons(String persons) {
        this.persons = persons;
    }

    public String getTzone() {
        return tzone;
    }

    public void setTzone(String tzone) {
        this.tzone = tzone;
    }

    public String getTzonec() {
        return tzonec;
    }

    public void setTzonec(String tzonec) {
        this.tzonec = tzonec;
    }

    public String getSelecteddate() {
        return selecteddate;
    }

    public void setSelecteddate(String selecteddate) {
        this.selecteddate = selecteddate;
    }

    public String getCday() {
        return cday;
    }

    public void setCday(String cday) {
        this.cday = cday;
    }

    public boolean isRestname() {
        return restname;
    }

    public void setRestname(boolean restname) {
        this.restname = restname;
    }

    public RestaurantsBean getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(RestaurantsBean restaurants) {
        this.restaurants = restaurants;
    }

    public int getRestaurantc() {
        return restaurantc;
    }

    public void setRestaurantc(int restaurantc) {
        this.restaurantc = restaurantc;
    }

    public List<String> getAllcuisines() {
        return allcuisines;
    }

    public void setAllcuisines(List<String> allcuisines) {
        this.allcuisines = allcuisines;
    }

    public List<String> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<String> cuisines) {
        this.cuisines = cuisines;
    }

    public static class RestaurantsBean {
        /**
         * current_page : 1
         * data : [{"ID":25,"owner_id":120,"name":"Namaste India","url_slug":"namaste-india","address":"Żurawia 5, Warsaw, Poland","timezone":"Europe/Warsaw","latitude":"52.2287","longitude":"21.0201","country":"Poland","state":"mazowieckie","city":"Warszawa","zipcode":"00-001","attachment_id":0,"added_on":"2019-09-10 02:14:57","updated_on":"2019-09-10 02:14:57","account_status":1,"reservation_status":1,"abs_path":null,"distance":0.34141359532915966},{"ID":4,"owner_id":4,"name":"Italian Restaurant","url_slug":"italian-restaurant","address":"John Paul II Avenue 23, Warsaw, Poland","timezone":"Europe/Warsaw","latitude":"52.2364","longitude":"20.9962","country":"Poland","state":"mazowieckie","city":"Warszawa","zipcode":"00-854","attachment_id":13,"added_on":"2019-03-28 07:59:02","updated_on":"2019-03-28 07:59:02","account_status":1,"reservation_status":1,"abs_path":"uploads/2019/04/1554392975patio-960x675.jpg","distance":0.8202400973572198}]
         * first_page_url : https://dev.booktable.co/mobapi/search?page=1
         * from : 1
         * last_page : 1
         * last_page_url : https://dev.booktable.co/mobapi/search?page=1
         * next_page_url : null
         * path : https://dev.booktable.co/mobapi/search
         * per_page : 10
         * prev_page_url : null
         * to : 2
         * total : 2
         */

        private int current_page;
        private String first_page_url;
        private int from;
        private int last_page;
        private String last_page_url;
        private Object next_page_url;
        private String path;
        private int per_page;
        private Object prev_page_url;
        private int to;
        private int total;
        private List<DataBean> data;

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public String getFirst_page_url() {
            return first_page_url;
        }

        public void setFirst_page_url(String first_page_url) {
            this.first_page_url = first_page_url;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public String getLast_page_url() {
            return last_page_url;
        }

        public void setLast_page_url(String last_page_url) {
            this.last_page_url = last_page_url;
        }

        public Object getNext_page_url() {
            return next_page_url;
        }

        public void setNext_page_url(Object next_page_url) {
            this.next_page_url = next_page_url;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public Object getPrev_page_url() {
            return prev_page_url;
        }

        public void setPrev_page_url(Object prev_page_url) {
            this.prev_page_url = prev_page_url;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * ID : 25
             * owner_id : 120
             * name : Namaste India
             * url_slug : namaste-india
             * address : Żurawia 5, Warsaw, Poland
             * timezone : Europe/Warsaw
             * latitude : 52.2287
             * longitude : 21.0201
             * country : Poland
             * state : mazowieckie
             * city : Warszawa
             * zipcode : 00-001
             * attachment_id : 0
             * added_on : 2019-09-10 02:14:57
             * updated_on : 2019-09-10 02:14:57
             * account_status : 1
             * reservation_status : 1
             * abs_path : null
             * distance : 0.34141359532915966
             */

            private int ID;
            private int owner_id;
            private String name;
            private String url_slug;
            private String address;
            private String timezone;
            private String latitude;
            private String longitude;
            private String country;
            private String state;
            private String city;
            private String zipcode;
            private int attachment_id;
            private String added_on;
            private String updated_on;
            private int account_status;
            private int reservation_status;
            private Object abs_path;
            private double distance;

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public int getOwner_id() {
                return owner_id;
            }

            public void setOwner_id(int owner_id) {
                this.owner_id = owner_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl_slug() {
                return url_slug;
            }

            public void setUrl_slug(String url_slug) {
                this.url_slug = url_slug;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getZipcode() {
                return zipcode;
            }

            public void setZipcode(String zipcode) {
                this.zipcode = zipcode;
            }

            public int getAttachment_id() {
                return attachment_id;
            }

            public void setAttachment_id(int attachment_id) {
                this.attachment_id = attachment_id;
            }

            public String getAdded_on() {
                return added_on;
            }

            public void setAdded_on(String added_on) {
                this.added_on = added_on;
            }

            public String getUpdated_on() {
                return updated_on;
            }

            public void setUpdated_on(String updated_on) {
                this.updated_on = updated_on;
            }

            public int getAccount_status() {
                return account_status;
            }

            public void setAccount_status(int account_status) {
                this.account_status = account_status;
            }

            public int getReservation_status() {
                return reservation_status;
            }

            public void setReservation_status(int reservation_status) {
                this.reservation_status = reservation_status;
            }

            public Object getAbs_path() {
                return abs_path;
            }

            public void setAbs_path(Object abs_path) {
                this.abs_path = abs_path;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }
        }
    }
}
