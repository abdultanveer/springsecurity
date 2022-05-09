INSERT INTO users(username,password,enabled)
values('navneetu','nitigna',true);

INSERT INTO users(username,password,enabled)
values('chandra','akshay',true);

INSERT INTO authorities(username,authority)
values('navneetu', 'ROLE_USER');

INSERT INTO authorities(username,authority)
values('chandra', 'ROLE_ADMIN');
