module com.kevin.music_streaming_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires jlayer;

    opens com.kevin.music_streaming_app to javafx.fxml;
    exports com.kevin.music_streaming_app;
}