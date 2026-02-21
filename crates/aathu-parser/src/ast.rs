//! Abstract Syntax Tree definitions.

use aathu_core::span::Span;

#[derive(Debug, Clone)]
pub struct Program {
    pub statements: Vec<Statement>,
}

#[derive(Debug, Clone)]
pub struct Statement {
    pub kind: StatementKind,
    pub span: Span,
}

#[derive(Debug, Clone)]
pub enum StatementKind {
    Let { name: String, value: Expression },
    Expression(Expression),
    Function { name: String, params: Vec<String>, body: Vec<Statement> },
    Return(Option<Expression>),
    If { condition: Expression, then: Vec<Statement>, otherwise: Option<Vec<Statement>> },
    While { condition: Expression, body: Vec<Statement> },
    For { variable: String, iterable: Expression, body: Vec<Statement> },
    Import { path: String },
}

#[derive(Debug, Clone)]
pub struct Expression {
    pub kind: ExpressionKind,
    pub span: Span,
}

#[derive(Debug, Clone)]
pub enum ExpressionKind {
    Integer(i64),
    Float(f64),
    String(String),
    Bool(bool),
    Identifier(String),
    Binary { op: BinaryOp, left: Box<Expression>, right: Box<Expression> },
    Unary { op: UnaryOp, operand: Box<Expression> },
    Call { callee: Box<Expression>, args: Vec<Expression> },
    Index { object: Box<Expression>, index: Box<Expression> },
    Member { object: Box<Expression>, field: String },
    List(Vec<Expression>),
    Map(Vec<(Expression, Expression)>),
    Lambda { params: Vec<String>, body: Box<Expression> },
}

#[derive(Debug, Clone)]
pub enum BinaryOp {
    Add, Sub, Mul, Div, Eq, NotEq, Lt, Gt, LtEq, GtEq, And, Or,
}

#[derive(Debug, Clone)]
pub enum UnaryOp {
    Neg, Not,
}
