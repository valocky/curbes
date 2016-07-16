package com.example.dvalo.curbes.model.domain.gallery;

import com.example.dvalo.curbes.controller.GalleryController;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by dvalo on 15.07.2016.
 */
public class PictureGallery extends Observable implements GalleryController {

    public static final String MESSAGE_PHOTOS_CHANGED="photos changed";

    private ArrayList<Photo> photos = new ArrayList<Photo>();

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public void addPicture(Photo photo){
        photos.add(photo);
        setChanged();
        notifyObservers(MESSAGE_PHOTOS_CHANGED);
    }

    public void removePicture(Photo photo){
        photos.remove(photo);
        setChanged();
        notifyObservers(MESSAGE_PHOTOS_CHANGED);
    }
}
