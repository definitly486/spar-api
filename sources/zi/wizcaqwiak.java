package zi;

import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.ArrayList;
import java.util.List;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public class wizcaqwiak {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final wizcaqwiak f130146zoijcleaow = lqeggnwhkg(igdgnonuha.f130043zoijcleaow);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final igdgnonuha f130147iobyxmoadg;

    static class iobyxmoadg implements tg.draadjrbmk {
        iobyxmoadg() {
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", ExternalMetricsManagerImpl.NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(ii.ppxfxbqfkf ppxfxbqfkfVar) {
            if (ppxfxbqfkfVar == null) {
                iobyxmoadg(0);
            }
            return Boolean.valueOf(!ppxfxbqfkfVar.equals(gh.ojitshcjhn.iobyxmoadg.f37341stevsuqkhv));
        }
    }

    private static final class ppxfxbqfkf extends Exception {
        public ppxfxbqfkf(String str) {
            super(str);
        }
    }

    private enum wkgbmnqykc {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f130152iobyxmoadg;

        static {
            int[] iArr = new int[wkgbmnqykc.values().length];
            f130152iobyxmoadg = iArr;
            try {
                iArr[wkgbmnqykc.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130152iobyxmoadg[wkgbmnqykc.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130152iobyxmoadg[wkgbmnqykc.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected wizcaqwiak(igdgnonuha igdgnonuhaVar) {
        if (igdgnonuhaVar == null) {
            iobyxmoadg(7);
        }
        this.f130147iobyxmoadg = igdgnonuhaVar;
    }

    private static iwxlajgraz draadjrbmk(kegysxyocb kegysxyocbVar, iwxlajgraz iwxlajgrazVar, jh.yfnezrywwk yfnezrywwkVar, iwxlajgraz iwxlajgrazVar2) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(26);
        }
        if (iwxlajgrazVar == null) {
            iobyxmoadg(27);
        }
        if (iwxlajgrazVar2 == null) {
            iobyxmoadg(28);
        }
        if (!kegysxyocbVar.getAnnotations().wizcaqwiak(gh.ojitshcjhn.iobyxmoadg.f37341stevsuqkhv)) {
            if (iwxlajgrazVar == null) {
                iobyxmoadg(29);
            }
            return iwxlajgrazVar;
        }
        zeieaojujs zeieaojujsVarGrlcpdaxtj = iwxlajgrazVar.getType().grlcpdaxtj();
        if (!(zeieaojujsVarGrlcpdaxtj instanceof aj.agtfadlqog)) {
            return iwxlajgrazVar;
        }
        iwxlajgraz iwxlajgrazVarPpxfxbqfkf = ((aj.agtfadlqog) zeieaojujsVarGrlcpdaxtj).ppxfxbqfkf();
        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = iwxlajgrazVarPpxfxbqfkf.ppxfxbqfkf();
        wkgbmnqykc wkgbmnqykcVarEablkybsjg = eablkybsjg(iwxlajgrazVar2.ppxfxbqfkf(), mhtqkkgtqmVarPpxfxbqfkf);
        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.OUT_IN_IN_POSITION;
        if (wkgbmnqykcVarEablkybsjg == wkgbmnqykcVar) {
            return new skhdrjzrfn(iwxlajgrazVarPpxfxbqfkf.getType());
        }
        return (yfnezrywwkVar != null && eablkybsjg(yfnezrywwkVar.draadjrbmk(), mhtqkkgtqmVarPpxfxbqfkf) == wkgbmnqykcVar) ? new skhdrjzrfn(iwxlajgrazVarPpxfxbqfkf.getType()) : iwxlajgrazVar;
    }

    private static kh.nufgyqmvbu dxjokdxxww(kh.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == null) {
            iobyxmoadg(33);
        }
        return !nufgyqmvbuVar.wizcaqwiak(gh.ojitshcjhn.iobyxmoadg.f37341stevsuqkhv) ? nufgyqmvbuVar : new kh.rgvfuqvkyq(nufgyqmvbuVar, new iobyxmoadg());
    }

    private static wkgbmnqykc eablkybsjg(mhtqkkgtqm mhtqkkgtqmVar, mhtqkkgtqm mhtqkkgtqmVar2) {
        mhtqkkgtqm mhtqkkgtqmVar3 = mhtqkkgtqm.IN_VARIANCE;
        if (mhtqkkgtqmVar == mhtqkkgtqmVar3 && mhtqkkgtqmVar2 == mhtqkkgtqm.OUT_VARIANCE) {
            return wkgbmnqykc.OUT_IN_IN_POSITION;
        }
        return (mhtqkkgtqmVar == mhtqkkgtqm.OUT_VARIANCE && mhtqkkgtqmVar2 == mhtqkkgtqmVar3) ? wkgbmnqykc.IN_IN_OUT_POSITION : wkgbmnqykc.NO_CONFLICT;
    }

    public static wizcaqwiak gxszxtbevo(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(6);
        }
        return lqeggnwhkg(nuxfzjnpeb.dxjokdxxww(kegysxyocbVar.grlcpdaxtj(), kegysxyocbVar.fyldjkxazc()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str;
        int i14;
        if (i13 != 1 && i13 != 2 && i13 != 8 && i13 != 34 && i13 != 37) {
            switch (i13) {
                default:
                    switch (i13) {
                        default:
                            switch (i13) {
                                default:
                                    switch (i13) {
                                        case 40:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case C4007z9.I /* 29 */:
                                case 30:
                                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case C4007z9.F /* 25 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 1 && i13 != 2 && i13 != 8 && i13 != 34 && i13 != 37) {
            switch (i13) {
                case 11:
                case 12:
                case 13:
                    i14 = 2;
                    break;
                default:
                    switch (i13) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case C4007z9.F /* 25 */:
                            i14 = 2;
                            break;
                        default:
                            switch (i13) {
                                case C4007z9.I /* 29 */:
                                case 30:
                                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                case 32:
                                    i14 = 2;
                                    break;
                                default:
                                    switch (i13) {
                                        case 40:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case 42:
                                            i14 = 2;
                                            break;
                                        default:
                                            i14 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case C4007z9.G /* 26 */:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case C4007z9.J /* 35 */:
            case C4007z9.K /* 38 */:
                objArr[0] = "typeParameterVariance";
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[0] = "projectionKind";
                break;
        }
        if (i13 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i13 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i13 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i13 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i13 != 37) {
            switch (i13) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i13) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case C4007z9.F /* 25 */:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i13) {
                                case C4007z9.I /* 29 */:
                                case 30:
                                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i13) {
                                        case 40:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i13) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 8 && i13 != 34 && i13 != 37) {
            switch (i13) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i13) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case C4007z9.F /* 25 */:
                            break;
                        default:
                            switch (i13) {
                                case C4007z9.I /* 29 */:
                                case 30:
                                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                case 32:
                                    break;
                                default:
                                    switch (i13) {
                                        case 40:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private List kcexrzcfyt(List list, List list2, int i13) throws ppxfxbqfkf {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z13 = false;
        for (int i14 = 0; i14 < list.size(); i14++) {
            jh.yfnezrywwk yfnezrywwkVar = (jh.yfnezrywwk) list.get(i14);
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) list2.get(i14);
            iwxlajgraz iwxlajgrazVarYggfygwlhe = yggfygwlhe(iwxlajgrazVar, yfnezrywwkVar, i13 + 1);
            int i15 = zoijcleaow.f130152iobyxmoadg[eablkybsjg(yfnezrywwkVar.draadjrbmk(), iwxlajgrazVarYggfygwlhe.ppxfxbqfkf()).ordinal()];
            if (i15 == 1 || i15 == 2) {
                iwxlajgrazVarYggfygwlhe = ageimvtcrz.kcexrzcfyt(yfnezrywwkVar);
            } else if (i15 == 3) {
                mhtqkkgtqm mhtqkkgtqmVarDraadjrbmk = yfnezrywwkVar.draadjrbmk();
                mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.INVARIANT;
                if (mhtqkkgtqmVarDraadjrbmk != mhtqkkgtqmVar && !iwxlajgrazVarYggfygwlhe.zoijcleaow()) {
                    iwxlajgrazVarYggfygwlhe = new skhdrjzrfn(mhtqkkgtqmVar, iwxlajgrazVarYggfygwlhe.getType());
                }
            }
            if (iwxlajgrazVarYggfygwlhe != iwxlajgrazVar) {
                z13 = true;
            }
            arrayList.add(iwxlajgrazVarYggfygwlhe);
        }
        return !z13 ? list2 : arrayList;
    }

    public static wizcaqwiak lqeggnwhkg(igdgnonuha igdgnonuhaVar) {
        if (igdgnonuhaVar == null) {
            iobyxmoadg(0);
        }
        return new wizcaqwiak(igdgnonuhaVar);
    }

    public static wizcaqwiak nufgyqmvbu(igdgnonuha igdgnonuhaVar, igdgnonuha igdgnonuhaVar2) {
        if (igdgnonuhaVar == null) {
            iobyxmoadg(3);
        }
        if (igdgnonuhaVar2 == null) {
            iobyxmoadg(4);
        }
        return lqeggnwhkg(cdpycssgdh.dxjokdxxww(igdgnonuhaVar, igdgnonuhaVar2));
    }

    private static String ojitshcjhn(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (jj.wkgbmnqykc.iobyxmoadg(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    private iwxlajgraz oxmwwwfdhm(iwxlajgraz iwxlajgrazVar, int i13) {
        kegysxyocb type = iwxlajgrazVar.getType();
        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = iwxlajgrazVar.ppxfxbqfkf();
        if (type.grlcpdaxtj().wkgbmnqykc() instanceof jh.yfnezrywwk) {
            return iwxlajgrazVar;
        }
        ikoacuggdj ikoacuggdjVarZoijcleaow = metgxyhuhe.zoijcleaow(type);
        kegysxyocb kegysxyocbVarRgvfuqvkyq = ikoacuggdjVarZoijcleaow != null ? wflxmlrfwp().rgvfuqvkyq(ikoacuggdjVarZoijcleaow, mhtqkkgtqm.INVARIANT) : null;
        kegysxyocb kegysxyocbVarZoijcleaow = lxfrhoxuzk.zoijcleaow(type, kcexrzcfyt(type.grlcpdaxtj().getParameters(), type.fyldjkxazc(), i13), this.f130147iobyxmoadg.wkgbmnqykc(type.getAnnotations()));
        if ((kegysxyocbVarZoijcleaow instanceof ikoacuggdj) && (kegysxyocbVarRgvfuqvkyq instanceof ikoacuggdj)) {
            kegysxyocbVarZoijcleaow = metgxyhuhe.btonecajqb((ikoacuggdj) kegysxyocbVarZoijcleaow, (ikoacuggdj) kegysxyocbVarRgvfuqvkyq);
        }
        return new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, kegysxyocbVarZoijcleaow);
    }

    public static mhtqkkgtqm ppxfxbqfkf(mhtqkkgtqm mhtqkkgtqmVar, iwxlajgraz iwxlajgrazVar) {
        if (mhtqkkgtqmVar == null) {
            iobyxmoadg(35);
        }
        if (iwxlajgrazVar == null) {
            iobyxmoadg(36);
        }
        if (!iwxlajgrazVar.zoijcleaow()) {
            return wkgbmnqykc(mhtqkkgtqmVar, iwxlajgrazVar.ppxfxbqfkf());
        }
        mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.OUT_VARIANCE;
        if (mhtqkkgtqmVar2 == null) {
            iobyxmoadg(37);
        }
        return mhtqkkgtqmVar2;
    }

    public static mhtqkkgtqm wkgbmnqykc(mhtqkkgtqm mhtqkkgtqmVar, mhtqkkgtqm mhtqkkgtqmVar2) {
        if (mhtqkkgtqmVar == null) {
            iobyxmoadg(38);
        }
        if (mhtqkkgtqmVar2 == null) {
            iobyxmoadg(39);
        }
        mhtqkkgtqm mhtqkkgtqmVar3 = mhtqkkgtqm.INVARIANT;
        if (mhtqkkgtqmVar == mhtqkkgtqmVar3) {
            if (mhtqkkgtqmVar2 == null) {
                iobyxmoadg(40);
            }
            return mhtqkkgtqmVar2;
        }
        if (mhtqkkgtqmVar2 == mhtqkkgtqmVar3) {
            if (mhtqkkgtqmVar == null) {
                iobyxmoadg(41);
            }
            return mhtqkkgtqmVar;
        }
        if (mhtqkkgtqmVar == mhtqkkgtqmVar2) {
            if (mhtqkkgtqmVar2 == null) {
                iobyxmoadg(42);
            }
            return mhtqkkgtqmVar2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + mhtqkkgtqmVar + "' and projection kind '" + mhtqkkgtqmVar2 + "' cannot be combined");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private iwxlajgraz yggfygwlhe(iwxlajgraz iwxlajgrazVar, jh.yfnezrywwk yfnezrywwkVar, int i13) throws ppxfxbqfkf {
        if (iwxlajgrazVar == null) {
            iobyxmoadg(18);
        }
        zoijcleaow(i13, iwxlajgrazVar, this.f130147iobyxmoadg);
        if (iwxlajgrazVar.zoijcleaow()) {
            return iwxlajgrazVar;
        }
        kegysxyocb type = iwxlajgrazVar.getType();
        if (type instanceof fyldjkxazc) {
            fyldjkxazc fyldjkxazcVar = (fyldjkxazc) type;
            grlcpdaxtj grlcpdaxtjVarWizcaqwiak = fyldjkxazcVar.wizcaqwiak();
            kegysxyocb kegysxyocbVarMetgxyhuhe = fyldjkxazcVar.metgxyhuhe();
            iwxlajgraz iwxlajgrazVarYggfygwlhe = yggfygwlhe(new skhdrjzrfn(iwxlajgrazVar.ppxfxbqfkf(), grlcpdaxtjVarWizcaqwiak), yfnezrywwkVar, i13 + 1);
            return iwxlajgrazVarYggfygwlhe.zoijcleaow() ? iwxlajgrazVarYggfygwlhe : new skhdrjzrfn(iwxlajgrazVarYggfygwlhe.ppxfxbqfkf(), ipoelvxyzq.wkgbmnqykc(iwxlajgrazVarYggfygwlhe.getType().jrbgnlbqoe(), rgvfuqvkyq(kegysxyocbVarMetgxyhuhe, iwxlajgrazVar.ppxfxbqfkf())));
        }
        if (!yadqdtsiqt.iobyxmoadg(type) && !(type.jrbgnlbqoe() instanceof jhduphickx)) {
            iwxlajgraz iwxlajgrazVarEablkybsjg = this.f130147iobyxmoadg.eablkybsjg(type);
            iwxlajgraz iwxlajgrazVarDraadjrbmk = iwxlajgrazVarEablkybsjg != null ? draadjrbmk(type, iwxlajgrazVarEablkybsjg, yfnezrywwkVar, iwxlajgrazVar) : null;
            mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = iwxlajgrazVar.ppxfxbqfkf();
            if (iwxlajgrazVarDraadjrbmk == null && jpowsppfya.zoijcleaow(type) && !weqkydbzbr.zoijcleaow(type)) {
                ylkuphrtab ylkuphrtabVarIobyxmoadg = jpowsppfya.iobyxmoadg(type);
                int i14 = i13 + 1;
                iwxlajgraz iwxlajgrazVarYggfygwlhe2 = yggfygwlhe(new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, ylkuphrtabVarIobyxmoadg.eslsurpljm()), yfnezrywwkVar, i14);
                iwxlajgraz iwxlajgrazVarYggfygwlhe3 = yggfygwlhe(new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, ylkuphrtabVarIobyxmoadg.krqnebusok()), yfnezrywwkVar, i14);
                return (iwxlajgrazVarYggfygwlhe2.getType() == ylkuphrtabVarIobyxmoadg.eslsurpljm() && iwxlajgrazVarYggfygwlhe3.getType() == ylkuphrtabVarIobyxmoadg.krqnebusok()) ? iwxlajgrazVar : new skhdrjzrfn(iwxlajgrazVarYggfygwlhe2.ppxfxbqfkf(), ntlheqmsrt.eablkybsjg(lxfrhoxuzk.iobyxmoadg(iwxlajgrazVarYggfygwlhe2.getType()), lxfrhoxuzk.iobyxmoadg(iwxlajgrazVarYggfygwlhe3.getType())));
            }
            if (!gh.dxjokdxxww.zfvoamnweg(type) && !ulzqkzuiru.iobyxmoadg(type)) {
                if (iwxlajgrazVarDraadjrbmk != null) {
                    wkgbmnqykc wkgbmnqykcVarEablkybsjg = eablkybsjg(mhtqkkgtqmVarPpxfxbqfkf, iwxlajgrazVarDraadjrbmk.ppxfxbqfkf());
                    if (!mi.eablkybsjg.gxszxtbevo(type)) {
                        int i15 = zoijcleaow.f130152iobyxmoadg[wkgbmnqykcVarEablkybsjg.ordinal()];
                        if (i15 == 1) {
                            throw new ppxfxbqfkf("Out-projection in in-position");
                        }
                        if (i15 == 2) {
                            return new skhdrjzrfn(mhtqkkgtqm.OUT_VARIANCE, type.grlcpdaxtj().wflxmlrfwp().ylkuphrtab());
                        }
                    }
                    iwizpuwonk iwizpuwonkVarIobyxmoadg = weqkydbzbr.iobyxmoadg(type);
                    if (iwxlajgrazVarDraadjrbmk.zoijcleaow()) {
                        return iwxlajgrazVarDraadjrbmk;
                    }
                    kegysxyocb kegysxyocbVarUawqvzlxes = iwizpuwonkVarIobyxmoadg != null ? iwizpuwonkVarIobyxmoadg.uawqvzlxes(iwxlajgrazVarDraadjrbmk.getType()) : ageimvtcrz.vdvldrhtss(iwxlajgrazVarDraadjrbmk.getType(), type.mhtqkkgtqm());
                    if (!type.getAnnotations().isEmpty()) {
                        kegysxyocbVarUawqvzlxes = ej.wkgbmnqykc.istkbnxepw(kegysxyocbVarUawqvzlxes, new kh.ojitshcjhn(kegysxyocbVarUawqvzlxes.getAnnotations(), dxjokdxxww(this.f130147iobyxmoadg.wkgbmnqykc(type.getAnnotations()))));
                    }
                    if (wkgbmnqykcVarEablkybsjg == wkgbmnqykc.NO_CONFLICT) {
                        mhtqkkgtqmVarPpxfxbqfkf = wkgbmnqykc(mhtqkkgtqmVarPpxfxbqfkf, iwxlajgrazVarDraadjrbmk.ppxfxbqfkf());
                    }
                    return new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, kegysxyocbVarUawqvzlxes);
                }
                iwxlajgrazVar = oxmwwwfdhm(iwxlajgrazVar, i13);
                if (iwxlajgrazVar == null) {
                    iobyxmoadg(25);
                }
            }
        }
        return iwxlajgrazVar;
    }

    private static void zoijcleaow(int i13, iwxlajgraz iwxlajgrazVar, igdgnonuha igdgnonuhaVar) {
        if (i13 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + ojitshcjhn(iwxlajgrazVar) + "; substitution: " + ojitshcjhn(igdgnonuhaVar));
    }

    public kegysxyocb agtfadlqog(kegysxyocb kegysxyocbVar, mhtqkkgtqm mhtqkkgtqmVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(9);
        }
        if (mhtqkkgtqmVar == null) {
            iobyxmoadg(10);
        }
        if (gtknphoqwx()) {
            if (kegysxyocbVar == null) {
                iobyxmoadg(11);
            }
            return kegysxyocbVar;
        }
        try {
            kegysxyocb type = yggfygwlhe(new skhdrjzrfn(mhtqkkgtqmVar, kegysxyocbVar), null, 0).getType();
            if (type == null) {
                iobyxmoadg(12);
            }
            return type;
        } catch (ppxfxbqfkf e13) {
            bj.dxjokdxxww dxjokdxxwwVarWkgbmnqykc = bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16492sopmlzcsov, e13.getMessage());
            if (dxjokdxxwwVarWkgbmnqykc == null) {
                iobyxmoadg(13);
            }
            return dxjokdxxwwVarWkgbmnqykc;
        }
    }

    public igdgnonuha btonecajqb() {
        igdgnonuha igdgnonuhaVar = this.f130147iobyxmoadg;
        if (igdgnonuhaVar == null) {
            iobyxmoadg(8);
        }
        return igdgnonuhaVar;
    }

    public boolean gtknphoqwx() {
        return this.f130147iobyxmoadg.gxszxtbevo();
    }

    public kegysxyocb rgvfuqvkyq(kegysxyocb kegysxyocbVar, mhtqkkgtqm mhtqkkgtqmVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(14);
        }
        if (mhtqkkgtqmVar == null) {
            iobyxmoadg(15);
        }
        iwxlajgraz iwxlajgrazVarVdvldrhtss = vdvldrhtss(new skhdrjzrfn(mhtqkkgtqmVar, btonecajqb().lqeggnwhkg(kegysxyocbVar, mhtqkkgtqmVar)));
        if (iwxlajgrazVarVdvldrhtss == null) {
            return null;
        }
        return iwxlajgrazVarVdvldrhtss.getType();
    }

    public iwxlajgraz vdvldrhtss(iwxlajgraz iwxlajgrazVar) {
        if (iwxlajgrazVar == null) {
            iobyxmoadg(16);
        }
        iwxlajgraz iwxlajgrazVarZdlpuopuiu = zdlpuopuiu(iwxlajgrazVar);
        return (this.f130147iobyxmoadg.iobyxmoadg() || this.f130147iobyxmoadg.zoijcleaow()) ? fj.ppxfxbqfkf.wkgbmnqykc(iwxlajgrazVarZdlpuopuiu, this.f130147iobyxmoadg.zoijcleaow()) : iwxlajgrazVarZdlpuopuiu;
    }

    public wizcaqwiak wflxmlrfwp() {
        igdgnonuha igdgnonuhaVar = this.f130147iobyxmoadg;
        return ((igdgnonuhaVar instanceof hkdspvbjdz) && igdgnonuhaVar.zoijcleaow()) ? new wizcaqwiak(new hkdspvbjdz(((hkdspvbjdz) this.f130147iobyxmoadg).btonecajqb(), ((hkdspvbjdz) this.f130147iobyxmoadg).dxjokdxxww(), false)) : this;
    }

    public iwxlajgraz zdlpuopuiu(iwxlajgraz iwxlajgrazVar) {
        if (iwxlajgrazVar == null) {
            iobyxmoadg(17);
        }
        if (gtknphoqwx()) {
            return iwxlajgrazVar;
        }
        try {
            return yggfygwlhe(iwxlajgrazVar, null, 0);
        } catch (ppxfxbqfkf unused) {
            return null;
        }
    }
}
