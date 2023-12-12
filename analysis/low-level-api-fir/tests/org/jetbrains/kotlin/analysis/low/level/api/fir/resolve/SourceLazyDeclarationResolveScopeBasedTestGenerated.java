/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/lazyResolveScopes")
@TestDataPath("$PROJECT_ROOT")
public class SourceLazyDeclarationResolveScopeBasedTestGenerated extends AbstractSourceLazyDeclarationResolveScopeBasedTest {
    @Test
    public void testAllFilesPresentInLazyResolveScopes() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveScopes"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
    }

    @Test
    @TestMetadata("anonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/anonymousObject.kt");
    }

    @Test
    @TestMetadata("class.kt")
    public void testClass() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/class.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithImplicitTypeInsideAnonymousObject.kt")
    public void testDelegateOverrideWithImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithImplicitTypeInsideAnonymousObjectWithSubstitution.kt")
    public void testDelegateOverrideWithImplicitTypeInsideAnonymousObjectWithSubstitution() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithImplicitTypeInsideAnonymousObjectWithSubstitution.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithImplicitTypeInsideClass.kt")
    public void testDelegateOverrideWithImplicitTypeInsideClass() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithImplicitTypeInsideClass.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithImplicitTypeInsideClassWithSubstitution.kt")
    public void testDelegateOverrideWithImplicitTypeInsideClassWithSubstitution() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithImplicitTypeInsideClassWithSubstitution.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
    public void testDelegateOverrideWithoutImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithoutImplicitTypeInsideAnonymousObjectWithSubstitution.kt")
    public void testDelegateOverrideWithoutImplicitTypeInsideAnonymousObjectWithSubstitution() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithoutImplicitTypeInsideAnonymousObjectWithSubstitution.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithoutImplicitTypeInsideClass.kt")
    public void testDelegateOverrideWithoutImplicitTypeInsideClass() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithoutImplicitTypeInsideClass.kt");
    }

    @Test
    @TestMetadata("delegateOverrideWithoutImplicitTypeInsideClassWithSubstitution.kt")
    public void testDelegateOverrideWithoutImplicitTypeInsideClassWithSubstitution() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithoutImplicitTypeInsideClassWithSubstitution.kt");
    }

    @Test
    @TestMetadata("intersectionOverride.kt")
    public void testIntersectionOverride() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/intersectionOverride.kt");
    }

    @Test
    @TestMetadata("intersectionOverride2.kt")
    public void testIntersectionOverride2() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/intersectionOverride2.kt");
    }

    @Test
    @TestMetadata("intersectionOverrideWithImplicitTypeInsideAnonymousObject.kt")
    public void testIntersectionOverrideWithImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/intersectionOverrideWithImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("intersectionOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
    public void testIntersectionOverrideWithoutImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/intersectionOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("localClass.kt")
    public void testLocalClass() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/localClass.kt");
    }

    @Test
    @TestMetadata("substitutionOverrideWithImplicitTypeInsideAnonymousObject.kt")
    public void testSubstitutionOverrideWithImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/substitutionOverrideWithImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("substitutionOverrideWithImplicitTypeInsideClass.kt")
    public void testSubstitutionOverrideWithImplicitTypeInsideClass() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/substitutionOverrideWithImplicitTypeInsideClass.kt");
    }

    @Test
    @TestMetadata("substitutionOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
    public void testSubstitutionOverrideWithoutImplicitTypeInsideAnonymousObject() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/substitutionOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
    }

    @Test
    @TestMetadata("substitutionOverrideWithoutImplicitTypeInsideClass.kt")
    public void testSubstitutionOverrideWithoutImplicitTypeInsideClass() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/substitutionOverrideWithoutImplicitTypeInsideClass.kt");
    }
}
