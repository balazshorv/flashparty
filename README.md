#FlashParty prototype

The application can be started without any further configuration, since it uses in-memory structures as database. I simplified the model that the events are generated in every ten minutes. The FlashParty events currently contain only the geolocation key, which is the rounded concatenated location. Adding the geolocation data would be the first part to enhance, currently I left it out, because it has no meaning, a lot of parties should be started in the water for example. 

##The logic

Currently the POST /api/v1/{userId} endpoint can be used to update or add the user location. The input structure is mapped to an object, which is then transformed by the transformer service for the internal data type. Then the data is stored to the database directly, which is fine now, but in case thousands of people start using the app, this should be switched to either a full event based architecture, or we should store the input to some event queue, then handle them as fast as we can.

The other part is the lifecycle package, which contains the job to create the Flash Parties, and a basic event store and event archive for the created events. Both store is created in a way, that new events can be introduced and old ones enhanced easily. These events can be pushed through web sockets, or later be changed to some global event queue implementation.

## Ways to improve

Of course there a a lot of things in which the app can improve:
- defining in what exact location should the event be started
- creating the update and delete flash party logic and events
- adding Redis or RabbitMQ can help the scalability
- instead of always checking and recalculating all parties, we can only check and work on the changed ones from an event queue (this can solve the multi node synchronization issues too)


 
