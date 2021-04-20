package com.example.login.model;


import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.RequiresApi;

public class Albums implements Parcelable {

    private int userId;
    private int id;
    private String title;

    public Albums(int userId, int id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    private Albums(Parcel parcel) {
        this.userId = parcel.readInt();
        this.id = parcel.readInt();
        this.title = parcel.readString();
    }

    public static final Creator<Albums> CREATOR = new Creator<Albums>() {
        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public Albums createFromParcel(Parcel in) {
            return new Albums(in);
        }

        @Override
        public Albums[] newArray(int size) {
            return new Albums[size];
        }
    };

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static Creator<Albums> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.userId);
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}

