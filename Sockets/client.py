import socket

c = socket.socket()

HOST = '192.168.43.89'
PORT = 9998
c.connect((HOST, PORT))

# Sending some information to server
name = input("Enter Your name: ")
c.send(bytes(name, 'utf-8'))

# The network will share information in the form of bytes. So before printing down you have to decode it First
msg = c.recv(1024).decode()
print(msg)






