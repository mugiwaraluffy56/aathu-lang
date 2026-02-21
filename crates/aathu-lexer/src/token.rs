//! Token definitions for the aathu lexer.

use aathu_core::span::Span;

#[derive(Debug, Clone, PartialEq)]
pub struct Token {
    pub kind: TokenKind,
    pub span: Span,
}

#[derive(Debug, Clone, PartialEq)]
pub enum TokenKind {
    // Literals
    Integer(i64),
    Float(f64),
    String(String),
    Bool(bool),

    // Identifiers & Keywords
    Identifier(String),
    Keyword(Keyword),

    // Operators
    Plus,
    Minus,
    Star,
    Slash,
    Eq,
    EqEq,
    BangEq,
    Lt,
    Gt,
    LtEq,
    GtEq,

    // Delimiters
    LParen,
    RParen,
    LBrace,
    RBrace,
    LBracket,
    RBracket,
    Comma,
    Colon,
    Semicolon,
    Arrow,
    Dot,

    // Special
    Newline,
    Eof,
}

#[derive(Debug, Clone, PartialEq)]
pub enum Keyword {
    Let,
    Fn,
    If,
    Else,
    While,
    For,
    In,
    Return,
    True,
    False,
    Import,
    Export,
    Struct,
    Enum,
    Match,
    Async,
    Await,
}
