# Contributing to aathu-lang

Thank you for your interest in contributing to aathu-lang!

## Getting Started

1. Fork the repository
2. Clone your fork
3. Run `./scripts/setup.sh` to install dependencies
4. Create a feature branch: `git checkout -b feature/my-feature`
5. Make your changes
6. Run tests: `cargo test --workspace`
7. Submit a pull request

## Development

```bash
# Build all crates
cargo build --workspace

# Run tests
cargo test --workspace

# Run clippy
cargo clippy --workspace -- -D warnings

# Format code
cargo fmt --all

# Run benchmarks
cargo bench -p benchmarks
```

## Project Structure

- `crates/` - Core language crates (lexer, parser, type checker, VM, etc.)
- `tools/` - Developer tools (CLI, LSP, formatter, linter, package manager)
- `stdlib/` - Standard library
- `editors/` - Editor integrations (VS Code, Neovim, Tree-sitter)
- `web/` - Documentation site and online playground
- `tests/` - Integration tests, benchmarks, and fuzz tests
- `examples/` - Example aathu programs
- `rfcs/` - Language design documents

## Code of Conduct

Be respectful and constructive. We are all here to build something great together.
