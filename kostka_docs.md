
# Dice Roll Simulation

This Python script simulates rolling a dice a specified number of times (between 3 and 10). It calculates the sum of the rolled values and allows the user to rerun the simulation.

## Features

- Randomly generates dice rolls between 1 and 6.
- Computes the total sum of the rolled values.
- Prompts the user to run the simulation multiple times.

## Functions

### `rand(count: int)`

- **Parameters**: 
  - `count` (int): The number of times to roll the dice.
  
- **Functionality**: Rolls the dice `count` times and appends the results to a global list called `result`.

### `calc_result(items: list)`

- **Parameters**: 
  - `items` (list): A list of integers representing the rolled dice values.
  
- **Returns**: 
  - The total sum of the integers in the list.


