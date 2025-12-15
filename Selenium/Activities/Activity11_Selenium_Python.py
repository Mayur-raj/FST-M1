from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Chrome()

try:
    driver.get("https://training-support.net/webelements/dynamic-controls")

    print("Page Title:", driver.title)

    wait = WebDriverWait(driver, 10)

    checkbox = wait.until(EC.presence_of_element_located((By.ID, "checkbox")))

    toggle_button = driver.find_element(By.ID, "toggleCheckbox")
    toggle_button.click(_
