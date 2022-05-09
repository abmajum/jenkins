#!/usr/bin/env groovy

#Using Global Variables in Shared Library
def call() {
    echo "building the application for branch $BRANCH_NAME"
    sh 'mvn package'
}
