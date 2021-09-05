-- -- -- SQL CHEAT-SHEET -- -- --
 
--- SQL Data Definition Language  D D L ---

-- CREATE --

	# Datenbank erzeugen
	CREATE DATABASE _b_name
	
	# Tabelle erzeugen
	CREATE TABLE tbl_name 
		(id INT(11) PRIMARY KEY AUTO INCREMENT, name VARCHAR(50) UNIQUE) 

	# Tabelle verändern
	UPDATE tbl_name SET name = "Schmidt" WHERE name = "Müller"


-- SHOW -- 
	
	# Übersicht über die Tbaellen in einer Datenbank
	SHOW TABLES

	# Übersich über vorhandene Datenbanken
	SHOW DATABASES

	# Akiviert eine Datenbank zur Verwendung
	USE db_name

	# 
	SHOW db_name

	# Erzeugt eine Auflistung mit Spaltennamen, Typ, NULL-Anforderung, 
	SHOW COLUMNS FROM tbl_name

-- ALTER


	# Spalte Löschen 
	ALTER TABLE tbl_name DROP COLUMN name

  	# Neue spalte hinzu
	ALTER TABLE tbl_name ADD name VARCHAR(50)

	# Tabelle umbenennen
	ALTER TABLE tbl_name RENAME TO new_table_name

	# Spalte ändern
	ALTER TABLE tbl_name CHANGE name new_name VARCHAR(50) UNIQUE

-- DROP
	
	# Löscht Tabelle
	DROP TABLE tbl_name

	# Löscht Datenbank
	DROP DATABASE b_name

-- CONSTRAINT

	# Diese Überprüfung heißt referenzielle Integrität!!! 
	# Erzeugt eine Beschränkung, dass es einen Eintrag in der Referenz-Prime Tabelle / Spalte gibt
	ALTER TABLE tb_name ADD CONSTRAINT const_name
	FOREIGN KEY (col_name) REFERENCES prime_tbl_name(prime_col_name)

	ALTER TABLE tbl_name ADD CONSTRAINT const_name
	UNIQUE (col_name, col2_name)




---- DATA MANIPULATION LANGUAGE


-- INSERT

	INSERT INTO TABLE tbl_name (col_name, col2_name) VALUES ("Content", "2021-12-29")

-- SELECT

	#Wählt alles aus
	SELECT * FROM tbl_name

	# Wählt nur unterschiedliche Einträge aus
	SELECT DISTINCT id, col_name FROM tbl_name

	SELECT * FROM WHERE col_name IN ("sache_a", "sache_b", "Sache_c")

	# Wählt Solche mit genau an zweiter Stelle "t"
	SELECT * FROM tbl_name WHERE col_name LIKE "_t"

	# Wählt jene mit irgendwas davor und dann 'nem "t"
	SELECT * FROM tbl_name WHERE col_name LIKE "%t"

	# Absteigend nach Spalte sortieren
    SELECT * FROM tbl_name ORDER BY col_name DESC

    # Zeigt nur die ersten 6 Einträge
    SELECT * FROM tbl_name LIMIT 6

    # Zeigt nur 3 Ergebnisse ab dem Eintag an der 7ten Stelle
    SELECT * FROM tbl_name LIMIT 6, 3


    # Subselect
    SELECT * FROM table_a WHERE col_name_a = (SELECT col_name_sub FROM table_b WHERE col_name_b = "Bedingung")

    # Vereinigung zweier Tabellenmit WHERE
    SELECT a.col_name, b.col2_name FROM tbl_name AS a, tbl_2_name AS b WHERE a.col_a = b.col_b

    # Vereinigung über INNER JOIN
	SELECT a.col_name, b.col2_name FROM tbl_name AS a INNER JOIN tbl_2_name AS b ON a.col_a = b.col_b

	# Prüfen ob etwas nicht NULL ist
	SELECT * FROM tbl_name WHERE col_name IS NOT NULL 

-- UPDATE



-- DELETE
	DELETE FROM projekte WHERE id = 1


-- Aggregatsfunktionen

	# Erzeugt Minimum
	MIN()

	# Erzeugt Maximum
	MAX()

	# Erzeugt Durchschnitt
	AVG()

	# Erzeugt anzahl von Einträgen
	COUNT()

-- JOIN


	# ist der wichtigste Join 
	-- INNER JOIN 

	# Inner join zweier Tabellen a und b über gleichheit der Spalten col_a und col_b
	SELECT a.col_name, b.col2_name FROM tbl_name AS a INNER JOIN tbl_2_name AS b ON a.col_a = b.col_b


	kunden   id (PRIME) name wohnort (FK)           
	wohnorte id (PRIME) bezeichnung PLZ


	SELECT * FROM Kunden WHERE wohnort = (SELECT id FROM Wohnorte WHERE bezeichnung = "Musterstadt")

	SELECT a.col_name, b.col2_name FROM tbl_name AS a, tbl_2_name AS b WHERE a.col_a = b.col_b

	SELECT a.col_name, b.col2_name FROM tbl_name AS a INNER JOIN tbl_2_name AS b ON a.col_a = b.col_b



-- VIEW 

	# Erzeugt einen View
	CREATE VIEW viewname AS SELECT col_a, col_b FROM tbl_name

	# Selektiert alles aus einem View
	SELECT * FROM viewname WHERE col_name = "Bedingung"