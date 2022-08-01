# Rest Client
This client creates a service to call a joke endpoint and return data.

The difference between a rest client and a web server is that the REST client does not have endpoint mappings to serve data. 

A web server contains endpoint mappings that will serve responses when navigating or calling those mappings.

Both a web server and a rest client will return data and require a JSON-like object model to contain the response of the data returned. 

The REST client does not detail the CONTENT of what is returned, only the model of the object that is returned. 

The REST client will use a restTemplate to call an external web server that contains the details of the data object.

The REST client does not work unless it is pointed at a web server to return the data. 

In this example repository, the REST client consists only of a service which implements a restTemplate that calls an external API endpoint to return jokes. 

## Note 
Make this its own repository.
