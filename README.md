# JaCaMo by exercises — Exercise 04 — Operations with guards

In this exercise, ten "producers" agents and ten "consumers" agents produce and consume items from a "BoundedBuffer." 
You are requested to exploit guarded operations such that consumers' "take"
action is suspended if the buffer is empty, and producers' "put" action is suspended if the buffer is full.
If everything is implemented correctly,
you'll see that the count of the elements in the buffer never exceeds 10 and never falls below 0.

## Solution

All solution files are marked with the "solution" suffix, don't open them before solving the exercise!
