/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.oauth2.service;

import org.springframework.social.connect.ConnectionFactory;

/**
 *
 * @author sosandstrom
 */
public interface ProviderFactory {

    boolean supports(String id);

    ConnectionFactory<?> createFactory(String id, String clientId, String clientSecret, String baseUrl);

    String getUserId(String access_token);
}
