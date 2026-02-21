//! Error types used across the compiler pipeline.

use crate::span::Span;

#[derive(Debug, Clone)]
pub struct AathuError {
    pub message: String,
    pub span: Option<Span>,
    pub kind: ErrorKind,
}

#[derive(Debug, Clone)]
pub enum ErrorKind {
    Syntax,
    Type,
    Runtime,
    Io,
}

impl std::fmt::Display for AathuError {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        write!(f, "{}", self.message)
    }
}

impl std::error::Error for AathuError {}
