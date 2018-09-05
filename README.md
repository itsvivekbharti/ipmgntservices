# ipmgntservices - The case study:

Given your team is building an API gateway and you get the following feature request:
The API gateway needs to filter users by IP based on a blacklist. The system needs to have means to add, delete, get blacklist configurations and to check the IP that does the request to drop it."
After quick discussion, you decide to implement the blacklist via a microservice in Spring (Java or Kotlin).
The solution can include more than one implementation of a filter in case various approaches were considered.
We expect no external databases to be used to store the data. The application is supposed to be run a single instance
