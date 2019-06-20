--UnitType
INSERT INTO `xmlagent`.`unit_type` (`id`, `name_of_unit_type`) VALUES ('1', 'Unit1');
INSERT INTO `xmlagent`.`unit_type` (`id`, `name_of_unit_type`) VALUES ('2', 'Unit2');

--Role
INSERT INTO `xmlagent`.`role` (`id`, `role_name`) VALUES ('1', 'Agent');
INSERT INTO `xmlagent`.`role` (`id`, `role_name`) VALUES ('2', 'Admin');

--Location
INSERT INTO `xmlagent`.`location` (`id`, `city`, `country`, `latitude`, `longitude`, `number`, `postal_code`, `street`) VALUES ('1', 'NS', 'SRB', '46', '48', '15', '21000', 'Sekspirova');

--AccType
INSERT INTO `xmlagent`.`accommodation_type` (`id`, `name_of_acc_type`) VALUES ('1', 'Hotel');
INSERT INTO `xmlagent`.`accommodation_type` (`id`, `name_of_acc_type`) VALUES ('2', 'BB');
INSERT INTO `xmlagent`.`accommodation_type` (`id`, `name_of_acc_type`) VALUES ('3', 'Apartman');

--User
INSERT INTO `xmlagent`.`user` (`id`, `activated_user`, `birthday`, `email`, `last_name`, `name`, `password`, `phone_number`, `pib`, `salt`, `location_id`, `role_id`) VALUES ('1', false,'2018-09-09', 'korisnik2@gmail.com', 'Djordjievi', 'Nikola', '12315641', '0651651', '11', '1155', '1', '2');

--Accommodation
INSERT INTO `xmlagent`.`accommodation` (`id`, `cancelation_days`, `description`, `name`, `accommodation_type_id`, `location_id`, `user_id`) VALUES ('1', '3', 'Opis', 'Smestaj1', '1', '1', '1');

--UnitAcc
INSERT INTO `xmlagent`.`accommodation_unit` (`id`, `capacity`, `name_of_unit`, `size`, `accommodation_id`, `unit_type_id`) VALUES ('1', '100', 'ImeUnita1', '100', '1', '1');


--Pricing
INSERT INTO `xmlagent`.`pricing` (`id`, `price`, `start_date`, `price_for_unit_id`) VALUES ('1', '100', '2018-09-09', '1');


--Service
INSERT INTO `xmlagent`.`service` (`id`, `description`, `name_of_service`, `service_for_acc_id`, `service_for_acc_unit_id`) VALUES ('1', 'OpisServisa1', 'ImeServisa1', '1', '1');

--Image
INSERT INTO `xmlagent`.`image` (`id`, `title`, `uri`, `belongs_to_accommodation_id`) VALUES ('1', 'Slika1', 'link', '1');

