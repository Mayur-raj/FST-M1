from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Chrome()

try:
    driver.get("https://training-support.net/webelements/drag-drop")

    print("Page Title:", driver.title)

    wait = WebDriverWait(driver, 10)
    actions = ActionChains(driver)

    ball = wait.until(EC.presence_of_element_located((By.ID, "ball")))
    dropzone1 = driver.find_element(By.ID, "dropzone1")
    dropzone2 = driver.find_element(By.ID, "dropzone2")

    actions.drag_and_drop(ball, dropzone1).perform()

    result_text_1 = dropzone1.text
    print("After dropping in Dropzone 1:", result_text_1)

    actions.drag_and_drop(ball, dropzone2).perform()

    result_text_2 = dropzone2.text
    print("After dropping in Dropzone 2:", result_text_2)

finally:
    driver.quit()
