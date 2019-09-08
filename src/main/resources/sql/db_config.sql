DROP TABLE IF EXISTS TB_AKASH_CONFIGURATION;

CREATE TABLE TB_AKASH_CONFIGURATION (
  APP   VARCHAR(250),
  KEY   VARCHAR(250),
  VALUE VARCHAR(250),
  CONSTRAINT SPRING_SESSION_ATTRIBUTES_PK PRIMARY KEY (APP, KEY)
);

INSERT INTO tb_akash_configuration (config_key, app, config_value)
VALUES ('in.alpha.application.state', 'spring', 'Application Up and Running');
UPDATE tb_akash_configuration
SET  config_value='Application Up and Running1'
WHERE  config_key='in.alpha.application.state';

INSERT INTO tb_akash_configuration (config_key, app, config_value)
VALUES ('in.alpha.application.system.environment', 'spring', 'Test');