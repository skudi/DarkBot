#!/bin/bash

source ~/.darkbot.rc

java -jar DarkBot.jar \
	-t bot --owner "$owner" --server $server\
	--offline --protocol "$protocol"\
	--username "$botname"\
	--password "$password"
