# Build
mvn clean package && docker build -t com.ratcash.crossover/mavenproject1 .

# RUN

docker rm -f mavenproject1 || true && docker run -d -p 8080:8080 -p 4848:4848 --name mavenproject1 com.ratcash.crossover/mavenproject1 

# System Test

Switch to the "-st" module and perform:

mvn compile failsafe:integration-test