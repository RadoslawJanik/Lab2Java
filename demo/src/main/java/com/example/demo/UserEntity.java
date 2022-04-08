package com.example.demo;

public class UserEntity {


    public UserEntity(String imie, String nazwisko, Integer wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;


        }
        private String nazwisko;

        public String getNazwisko(){

        return nazwisko;

        }

        public void setNazwisko(String newNazwisko){
        this.nazwisko =newNazwisko;
        }

    private String imie;

    public String getImie(){

        return imie;

    }

    public void setImie(String newImie){
        this.imie =newImie;
    }
    private Integer wiek;

    public Integer getWiek(){

        return this.wiek;

    }

    public void setWiek(Integer newWiek){
        this.wiek =newWiek;


    }

    }

