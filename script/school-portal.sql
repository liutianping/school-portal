drop table if exists t_cus_subscribe_record;

drop table if exists t_cus_user_message;

drop table if exists t_man_book;

drop table if exists t_man_book_category;

drop table if exists t_man_book_category_rel;

drop table if exists t_man_book_type;

drop table if exists t_sys_permission;

drop table if exists t_sys_resource;

drop table if exists t_sys_role;

drop table if exists t_sys_user;

drop table if exists t_sys_user_role;

/*==============================================================*/
/* Table: t_cus_subscribe_record                                */
/*==============================================================*/
create table t_cus_subscribe_record
(
   subscribe_record_id  bigint(20) not null,
   num                  int(11) not null,
   create_time          datetime,
   return_time          datetime,
   update_time          datetime,
   book_id              bigint(20) not null,
   user_id              bigint(20),
   primary key (subscribe_record_id)
);

/*==============================================================*/
/* Table: t_cus_user_message                                    */
/*==============================================================*/
create table t_cus_user_message
(
   user_message_id      bigint(20) not null,
   create_time          datetime,
   update_time          datetime,
   title                varchar(255),
   message              varchar(255),
   score                int(11),
   user_id              bigint(20) not null,
   book_id              bigint(20) not null,
   primary key (user_message_id)
);

/*==============================================================*/
/* Table: t_man_book                                            */
/*==============================================================*/
create table t_man_book
(
   man_book_id          bigint(20) not null,
   code                 varchar(255) not null,
   book_name            varchar(255) not null,
   auther               varchar(255),
   directory            varchar(255),
   press                varchar(255),
   price                double,
   description          varchar(255),
   create_time          datetime,
   update_time          datetime,
   book_type_id         bigint(20) not null,
   num                  int(11) not null,
   ordered              int(11) not null,
   status               int(11) not null,
   primary key (man_book_id)
);

/*==============================================================*/
/* Table: t_man_book_category                                   */
/*==============================================================*/
create table t_man_book_category
(
   book_category_id     bigint(20) not null auto_increment,
   code                 varchar(255) not null,
   category_name        varchar(255) not null,
   ordered              int(11) not null,
   status               int(11) not null,
   create_time          datetime,
   update_time          datetime,
   primary key (book_category_id)
);

/*==============================================================*/
/* Table: t_man_book_category_rel                               */
/*==============================================================*/
create table t_man_book_category_rel
(
   book_category_rel_id bigint(20) not null,
   book_id              bigint(20) not null,
   book_category_id     bigint(20) not null,
   primary key (book_category_rel_id)
);

/*==============================================================*/
/* Table: t_man_book_type                                       */
/*==============================================================*/
create table t_man_book_type
(
   book_type_id         bigint(20) not null auto_increment,
   code                 varchar(255) not null,
   type_name            varchar(255) not null,
   ordered              int(11) not null,
   create_time          datetime,
   update_time          datetime,
   parent_id            bigint(20) not null,
   primary key (book_type_id)
);

/*==============================================================*/
/* Table: t_sys_permission                                      */
/*==============================================================*/
create table t_sys_permission
(
   permission_id        bigint(20) not null auto_increment,
   operate              int(11),
   user_role_id         bigint(20) not null,
   resources_id         bigint(20) not null,
   status               int(11) not null,
   create_time          datetime,
   update_time          datetime,
   primary key (permission_id)
);

/*==============================================================*/
/* Table: t_sys_resource                                        */
/*==============================================================*/
create table t_sys_resource
(
   resource_id          bigint(255) not null auto_increment,
   resources_name       varchar(255) not null,
   resources_url        varchar(255) not null,
   ordered              int(11),
   code                 varchar(255) not null,
   status               int(11),
   resources_type       int(11),
   create_time          datetime,
   update_time          datetime,
   parent_id            bigint not null,
   primary key (resource_id)
);

/*==============================================================*/
/* Table: t_sys_role                                            */
/*==============================================================*/
create table t_sys_role
(
   role_id              bigint(20) not null auto_increment,
   code                 varchar(255) not null,
   role_name            varchar(255),
   status               int(11),
   create_time          datetime,
   update_time          datetime,
   primary key (role_id)
);

/*==============================================================*/
/* Table: t_sys_user                                            */
/*==============================================================*/
create table t_sys_user
(
   user_id              bigint(20) not null auto_increment,
   user_name            varchar(255) not null,
   password             varchar(255) not null,
   nick_name            varchar(255),
   phonenum             varchar(20),
   status               int(11),
   birthday             datetime,
   create_time          datetime,
   update_time          datetime,
   primary key (user_id)
);

/*==============================================================*/
/* Table: t_sys_user_role                                       */
/*==============================================================*/
create table t_sys_user_role
(
   user_role_id         bigint(255) not null,
   user_id              bigint(255) not null,
   role_id              bigint(255) not null,
   primary key (user_role_id)
);

alter table t_cus_subscribe_record add constraint FK_Reference_10 foreign key (book_id)
      references t_man_book (man_book_id) on delete restrict on update restrict;

alter table t_cus_subscribe_record add constraint FK_Reference_11 foreign key (user_id)
      references t_sys_role (role_id) on delete restrict on update restrict;

alter table t_cus_user_message add constraint FK_Reference_12 foreign key (book_id)
      references t_man_book (man_book_id) on delete restrict on update restrict;

alter table t_cus_user_message add constraint FK_Reference_13 foreign key (user_id)
      references t_sys_role (role_id) on delete restrict on update restrict;

alter table t_man_book add constraint FK_Reference_7 foreign key (book_type_id)
      references t_man_book_type (book_type_id) on delete restrict on update restrict;

alter table t_man_book_category_rel add constraint FK_Reference_8 foreign key (book_id)
      references t_man_book (man_book_id) on delete restrict on update restrict;

alter table t_man_book_category_rel add constraint FK_Reference_9 foreign key (book_category_id)
      references t_man_book_category (book_category_id) on delete restrict on update restrict;

alter table t_man_book_type add constraint FK_Reference_6 foreign key (parent_id)
      references t_man_book_type (book_type_id) on delete restrict on update restrict;

alter table t_sys_permission add constraint FK_Reference_4 foreign key (user_role_id)
      references t_sys_user_role (user_role_id) on delete restrict on update restrict;

alter table t_sys_permission add constraint FK_Reference_5 foreign key (resources_id)
      references t_sys_resource (resource_id) on delete restrict on update restrict;

alter table t_sys_resource add constraint FK_Reference_3 foreign key (parent_id)
      references t_sys_resource (resource_id) on delete restrict on update restrict;

alter table t_sys_user_role add constraint FK_Reference_1 foreign key (user_id)
      references t_sys_user (user_id) on delete restrict on update restrict;

alter table t_sys_user_role add constraint FK_Reference_2 foreign key (role_id)
      references t_sys_role (role_id) on delete restrict on update restrict;
