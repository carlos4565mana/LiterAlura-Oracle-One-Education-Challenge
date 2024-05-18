
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (1, 73638, '{en}', 'Frankenstein; Or, The Modern Prometheus');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (2, 7042, '{en}', 'Emma');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (3, 54976, '{en}', 'Romeo and Juliet');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (4, 58237, '{en}', 'Moby Dick; Or, The Whale');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (5, 42235, '{en}', 'Middlemarch');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (6, 36924, '{en}', 'The Enchanted April');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (7, 33064, '{en}', 'Cranford');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (8, 691, '{pt}','Principios e questões de philosophia politica (Vol. 1 of 2)');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (9, 620, '{pt}', 'O crime do padre Amaro, scenas da vida devota');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (10, 610, '{pt}', 'Historia de Portugal: Tomo I');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (11, 4742, '{fr}', 'Du côté de chez Swann');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (12, 1930, '{fr}', 'Les trois mousquetaires');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (13, 12454, '{es}', 'Don Quijote');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (14, 976, '{he}', 'Genesis');
INSERT INTO public.tb_book(id, download_count, languages, title)VALUES (15, 1019, '{it}', 'Divina Commedia di Dante: Inferno');


INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (1, 1797, 1851, 'Shelley, Mary Wollstonecraft');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (2, 1775, 1817, 'Austen, Jane');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (3, 1564, 1616, 'Shakespeare, William');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (4, 1819, 1891, 'Melville, Herman');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (5, 1819, 1880, 'Eliot, George');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (6, 1866, 1941, 'Von Arnim, Elizabeth');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (7, 1810, 1865, 'Gaskell, Elizabeth Cleghorn');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (8, 1850,1922,'Cândido, António');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (9, 1845, 1900, 'Queirós, Eça de');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (10, 1845, 1894, 'Oliveira Martins, J. P. (Joaquim Pedro)');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (11,1872 ,1922,'Proust, Marcel"');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (12,1802 , 1870 ,'Dumas, Alexandre');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (13, 1547, 1616 , 'Cervantes Saavedra, Miguel de');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (14,1961 , 2010, 'Vaknin, Samuel');
INSERT INTO public.tb_author(id, birth_year, death_year, name) VALUES (15, 1265, 1321, 'Dante Alighieri');



INSERT INTO public.book_author(book_id, author_id) VALUES (1, 1);
INSERT INTO public.book_author(book_id, author_id) VALUES (2, 2);
INSERT INTO public.book_author(book_id, author_id) VALUES (3, 3);
INSERT INTO public.book_author(book_id, author_id) VALUES (4, 4);
INSERT INTO public.book_author(book_id, author_id) VALUES (5, 5);
INSERT INTO public.book_author(book_id, author_id) VALUES (6, 6);
INSERT INTO public.book_author(book_id, author_id) VALUES (7, 7);
INSERT INTO public.book_author(book_id, author_id) VALUES (8, 8);
INSERT INTO public.book_author(book_id, author_id) VALUES (9, 9);
INSERT INTO public.book_author(book_id, author_id) VALUES (10, 10);
INSERT INTO public.book_author(book_id, author_id) VALUES (11, 11);
INSERT INTO public.book_author(book_id, author_id) VALUES (12,12 );
INSERT INTO public.book_author(book_id, author_id) VALUES (13, 13);
INSERT INTO public.book_author(book_id, author_id) VALUES (14, 14);
INSERT INTO public.book_author(book_id, author_id) VALUES (15, 15);
