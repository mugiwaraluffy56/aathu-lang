module.exports = grammar({
    name: 'aathu',
    rules: {
        source_file: $ => repeat($._statement),
        _statement: $ => choice($.let_declaration, $.expression_statement),
        let_declaration: $ => seq('let', $.identifier, '=', $._expression),
        expression_statement: $ => $._expression,
        _expression: $ => choice($.identifier, $.number, $.string),
        identifier: $ => /[a-zA-Z_][a-zA-Z0-9_]*/,
        number: $ => /[0-9]+(\.[0-9]+)?/,
        string: $ => /"[^"]*"/,
    }
});
