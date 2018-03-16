"""
Two sum

Problem Statement: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
"""
import unittest


def two_sum(num_list, sum):
	num_set = {}
	for i in range(len(num_list)):
		complement = sum - num_list[i]
		if complement in num_set:
			return num_set[complement], i
		else:
			num_set[num_list[i]] = i
	return -1, -1


class TwoSumTestCase(unittest.TestCase):

	def test_two_sum_happy_case(self):
		self.assertEquals(two_sum([1, 2, 3, 4, 5], 6), (1, 3))

	def test_two_sum_empty_list(self):
		self.assertEquals(two_sum([], 6), (-1, -1))

	def test_two_sum_no_sum(self):
		self.assertEquals(two_sum([1, 2, 3, 4, 5], 10), (-1, -1))

	def test_two_sum_negative_values(self):
		self.assertEquals(two_sum([-2, 0, -1, 4, 5], 3), (2, 3))

	def test_two_sum_zero(self):
		self.assertEquals(two_sum([-2, 0, -1, 3, 4, 5], 3), (1, 3))


if __name__=="__main__":
	unittest.main()
