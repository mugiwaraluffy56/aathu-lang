// sbt-scalajs-bundler copies this file into target/ then runs webpack with it.
// We must require the generated config (written alongside this file in target/).

// Fix: Node.js 22 OpenSSL 3 dropped MD4 support used by older webpack internals.
const crypto = require('crypto');
const orig = crypto.createHash;
crypto.createHash = (alg) => orig(alg === 'md4' ? 'sha256' : alg);

module.exports = require('./scalajs.webpack.config.js');
