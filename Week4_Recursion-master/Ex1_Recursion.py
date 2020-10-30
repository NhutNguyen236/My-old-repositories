limit = int(input('Input the end number: '))
def sum_up(limit):
  if limit<=1:
    return limit
  else:
    return limit + sum_up(limit-1)
print(sum_up(limit))
