package YouTube;

public class YouTubeApp {

    public static void main(String[] args) {
        // Create some users
        User user1 = new User(1, "JohnDoe", "john@example.com", "password123", "1990-01-01");
        User user2 = new User(2, "JaneSmith", "jane@example.com", "pass456", "1992-05-12");

        // Create some videos
        Video video1 = new Video(1, "Java Tutorial", "A tutorial on Java programming.", "2024-09-01", 1000, 150, user1.getUserId());
        Video video2 = new Video(2, "Cooking with Jane", "Delicious recipes to try at home.", "2024-08-30", 2000, 250, user2.getUserId());

        // Create some comments
        Comment comment1 = new Comment(1, "Great tutorial, thanks!", "2024-09-02", user2.getUserId(), video1.getVideoId());
        Comment comment2 = new Comment(2, "I love this recipe!", "2024-09-01", user1.getUserId(), video2.getVideoId());

        // Create some subscriptions
        Subscription subscription1 = new Subscription(1, user1.getUserId(), user2.getUserId(), "2024-09-01");
        Subscription subscription2 = new Subscription(2, user2.getUserId(), user1.getUserId(), "2024-09-02");

        // Print some details
        System.out.println("User 1: " + user1.getUsername());
        System.out.println("User 2: " + user2.getUsername());

        System.out.println("Video 1: " + video1.getTitle() + " uploaded by User ID: " + video1.getUserId());
        System.out.println("Video 2: " + video2.getTitle() + " uploaded by User ID: " + video2.getUserId());

        System.out.println("Comment 1: " + comment1.getContent() + " by User ID: " + comment1.getUserId());
        System.out.println("Comment 2: " + comment2.getContent() + " by User ID: " + comment2.getUserId());

        System.out.println("Subscription 1: User ID " + subscription1.getSubscriberId() + " subscribed to User ID " + subscription1.getChannelId());
        System.out.println("Subscription 2: User ID " + subscription2.getSubscriberId() + " subscribed to User ID " + subscription2.getChannelId());
    }
}
