Run maven clean package under Maven LifeCycle to create a jar file 
Create a Dockerfile in the same project named Dockerfile, specifying the attributes for the Docker image in this file.

# TAKING THE EXAMPLE OF CREATING A DOCKER IMAGE OF OPENJDK 17:-

FROM eclipse-temurin:17 [COPY PASTE FROM DOKCER HUB FOR OPEN JDK]

LABEL MAINTAINER="nikhilchpr7@gmail.com" [ YOUR EMAIL ID]

WORKDIR /app [WORKING DIRECTORY = /app]

COPY target/springboot-docker-demo-0.0.1-SNAPSHOT.jar  app.jar [SOURCE WHIHC IS IN SPRINGBOOT APPLICATION FOLDER ITSELF= target/springboot-docker-demo-0.0.1-SNAPSHOT.jar,  DESTINATION = app.jar ]

ENTRYPOINT ["java", "-jar", "app.jar"] 


# Open cmd
Open the folder where springboot application is stored

# CREATING DOCKER IMAGE
Run command docker build -t <imageName: timeStamp> . THE DOT REPRESENT THE CURRENT DIRECTORY.

# FEWS IMAGES COMMANDS -
docker images                    # List images
docker pull nginx: latest        # Download image from registry   [IF YOU DON'T NAME THE IMAGE, THE TAG WILL BE  LATEST BY ITSELF ] 
docker build -t myapp .          # Build image from Dockerfile
docker rmi <image_id>            # Remove image

# HOW TO RUN A DOCKER IMAGE IN A DOCKER CONTAINER {Port Mapping}
Run command docker run -p 8090:8080 <imageName: timeStamp>     [8090 = port for operating system{HOST PORT] whereas 8080 = port of container ][EXPOSING CONTAINER PORT TO OUR OPERATING PORF


#ctrl + c =====> TO KILL DOCKER INSTANCE [will not kill the container, just stops the instance]

# FEW DOCKER CONTAINER COMMANDS 
docker run -d <imageName>                    # Run container in background  [-d = detached mode, show the container running in the background]
docker ps                                    # List running containers
docker stop <container_id>                   # Stop container
docker rm <container_id>                     # Remove container
docker logs -f <first4digit of containerId>  # logs of our container 


# PUSHING/PULLING THE DOCKER IMAGE TO DOCKER HUB 
DOKCER HUB = A repository for Docker images. It can be public or private. Docker Hub is the default public registry.

NEED TO LOG IN TO THE DOCKER THROUGH THE TERMINAL 
command docker login

command docker tag <imageName> <dockerId/RepositoriesNameYouGoingToCreate:tagName>

ready to push 
cmd docker push <dockerId/RepositoriesNameYouGoingToCreate:tagName>

push completed 

ready to pull 
cmd docker pull <dockerId/RepositoriesNameYouGoingToCreate:tagName>












