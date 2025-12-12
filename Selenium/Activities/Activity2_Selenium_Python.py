from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service
from webdriver_manager.firefox import GeckoDriverManager
import time

service = Service(GeckoDriverManager().install())
driver = webdriver.Firefox(service=service)

driver.get("https://training-support.net/webelements/login-form/")

print("Page Title:", driver.title)

driver.find_element(By.ID, "username").send_keys("admin")

driver.find_element(By.ID, "password").send_keys("password")

driver.find_element(By.CSS_SELECTOR, "button.ui.button").click()

time.sleep(2)

driver.quit()
