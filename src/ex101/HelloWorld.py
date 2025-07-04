import math
from abc import ABC, abstractmethod

# b) Class Student 
class Student:
    def __init__(self, age, name):
        self.age = age
        self.name = name

# e) Class Student with grades
class StudentWithGrades:
    def __init__(self, name):
        self.name = name
        self.grades = {}
                    
    def set_grade(self, course, grade):
        self.grades[course] = grade
        
    def get_average(self):
        return sum(self.grades.values()) / len(self.grades) if self.grades else 0

# d) Inheritance and abstractions
class Shape(ABC):
    @abstractmethod
    def get_area(self):
        pass
        
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius
        
    def get_area(self):
        return math.pi * self.radius ** 2

# a) Hello World
def main():
    print("Hello, World!")
    
    # b) Class Student
    student1 = Student(20, "Alice")
    print(f"Student Name: {student1.name}, Age: {student1.age}")
    
    # e) Class Student with grades
    student2 = StudentWithGrades("Bob")
    student2.set_grade("Math", 90)
    student2.set_grade("Science", 85)
    print(f"{student2.name}'s Average Grade: {student2.get_average()}")
    
    # d) Inheritance and abstractions
    circle = Circle(5)
    print(f"Area of the circle with radius {circle.radius}: {circle.get_area()}")

if __name__ == "__main__":
    main()
