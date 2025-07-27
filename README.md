# CoinSync

CoinSync is a simple expense tracking project used to share debts between members of a group. The current codebase provides a minimal REST API using Spring Boot with in-memory H2 database. Users can create rooms, invite members and register expenses associated with any room.

The project still lacks a user interface and email integration but can be used as a starting point for further development.

## Building

The project uses Maven. Due to the environment restrictions of this repository the build might fail if dependencies are not cached locally.

```bash
mvn test
```
