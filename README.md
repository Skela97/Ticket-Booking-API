## Ticket Booking API (University Project - 2021)

### Overview
This Ticket Booking API orchestrates the dynamic interactions between Organizers, who curate and manage events, and Users, who engage with these events by reserving their spots.

- **Organizers:** Manages events.
- **Users(Customers):** Access the system to browse events and book the desired ones.
- **Events** Central to the system, representing specific occasions with defined dates and place.
- **Bookings** Connect Users Events, enabling seamless reservations.
- **TicketsCategories** Represent different categories or types of tickets available for booking, each with unique pricing or privileges.
- **Places** Represents the physical location for the event to occur.

### Technologies:
- **Spring Boot** - For development
- **Spring Data JPA**: For Database interactions.
- **Spring Security** (OAuth2): Secure user management.
- **MySQL**: RDMBS

Additionally,`initdb.sql` file is provided to set up the project's database schema and populate it with initial data.
