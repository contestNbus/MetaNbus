insert into app_users (id, name, password, create_at, modified_at) values 
('user1', 'user1', '1234', now(), now())
('user2', 'user2', '1234', now(), now())
('user3', 'user3', '1234', now(), now())
('user4', 'user4', '1234', now(), now())
ON CONFLICT (id) DO NOTHING;