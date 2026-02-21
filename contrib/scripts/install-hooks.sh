#!/usr/bin/env bash
set -euo pipefail
HOOKS_DIR="$(git rev-parse --show-toplevel)/.git/hooks"
cp contrib/hooks/* "$HOOKS_DIR/"
chmod +x "$HOOKS_DIR/pre-commit" "$HOOKS_DIR/pre-push"
echo "Git hooks installed!"
