from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Chrome()

try:
    driver.get("https://training-support.net/webelements/mouse-events")

    print("Page Title:", driver.title)

    wait = WebDriverWait(driver, 10)
    actions = ActionChains(driver)

    cargo_lock = wait.until(EC.presence_of_element_located((By.ID, "cargo-lock")))
    cargo_toml = driver.find_element(By.ID, "cargo-toml")
    src = driver.find_element(By.ID, "src"))
    target = driver.find_element(By.ID, "target"))

    actions.click(cargo_lock) \
           .move_to_element(cargo_toml) \
           .click(cargo_toml) \
           .perform()

    confirmation1 = driver.find_element(By.ID, "result").text
    print("Confirmation after first sequence:", confirmation1)

    actions.double_click(src) \
           .context_click(target) \
           .perform()

    open_option = wait.until(EC.element_to_be_clickable((By.ID, "open")))
    open_option.click()

    confirmation2 = driver.find_element(By.ID, "result").text
    print("Confirmation after second sequence:", confirmation2)

finally:
    driver.quit()
