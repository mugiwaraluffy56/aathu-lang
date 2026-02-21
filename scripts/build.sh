#!/usr/bin/env bash
set -euo pipefail
echo "Building aathu-lang..."
cargo build --workspace "$@"
echo "Build complete!"
