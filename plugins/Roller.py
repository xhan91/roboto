import random

class Roller:
  def roll(self, max=100):
    return random.randint(1, max)