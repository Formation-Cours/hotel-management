-- chambre, chambre_service, client, reservation, service
insert into chambre (type, numero, prix_par_nuit, created_date, last_modified_date, disponible)
values  ('LIT_SIMPLE', '392', 378.68, '2022-11-22', '2023-06-18', false),
        ('CHAMBRE_PARENTALE', '258', 212.14, '2023-05-27', '2023-02-07', true),
        ('LIT_DOUBLE', '110', 253.25, '2022-05-15', '2023-09-12', true),
        ('LIT_DOUBLE', '208', 162.02, '2022-12-17', '2022-12-22', false),
        ('LIT_SIMPLE', '356', 199.17, '2022-12-07', '2023-03-24', true),
        ('LIT_KING_SIZE', '386', 465.51, '2022-07-09', '2023-09-13', true),
        ('CHAMBRE_PARENTALE', '199', 415.82, '2022-11-21', '2022-06-28', true),
        ('LIT_SIMPLE', '350', 357.6, '2022-08-01', '2022-02-28', true),
        ('LIT_KING_SIZE', '310', 315.4, '2023-11-14', '2023-07-05', false),
        ('LIT_DOUBLE', '257', 467.03, '2023-04-11', '2023-03-16', false);

insert into client (created_date, last_modified_date, nom, prenom, email, telephone)
values  ('2022-06-30', '2022-08-24', 'McCromley', 'Laughton', 'lmccromley0@163.com', '7253700747'),
        ('2023-10-19', '2022-06-14', 'Caukill', 'Bear', 'bcaukill1@taobao.com', '3193630506'),
        ('2022-03-23', '2023-03-07', 'Oldroyd', 'Cathee', 'coldroyd2@storify.com', '2954482108'),
        ('2022-09-19', '2023-05-06', 'Leal', 'Elwood', 'eleal3@nyu.edu', '2059211680'),
        ('2022-09-06', '2022-05-25', 'Webburn', 'Maisie', 'mwebburn4@surveymonkey.com', '9183358131'),
        ('2023-11-13', '2022-12-04', 'Cottey', 'Nina', 'ncottey5@vinaora.com', '1015670758'),
        ('2022-01-10', '2022-11-11', 'Melton', 'Ban', 'bmelton6@mail.ru', '5929841563'),
        ('2022-11-29', '2022-10-10', 'Cersey', 'Oliver', 'ocersey7@lulu.com', '3647264090'),
        ('2023-10-22', '2022-03-31', 'Roycroft', 'Siegfried', 'sroycroft8@census.gov', '2359032476'),
        ('2023-01-20', '2022-10-18', 'Haggas', 'Bing', 'bhaggas9@ehow.com', '6506528230');

insert into service (nom, description, created_date, last_modified_date, tarif)
values  ('apero', 'integer pede justo lacinia eget tincidunt eget', '2022-07-19', '2022-03-21', 74.05),
        ('wifi', 'lectus suspendisse potenti in eleifend quam a odio in hac habitasse platea', '2022-02-09', '2023-10-13', 28.76),
        ('apero', 'ut erat curabitur gravida nisi at nibh in', '2022-07-21', '2023-11-28', 57.74),
        ('repas', 'sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio', '2022-04-28', '2023-08-14', 68.69),
        ('apero', 'lacus at velit vivamus vel nulla', '2022-05-07', '2022-03-18', 50.16),
        ('repas', 'curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget', '2023-02-10', '2023-08-15', 32.52),
        ('spa', 'in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque', '2023-09-08', '2022-04-19', 91.15),
        ('spa', 'tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim', '2023-09-23', '2023-11-09', 23.84),
        ('apero', 'curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit', '2023-03-10', '2023-05-31', 33.89),
        ('wifi', 'non lectus aliquam sit amet diam', '2022-02-28', '2022-04-23', 61.25);

insert into reservation (date_debut, date_fin, created_date, last_modified_date, client_id, chambre_id)
values  ('2022-03-10', '2022-11-02', '2023-04-22', '2022-04-10', 1, 1),
        ('2022-10-19', '2023-05-11', '2023-03-25', '2023-03-31', 1, 2),
        ('2022-03-07', '2022-06-29', '2023-08-03', '2023-03-23', 1, 3),
        ('2023-06-05', '2022-01-09', '2023-01-11', '2023-05-25', 2, 4),
        ('2022-09-26', '2023-04-16', '2023-04-26', '2022-08-21', 5, 2),
        ('2023-09-23', '2023-11-21', '2023-07-08', '2023-05-17', 6, 2),
        ('2022-11-13', '2023-01-18', '2023-11-23', '2022-05-30', 7, 4),
        ('2023-01-12', '2022-08-15', '2022-11-16', '2023-10-09', 5, 8),
        ('2023-05-31', '2023-01-26', '2022-02-09', '2023-07-17', 5, 9),
        ('2023-08-12', '2022-08-20', '2023-01-12', '2022-12-04', 7, 10);

insert into chambre_service (chambre_id, service_id, date, heure, commentaire)
values   (1, 1, '2023-04-01', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (2, 2, '2022-12-17', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (3, 3, '2023-01-12', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (4, 4, '2022-12-17', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (5, 5, '2023-01-12', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (6, 6, '2022-12-17', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (7, 7, '2023-01-12', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (8, 8, '2022-12-17', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (9, 9, '2023-01-12', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.'),
         (10, 10, '2022-12-17', '12:45', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.');

