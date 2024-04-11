## Ticket Booking API (University Project - 2021)

### Overview
This API manages interactions between Organizers who create events and Users who book their spots.

- **Organizers:** Initiate events, specifying details like the event name and dates.
- **Users(Customers):** Access the system to browse events and book the desired ones.
- **Events** Central to the system, representing specific occasions with defined dates and place.
- **Bookings** Connect Users Events, enabling seamless reservations.
- **Tickets** Represent different categories or types of tickets available for booking, each with unique pricing or privileges.
- **Places** Represents the physical location for the event to occur.

### Technologies:
- **Spring Boot** - For development
- **Spring Data JPA**: For Database interactions.
- **Spring Security** (OAuth2): Secure user management.
- **MySQL**: RDMBS

Additionally,`initdb.sql` file is provided to set up the project's database schema and populate it with initial data.
