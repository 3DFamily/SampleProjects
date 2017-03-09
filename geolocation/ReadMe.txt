With Docker
==========
docker build -t packt/geolocation .    --> this will build the image
docker run -p 8080:8080 packt/geolocation  --> run the docker container -p port mapping with left port is for the docker host and right for container

docker tag packt/geolocation dinshetty/geolocation   --> you can tag the image /dinshetty is existing in dockerhub
docker push dinshetty/geolocation  --> push image to docker hub

docker rm $(docker ps -a -q)  -- remove any of the containers running or stopped




Payload

curl -H "Content-Type: application/json" -X POST -d'{"timestamp": 1468203975, "userId": "f1196aac-470e-11e6-beb8-9e71128cae77", "latitude": 41.803488, "longitude":-88.144040}' http://192.168.99.100:8080/geolocation



With Docker composer
===================

docker-compose -f docker-compose-mesos.yml up

docker rm $(docker ps -a -q)