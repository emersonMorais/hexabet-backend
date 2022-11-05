insert into tb_team(country_name, group_team) values('Brasil', 'D');
insert into tb_team(country_name, group_team) values('Italia', 'D');


insert into tb_matches(date, result, team1_id, team2_id) values(TIMESTAMP WITH TIME ZONE '2022-10-14T20:50:08Z', 'vitoria time 1', 1, 2);

insert into tb_bets(guess) values('vitoria time 1');
insert into match_bets(match_id, bet_id) values(1, 1);