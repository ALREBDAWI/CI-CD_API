CREATE TABLE IF NOT EXISTS roles (
        id_role INT AUTO_INCREMENT PRIMARY KEY,
        label_role VARCHAR(255) NOT NULL
    );

INSERT INTO roles (label_role ) VALUES ('rex');
INSERT INTO roles (label_role ) VALUES ('host');