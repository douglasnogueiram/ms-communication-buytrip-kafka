FROM openjdk:8-jre
RUN mkdir app
ARG JAR_FILE
ADD /target/${JAR_FILE} /app/ms-communication-buytrip.jar
WORKDIR /app
#RUN wget -O /apm-agent.jar https://search.maven.org/remotecontent?filepath=co/elastic/apm/elastic-apm-agent/1.18.0.RC1/elastic-apm-agent-1.18.0.RC1.jar
ENTRYPOINT java -jar ms-communication-buytrip.jar