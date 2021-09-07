--zadatak1
SELECT * 
FROM profesori
WHERE godine > 45;

--zadatak2
SELECT ime, prezime
FROM ucenici
WHERE godine > 15 AND prosek > 6.5;

--zadatak3
SELECT godine
FROM ucenici
ORDER BY godine DESC;

--zadatak4
SELECT *
FROM profesori
WHERE predmet LIKE 'Informatika';

--zadatak5
SELECT ucenikid, ime, prezime
FROM ucenici
WHERE ime LIKE '______';

