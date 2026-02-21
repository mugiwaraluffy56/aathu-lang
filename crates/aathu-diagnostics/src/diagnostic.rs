//! Diagnostic message types and builders.

use aathu_core::span::Span;

#[derive(Debug)]
pub struct Diagnostic {
    pub level: Level,
    pub message: String,
    pub span: Option<Span>,
    pub notes: Vec<String>,
}

#[derive(Debug)]
pub enum Level {
    Error,
    Warning,
    Info,
    Hint,
}
