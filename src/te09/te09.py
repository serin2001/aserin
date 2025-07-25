def parse_input ( input_str ):
    try: # start code block that
        # might raise an exception
        parts = input_str.split(',')
        numbers = [] # initialize empty list
        for p in parts : # loop through parts with
            # variable p
            num = int(p.strip())
            numbers.append (num)
        return numbers
    except ValueError as e: # catch ValueError
        print("Error parsing input:", e)
        return []

def compute_average(numbers):
    if not numbers:
        return 0.0
    return sum(numbers) / len(numbers)

def main():
    raw = input("Enter comma-separated numbers: ")  # Read from console
    nums = parse_input(raw)
    avg = compute_average(nums)
    print("Average:", avg)  # Print average to console

if __name__ == "__main__":
    main()