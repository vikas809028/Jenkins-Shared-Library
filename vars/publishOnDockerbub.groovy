def call(String dockerHubCred){
  withCredentials([
      usernamePassword(
          credentialsId: dockerHubCred,
          usernameVariable: "dockerHubUser",
          passwordVariable: "dockerHubPass"
      )
  ]) {
      sh "echo ${dockerHubPass} | docker login -u ${dockerHubUser} --password-stdin"
      sh "docker tag jenkins-test:latest ${dockerHubUser}/jenkins-test:latest"
      sh "docker push ${dockerHubUser}/jenkins-test:latest"
  }
}
