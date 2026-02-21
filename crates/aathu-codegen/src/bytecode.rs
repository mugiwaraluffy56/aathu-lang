//! Bytecode instruction definitions.

#[derive(Debug, Clone, Copy)]
#[repr(u8)]
pub enum OpCode {
    Halt,
    LoadConst,
    LoadLocal,
    StoreLocal,
    Add,
    Sub,
    Mul,
    Div,
    Negate,
    Not,
    Equal,
    NotEqual,
    LessThan,
    GreaterThan,
    Jump,
    JumpIfFalse,
    Call,
    Return,
    Print,
    Pop,
}
