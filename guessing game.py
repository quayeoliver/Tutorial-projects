secret_number = 6
guesses = 0
guess_limit = 3
while guesses < guess_limit:
    guess = int(input('Guess:  '))
    guesses += 1
    if guess == secret_number:
        print('You won.')
        break
else:
    print('sorry  you failed')


