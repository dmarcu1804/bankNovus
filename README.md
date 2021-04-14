# bankNovus

mysql config:

'users', 'CREATE TABLE `users` (\n  `id` int NOT NULL,\n  `account_number` int DEFAULT NULL,\n  `email` varchar(255) DEFAULT NULL,\n  `first_name` varchar(255) DEFAULT NULL,\n  `last_name` varchar(255) DEFAULT NULL,\n  `password` varchar(255) DEFAULT NULL,\n  `sort_code` int DEFAULT NULL,\n  PRIMARY KEY (`id`)\n) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'
