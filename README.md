## Ticket Booking API (University Project - 2021)

### Overview
This API manages interactions between Organizers who create events and Users who book their spots.

- **Organizers:** Initiate events, specifying details like the event name and date. They also define available Places within these events.
- **Users(Customers):** Access the system to browse events and book their desired Places for attendance.
- **Events** Central to the system, representing specific occasions with defined dates and associated Places.
- **Bookings** Connect Users to Places within Events, enabling seamless reservations.
- **Tickets** Represent different categories or types of tickets available for booking, each with unique pricing or privileges.
- **Places** within Events represent specific spots or seats available for booking.

### Technologies:
- **Spring Boot** - For development
- **Spring Data JPA**: For Database interactions.
- **Spring Security** (OAuth2): Secure user management.
- **MySQL**: RDMBS

Additionally,`initdb.sql` file is provided to set up the project's database schema and populate it with initial data.
