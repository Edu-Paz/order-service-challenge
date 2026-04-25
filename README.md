# Order Service Challenge

This project is a back-end application developed with **Java** and **Spring Boot** to demonstrate the implementation of components and dependency injection. The system calculates the total value of an order based on its basic price, discount percentage, and shipping costs.

## Technologies
- Java 17
- Spring Boot 3
- Maven

## Features
- **Total Value Calculation**: Applies a discount to the basic order value and adds shipping costs.
- **Service Layering**: Modular design using specialized services for shipping and order operations.
- **Dependency Injection**: Decoupled components using Spring's `@Service` and `@Autowired` annotations.

## Business Rules

### Shipping Calculation
The shipping cost is determined by the basic order value (before discounts):
- **Below R$ 100.00**: R$ 20.00
- **From R$ 100.00 to R$ 200.00 (exclusive)**: R$ 12.00
- **R$ 200.00 or more**: Free shipping

### Order Total
The final price is calculated as: `Total = Basic Value - (Basic Value * Discount / 100) + Shipping`

## Architecture
The project follows a component-based architecture:
1. **Order (Entity)**: Plain Java object representing the order data (code, basic value, and discount).
2. **OrderService**: Responsible for calculating the total order value by communicating with the ShippingService.
3. **ShippingService**: Responsible for determining the shipping cost based on the project's business rules.

## How to Run
1. Clone the repository:
   git clone https://github.com/Edu-Paz/order-service-challenge.git

2. Navigate to the project folder:
   cd order-service-challenge

3. Run the application:
   ./mvnw spring-boot:run

4. Check the results:
   The application output is displayed directly in the terminal log during execution.

## License
This project was developed for educational purposes as part of the Java Spring Professional path in the DevSuperior Modern Developer Training.
