package br.com.findfer.findfer.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * Created by infsolution on 22/09/17.
 */

public class Poster implements Parcelable {
    public static final String PATH = "http://www.findfer.com.br/FindFer/images/posters/__w-395-593-790-1185__";
    private long idPoster;
    private long marketPlace;
    private long marketer;
    private String title;
    private Double value;
    private String description;
    private String date;
    private String urlImage;
    private String nameUser;
    private String urlImageUser;
    private String nameMarket;
    private float quaflification;
    private int photo;
    public Poster(String title){
        this.title = title;
        Date datefor = new Date();
        SimpleDateFormat dt = new SimpleDateFormat ("yyyy-MM-dd hh:mm");
        this.date = dt.format(datefor);

    }

    protected Poster(Parcel in) {
        idPoster = in.readLong();
        title = in.readString();
        description = in.readString();
        date = in.readString();
        photo = in.readInt();
        marketPlace = in.readLong();
    }

    public static final Creator<Poster> CREATOR = new Creator<Poster>() {
        @Override
        public Poster createFromParcel(Parcel in) {
            return new Poster(in);
        }

        @Override
        public Poster[] newArray(int size) {
            return new Poster[size];
        }
    };

    public long getIdPoster() {
        return idPoster;
    }

    public void setIdPoster(long idPoster) {
        this.idPoster = idPoster;
    }

    public long getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(long marketPlace) {
        this.marketPlace = marketPlace;
    }

    public long getMarketer() {
        return marketer;
    }

    public void setMarketer(long marketer) {
        this.marketer = marketer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getStringValue(){
        return Double.toString(this.value);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getUrlImageUser() {
        return urlImageUser;
    }

    public void setUrlImageUser(String urlImageUser) {
        this.urlImageUser = urlImageUser;
    }

    public float getQuaflification() {
        return quaflification;
    }

    public void setQuaflification(float quaflification) {
        this.quaflification = quaflification;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    // PARCELABLE
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(idPoster);
        parcel.writeString(title);
        parcel.writeString(description);
        parcel.writeString(date);
        parcel.writeInt(photo);
        parcel.writeLong(marketPlace);
    }

}
