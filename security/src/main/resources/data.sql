-- CATEGORY
INSERT INTO category (category) VALUES ('Protein');
INSERT INTO category (category) VALUES ('Creatine');
INSERT INTO category (category) VALUES ('Pre-Workout');
INSERT INTO category (category) VALUES ('Vitamins');
INSERT INTO category (category) VALUES ('Weight Gainer');
INSERT INTO category (category) VALUES ('BCAA');
INSERT INTO category (category) VALUES ('Fat Burner');

-- ITEM
INSERT INTO item (category, item_name) VALUES ('Protein', 'Optimum Nutrition Whey Gold');
INSERT INTO item (category, item_name) VALUES ('Protein', 'MuscleBlaze Whey Protein');
INSERT INTO item (category, item_name) VALUES ('Protein', 'Dymatize ISO100');
INSERT INTO item (category, item_name) VALUES ('Creatine', 'ON Micronized Creatine');
INSERT INTO item (category, item_name) VALUES ('Creatine', 'MuscleBlaze Creatine');
INSERT INTO item (category, item_name) VALUES ('Pre-Workout', 'C4 Original Pre-Workout');
INSERT INTO item (category, item_name) VALUES ('Pre-Workout', 'Nitraflex Pre-Workout');
INSERT INTO item (category, item_name) VALUES ('Vitamins', 'Centrum Multivitamin');
INSERT INTO item (category, item_name) VALUES ('Vitamins', 'Omega-3 Fish Oil');
INSERT INTO item (category, item_name) VALUES ('Weight Gainer', 'Serious Mass ON');
INSERT INTO item (category, item_name) VALUES ('Weight Gainer', 'MuscleBlaze Mass Gainer');
INSERT INTO item (category, item_name) VALUES ('BCAA', 'Scivation Xtend BCAA');
INSERT INTO item (category, item_name) VALUES ('BCAA', 'MusclePharm BCAA');
INSERT INTO item (category, item_name) VALUES ('Fat Burner', 'MuscleBlaze Fat Burner');
INSERT INTO item (category, item_name) VALUES ('Fat Burner', 'Hydroxycut Hardcore');

-- STOCK
INSERT INTO stock (item, count) VALUES ('Optimum Nutrition Whey Gold', 45);
INSERT INTO stock (item, count) VALUES ('MuscleBlaze Whey Protein', 60);
INSERT INTO stock (item, count) VALUES ('Dymatize ISO100', 20);
INSERT INTO stock (item, count) VALUES ('ON Micronized Creatine', 35);
INSERT INTO stock (item, count) VALUES ('MuscleBlaze Creatine', 50);
INSERT INTO stock (item, count) VALUES ('C4 Original Pre-Workout', 25);
INSERT INTO stock (item, count) VALUES ('Nitraflex Pre-Workout', 15);
INSERT INTO stock (item, count) VALUES ('Centrum Multivitamin', 80);
INSERT INTO stock (item, count) VALUES ('Omega-3 Fish Oil', 70);
INSERT INTO stock (item, count) VALUES ('Serious Mass ON', 18);
INSERT INTO stock (item, count) VALUES ('MuscleBlaze Mass Gainer', 30);
INSERT INTO stock (item, count) VALUES ('Scivation Xtend BCAA', 40);
INSERT INTO stock (item, count) VALUES ('MusclePharm BCAA', 22);
INSERT INTO stock (item, count) VALUES ('MuscleBlaze Fat Burner', 28);
INSERT INTO stock (item, count) VALUES ('Hydroxycut Hardcore', 12);

-- SALE
INSERT INTO sale (item, total_sale) VALUES ('Optimum Nutrition Whey Gold', '352000');
INSERT INTO sale (item, total_sale) VALUES ('MuscleBlaze Whey Protein', '198000');
INSERT INTO sale (item, total_sale) VALUES ('Dymatize ISO100', '124000');
INSERT INTO sale (item, total_sale) VALUES ('ON Micronized Creatine', '87500');
INSERT INTO sale (item, total_sale) VALUES ('MuscleBlaze Creatine', '62000');
INSERT INTO sale (item, total_sale) VALUES ('C4 Original Pre-Workout', '93000');
INSERT INTO sale (item, total_sale) VALUES ('Nitraflex Pre-Workout', '54000');
INSERT INTO sale (item, total_sale) VALUES ('Centrum Multivitamin', '41000');
INSERT INTO sale (item, total_sale) VALUES ('Omega-3 Fish Oil', '38500');
INSERT INTO sale (item, total_sale) VALUES ('Serious Mass ON', '215000');
INSERT INTO sale (item, total_sale) VALUES ('MuscleBlaze Mass Gainer', '178000');
INSERT INTO sale (item, total_sale) VALUES ('Scivation Xtend BCAA', '72000');
INSERT INTO sale (item, total_sale) VALUES ('MusclePharm BCAA', '49000');
INSERT INTO sale (item, total_sale) VALUES ('MuscleBlaze Fat Burner', '63000');
INSERT INTO sale (item, total_sale) VALUES ('Hydroxycut Hardcore', '31000');



--To Add directly in DB
-- ==========================================
-- CATEGORY
-- ==========================================
--INSERT INTO category (id, category) VALUES
--(1, 'Protein'),
--(2, 'Creatine'),
--(3, 'Pre-Workout'),
--(4, 'Vitamins'),
--(5, 'Weight Gainer'),
--(6, 'BCAA'),
--(7, 'Fat Burner');

-- ==========================================
-- ITEM
-- ==========================================
--INSERT INTO item (id, category, item_name) VALUES
--(1,  'Protein',      'Optimum Nutrition Whey Gold'),
--(2,  'Protein',      'MuscleBlaze Whey Protein'),
--(3,  'Protein',      'Dymatize ISO100'),
--(4,  'Creatine',     'ON Micronized Creatine'),
--(5,  'Creatine',     'MuscleBlaze Creatine'),
--(6,  'Pre-Workout',  'C4 Original Pre-Workout'),
--(7,  'Pre-Workout',  'Nitraflex Pre-Workout'),
--(8,  'Vitamins',     'Centrum Multivitamin'),
--(9,  'Vitamins',     'Omega-3 Fish Oil'),
--(10, 'Weight Gainer','Serious Mass ON'),
--(11, 'Weight Gainer','MuscleBlaze Mass Gainer'),
--(12, 'BCAA',         'Scivation Xtend BCAA'),
--(13, 'BCAA',         'MusclePharm BCAA'),
--(14, 'Fat Burner',   'MuscleBlaze Fat Burner'),
--(15, 'Fat Burner',   'Hydroxycut Hardcore');

-- ==========================================
-- STOCK
-- ==========================================
--INSERT INTO stock (id, item, count) VALUES
--(1,  'Optimum Nutrition Whey Gold',  45),
--(2,  'MuscleBlaze Whey Protein',     60),
--(3,  'Dymatize ISO100',              20),
--(4,  'ON Micronized Creatine',       35),
--(5,  'MuscleBlaze Creatine',         50),
--(6,  'C4 Original Pre-Workout',      25),
--(7,  'Nitraflex Pre-Workout',        15),
--(8,  'Centrum Multivitamin',         80),
--(9,  'Omega-3 Fish Oil',             70),
--(10, 'Serious Mass ON',              18),
--(11, 'MuscleBlaze Mass Gainer',      30),
--(12, 'Scivation Xtend BCAA',         40),
--(13, 'MusclePharm BCAA',             22),
--(14, 'MuscleBlaze Fat Burner',       28),
--(15, 'Hydroxycut Hardcore',          12);

-- ==========================================
-- SALE
-- ==========================================
--INSERT INTO sale (id, item, total_sale) VALUES
--(1,  'Optimum Nutrition Whey Gold',  '352000'),
--(2,  'MuscleBlaze Whey Protein',     '198000'),
--(3,  'Dymatize ISO100',              '124000'),
--(4,  'ON Micronized Creatine',       '87500'),
--(5,  'MuscleBlaze Creatine',         '62000'),
--(6,  'C4 Original Pre-Workout',      '93000'),
--(7,  'Nitraflex Pre-Workout',        '54000'),
--(8,  'Centrum Multivitamin',         '41000'),
--(9,  'Omega-3 Fish Oil',             '38500'),
--(10, 'Serious Mass ON',              '215000'),
--(11, 'MuscleBlaze Mass Gainer',      '178000'),
--(12, 'Scivation Xtend BCAA',         '72000'),
--(13, 'MusclePharm BCAA',             '49000'),
--(14, 'MuscleBlaze Fat Burner',       '63000'),
--(15, 'Hydroxycut Hardcore',          '31000');