f = open("01.in", "r")
content = f.readlines()
counter = 0
print(len(content))
for i in range(len(content)-3):
    a = int(content[i]) + int(content[i+1]) + int(content[i+2])
    b = int(content[i+1]) + int(content[i+2]) + int(content[i+3])
    if (a < b):
        counter = counter+1
print(counter)