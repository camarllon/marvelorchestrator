package com.br.camarllon.marvelorchestrator.services;

import java.net.URI;

public interface MarvelAPIService {

    /**
     * Create a URI to Marvel's API using parameters.
     * 
     * @param pathURI
     *            a string thats represent a endpoint to use.
     * @return a URI
     */
    URI buildFromMarvelPublicURI(String... pathURI);

    /**
     * Create a URI to Marvel's API using a URI that not contains de parameters.
     * 
     * @param targetURI
     * @return
     */
    URI buildAuthenticatedURI(URI targetURI);
}
