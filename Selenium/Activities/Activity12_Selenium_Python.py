from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Chrome()

try:
    driver.get("https://training-support.net/webelements/dynamic-content")

    print("Page Title:", driver.title)

    wait = WebDriverWait(driver, 10)

    click_me_button = wait.until(
        EC.element_to_be_clickable((By.ID, "click"))
    )
    click_me_button.click()

    wait.until(
        EC.text_to_be_present_in_element((By.ID, "dynamic-content"), "release")
    )
    dynamic_text = driver.find_element(By.ID, "dynamic-content").text
    print("Dynamic text:", dynamic_text)

finally:
    driver.quit()
