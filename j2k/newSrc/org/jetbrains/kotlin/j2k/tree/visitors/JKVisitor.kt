package org.jetbrains.kotlin.j2k.tree.visitors

import org.jetbrains.kotlin.j2k.tree.*

interface JKVisitor<out R, in D> {
    fun visitTreeElement(treeElement: JKTreeElement, data: D): R 
    fun visitDeclaration(declaration: JKDeclaration, data: D): R = visitTreeElement(declaration, data)
    fun visitClass(klass: JKClass, data: D): R = visitDeclaration(klass, data)
    fun visitMethod(method: JKMethod, data: D): R = visitDeclaration(method, data)
    fun visitField(field: JKField, data: D): R = visitDeclaration(field, data)
    fun visitLocalVariable(localVariable: JKLocalVariable, data: D): R = visitField(localVariable, data)
    fun visitModifier(modifier: JKModifier, data: D): R = visitTreeElement(modifier, data)
    fun visitModifierList(modifierList: JKModifierList, data: D): R = visitTreeElement(modifierList, data)
    fun visitAccessModifier(accessModifier: JKAccessModifier, data: D): R = visitModifier(accessModifier, data)
    fun visitModalityModifier(modalityModifier: JKModalityModifier, data: D): R = visitModifier(modalityModifier, data)
    fun visitTypeElement(typeElement: JKTypeElement, data: D): R = visitTreeElement(typeElement, data)
    fun visitStatement(statement: JKStatement, data: D): R = visitTreeElement(statement, data)
    fun visitBlock(block: JKBlock, data: D): R = visitTreeElement(block, data)
    fun visitIdentifier(identifier: JKIdentifier, data: D): R = visitTreeElement(identifier, data)
    fun visitNameIdentifier(nameIdentifier: JKNameIdentifier, data: D): R = visitIdentifier(nameIdentifier, data)
    fun visitExpression(expression: JKExpression, data: D): R = visitTreeElement(expression, data)
    fun visitExpressionStatement(expressionStatement: JKExpressionStatement, data: D): R = visitStatement(expressionStatement, data)
    fun visitDeclarationStatement(declarationStatement: JKDeclarationStatement, data: D): R = visitStatement(declarationStatement, data)
    fun visitBinaryExpression(binaryExpression: JKBinaryExpression, data: D): R = visitExpression(binaryExpression, data)
    fun visitUnaryExpression(unaryExpression: JKUnaryExpression, data: D): R = visitExpression(unaryExpression, data)
    fun visitPrefixExpression(prefixExpression: JKPrefixExpression, data: D): R = visitUnaryExpression(prefixExpression, data)
    fun visitPostfixExpression(postfixExpression: JKPostfixExpression, data: D): R = visitUnaryExpression(postfixExpression, data)
    fun visitQualifiedExpression(qualifiedExpression: JKQualifiedExpression, data: D): R = visitExpression(qualifiedExpression, data)
    fun visitMethodCallExpression(methodCallExpression: JKMethodCallExpression, data: D): R = visitExpression(methodCallExpression, data)
    fun visitFieldAccessExpression(fieldAccessExpression: JKFieldAccessExpression, data: D): R = visitExpression(fieldAccessExpression, data)
    fun visitArrayAccessExpression(arrayAccessExpression: JKArrayAccessExpression, data: D): R = visitExpression(arrayAccessExpression, data)
    fun visitParenthesizedExpression(parenthesizedExpression: JKParenthesizedExpression, data: D): R = visitExpression(parenthesizedExpression, data)
    fun visitTypeCastExpression(typeCastExpression: JKTypeCastExpression, data: D): R = visitExpression(typeCastExpression, data)
    fun visitExpressionList(expressionList: JKExpressionList, data: D): R = visitTreeElement(expressionList, data)
    fun visitLiteralExpression(literalExpression: JKLiteralExpression, data: D): R = visitExpression(literalExpression, data)
    fun visitValueArgument(valueArgument: JKValueArgument, data: D): R = visitTreeElement(valueArgument, data)
    fun visitStringLiteralExpression(stringLiteralExpression: JKStringLiteralExpression, data: D): R = visitLiteralExpression(stringLiteralExpression, data)
    fun visitStubExpression(stubExpression: JKStubExpression, data: D): R = visitExpression(stubExpression, data)
    fun visitLoopStatement(loopStatement: JKLoopStatement, data: D): R = visitStatement(loopStatement, data)
    fun visitBlockStatement(blockStatement: JKBlockStatement, data: D): R = visitStatement(blockStatement, data)
    fun visitThisExpression(thisExpression: JKThisExpression, data: D): R = visitExpression(thisExpression, data)
    fun visitSuperExpression(superExpression: JKSuperExpression, data: D): R = visitExpression(superExpression, data)
    fun visitWhileStatement(whileStatement: JKWhileStatement, data: D): R = visitLoopStatement(whileStatement, data)
    fun visitDoWhileStatement(doWhileStatement: JKDoWhileStatement, data: D): R = visitLoopStatement(doWhileStatement, data)
    fun visitSwitchStatement(switchStatement: JKSwitchStatement, data: D): R = visitStatement(switchStatement, data)
    fun visitSwitchLabelStatement(switchLabelStatement: JKSwitchLabelStatement, data: D): R = visitStatement(switchLabelStatement, data)
    fun visitSwitchDefaultLabelStatement(switchDefaultLabelStatement: JKSwitchDefaultLabelStatement, data: D): R = visitStatement(switchDefaultLabelStatement, data)
    fun visitBreakStatement(breakStatement: JKBreakStatement, data: D): R = visitStatement(breakStatement, data)
    fun visitIfStatement(ifStatement: JKIfStatement, data: D): R = visitStatement(ifStatement, data)
    fun visitIfElseStatement(ifElseStatement: JKIfElseStatement, data: D): R = visitIfStatement(ifElseStatement, data)
    fun visitIfElseExpression(ifElseExpression: JKIfElseExpression, data: D): R = visitExpression(ifElseExpression, data)
    fun visitJavaField(javaField: JKJavaField, data: D): R = visitField(javaField, data)
    fun visitJavaMethod(javaMethod: JKJavaMethod, data: D): R = visitMethod(javaMethod, data)
    fun visitJavaAssignmentExpression(javaAssignmentExpression: JKJavaAssignmentExpression, data: D): R = visitExpression(javaAssignmentExpression, data)
    fun visitJavaMethodCallExpression(javaMethodCallExpression: JKJavaMethodCallExpression, data: D): R = visitMethodCallExpression(javaMethodCallExpression, data)
    fun visitJavaFieldAccessExpression(javaFieldAccessExpression: JKJavaFieldAccessExpression, data: D): R = visitFieldAccessExpression(javaFieldAccessExpression, data)
    fun visitJavaNewExpression(javaNewExpression: JKJavaNewExpression, data: D): R = visitExpression(javaNewExpression, data)
    fun visitJavaDefaultNewExpression(javaDefaultNewExpression: JKJavaDefaultNewExpression, data: D): R = visitExpression(javaDefaultNewExpression, data)
    fun visitJavaAccessModifier(javaAccessModifier: JKJavaAccessModifier, data: D): R = visitAccessModifier(javaAccessModifier, data)
    fun visitJavaModifier(javaModifier: JKJavaModifier, data: D): R = visitModifier(javaModifier, data)
    fun visitJavaNewEmptyArray(javaNewEmptyArray: JKJavaNewEmptyArray, data: D): R = visitExpression(javaNewEmptyArray, data)
    fun visitJavaNewArray(javaNewArray: JKJavaNewArray, data: D): R = visitExpression(javaNewArray, data)
    fun visitJavaLiteralExpression(javaLiteralExpression: JKJavaLiteralExpression, data: D): R = visitLiteralExpression(javaLiteralExpression, data)
    fun visitReturnStatement(returnStatement: JKReturnStatement, data: D): R = visitStatement(returnStatement, data)
    fun visitJavaAssertStatement(javaAssertStatement: JKJavaAssertStatement, data: D): R = visitStatement(javaAssertStatement, data)
    fun visitJavaForLoopStatement(javaForLoopStatement: JKJavaForLoopStatement, data: D): R = visitLoopStatement(javaForLoopStatement, data)
    fun visitJavaInstanceOfExpression(javaInstanceOfExpression: JKJavaInstanceOfExpression, data: D): R = visitExpression(javaInstanceOfExpression, data)
    fun visitJavaPolyadicExpression(javaPolyadicExpression: JKJavaPolyadicExpression, data: D): R = visitExpression(javaPolyadicExpression, data)
    fun visitKtProperty(ktProperty: JKKtProperty, data: D): R = visitField(ktProperty, data)
    fun visitKtFunction(ktFunction: JKKtFunction, data: D): R = visitMethod(ktFunction, data)
    fun visitKtConstructor(ktConstructor: JKKtConstructor, data: D): R = visitDeclaration(ktConstructor, data)
    fun visitKtPrimaryConstructor(ktPrimaryConstructor: JKKtPrimaryConstructor, data: D): R = visitKtConstructor(ktPrimaryConstructor, data)
    fun visitKtAssignmentStatement(ktAssignmentStatement: JKKtAssignmentStatement, data: D): R = visitStatement(ktAssignmentStatement, data)
    fun visitKtCall(ktCall: JKKtCall, data: D): R = visitMethodCallExpression(ktCall, data)
    fun visitKtModifier(ktModifier: JKKtModifier, data: D): R = visitModifier(ktModifier, data)
    fun visitKtMethodCallExpression(ktMethodCallExpression: JKKtMethodCallExpression, data: D): R = visitMethodCallExpression(ktMethodCallExpression, data)
    fun visitKtFieldAccessExpression(ktFieldAccessExpression: JKKtFieldAccessExpression, data: D): R = visitFieldAccessExpression(ktFieldAccessExpression, data)
    fun visitKtLiteralExpression(ktLiteralExpression: JKKtLiteralExpression, data: D): R = visitLiteralExpression(ktLiteralExpression, data)
}
