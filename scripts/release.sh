#!/usr/bin/env bash
set -euo pipefail
VERSION="${1:?Usage: release.sh <version>}"
echo "Releasing aathu-lang v${VERSION}..."
cargo build --release --workspace
echo "Release v${VERSION} built!"
