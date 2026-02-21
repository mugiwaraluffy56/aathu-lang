module.exports = {
  "entry": {
    "aathu-landing-fastopt": ["C:\\Users\\Atrancendentbeing\\Desktop\\aathu-lang\\web\\landing\\target\\scala-3.3.3\\scalajs-bundler\\main\\aathu-landing-fastopt.js"]
  },
  "output": {
    "path": "C:\\Users\\Atrancendentbeing\\Desktop\\aathu-lang\\web\\landing\\target\\scala-3.3.3\\scalajs-bundler\\main",
    "filename": "[name]-bundle.js"
  },
  "mode": "development",
  "devServer": {
    "port": 8080
  },
  "devtool": "source-map",
  "module": {
    "rules": [{
      "test": new RegExp("\\.js$"),
      "enforce": "pre",
      "use": ["source-map-loader"]
    }]
  }
}