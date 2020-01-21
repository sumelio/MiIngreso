clear
printf "${YELLOW}\n [MiIngreso startup] 🚓 \n${NORMAL}"
java -Dspring.profiles.active=prod -Djava.security.egd=file:/dev/./urandom -jar /MiIngreso-0.0.1-SNAPSHOT.jar

