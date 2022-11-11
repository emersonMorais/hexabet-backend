insert into tb_groups(name)values('A')
insert into tb_groups(name)values('B')
insert into tb_groups(name)values('C')
insert into tb_groups(name)values('D')
insert into tb_groups(name)values('E')
insert into tb_groups(name)values('F')
insert into tb_groups(name)values('G')
insert into tb_groups(name)values('H')

INSERT INTO tb_team(country_name, group_id) VALUES ('Catar', 1);
INSERT INTO tb_team(country_name, group_id) VALUES ('Equador', 1);
INSERT INTO tb_team(country_name, group_id) VALUES ('Holanda', 1);
INSERT INTO tb_team(country_name, group_id) VALUES ('Senegal', 1);
INSERT INTO tb_team(country_name, group_id) VALUES ('Estados Unidos', 2);
INSERT INTO tb_team(country_name, group_id) VALUES ('Inglaterra', 2);
INSERT INTO tb_team(country_name, group_id) VALUES ('Irã', 2);
INSERT INTO tb_team(country_name, group_id) VALUES ('País de Gales', 2);
INSERT INTO tb_team(country_name, group_id) VALUES ('Argentina', 3);
INSERT INTO tb_team(country_name, group_id) VALUES ('Arábia Saudita', 3);
INSERT INTO tb_team(country_name, group_id) VALUES ('México', 3);
INSERT INTO tb_team(country_name, group_id) VALUES ('Polônia', 3);
INSERT INTO tb_team(country_name, group_id) VALUES ('Austrália', 4);
INSERT INTO tb_team(country_name, group_id) VALUES ('Dinamarca', 4);
INSERT INTO tb_team(country_name, group_id) VALUES ('França', 4);
INSERT INTO tb_team(country_name, group_id) VALUES ('Tunísia', 4);
INSERT INTO tb_team(country_name, group_id) VALUES ('Alemanha', 5);
INSERT INTO tb_team(country_name, group_id) VALUES ('Costa Rica', 5);
INSERT INTO tb_team(country_name, group_id) VALUES ('Espanha', 5);
INSERT INTO tb_team(country_name, group_id) VALUES ('Japão', 5);
INSERT INTO tb_team(country_name, group_id) VALUES ('Bélgica', 6);
INSERT INTO tb_team(country_name, group_id) VALUES ('Canadá', 6);
INSERT INTO tb_team(country_name, group_id) VALUES ('Croácia', 6);
INSERT INTO tb_team(country_name, group_id) VALUES ('Marrocos', 6);
INSERT INTO tb_team(country_name, group_id) VALUES ('Brasil', 7);
INSERT INTO tb_team(country_name, group_id) VALUES ('Camarões', 7);
INSERT INTO tb_team(country_name, group_id) VALUES ('Portugal', 7);
INSERT INTO tb_team(country_name, group_id) VALUES ('Sérvia', 7);
INSERT INTO tb_team(country_name, group_id) VALUES ('Coréia do Sul', 8);
INSERT INTO tb_team(country_name, group_id) VALUES ('Gana', 8);
INSERT INTO tb_team(country_name, group_id) VALUES ('Portugal', 8);
INSERT INTO tb_team(country_name, group_id) VALUES ('Uruguai', 8);


INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-20T13:00:00Z', 'ND', 1, 2);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-21 13:00:00Z', 'ND', 4, 3);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-25 10:00:00Z', 'ND', 1, 4);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-25 13:00:00Z', 'ND', 3, 2);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-29 12:00:00Z', 'ND', 2, 4);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-29 12:00:00Z', 'ND', 3, 1);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-21 10:00:00Z', 'ND', 6, 7);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-21 16:00:00Z', 'ND', 5, 8);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-25 07:00:00Z', 'ND', 8, 7);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-25 16:00Z', 'ND', 6, 5);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-29 16:00Z', 'ND', 8, 6);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-29 16:00:00Z', 'ND', 7, 5);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-22 07:00:00Z', 'ND', 9, 10);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-22 13:00:00Z', 'ND', 11, 12);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-26 10:00:00Z', 'ND', 12, 10);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-26 16:00:00Z', 'ND', 9, 11);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-30 16:00:00Z', 'ND', 12, 9);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-30 16:00:00Z', 'ND', 10, 11);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-22 10:00:00Z', 'ND', 14, 16);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-22 16:00:00Z', 'ND', 15, 13);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-26 07:00:00Z', 'ND', 16, 13);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-26 13:00:00Z', 'ND', 15, 14);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-30 12:00:00Z', 'ND', 13, 14);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-30 12:00:00Z', 'ND', 16, 15);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-23 10:00:00Z', 'ND', 17, 20);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-23 13:00:00Z', 'ND', 19, 18);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-27 07:00:00Z', 'ND', 20, 18);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-27 16:00:00Z', 'ND', 19, 17);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-12-01 16:00:00Z', 'ND', 20, 19);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-12-01 16:00:00Z', 'ND', 18, 17);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-23 07:00:00Z', 'ND', 24, 23);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-23 16:00:00Z', 'ND', 21, 22);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-27 10:00:00Z', 'ND', 21, 24);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-27 13:00:00Z', 'ND', 23, 22);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-12-01 12:00:00Z', 'ND', 23, 21);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-12-01 12:00:00Z', 'ND', 22, 24);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-24 07:00:00Z', 'ND', 27, 26);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-24 16:00:00Z', 'ND', 25, 28);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-28 07:00:00Z', 'ND', 26, 28);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-28 13:00:00Z', 'ND', 25, 27);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-12-02 16:00:00Z', 'ND', 28, 27);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-12-02 16:00:00Z', 'ND', 26, 25);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-24 10:00:00Z', 'ND', 32, 29);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-24 13:00:00Z', 'ND', 31, 30);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-28 10:00:00Z', 'ND', 29, 30);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-11-28 16:00:00Z', 'ND', 31, 32);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-12-02 12:00:00Z', 'ND', 30, 32);

INSERT INTO tb_matches(date, result, team1_id, team2_id) VALUES ( TIMESTAMP WITH TIME ZONE'2022-12-02 12:00:00Z', 'ND', 29, 31);



insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Emerson', 'Morais', 'emersn@gmail', Now(), Now(), '123');

insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Jamel', 'Mattos', 'matos@gmail', Now(), Now(), '123');


insert into tb_role(permission) values ('ROLE_OPERATOR');
insert into tb_role(permission) values ('ROLE_ADMIN');


insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Jhon', 'Doe', 'jhondoe@hotmail.com', Now(), Now(), '$2a$10$V907jST6o.tBAyWpVQNpM.JTKr0Bj1jaTTOy2WJB2boe/5COXnq6C');

insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Jose', 'Moreira', 'mas@hotmail.com', Now(), Now(), '$2a$10$V907jST6o.tBAyWpVQNpM.JTKr0Bj1jaTTOy2WJB2boe/5COXnq6C');

insert into user_role(user_id, role_id) values(3, 1);
insert into user_role(user_id, role_id) values(4, 2);  

