insert into tb_team(country_name, group_team) values('Brasil', 'D');
insert into tb_team(country_name, group_team) values('Italia', 'D');


insert into tb_matches(date, result, team1_id, team2_id) values(TIMESTAMP WITH TIME ZONE '2022-10-14T20:50:08Z', 'vitoria time 1', 1, 2);

insert into tb_bets(guess) values('vitoria time 1');


insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Emerson', 'Morais', 'emersn@gmail', Now(), Now(), '123');

insert into tb_users(first_name, last_name, email, created_at,updated_at,password) values('Jamel', 'Mattos', 'matos@gmail', Now(), Now(), '123');


insert into tb_role(permission) values ('ROLE_OPERATOR');
insert into tb_role(permission) values ('ROLE_ADMIN');

insert into user_role(user_id, role_id) VALUES(1, 1); 
insert into user_role(user_id, role_id) VALUES(2, 2);
