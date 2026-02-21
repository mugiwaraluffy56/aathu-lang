#!/usr/bin/env bash
set -euo pipefail
echo "Setting up aathu-lang development environment..."
if ! command -v rustc &> /dev/null; then echo "Install Rust first: https://rustup.rs"; exit 1; fi
cargo build --workspace
echo "Setup complete!"
