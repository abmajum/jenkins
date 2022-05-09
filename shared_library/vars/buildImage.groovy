#!/usr/bin/env groovy

#parametarize global libraries

def call(String imageName) {
	echo "building the docker image..."
	with Credential([usernamePassword(credentialsId: ''docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]){
		sh "docker build -t $imageName ."
		sh "echo $PASS | docker login -u $USER --password-stdin"
		sh "docker push $imageName"
	}
}
