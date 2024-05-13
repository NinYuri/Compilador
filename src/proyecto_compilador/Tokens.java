package proyecto_compilador;

public enum Tokens 
{
    program,
    idp,                    // id del programa, nombre de la clase
    open_key,               // llave de apertura {
    close_key,              // llave de cierre }
    open_parenth,           // paréntesis de apertura (
    close_parenth,          // paréntesis de cierre )
    read,
    print,
    integer,
    floatType,
    stringType,
    character,
    bool,
    then,
    if_keyword,
    end_if,
    else_keyword,
    while_keyword,
    end_while,
    for_keyword,
    plus,
    minus,
    mult,
    div,
    res,                    // %
    equal,                  // =
    less_than,              // <
    greater_than,           // >
    not,                    // !
    different_to,           // !=
    equals_to,              // ==
    less_or_equals,         // <=
    greater_or_equals,      // >=
    plus_equals,            // += 
    minus_equals,           // -=
    mult_equals,            // *=
    div_equals,             // /=
    res_equals,             // %=
    logical_and,            // &&
    logical_or,             // ||
    semicolon,
    comma,
    id,
    num,
    litcar,
    litcad,
    trueType,
    falseType,
    Error
}