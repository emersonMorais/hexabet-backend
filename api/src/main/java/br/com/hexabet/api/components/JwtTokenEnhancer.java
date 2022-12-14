package br.com.hexabet.api.components;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import br.com.hexabet.api.entities.User;
import br.com.hexabet.api.repositories.UserRepository;

@Component
public class JwtTokenEnhancer implements TokenEnhancer {

  @Autowired
  private UserRepository userRepository;

  @Override
  public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
    
    User user = userRepository.findByEmail(authentication.getName());
    Map<String, Object> userAttributesmap = new HashMap<> ();
    userAttributesmap.put("email", user.getEmail());
    userAttributesmap.put("firstName", user.getFirstName());

    DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) accessToken;
    token.setAdditionalInformation(userAttributesmap);

    return accessToken;
  }

}
