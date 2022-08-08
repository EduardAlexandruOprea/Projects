from bs4 import BeautifulSoup
import requests
import json
import time
from concurrent.futures import ThreadPoolExecutor
from os import system,name


def clear():
    if name == 'nt':
        _ = system('cls')
    else:
        _ = system('clear')

def choices():
    print('What do you want to scrap Cel.ro for?:')
    print('1.Laptops')
    print('2.TVs')
    print('3.Smartwatches')
    print('4.JSON manipulation')
    print('Type 9 to exit the program')
    choiceGiven=input('Please enter an option: ')
    return choiceGiven

