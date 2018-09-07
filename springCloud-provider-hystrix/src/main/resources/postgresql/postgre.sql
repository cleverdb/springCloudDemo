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
COMMENT ON COLUMN "public"."classes"."classes_name" IS '班级名称';
COMMENT ON COLUMN "public"."classes"."db_source" IS '数据源';

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO "public"."classes" VALUES ('1', '一年级', (select current_database()));
INSERT INTO "public"."classes" VALUES ('2', '二年级', (select current_database()));
INSERT INTO "public"."classes" VALUES ('3', '三年级', (select current_database()));
-- ----------------------------
-- Indexes structure for table classes
-- ----------------------------
CREATE UNIQUE INDEX "id" ON "public"."classes" USING btree ("id");

-- ----------------------------
-- Primary Key structure for table classes
-- ----------------------------
ALTER TABLE "public"."classes" ADD PRIMARY KEY ("id");
