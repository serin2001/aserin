class LearningGroup:
    def __init__(self, students=None):
        if students is None:
            self.studentList = []
        else:
            self.studentList = students
            
    def __add__(self, student):
		# Overloaded to add a student to the same instance
        if isinstance(student, Student):
            self.studentList.append(student)
            return self
        else:
            raise TypeError("Only Student instances can be added to a LearningGroup.")

    def __str__(self):
        return str([str(student) for student in self.studentList])

class Student:
    def __init__(self, name, matNr):
        self.name = name
        self.matNr = matNr

    def __add__(self, other):
        # Overloaded + to create a LearningGroup with two students
        if isinstance(other, Student):
            return LearningGroup([self, other])
        elif isinstance(other, LearningGroup):
            return other + self
        else:
            raise TypeError("Can only add Student or LearningGroup.")

    def __str__(self):
        return self.name + ' ' + str(self.matNr)

if __name__ == '__main__':
    student1 = Student('Alice Wonderland', 42424242)
    student2 = Student('Bob Miller', 1564153)
    student3 = Student('Charly Robert', 4681398)

    group = LearningGroup()
    group = student1 + student2  # LearningGroup with student1 and student2
    group = group + student3  # Adds an additional student to the same group (in-place)
    
    group2 = student1 + student2 + student3 # Equivalent to above

    print(group)   # ['Alice Wonderland 42424242', 'Bob Miller 1564153', 'Charly Robert 4681398']
    print(group2)  # ['Alice Wonderland 42424242', 'Bob Miller 1564153', 'Charly Robert 4681398']
