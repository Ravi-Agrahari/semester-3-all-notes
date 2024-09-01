package YouTube;

public class Video {
    private int videoId;
    private String title;
    private String description;
    private String uploadDate;
    private int views;
    private int likes;
    private int userId; // Foreign key to User

    // Default Constructor
    public Video() {}

    // Parameterized Constructor
    public Video(int videoId, String title, String description, String uploadDate, int views, int likes, int userId) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.uploadDate = uploadDate;
        this.views = views;
        this.likes = likes;
        this.userId = userId;
    }

    // Getters and Setters
    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

