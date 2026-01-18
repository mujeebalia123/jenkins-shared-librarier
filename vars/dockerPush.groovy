def call(String image, String tag, String user) {
    sh "docker tag ${image}:${tag} ${user}/${image}:${tag}"
    sh "docker push ${user}/${image}:${tag}"
}
