
insert into tb_groups(name)values('D')
insert into tb_groups(name)values('E')

insert into tb_team(country_name, group_id) values('Brasil', 2);
insert into tb_team(country_name, group_id) values('Italia', 1);


insert into tb_matches(date, result, team1_id, team2_id) values(TIMESTAMP WITH TIME ZONE '2022-10-14T20:50:08Z', 'vitoria time 1', 1, 2);

insert into tb_bets(guess, created_at, updated_at, match_id) values('vitoria time 1', NOW(), NOW(), 1);


insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Emerson', 'Morais', 'emersn@gmail', Now(), Now(), '123');

insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Jamel', 'Mattos', 'matos@gmail', Now(), Now(), '123');


insert into tb_role(permission) values ('ROLE_OPERATOR');
insert into tb_role(permission) values ('ROLE_ADMIN');

insert into user_role(user_id, role_id) VALUES(1, 1); 
insert into user_role(user_id, role_id) VALUES(2, 2);

insert into user_bet(user_id, bet_id) values(1, 1); 


insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Juana', 'Macal', 'masac@hotmail.com', Now(), Now(), '$2a$10$V907jST6o.tBAyWpVQNpM.JTKr0Bj1jaTTOy2WJB2boe/5COXnq6C');

insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Juan', 'Mac', 'mas@hotmail.com', Now(), Now(), '$2a$10$V907jST6o.tBAyWpVQNpM.JTKr0Bj1jaTTOy2WJB2boe/5COXnq6C');

insert into user_role(user_id, role_id) values(3, 1);
insert into user_role(user_id, role_id) values(4, 2);  

insert into match_bet(match_id, bet_id) values(1, 1);