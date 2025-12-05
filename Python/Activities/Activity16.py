class Car:
    """Car class storing basic vehicle details"""

    def __init__(self, brand, model_name, year, gearbox, paint):
        self.brand = brand
        self.model_name = model_name
        self.year = year
        self.gearbox = gearbox
        self.paint = paint

    def accelerate(self):
        print(f"{self.brand} {self.model_name} is moving")

    def stop(self):
        print(f"{self.brand} {self.model_name} has stopped")



first_car = Car("Hyundai", "i20", 2021, "Automatic", "Grey")
second_car = Car("Kia", "Seltos", 2020, "Manual", "Blue")
third_car = Car("Volkswagen", "Polo", 2018, "Automatic", "White")


first_car.accelerate()
first_car.stop()

second_car.accelerate()
second_car.stop()

third_car.accelerate()
third_car.stop()
