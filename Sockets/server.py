import socket

s = socket.socket()
print("Socket Created")

HOST = '192.168.43.89'
PORT = 9998
s.bind((HOST, PORT))

s.listen(5)
print("Waiting for Connection")

while True:
    c, address = s.accept()
    # Receiving some information form client side
    name = c.recv(1024).decode()

    print("Connected With ", address, name)

    c.send(bytes("Welcome to the Harsh Server", 'utf-8'))

    c.close()




