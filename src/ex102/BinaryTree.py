class Node:
	def __init__(self, value):
		self.value = value
		self.left = None
		self.right = None
		
	def add(self, val):
		if val > self.value:
			if self.right is None:
				self.right = Node(val)
			else:
				self.right.add(val)
		else:
			if self.left is None:
				self.left = Node(val)
			else:
				self.left.add(val)
				
	def get(self, val):
		if val == self.value:
				return self
		elif val < self.value and self.left:
			return self.left.get(val)
		elif val > self.value and self.right:
			return self.right.get(val)
		return None
		
	def remove(self, val, parent=None):
		if val < self.value and self.left:
			return self.left.remove(val, self)
		elif val > self.value and self.right:
			return self.right.remove(val, self)
		elif val == self.value:
			if self.left and self.right:
				successor = self.right
				while successor.left:
					successor = successor.left
				self.value = successor.value
				self.right.remove(successor.value, self)
			elif parent:
				if parent.left == self:
					parent.left = self.left if self.left else self.right
				if parent.right == self:
					parent.right = self.right if self.left else self.right
			else:
				return False # root deletion not handled
			return True
		return False
		
	def to_string(self):
		return str(self.left.to_string() + ", " if self.left is not None else "") + str(self.value) + \
			str(", " + self.right.to_string() if self.right is not None else "")

class BinaryTree:
	def __init__(self):
		self.root = None
	
	def add(self, val):
		if self.root is None:
			self.root = Node(val)
		else:
			self.root.add(val)
	
	def get(self, val):
		if self.root:
			return self.root.get(val)
		return None
		
	def remove(self, val):
		if self.root:
			if self.root.value == val:
				pseudo_parent = Node(None)
				pseudo_parent.left = self.root
				result = self.root.remove(val, pseudo_parent)
				self.root = pseudo_parent.left
				return result
			else:
				return self.root.remove(val)
		return False
		
	def print(self):
		if self.root:
			print(self.root.to_string())
			
if __name__ == "__main__":
	tree = BinaryTree()
	tree.add(10)
	tree.add(6)
	tree.add(4)
	tree.add(5)
	tree.add(20)
	tree.add(30)
	tree.add(8)
	tree.add(7)
	
	tree.print() 