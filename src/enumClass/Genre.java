package enumClass;

public enum Genre {
    MALE("Laki-laki"),
    FEMALE("Perempuan");

    private String genre_desc;

    Genre(String genre_desc_param){
        this.genre_desc = genre_desc_param;
    }

    public String getGenre_desc() {
        return genre_desc;
    }
}
