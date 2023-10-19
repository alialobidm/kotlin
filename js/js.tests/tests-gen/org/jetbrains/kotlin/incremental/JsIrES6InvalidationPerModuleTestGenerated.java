/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/incremental/invalidation")
@TestDataPath("$PROJECT_ROOT")
public class JsIrES6InvalidationPerModuleTestGenerated extends AbstractJsIrES6InvalidationPerModuleTest {
    @Test
    @TestMetadata("addUpdateRemoveDependentFile")
    public void testAddUpdateRemoveDependentFile() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/addUpdateRemoveDependentFile/");
    }

    @Test
    @TestMetadata("addUpdateRemoveDependentModule")
    public void testAddUpdateRemoveDependentModule() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/addUpdateRemoveDependentModule/");
    }

    @Test
    public void testAllFilesPresentInInvalidation() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/incremental/invalidation"), Pattern.compile("^([^_](.+))$"), null, TargetBackend.JS_IR_ES6, false);
    }

    @Test
    @TestMetadata("circleExportsUpdate")
    public void testCircleExportsUpdate() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/circleExportsUpdate/");
    }

    @Test
    @TestMetadata("circleInlineImportsUpdate")
    public void testCircleInlineImportsUpdate() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/circleInlineImportsUpdate/");
    }

    @Test
    @TestMetadata("class")
    public void testClass() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/class/");
    }

    @Test
    @TestMetadata("classFunctionsAndFields")
    public void testClassFunctionsAndFields() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/classFunctionsAndFields/");
    }

    @Test
    @TestMetadata("companionConstVal")
    public void testCompanionConstVal() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/companionConstVal/");
    }

    @Test
    @TestMetadata("companionFunction")
    public void testCompanionFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/companionFunction/");
    }

    @Test
    @TestMetadata("companionInlineFunction")
    public void testCompanionInlineFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/companionInlineFunction/");
    }

    @Test
    @TestMetadata("companionProperties")
    public void testCompanionProperties() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/companionProperties/");
    }

    @Test
    @TestMetadata("companionWithStdLibCall")
    public void testCompanionWithStdLibCall() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/companionWithStdLibCall/");
    }

    @Test
    @TestMetadata("constVals")
    public void testConstVals() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/constVals/");
    }

    @Test
    @TestMetadata("crossModuleReferences")
    public void testCrossModuleReferences() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/crossModuleReferences/");
    }

    @Test
    @TestMetadata("eagerInitialization")
    public void testEagerInitialization() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/eagerInitialization/");
    }

    @Test
    @TestMetadata("enum")
    public void testEnum() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/enum/");
    }

    @Test
    @TestMetadata("enumsInInlineFunctions")
    public void testEnumsInInlineFunctions() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/enumsInInlineFunctions/");
    }

    @Test
    @TestMetadata("exceptionsFromInlineFunction")
    public void testExceptionsFromInlineFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/exceptionsFromInlineFunction/");
    }

    @Test
    @TestMetadata("exportsThroughInlineFunction")
    public void testExportsThroughInlineFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/exportsThroughInlineFunction/");
    }

    @Test
    @TestMetadata("fakeOverrideClassFunctionQualifiers")
    public void testFakeOverrideClassFunctionQualifiers() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fakeOverrideClassFunctionQualifiers/");
    }

    @Test
    @TestMetadata("fakeOverrideInheritance")
    public void testFakeOverrideInheritance() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fakeOverrideInheritance/");
    }

    @Test
    @TestMetadata("fakeOverrideInlineExtension")
    public void testFakeOverrideInlineExtension() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fakeOverrideInlineExtension/");
    }

    @Test
    @TestMetadata("fakeOverrideInlineFunction")
    public void testFakeOverrideInlineFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fakeOverrideInlineFunction/");
    }

    @Test
    @TestMetadata("fakeOverrideInlineProperty")
    public void testFakeOverrideInlineProperty() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fakeOverrideInlineProperty/");
    }

    @Test
    @TestMetadata("fakeOverrideInterfaceFunctionQualifiers")
    public void testFakeOverrideInterfaceFunctionQualifiers() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fakeOverrideInterfaceFunctionQualifiers/");
    }

    @Test
    @TestMetadata("fastPath1")
    public void testFastPath1() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fastPath1/");
    }

    @Test
    @TestMetadata("fastPath2")
    public void testFastPath2() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fastPath2/");
    }

    @Test
    @TestMetadata("fileNameClash")
    public void testFileNameClash() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/fileNameClash/");
    }

    @Test
    @TestMetadata("friendDependency")
    public void testFriendDependency() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/friendDependency/");
    }

    @Test
    @TestMetadata("functionDefaultParams")
    public void testFunctionDefaultParams() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/functionDefaultParams/");
    }

    @Test
    @TestMetadata("functionSignature")
    public void testFunctionSignature() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/functionSignature/");
    }

    @Test
    @TestMetadata("functionTypeInterface")
    public void testFunctionTypeInterface() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/functionTypeInterface/");
    }

    @Test
    @TestMetadata("functionTypeInterfaceReflect")
    public void testFunctionTypeInterfaceReflect() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/functionTypeInterfaceReflect/");
    }

    @Test
    @TestMetadata("genericFunctions")
    public void testGenericFunctions() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/genericFunctions/");
    }

    @Test
    @TestMetadata("genericInlineFunctions")
    public void testGenericInlineFunctions() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/genericInlineFunctions/");
    }

    @Test
    @TestMetadata("gettersAndSettersInlining")
    public void testGettersAndSettersInlining() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/gettersAndSettersInlining/");
    }

    @Test
    @TestMetadata("inlineBecomeNonInline")
    public void testInlineBecomeNonInline() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/inlineBecomeNonInline/");
    }

    @Test
    @TestMetadata("inlineFunctionAnnotations")
    public void testInlineFunctionAnnotations() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/inlineFunctionAnnotations/");
    }

    @Test
    @TestMetadata("inlineFunctionAsFunctionReference")
    public void testInlineFunctionAsFunctionReference() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/inlineFunctionAsFunctionReference/");
    }

    @Test
    @TestMetadata("inlineFunctionAsParam")
    public void testInlineFunctionAsParam() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/inlineFunctionAsParam/");
    }

    @Test
    @TestMetadata("inlineFunctionCircleUsage")
    public void testInlineFunctionCircleUsage() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/inlineFunctionCircleUsage/");
    }

    @Test
    @TestMetadata("inlineFunctionDefaultParams")
    public void testInlineFunctionDefaultParams() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/inlineFunctionDefaultParams/");
    }

    @Test
    @TestMetadata("inlineFunctionWithObject")
    public void testInlineFunctionWithObject() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/inlineFunctionWithObject/");
    }

    @Test
    @TestMetadata("interfaceOpenMethods")
    public void testInterfaceOpenMethods() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/interfaceOpenMethods/");
    }

    @Test
    @TestMetadata("interfaceOpenMethodsInOpenClass")
    public void testInterfaceOpenMethodsInOpenClass() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/interfaceOpenMethodsInOpenClass/");
    }

    @Test
    @TestMetadata("interfaceSuperUsage")
    public void testInterfaceSuperUsage() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/interfaceSuperUsage/");
    }

    @Test
    @TestMetadata("interfaceWithDefaultParams")
    public void testInterfaceWithDefaultParams() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/interfaceWithDefaultParams/");
    }

    @Test
    @TestMetadata("jsCode")
    public void testJsCode() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/jsCode/");
    }

    @Test
    @TestMetadata("jsCodeWithConstString")
    public void testJsCodeWithConstString() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/jsCodeWithConstString/");
    }

    @Test
    @TestMetadata("jsCodeWithConstStringFromOtherModule")
    public void testJsCodeWithConstStringFromOtherModule() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/jsCodeWithConstStringFromOtherModule/");
    }

    @Test
    @TestMetadata("jsExport")
    public void testJsExport() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/jsExport/");
    }

    @Test
    @TestMetadata("jsExportReexport")
    public void testJsExportReexport() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/jsExportReexport/");
    }

    @Test
    @TestMetadata("jsExportWithMultipleFiles")
    public void testJsExportWithMultipleFiles() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/jsExportWithMultipleFiles/");
    }

    @Test
    @TestMetadata("jsModuleAnnotation")
    public void testJsModuleAnnotation() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/jsModuleAnnotation/");
    }

    @Test
    @TestMetadata("jsModuleAnnotationOnObjectWithUsage")
    public void testJsModuleAnnotationOnObjectWithUsage() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/jsModuleAnnotationOnObjectWithUsage/");
    }

    @Test
    @TestMetadata("languageVersionSettings")
    public void testLanguageVersionSettings() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/languageVersionSettings/");
    }

    @Test
    @TestMetadata("localInlineFunction")
    public void testLocalInlineFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/localInlineFunction/");
    }

    @Test
    @TestMetadata("localObjectsLeakThroughInterface")
    public void testLocalObjectsLeakThroughInterface() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/localObjectsLeakThroughInterface/");
    }

    @Test
    @TestMetadata("mainFunction")
    public void testMainFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/mainFunction/");
    }

    @Test
    @TestMetadata("mainModuleInvalidation")
    public void testMainModuleInvalidation() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/mainModuleInvalidation/");
    }

    @Test
    @TestMetadata("moveAndModifyInlineFunction")
    public void testMoveAndModifyInlineFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/moveAndModifyInlineFunction/");
    }

    @Test
    @TestMetadata("moveExternalDeclarationsBetweenFiles")
    public void testMoveExternalDeclarationsBetweenFiles() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/moveExternalDeclarationsBetweenFiles/");
    }

    @Test
    @TestMetadata("moveExternalDeclarationsBetweenJsModules")
    public void testMoveExternalDeclarationsBetweenJsModules() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/moveExternalDeclarationsBetweenJsModules/");
    }

    @Test
    @TestMetadata("moveFilesBetweenModules")
    public void testMoveFilesBetweenModules() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/moveFilesBetweenModules/");
    }

    @Test
    @TestMetadata("moveInlineFunctionBetweenModules")
    public void testMoveInlineFunctionBetweenModules() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/moveInlineFunctionBetweenModules/");
    }

    @Test
    @TestMetadata("multiPlatformSimple")
    public void testMultiPlatformSimple() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/multiPlatformSimple/");
    }

    @Test
    @TestMetadata("nestedClass")
    public void testNestedClass() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/nestedClass/");
    }

    @Test
    @TestMetadata("nonInlineBecomeInline")
    public void testNonInlineBecomeInline() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/nonInlineBecomeInline/");
    }

    @Test
    @TestMetadata("openClassWithInternalField")
    public void testOpenClassWithInternalField() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/openClassWithInternalField/");
    }

    @Test
    @TestMetadata("privateDeclarationLeakThroughDefaultParam")
    public void testPrivateDeclarationLeakThroughDefaultParam() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/privateDeclarationLeakThroughDefaultParam/");
    }

    @Test
    @TestMetadata("privateInlineFunction1")
    public void testPrivateInlineFunction1() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/privateInlineFunction1/");
    }

    @Test
    @TestMetadata("privateObjectsLeakThroughSealedInterface")
    public void testPrivateObjectsLeakThroughSealedInterface() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/privateObjectsLeakThroughSealedInterface/");
    }

    @Test
    @TestMetadata("removeFile")
    public void testRemoveFile() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/removeFile/");
    }

    @Test
    @TestMetadata("removeModule")
    public void testRemoveModule() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/removeModule/");
    }

    @Test
    @TestMetadata("removeUnusedFile")
    public void testRemoveUnusedFile() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/removeUnusedFile/");
    }

    @Test
    @TestMetadata("renameFile")
    public void testRenameFile() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/renameFile/");
    }

    @Test
    @TestMetadata("renameModule")
    public void testRenameModule() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/renameModule/");
    }

    @Test
    @TestMetadata("simple")
    public void testSimple() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/simple/");
    }

    @Test
    @TestMetadata("splitJoinModule")
    public void testSplitJoinModule() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/splitJoinModule/");
    }

    @Test
    @TestMetadata("suspendFunctions")
    public void testSuspendFunctions() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/suspendFunctions/");
    }

    @Test
    @TestMetadata("suspendInterfaceWithDefaultParams")
    public void testSuspendInterfaceWithDefaultParams() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/suspendInterfaceWithDefaultParams/");
    }

    @Test
    @TestMetadata("toplevelProperties")
    public void testToplevelProperties() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/toplevelProperties/");
    }

    @Test
    @TestMetadata("transitiveInlineFunction")
    public void testTransitiveInlineFunction() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/transitiveInlineFunction/");
    }

    @Test
    @TestMetadata("typeScriptExportsPerFile")
    public void testTypeScriptExportsPerFile() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/typeScriptExportsPerFile/");
    }

    @Test
    @TestMetadata("typeScriptExportsPerModule")
    public void testTypeScriptExportsPerModule() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/typeScriptExportsPerModule/");
    }

    @Test
    @TestMetadata("unicodeSerializationAndDeserialization")
    public void testUnicodeSerializationAndDeserialization() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/unicodeSerializationAndDeserialization/");
    }

    @Test
    @TestMetadata("updateExports")
    public void testUpdateExports() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/updateExports/");
    }

    @Test
    @TestMetadata("updateExportsAndInlineImports")
    public void testUpdateExportsAndInlineImports() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/updateExportsAndInlineImports/");
    }

    @Test
    @TestMetadata("variance")
    public void testVariance() throws Exception {
        runTest("js/js.translator/testData/incremental/invalidation/variance/");
    }
}
