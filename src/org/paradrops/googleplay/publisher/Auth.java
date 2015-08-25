package org.paradrops.googleplay.publisher;

import com.google.api.services.androidpublisher.AndroidPublisher;

public class Auth {

    public AndroidPublisher start() throws Exception {
        return AndroidPublisherHelper.init(ApplicationConfig.APPLICATION_NAME);
    }
}
