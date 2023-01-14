command = ""
started = False
stopped = False
while command != "quit":
    command = input("> ").lower()
    if command == "start":
        if started:
         print("car already started...")
        else:
         started = True

         print("car started...")
    elif command == "stop":
        if stopped:
         print("car already stopped...")
        else:
            stopped =True
            print("car stopped...")
    elif command == "help":
        print("""
 >start - To start the car .
 >stop - To stop the car.
 >Quit - To stop playing.       
        """ )
    elif command == "quit":
        break
    else :
        print("Sorry I don't understand!")


