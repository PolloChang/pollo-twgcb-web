ruleset {

    description '''
    A Sample Groovy RuleSet containing all CodeNarc Rules, grouped by category.
    You can use this as a template for your own custom RuleSet.
    Just delete the rules that you don't want to include.
    https://codenarc.org/StarterRuleSet-AllRulesByCategory.groovy.txt
    '''


    //ruleset('rulesets/basic.xml')
    AssertWithinFinallyBlock
    AssignmentInConditional
    BigDecimalInstantiation
    BitwiseOperatorInConditional
    BooleanGetBoolean
    BrokenNullCheck
    BrokenOddnessCheck
    ClassForName
    ComparisonOfTwoConstants
    ComparisonWithSelf
    ConstantAssertExpression
    ConstantIfExpression
    ConstantTernaryExpression
    DeadCode
    DoubleNegative
    DuplicateCaseStatement
    DuplicateMapKey
    DuplicateSetValue
    EmptyCatchBlock
    EmptyClass{
        priority = 3
    }
    EmptyElseBlock
    EmptyFinallyBlock
    EmptyForStatement
    EmptyIfStatement
    EmptyInstanceInitializer
    EmptyMethod{
        priority = 3
    }
    EmptyStaticInitializer
    EmptySwitchStatement
    EmptySynchronizedStatement
    EmptyTryBlock
    EmptyWhileStatement
    EqualsAndHashCode
    EqualsOverloaded
    ExplicitGarbageCollection
    ForLoopShouldBeWhileLoop
    HardCodedWindowsFileSeparator
    HardCodedWindowsRootDirectory
    IntegerGetInteger
    MultipleUnaryOperators
    ParameterAssignmentInFilterClosure
    RandomDoubleCoercedToZero
    RemoveAllOnSelf
    ReturnFromFinallyBlock
    ThrowExceptionFromFinallyBlock

    // rulesets/braces.xml
    ElseBlockBraces
    ForStatementBraces
    IfStatementBraces{
        priority = 3
    }
    WhileStatementBraces

    // rulesets/comments.xml
    ClassJavadoc{
//    priority = 3
    }
    JavadocConsecutiveEmptyLines{
//        priority = 3
    }
    JavadocEmptyAuthorTag{
//        priority = 3
    }
    JavadocEmptyExceptionTag{
//        priority = 3
    }
    JavadocEmptyFirstLine{
//        priority = 3
    }
    JavadocEmptyLastLine{
//        priority = 3
    }
    JavadocEmptyParamTag{
//        priority = 3
    }
    JavadocEmptyReturnTag{
//        priority = 3
    }
    JavadocEmptySeeTag{
//        priority = 3
    }
    JavadocEmptySinceTag{
//        priority = 3
    }
    JavadocEmptyThrowsTag{
//        priority = 3
    }
    JavadocEmptyVersionTag{
//        priority = 3
    }
    JavadocMissingExceptionDescription
    JavadocMissingParamDescription{
//        priority = 3
    }
    JavadocMissingThrowsDescription{
//        priority = 3
    }

    // rulesets/concurrency.xml
    BusyWait
    DoubleCheckedLocking
    InconsistentPropertyLocking
    InconsistentPropertySynchronization
    NestedSynchronization
    StaticCalendarField
    StaticConnection
    StaticDateFormatField
    StaticMatcherField
    StaticSimpleDateFormatField
    SynchronizedMethod
    SynchronizedOnBoxedPrimitive
    SynchronizedOnGetClass
    SynchronizedOnReentrantLock
    SynchronizedOnString
    SynchronizedOnThis
    SynchronizedReadObjectMethod
    SystemRunFinalizersOnExit
    ThisReferenceEscapesConstructor
    ThreadGroup
    ThreadLocalNotStaticFinal
    ThreadYield
    UseOfNotifyMethod
    VolatileArrayField
    VolatileLongOrDoubleField
    WaitOutsideOfWhileLoop

    // rulesets/convention.xml
    //CompileStatic
    ConfusingTernary{
        priority = 3
    }
    CouldBeElvis{
        priority = 3
    }
    CouldBeSwitchStatement{
        priority = 3
    }
    FieldTypeRequired{
        enabled = true
    }
    HashtableIsObsolete
    IfStatementCouldBeTernary
    ImplicitClosureParameter{
        enabled = true
    }
    ImplicitReturnStatement
    InvertedCondition
    InvertedIfElse{
        enabled = true
    }
    LongLiteralWithLowerCaseL
    MethodParameterTypeRequired{

    }
    MethodReturnTypeRequired{
        enabled = true
    }
    NoDef{
        enabled = false
    }
    NoDouble{
        priority = 3
    }
    NoFloat{
        priority = 3
    }
    NoJavaUtilDate{
        priority = 3
    }
    NoTabCharacter{
        enabled = true
    }
    ParameterReassignment{
        priority = 3
    }
    PublicMethodsBeforeNonPublicMethods{
        priority = 3
    }
    StaticFieldsBeforeInstanceFields{
        enabled = true
    }
    StaticMethodsBeforeInstanceMethods{
        priority = 3
    }
    TernaryCouldBeElvis
    TrailingComma{
        enabled = true
    }
    VariableTypeRequired{
        enabled = true
    }
    VectorIsObsolete

    // rulesets/design.xml
    AbstractClassWithPublicConstructor
    AbstractClassWithoutAbstractMethod
    AssignmentToStaticFieldFromInstanceMethod
    BooleanMethodReturnsNull
    BuilderMethodWithSideEffects{
    }
    CloneableWithoutClone
    CloseWithoutCloseable
    CompareToWithoutComparable
    ConstantsOnlyInterface
    EmptyMethodInAbstractClass
    FinalClassWithProtectedMember
    //    ImplementationAsType{
    //        enabled = true
    //    }
    Instanceof{
    }
    LocaleSetDefault
    NestedForLoop{
        enabled = true
    }
    OptionalCollectionReturnType
    OptionalField
    OptionalMethodParameter
    PrivateFieldCouldBeFinal{
    }
    PublicInstanceField
    ReturnsNullInsteadOfEmptyArray
    ReturnsNullInsteadOfEmptyCollection
    SimpleDateFormatMissingLocale{
    }
    StatelessSingleton
    ToStringReturnsNull

    // rulesets/dry.xml
    DuplicateListLiteral{
        enabled = true
    }
    DuplicateMapLiteral{
        enabled = true
    }
    DuplicateNumberLiteral{
        enabled = true
    }
    DuplicateStringLiteral{
        enabled = true
    }

    // rulesets/enhanced.xml
    CloneWithoutCloneable
    JUnitAssertEqualsConstantActualValue
    MissingOverrideAnnotation
    UnsafeImplementationAsMap

    // rulesets/exceptions.xml
    CatchArrayIndexOutOfBoundsException
    CatchError
    CatchException{
    }
    CatchIllegalMonitorStateException{
    }
    CatchIndexOutOfBoundsException{
    }
    CatchNullPointerException{
    }
    CatchRuntimeException
    CatchThrowable
    ConfusingClassNamedException
    ExceptionExtendsError
    ExceptionExtendsThrowable
    ExceptionNotThrown
    MissingNewInThrowStatement
    ReturnNullFromCatchBlock
    SwallowThreadDeath
    ThrowError
    ThrowException{
    }
    ThrowNullPointerException
    ThrowRuntimeException{
    }
    ThrowThrowable

    // rulesets/formatting.xml
    BlankLineBeforePackage
    BlockEndsWithBlankLine{
    }
    BlockStartsWithBlankLine{
    }
    BracesForClass
    BracesForForLoop
    BracesForIfElse
    BracesForMethod
    BracesForTryCatchFinally
    ClassEndsWithBlankLine{
    }
    ClassStartsWithBlankLine{
    }
    ClosureStatementOnOpeningLineOfMultipleLineClosure{
    }
    ConsecutiveBlankLines{
        enabled = true
    }
    FileEndsWithoutNewline{
        enabled = true
    }
    Indentation{
        enabled = true
    }
    LineLength{
        enabled = true
    }
    MissingBlankLineAfterImports
    MissingBlankLineAfterPackage
    MissingBlankLineBeforeAnnotatedField{
        enabled = true
    }
    SpaceAfterCatch{
        priority = 3
    }
    SpaceAfterClosingBrace{
        enabled = true
    }
    SpaceAfterComma{
        enabled = true
    }
    SpaceAfterFor{
        priority = 3
    }
    SpaceAfterIf{
        enabled = true
    }
    SpaceAfterMethodCallName{
        enabled = true
    }
    SpaceAfterMethodDeclarationName{
        enabled = true
    }
    SpaceAfterNotOperator
    SpaceAfterOpeningBrace{
        priority = 3
    }
    SpaceAfterSemicolon{
        priority = 3
    }
    SpaceAfterSwitch{
        priority = 3
    }
    SpaceAfterWhile{
        priority = 3
    }
    SpaceAroundClosureArrow{
        priority = 3
    }
    SpaceAroundMapEntryColon{
        enabled = true
    }
    SpaceAroundOperator{
        priority = 3
    }
    SpaceBeforeClosingBrace{
        priority = 3
    }
    SpaceBeforeOpeningBrace{
        priority = 3
    }
    SpaceInsideParentheses{
        enabled = true
    }
    TrailingWhitespace{
        enabled = true
    }

    // rulesets/generic.xml
    IllegalClassMember
    IllegalClassReference
    IllegalPackageReference
    IllegalRegex
    IllegalString
    IllegalSubclass
    RequiredRegex
    RequiredString
    StatelessClass

    // rulesets/grails.xml
    GrailsDomainGormMethods
    GrailsDomainHasEquals{
        enabled = true
    }
    GrailsDomainHasToString{
        enabled = true
    }
    GrailsDomainReservedSqlKeywordName{
        enabled = true
    }
    GrailsDomainStringPropertyMaxSize{
        enabled = true
    }
    GrailsDomainWithServiceReference{
        priority = 3
    }
    GrailsDuplicateConstraint
    GrailsDuplicateMapping{
        enabled = true
    }
    GrailsMassAssignment{
        priority = 3
    }
    GrailsPublicControllerMethod
    GrailsServletContextReference{
        priority = 3
    }
    GrailsStatelessService{
        priority = 3
    }

    // rulesets/groovyism.xml
    AssignCollectionSort
    AssignCollectionUnique{
        priority = 3
    }
    ClosureAsLastMethodParameter{
        priority = 3
    }
    CollectAllIsDeprecated
    ConfusingMultipleReturns
    ExplicitArrayListInstantiation
    ExplicitCallToAndMethod
    ExplicitCallToCompareToMethod
    ExplicitCallToDivMethod
    ExplicitCallToEqualsMethod{
        priority = 3
    }
    ExplicitCallToGetAtMethod{
        priority = 3
    }
    ExplicitCallToLeftShiftMethod
    ExplicitCallToMinusMethod
    ExplicitCallToModMethod
    ExplicitCallToMultiplyMethod
    ExplicitCallToOrMethod
    ExplicitCallToPlusMethod{
        priority = 3
    }
    ExplicitCallToPowerMethod
    ExplicitCallToPutAtMethod{
        priority = 3
    }
    ExplicitCallToRightShiftMethod
    ExplicitCallToXorMethod
    ExplicitHashMapInstantiation
    ExplicitHashSetInstantiation
    ExplicitLinkedHashMapInstantiation
    ExplicitLinkedListInstantiation
    ExplicitStackInstantiation
    ExplicitTreeSetInstantiation
    GStringAsMapKey{
        enabled = true
    }
    GStringExpressionWithinString{
        enabled = true
    }
    GetterMethodCouldBeProperty
    GroovyLangImmutable
    UseCollectMany
    UseCollectNested

    // rulesets/imports.xml
    DuplicateImport
    ImportFromSamePackage
    ImportFromSunPackages
    MisorderedStaticImports
    UnnecessaryGroovyImport
    UnusedImport

    // rulesets/jdbc.xml
    DirectConnectionManagement
    JdbcConnectionReference
    JdbcResultSetReference{
        priority = 3
    }
    JdbcStatementReference

    // rulesets/junit.xml
    ChainedTest
    CoupledTestCase
    JUnitAssertAlwaysFails
    JUnitAssertAlwaysSucceeds
    JUnitFailWithoutMessage
    JUnitLostTest
    JUnitPublicField
    JUnitPublicNonTestMethod
    JUnitPublicProperty
    JUnitSetUpCallsSuper
    JUnitStyleAssertions
    JUnitTearDownCallsSuper
    JUnitTestMethodWithoutAssert
    JUnitUnnecessarySetUp
    JUnitUnnecessaryTearDown
    JUnitUnnecessaryThrowsException
    SpockIgnoreRestUsed
    UnnecessaryFail
    UseAssertEqualsInsteadOfAssertTrue
    UseAssertFalseInsteadOfNegation
    UseAssertNullInsteadOfAssertEquals
    UseAssertSameInsteadOfAssertTrue
    UseAssertTrueInsteadOfAssertEquals
    UseAssertTrueInsteadOfNegation

    // rulesets/logging.xml
    LoggerForDifferentClass
    LoggerWithWrongModifiers
    LoggingSwallowsStacktrace
    MultipleLoggers
    PrintStackTrace{
        priority = 1
    }
    Println
    SystemErrPrint
    SystemOutPrint

    // rulesets/naming.xml
    AbstractClassName
    ClassName
    ClassNameSameAsFilename
    ClassNameSameAsSuperclass
    ConfusingMethodName{
        priority = 3
    }
    FactoryMethodName{
        priority = 3
    }
    FieldName
    InterfaceName
    InterfaceNameSameAsSuperInterface
    MethodName{
        priority = 3
    }
    ObjectOverrideMisspelledMethodName
    PackageName
    PackageNameMatchesFilePath
    ParameterName{
        priority = 3
    }
    PropertyName{
        enabled = true
    }
    VariableName{
        enabled = true
    }

    // rulesets/security.xml
    FileCreateTempFile{
        enabled = true
    }
    InsecureRandom
    JavaIoPackageAccess{
        enabled = true
    }
    NonFinalPublicField
    NonFinalSubclassOfSensitiveInterface
    ObjectFinalize
    PublicFinalizeMethod
    SystemExit
    UnsafeArrayDeclaration

    // rulesets/serialization.xml
    EnumCustomSerializationIgnored
    SerialPersistentFields
    SerialVersionUID
    SerializableClassMustDefineSerialVersionUID{
        priority = 3
    }

    // rulesets/size.xml
    //AbcMetric   // Requires the GMetrics jar
    ClassSize{
        maxLines = 3000
    }
    CrapMetric   // Requires the GMetrics jar and a Cobertura coverage file
    CyclomaticComplexity{ // Requires the GMetrics jar
        enabled = true
    }
    MethodCount{
        priority = 3
    }
    MethodSize{
        priority = 3
    }
    NestedBlockDepth{
        priority = 3
    }
    ParameterCount{
        priority = 3
    }

    // rulesets/unnecessary.xml
    AddEmptyString{
        priority = 3
    }
    ConsecutiveLiteralAppends
    ConsecutiveStringConcatenation
    UnnecessaryBigDecimalInstantiation
    UnnecessaryBigIntegerInstantiation
    UnnecessaryBooleanExpression
    UnnecessaryBooleanInstantiation
    UnnecessaryCallForLastElement
    UnnecessaryCallToSubstring
    UnnecessaryCast
    UnnecessaryCatchBlock
    UnnecessaryCollectCall{
        priority = 3
    }
    UnnecessaryCollectionCall
    UnnecessaryConstructor
    UnnecessaryDefInFieldDeclaration
    UnnecessaryDefInMethodDeclaration
    UnnecessaryDefInVariableDeclaration
    UnnecessaryDotClass{
        enabled = true
    }
    UnnecessaryDoubleInstantiation
    UnnecessaryElseStatement{
        priority = 3
    }
    UnnecessaryFinalOnPrivateMethod
    UnnecessaryFloatInstantiation
    UnnecessaryGString{
        enabled = true
    }
    UnnecessaryGetter{
        priority = 3
    }
    UnnecessaryIfStatement{
        priority = 3
    }
    UnnecessaryInstanceOfCheck
    UnnecessaryInstantiationToGetClass
    UnnecessaryIntegerInstantiation
    UnnecessaryLongInstantiation
    UnnecessaryModOne
    UnnecessaryNullCheck
    UnnecessaryNullCheckBeforeInstanceOf
    UnnecessaryObjectReferences{
        priority = 3
    }
    UnnecessaryOverridingMethod
    UnnecessaryPackageReference{
        priority = 3
    }
    UnnecessaryParenthesesForMethodCallWithClosure{
        priority = 3
    }
    UnnecessaryPublicModifier
    UnnecessaryReturnKeyword{
        priority = 3
    }
    UnnecessarySafeNavigationOperator{
        priority = 3
    }
    UnnecessarySelfAssignment
    UnnecessarySemicolon{
        priority = 3
    }
    UnnecessarySetter{
        priority = 3
    }
    UnnecessaryStringInstantiation
    UnnecessaryTernaryExpression
    UnnecessaryToString{
        priority = 3
    }
    UnnecessaryTransientModifier{
        priority = 3
    }

    // rulesets/unused.xml
    UnusedArray
    UnusedMethodParameter{
        enabled = true
    }
    UnusedObject
    UnusedPrivateField
    UnusedPrivateMethod
    UnusedPrivateMethodParameter
    UnusedVariable{
        priority = 3
    }

}
