package com.example.sandbox;

import android.os.Parcel;
import android.os.Parcelable;

public class OutterClass {

    public static class InnerClass implements Parcelable {

        public InnerClass() {

        }

        protected InnerClass(Parcel in) {

        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {

        }

        public static final Creator<InnerClass> CREATOR = new Creator<InnerClass>() {
            @Override
            public InnerClass createFromParcel(Parcel in) {
                return new InnerClass(in);
            }

            @Override
            public InnerClass[] newArray(int size) {
                return new InnerClass[size];
            }
        };
    }
}
