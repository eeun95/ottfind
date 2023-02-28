insert into ott(ott_category) values('NETFLIX');
insert into ott(ott_category) values('WATCHA');
insert into ott(ott_category) values('TIVING');
insert into ott(ott_category) values('WAVE');
insert into ott(ott_category) values('DISNEY');

insert into ott_content(ott_id, genre, title, description, director, main_actor, sub_actor) values(1, 'MOVIE', '일타 스캔들', '일타 강사의 스캔들', '김감독', '정경호, 전도연', '남재우, 남해이');
insert into ott_content(ott_id, genre, title, description, director, main_actor) values(1, 'ANIMATION', '사카모토입니다만', '왕따 사카모토', '김나까무라', '사카모토');

insert into review(ott_content_id, url, review) values(1, '', '재밌어용;')
