def safe_divide():
    try:
    # Prompt the user for input
        numerator = input("Enter the numerator: ")
        denominator = input("Enter the denominator: ")

        # Convert inputs to float
        numerator = float(numerator)
        denominator = float(denominator)

        # Perform division
        result = numerator / denominator
        print(f"The result of {numerator} divided by {denominator} is: {result}")

    except ValueError as e:
        print(f"Error: {e}")
        print("Error: Please enter numeric values only.")
    except ZeroDivisionError as e:
        print(f"Error: {e}")
        print("Error: The denominator cannot be zero.")

while True:
    safe_divide()
    # Ask the user if they want to try again
    again = input("Do you want to try again? (y/n): ").lower()
    if again != 'y':
        print("Goodbye!")
        break
