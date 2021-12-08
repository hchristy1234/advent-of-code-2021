f = open("02/02.txt", "r")
content = f.readlines()
total_length = 1000;
x_array = []
y_array = []
hor = 0
depth = 0
aim = 0
for i in range(0, int(total_length)):
    move = content[i]
    contentarray = move.split(' ')
    if (contentarray[0] == "forward"):
        hor += int(contentarray[1])
        depth += aim*int(contentarray[1])
    elif (contentarray[0] == "down"):
        aim += int(contentarray[1])
    elif (contentarray[0] == "up"):
        aim -= int(contentarray[1])
print(hor)
print(depth)