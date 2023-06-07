while True:
    try:
        print(input())
    except EOFError: # End Of File
        break