from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Chrome()

try:
    driver.get("https://training-support.net/webelements/keyboard-events")

    print("Page Title:", driver.title)

    wait = WebDriverWait(driver, 10)

    input_field = wait.until(EC.presence_of_element_located((By.ID, "textInput")))

    message = "Hello from Selenium Python!"
    input_field.send_keys(message)

    print("Typed message:", message)

finally:
    driver.quit()
