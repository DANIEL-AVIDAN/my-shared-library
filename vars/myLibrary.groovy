def buildApp() {
    echo "Building the application"
     sh "docker build -t danielavidan/${env.APP_NAME}:${env.BUILD_NUMBER} ."
}

def pushApp() {
    echo "Pushing the application"
     sh '''
        printf '%s' "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
        docker push danielavidan/${APP_NAME}:${BUILD_NUMBER}
    '''
}

def testApp() {
    echo "Testing the application"
}

def deployApp(String branch = 'main') {
    echo "Deploying application from branch: ${branch}"
}

def chromeTest() {
    echo "Running Chrome tests"
}

def firefoxTest() {
    echo "Running Firefox tests"
}