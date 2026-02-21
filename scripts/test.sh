#!/usr/bin/env bash
set -euo pipefail
echo "Running tests..."
cargo test --workspace "$@"
echo "All tests passed!"
