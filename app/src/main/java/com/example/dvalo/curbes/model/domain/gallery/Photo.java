package com.example.dvalo.curbes.model.domain.gallery;

import android.graphics.Bitmap;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by dvalo on 15.07.2016.
 */
public class Photo {

    File photo;
    Bitmap thumbmail;

    Photo(File photo){

        this.photo = photo;
    }
    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public Bitmap getThumbmail() {
        return thumbmail;
    }

    public void setThumbmail(Bitmap thumbmail) {
        this.thumbmail = thumbmail;
    }
}
