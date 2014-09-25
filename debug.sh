#!/bin/bash

source ~/.darkbot.rc

extjars=$(echo lib/*.jar | tr " " ":") 

java -cp bin:$extjars org.darkstorm.darkbot.mcwrapper.Main \
	-t bot --owner "$owner" --server $server\
	--offline --protocol "$protocol"\
	--username "$botname"\
	--password "$password"

