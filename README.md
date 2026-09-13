
# starwars-java

This [SDK](https://github.com/sdk-fabric/starwars-java) is managed by the [SDK Fabric](https://sdk-fabric.org/) project, a global infrastructure to
automatically generate SDKs for every API.

You can find more information about this SDK at [TypeHub](https://typehub.cloud/):
https://app.typehub.cloud/d/sdkfabric/starwars

## Usage

```java
import org.sdkfabric.starwars.Client;

Client client = Client::build("[access_token]");

// Get all the people.
People_Collection response = client.people().getAll("search");

// Get a specific people.
People response = client.people().get("id");

// Get all the films.
Film_Collection response = client.film().getAll("search");

// Get a specific film.
Film response = client.film().get("id");

// Get all the starships.
Starship_Collection response = client.starship().getAll("search");

// Get a specific starship.
Starship response = client.starship().get("id");

// Get all the species.
Species_Collection response = client.species().getAll("search");

// Get a specific species.
Species response = client.species().get("id");

// Get all the vehicles.
Vehicle_Collection response = client.vehicle().getAll("search");

// Get a specific vehicle.
Vehicle response = client.vehicle().get("id");

// Get all the planets.
Planet_Collection response = client.planet().getAll("search");

// Get a specific planet.
Planet response = client.planet().get("id");
```
