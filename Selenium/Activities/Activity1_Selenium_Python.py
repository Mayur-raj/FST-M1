from selenium import webdriver
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service
import time


service = Service(GeckoDriverManager().install())
driver = webdriver.Firefox(service=service)


driver.get("https://training-support.net")


print("Home Page Title:", driver.title)

about_button = driver.find_element(By.ID, "about-link")
about_button.click()

time.sleep(2)

print("About Us Page Title:", driver.title)

driver.quit()
