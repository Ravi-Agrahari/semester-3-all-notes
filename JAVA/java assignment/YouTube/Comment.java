package YouTube;

public class Comment {
    private int commentId;
    private String content;
    private String commentDate;
    private int userId; // Foreign key to User
    private int videoId; // Foreign key to Video

    // Default Constructor
    public Comment() {}

    // Parameterized Constructor
    public Comment(int commentId, String content, String commentDate, int userId, int videoId) {
        this.commentId = commentId;
        this.content = content;
        this.commentDate = commentDate;
        this.userId = userId;
        this.videoId = videoId;
    }

    // Getters and Setters
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
}

