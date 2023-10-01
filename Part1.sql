-- Question: 1

SELECT  RatingValue, Title, Publisher, Pages
FROM Book3
ORDER BY SalesRank ASC 
LIMIT 15
-- FETCH FIRST 15 ROWS ONLY
UNION
SELECT  RatingValue, Title, Publisher, Pages
FROM Book3
ORDER BY SalesRank ASC
LIMIT 10
-- FETCH FIRST 10 ROWS ONLY

-- idea : value/count

-- (2) Table 3 will be use to solve this type of question because
-- this relation contain rating count and rating Value which will 
-- be use for ranking them.
-- SalesRank
------------------------------------

-- Question: 2 

-- (1)

SELECT tile, authors
FROM Book1
WHERE Publisher LIKE '%XXX%'


SELECT id, `language`, pages, HardcoverPrice, EbookPrice
FROM Book1
WHERE pubyear = 2018

-- strategy: vertical fragmentation
-- 1st fragment: Book1 (id, title, authors)
-- 2nd fragment: Book2 (id, language, pages, HardcoverPrice, EbookPrice, pubyear,pubyear, pubmonth, pubday, edition, ...)

-- (2)
-- Fragment 1: pages ≤ 200
-- Fragment 2: 200 < pages ≤ 600
-- Fragment 3: pages > 800
-- No, set of Minterm:
-- doc: https://docs.google.com/document/d/1fDg1qtXBD28uyR9lXUkcIkh4e7dmMBgoDv2-7yNcsU4/edit 

--------------------------------------

