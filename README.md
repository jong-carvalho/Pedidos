## Project  - Simple Order Registration

This project was built to be a simple order registration.
The project containing five endpoints:

- **GET**: Get all the orders
    - ` curl --location 'localhost:8090/orders' `

- **POST**: Create a new order
    - ` curl --location 'localhost:8090/orders' \
      --header 'Content-Type: application/json' \
      --data '{
      "client_id": "CLI_DACB24F3-E80B-44F9-8372-15327E490C25"
      }' `


