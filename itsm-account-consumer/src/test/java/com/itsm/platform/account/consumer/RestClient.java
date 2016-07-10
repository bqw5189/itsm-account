
package com.itsm.platform.account.consumer;


import javax.ws.rs.core.MediaType;

/**
 * @author baiqw
 */
public class RestClient {

  public static void main(String[] args) {
      final String port = "8828";
      signIn("http://localhost:" + port + "/api/v2/accounts/sign-in", MediaType.APPLICATION_JSON_TYPE);
  }

  private static void signIn(String url, MediaType mediaType) {

  }
}
