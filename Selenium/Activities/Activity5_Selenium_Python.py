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

    print("Checkbox visible initially:", checkbox.is_displayed())

    remove_button = driver.find_element(By.ID, "toggleCheckbox")
    remove_button.click()

    wait.until(EC.invisibility_of_element_located((By.ID, "checkbox")))

    try:
        checkbox = driver.find_element(By.ID, "checkbox")
        visible_after = checkbox.is_displayed()
    except:
        visible_after = False

    print("Checkbox visible after clicking Remove:", visible_after)

finally:
    driver.quit()
