drop database if exists 'springCloud01';
create database 'springCloud01' character UTF8;
use 'springCloud01';

-- ----------------------------
-- Table structure for classes
-- ----------------------------
DROP TABLE IF EXISTS "public"."classes";
CREATE TABLE "public"."classes" (
"id" int4 NOT NULL,
"classes_name" varchar(20) COLLATE "default" NOT NULL,
"db_source" varchar(25) COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "public"."classes"."classes_name" IS '�༶����';
COMMENT ON COLUMN "public"."classes"."db_source" IS '����Դ';

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO "public"."classes" VALUES ('1', 'һ�꼶', (select current_database()));
INSERT INTO "public"."classes" VALUES ('2', '���꼶', (select current_database()));
INSERT INTO "public"."classes" VALUES ('3', '���꼶', (select current_database()));
-- ----------------------------
-- Indexes structure for table classes
-- ----------------------------
CREATE UNIQUE INDEX "id" ON "public"."classes" USING btree ("id");

-- ----------------------------
-- Primary Key structure for table classes
-- ----------------------------
ALTER TABLE "public"."classes" ADD PRIMARY KEY ("id");
