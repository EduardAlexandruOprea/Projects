from importsAndStuff import*
from Class import Item

class Laptop(Item):
    listOfItems = []             
                            
    def __init__(self,title, price, product_code):
        super().__init__(title, price, product_code,itemType='laptop')

    @staticmethod
    def scraper(max_items=50):
        response=requests.get('https://www.cel.ro/laptop-laptopuri/')
        if response.status_code!=200: return
        soup = BeautifulSoup(response.text, 'html.parser')
        urlList = soup.find_all("a", {"class": "productListing-data-b product_link product_name"})
        urlList = urlList[:max_items]
        urlList = [item.get('href') for item in urlList]
        scraperPool = ThreadPoolExecutor(2)
        itemList = scraperPool.map(Item.getData, urlList)
        for item in itemList:
            item.itemType = "laptop"
            Laptop.listOfItems.append(item)

def mainLaptop():
    Laptop.scraper()
    Laptop.dumpToJSON(Laptop.listOfItems, 'laptop.json')

if __name__=="__main__":
    mainLaptop()
