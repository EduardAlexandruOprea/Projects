from pydoc import doc
from importsAndStuff import *

def inBetween(filename, min_value, max_value):
    itemsPrinted = 0
    with open(filename, 'r') as file:
        itemList = json.load(file)
    for item in itemList:
       if int(min_value) <= int(item['price']) <= int(max_value):
            print(item)
            print(' ')
            itemsPrinted += 1
    if itemsPrinted == 0:
        print('No product found')


def mainJsonManipulation():
    clear()
    DoWeContinue = True
    while DoWeContinue:
        print('1.Check laptops in between two prices')
        print('2.Check TVs in between two prices')
        print('3.Check smartwatches in between two prices')
        print('4.Go back to the previous menu')
        print('5.Quit the program')

        optionHere = input('Please select an option: ')
       
        if optionHere == '1':
            min_valueMain = input('Give a minimum price: ')
            max_valueMain = input('Give a maximum price: ')

            if int(min_valueMain)<int(max_valueMain):
                inBetween('laptop.json', min_valueMain, max_valueMain)
            else:
                print('That is not how math work!')
                break

        elif optionHere == '2':
            min_valueMain = input('Give a minimum price: ')
            max_valueMain = input('Give a maximum price: ')
            if int(min_valueMain)<int(max_valueMain):
                inBetween('tv.json', min_valueMain, max_valueMain)
            else:
                print('That is not how math work!')
                break

        elif optionHere == '3':
            min_valueMain = input('Give a minimum price: ')
            max_valueMain = input('Give a maximum price: ')
            if int(min_valueMain)<int(max_valueMain):
                inBetween('smartwatch.json', min_valueMain, max_valueMain)
            else:
                print('That is not how math work!')
                break


        elif optionHere == '4':
            break

        elif optionHere == '5':
            quit()


if __name__ == "__main__":
    mainJsonManipulation()
