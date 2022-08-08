from Class import *
from ClassLaptop import mainLaptop
from ClassTVs import mainTV
from ClassSmartwatch import mainSmartwatch
from JsonManipulation import mainJsonManipulation


def main():
    choice = str(choices())
    while choice != '9':

        if choice == '1':

            mainLaptop()
            print('Operation completed successfully')
            input("Press Enter to continue...")
            clear()
            choice = str(choices())

        elif choice == '2':
            mainTV()
            print('Operation completed successfully')
            input("Press Enter to continue...")
            clear()
            choice = str(choices())

        elif choice == '3':
            mainSmartwatch()
            print('Operation completed successfully')
            input("Press Enter to continue...")
            clear()
            choice = str(choices())

        elif choice == '4':
            mainJsonManipulation()
            print('Operation completed successfully')
            clear()
            choice = str(choices())


        elif choice < '1' or choice > '4':
            print('Incorrect option, please try again')
            input("Press Enter to continue...")
            clear()
            choice = str(choices())

        elif choice == '9':
            quit()


if __name__ == "__main__":
    main()
