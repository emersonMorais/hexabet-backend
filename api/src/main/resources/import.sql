insert into tb_team(country_name, group_team) values('Brasil', 'D');
insert into tb_team(country_name, group_team) values('Italia', 'D');
insert into tb_team(country_name, group_team) values('Japao', 'D');
insert into tb_team(country_name, group_team) values('Canada', 'D');


insert into tb_matches(date, result, team1_id, team2_id) values(TIMESTAMP WITH TIME ZONE '2022-10-14T20:50:08Z', 'vitoria time 1', 1, 2);

insert into tb_matches(date, result, team1_id, team2_id) values(TIMESTAMP WITH TIME ZONE '2022-11-14T20:50:10Z', 'vitoria time 2', 1, 3);

insert into tb_matches(date, result, team1_id, team2_id) values(TIMESTAMP WITH TIME ZONE '2022-11-14T20:50:06Z', 'vitoria time 1', 4, 1);

insert into tb_bets(guess, created_at, updated_at) values('vitoria time 1', TIMESTAMP WITH TIME ZONE '2022-11-14T20:55:07Z', TIMESTAMP WITH TIME ZONE '2022-11-14T20:50:07Z');

insert into tb_bets(guess, created_at, updated_at) values('vitoria time 2', TIMESTAMP WITH TIME ZONE '2022-12-14T22:50:07Z', TIMESTAMP WITH TIME ZONE '2022-12-14T20:50:07Z');


insert into tb_users(name, email, password, role, created_at, updated_at ) values('Emerson', 'emerson@gmail.com','12355', 'user', TIMESTAMP WITH TIME ZONE '2022-12-14T20:50:07Z',  TIMESTAMP WITH TIME ZONE '2022-12-14T20:50:07Z');


insert into tb_users(name, email, password, role, created_at, updated_at ) values('John', 'jhon@gmail.com','12357', 'user', TIMESTAMP WITH TIME ZONE '2022-12-14T20:54:07Z',  TIMESTAMP WITH TIME ZONE '2022-12-14T20:54:07Z');

insert into user_bet(user_id, bet_id) values (1, 2);
insert into user_bet(user_id, bet_id) values (2, 1);

insert into match_bets(match_id, bet_id) values(1, 1);
insert into match_bets(match_id, bet_id) values(2, 2);


