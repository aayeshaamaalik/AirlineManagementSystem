# Airline Management System

This project is an implementation of an Airline Management System, inspired by real-world airline reservation platforms and designed using clean Object-Oriented Design (OOD) principles. It supports functionalities such as flight scheduling, booking management, passenger seat reservations, and cancellation handling.

**Design Reference:**  
This implementation is modeled based on design concepts outlined in the [OOD-Object-Oriented-Design repository by ycwkatie](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/airline_management.md).

---

## Key Components and Interacting Objects

The following components form the core of the system and work together to manage end-to-end airline operations:

- **AirlineManagementSystem**: Central orchestrator responsible for managing airlines, airports, reservations, and coordinating booking and cancellation workflows.
- **Airport**: Represents real-world airports, including name, address, and airport code.
- **Airline**: Maintains a list of its aircraft and flight schedules.
- **Aircraft**: Represents individual aircrafts and their seating layout.
- **Seat**: Represents each seat with class, type, and availability status.
- **FlightInstance**: A scheduled flight that includes source, destination, time details, and crew assignments. Implements the `Flight` interface.
- **ReservationRequest**: Encapsulates passenger input including source, destination, date, and seat preferences.
- **Reservation**: Captures successful seat bookings and payment information for a passenger on a given flight.
- **Itinerary**: Represents one or more `FlightInstance`s forming a complete trip.
- **Enums**: Includes standardized definitions such as `SeatType`, `SeatClass`, `ReservationStatus`, and `FlightStatus`.

---

## User Action Flow

The Airline Management System supports the full travel cycle from flight discovery to booking and cancellation. The core operations are handled by the `AirlineManagementSystem` class as outlined below:

1. `addAirport(Airport airport)` and `addAirline(Airline airline)`  
   Used to register available airports and airlines into the system during initialization.

2. `searchFlights(ReservationRequest request)`  
   Searches for scheduled flights that match the user’s source, destination, and preferred departure date.  
   Filters flights based on:
   - Source and destination airports  
   - Departure time on the same date  
   - Status being `SCHEDULED`

3. `bookFlight(FlightInstance flight, Passenger passenger, SeatClass seatClass, SeatType seatType, Payment payment)`  
   Reserves a seat on the selected flight by:
   - Checking for an available seat with the specified class and type  
   - Marking the seat as booked  
   - Creating a `Reservation` with the associated payment  
   - Returning the booking reference

4. `cancelReservation(String reservationId)`  
   Allows cancellation of a confirmed reservation.  
   - Updates the `ReservationStatus` to `CANCELLED`  
   - Frees the associated seat

---

## Getting Started

To set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/airline-management-system.git
   ```

2. Navigate to the project directory:
   ```bash
   cd airline-management-system
   ```

3. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse)

4. Build and run the project  
   Ensure your environment supports Java 8+ and optionally a build tool like Maven or Gradle.

---

## Usage

The system can be simulated using the `AirlineManagementSystem` class. Core workflows include:

- Searching for flights based on passenger preferences
- Booking a flight with class and seat type filters
- Cancelling reservations and releasing seats
- Managing registered airlines, airports, and flight schedules

---

## Project Structure

| Component                       | Responsibility                                                      |
|----------------------------------|----------------------------------------------------------------------|
| `Airport`, `Airline`, `Aircraft`| Define travel network, aircraft models, and seating layouts         |
| `FlightInstance`, `Flight`      | Represent and schedule operational flights                          |
| `Seat`, `SeatType`, `SeatClass` | Define seating arrangements, preferences, and classification        |
| `ReservationRequest`, `Reservation` | Handle user requests and confirmed bookings                   |
| `AirlineManagementSystem`       | Controls core logic for booking, searching, and managing entities   |
| `Enums`                         | Standardize operational states like flight status and seat type     |

