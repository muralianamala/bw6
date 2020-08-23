import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;

public class JWTTokenGenerate {

	 public static String generateJwt(final String secretKey, final String keyID,
		      final int expiryLength) throws FileNotFoundException, IOException {

		    Date now = new Date();
		    Date expTime = new Date(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(expiryLength));

		    // Build the JWT payload
		    Map<String, Object> headerClaims = new HashMap<String, Object>();
		    headerClaims.put("kid", keyID);

		    JWTCreator.Builder token = JWT.create().withHeader(headerClaims).withIssuedAt(now)
		        // Expires after 'expiraryLength' seconds
		        .withExpiresAt(expTime).withIssuer(keyID).withSubject("test");

		    // Sign the JWT
		    Algorithm algorithm = Algorithm.HMAC256(secretKey);
		    return token.sign(algorithm);
		  }
}
