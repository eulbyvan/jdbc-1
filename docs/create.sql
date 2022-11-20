drop table if exists product;
create table product (
	id int generated always as identity,
	name varchar(255),
	is_active boolean,
	is_deleted boolean,
	primary key (id)
);

drop table if exists product_detail;
create table product_detail (
	id int generated always as identity,
	product_id int unique,
	price numeric(18,2),
	description varchar(255),
	primary key (id),
	is_active boolean,
	is_deleted boolean,
	constraint fk_product
		foreign key (product_id)
			references product (id)
);

drop table if exists trx;
create table trx (
	id int generated always as identity,
	date date,
	is_active boolean,
	is_deleted boolean,
	primary key (id)
);

drop table if exists trx_detail;
create table trx_detail (
	id int generated always as identity,
	trx_id int,
	product_id int,
	qty int,
	primary key (id),
	constraint fk_trx
		foreign key (trx_id)
			references trx (id),
	constraint fk_product
		foreign key (product_id)
			references product (id)
);
