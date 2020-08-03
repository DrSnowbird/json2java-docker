FROM openkbs/jdk-mvn-py3

ENV APP_HOME=${HOME}/app
RUN mkdir -p ${APP_HOME}

LABEL maintainer="DrSnowbird@openkbs.org"

ARG VERSION=${VERSION:-1.0.2}

ARG TAR_URL=https://github.com/joelittlejohn/jsonschema2pojo/releases/download/jsonschema2pojo-1.0.2/jsonschema2pojo-1.0.2.tar.gz
RUN cd $APP_HOME && \
    wget -cq https://github.com/joelittlejohn/jsonschema2pojo/releases/download/jsonschema2pojo-${VERSION}/jsonschema2pojo-${VERSION}.tar.gz && \
    tar xvfz $(basename $TAR_URL)
    
# ---- build ----
WORKDIR ${APP_HOME}
USER $USER

### entrypoint
ENTRYPOINT ["java", "-jar", "jsonschema2pojo-1.0.2/lib/jsonschema2pojo-cli-1.0.2.jar"]

