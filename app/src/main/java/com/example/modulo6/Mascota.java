package com.example.modulo6;

public class Mascota {
    String pet;
    int image;
    boolean hasLike;
    int likes;

    public Mascota(String pet, int image, boolean hasLike, int likes) {
        this.pet = pet;
        this.image = image;
        this.hasLike = hasLike;
        this.likes = likes;
    }

    public Mascota(int image, int likes) {
        this.image = image;
        this.likes = likes;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isHasLike() {
        return hasLike;
    }

    public void setHasLike(boolean hasLike) {
        this.hasLike = hasLike;
    }

    public String getLikes() {
        return String.valueOf(likes);
    }

    public void incrementLikes() {
        likes++;
    }

    public void decrementLikes() {
        if (likes > 0) {
            likes--;
        }
    }
}
