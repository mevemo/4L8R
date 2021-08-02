""" Hello, I am new to Git and GitHub and I am just testing how it works"""

import functions as f, classes as c

# Here my Program tells the World, we exist
print("Hello World")

# Und jetzt macht er was neues, indem er den User nach seinem Alter fragt
age = int(input("Bitte gib dein alter ein: "))

# Und jetzt gibt er das alter aus.
print("und du bist ", age, "Jahre alt.")


# Und dann Begginen wir hier mit Objekten

# Erstmal machen wir und eine Bauplan für Unser Objekt
class Unser_Objekt:
    pass

# Dann erschaffen wir eine erste Instanz von dem Objekt
erster = Unser_Objekt()


# Ein versuch die Funktion hurra() mit dem Parameter 2 von hier aus aufzurufen
print(f.hurra(2))