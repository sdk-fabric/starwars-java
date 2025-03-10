/**
 * StarshipTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.starwars;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TagAbstract;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.*;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.core5.net.URLEncodedUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarshipTag extends TagAbstract {
    public StarshipTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * Get all the starships
     */
    public StarshipCollection getAll(String search) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("search", search);

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/starships", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<StarshipCollection>(){});

                    return data;
                }

                var statusCode = response.getCode();
                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Get a specific starship
     */
    public Starship get(String id) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("id", id);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/starships/:id", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<Starship>(){});

                    return data;
                }

                var statusCode = response.getCode();
                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }



}
