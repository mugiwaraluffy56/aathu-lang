FROM rust:1.75-slim as builder
WORKDIR /app
COPY . .
RUN cargo build --release -p aathu-cli
FROM debian:bookworm-slim
COPY --from=builder /app/target/release/aathu-cli /usr/local/bin/aathu
ENTRYPOINT ["aathu"]
