from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Chrome()

try:
    driver.get("https://training-support.net/webelements/dynamic-controls")

    print("Page Title:", driver.title)

    wait = WebDriverWait(driver, 10)

    text_field = wait.until(EC.presence_of_element_located((By.ID, "input-text")))

    print("Text field enabled initially:", text_field.is_enabled())

    enable_button = driver.find_element(By.ID, "toggleInput")
    enable_button.click()

    wait.until(EC.element_to_be_clickable((By.ID, "input-text")))

    print("Text field enabled after clicking Enable:", text_field.is_enabled())

finally:
    driver.quit()
