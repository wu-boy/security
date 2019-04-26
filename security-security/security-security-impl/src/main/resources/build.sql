drop table if exists t_sec_department;
create table t_sec_department (
   id char(32) primary key,
   name varchar(32) not null,
   parent_id char(32) not null,
   gmt_create timestamp default localtimestamp(0),
   gmt_modified timestamp
);
comment on table t_sec_department is '部门表';
comment on column t_sec_department.id is 'ID';
comment on column t_sec_department.name is '名称';
comment on column t_sec_department.parent_id is '父ID';
comment on column t_sec_department.create_time is '创建时间';
comment on column t_sec_department.update_time is '更新时间';