def call(String url, String branch) {
    echo "This is cloning code"
    git branch: branch, url: url
}
