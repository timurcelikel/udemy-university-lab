DELETE
FROM COURSES;
INSERT INTO COURSES (title, description, number_of_credits)
VALUES ('Computer Science 101', 'Introduction to the Field Of Computers and Programming', 3);
INSERT INTO COURSES (title, description, number_of_credits)
VALUES ('Algorithms and Data Structures', 'Advanced theoretical course on how to write efficient programs', 5);
INSERT INTO COURSES (title, description, number_of_credits)
VALUES ('Physics 101', 'Introduction to Mechanics and Newton Laws', 2);
INSERT INTO COURSES (title, description, number_of_credits)
VALUES ('Physics 102', 'Introduction to Electromagnetism', 4);
INSERT INTO COURSES (title, description, number_of_credits)
VALUES ('Linear Algebra', 'Introduction to Algebra, Theory and Practice', 5);
INSERT INTO COURSES (title, description, number_of_credits)
VALUES ('Introduction to Calculus', 'Mathematical Study of Continuous Change', 6);

DELETE
FROM STUDENTS;
DELETE
FROM LEARNER_PROFILES;

INSERT INTO LEARNER_PROFILES (number_of_credits, gpa, is_graduated, start_year)
VALUES (30, 90.4, 'FALSE', 2022);
INSERT INTO STUDENTS (first_name, last_name, email, date_of_birth, profile_id)
VALUES ('John', 'Smith', 'john.smith@gmail.com', '1987-08-14', 1);

INSERT INTO LEARNER_PROFILES (number_of_credits, gpa, is_graduated, start_year)
VALUES (25, 68.1, 'FALSE', 2021);
INSERT INTO STUDENTS (first_name, last_name, email, date_of_birth, profile_id)
VALUES ('Mary', 'James', 'mary.james@gmail.com', '2002-12-02', 2);

INSERT INTO LEARNER_PROFILES (number_of_credits, gpa, is_graduated, start_year)
VALUES (140, 88, 'FALSE', 2021);
INSERT INTO STUDENTS (first_name, last_name, email, date_of_birth, profile_id)
VALUES ('Dianna', 'Martin', 'dianna.martin@yahoo.com', '2001-01-03', 3);

INSERT INTO LEARNER_PROFILES (number_of_credits, gpa, is_graduated, start_year)
VALUES (87, 74.5, 'TRUE', 2019);
INSERT INTO STUDENTS (first_name, last_name, email, date_of_birth, profile_id)
VALUES ('Daniel', 'Lee', 'daniel.lee@yahoo.com', '1999-04-05', 4);