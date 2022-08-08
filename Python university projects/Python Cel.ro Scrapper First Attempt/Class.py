from importsAndStuff import*

class Item:
    def __init__(self, title, price, product_code, itemType = None):
        self.title = title
        self.price = price
        self.product_code = product_code
        self.itemType = itemType

    def __str__(self):
        return 'Product name: ' + self.title + ' Product price: '+str(round(self.price/5, 2)) + ' Product code: '+ self.product_code


    def __repr__(self):
        return str(self.__dict__)


    @staticmethod
    def dumpToJSON(productList,filename):
        with open(filename,'w') as file:
            file.write(json.dumps(productList, default=lambda x: x.__dict__, indent=4))

    @staticmethod
    def loadFromJSON(filename):
        #itemList.clear()
        with open(filename,'r') as file:
            itemList = json.load(file)
        for item in itemList:
            if item['type']=='laptop':
                Laptop.listOfItems.append(Laptop(item['title'], item['price'],item['product_code']))
            elif item['type']=='smartwatch':
                SmartWatches.listOfItems.append(SmartWatches(item['title'], item['price'],item['product_code']))
            elif item['type']=='TV':
                TV.listOfItems.append(TV(item['title'], item['price'],item['product_code']))

    @staticmethod
    def getData(url):
        response = requests.get(url)
        soup = BeautifulSoup(response.text, 'html.parser')
        name = soup.find("h1", {"id": "product-name"}).contents[0]
        price = float((soup.find("span", {"id": "product-price"}).contents[0]))/5
        product_code = soup.find("span", {"id": "cod"}).contents[0]
        time.sleep(2)
        return Item(name, price, product_code)
