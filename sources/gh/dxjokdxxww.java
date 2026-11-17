package gh;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jh.crxdokpmqz;
import jh.esjtqupxsv;
import jh.hkdspvbjdz;
import jh.jlmebxxoox;
import jh.lmojexxdyd;
import jh.ribwqtqdhb;
import mh.iozdgvuglv;
import zi.ageimvtcrz;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.iyctptxqzt;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.ntlheqmsrt;
import zi.skhdrjzrfn;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final ii.gxszxtbevo f37212lqeggnwhkg = ii.gxszxtbevo.dxjokdxxww("<built-ins module>");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yi.lqeggnwhkg f37213eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yi.agtfadlqog f37214gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private iozdgvuglv f37215iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yi.dxjokdxxww f37216ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yi.dxjokdxxww f37217wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private yi.dxjokdxxww f37218zoijcleaow;

    private static class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Map f37219iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final Map f37220ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final Map f37221zoijcleaow;

        /* synthetic */ eablkybsjg(Map map, Map map2, Map map3, iobyxmoadg iobyxmoadgVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            Object[] objArr = new Object[3];
            if (i13 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i13 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private eablkybsjg(Map map, Map map2, Map map3) {
            if (map == null) {
                iobyxmoadg(0);
            }
            if (map2 == null) {
                iobyxmoadg(1);
            }
            if (map3 == null) {
                iobyxmoadg(2);
            }
            this.f37219iobyxmoadg = map;
            this.f37221zoijcleaow = map2;
            this.f37220ppxfxbqfkf = map3;
        }
    }

    class iobyxmoadg implements tg.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            return Arrays.asList(dxjokdxxww.this.oxmwwwfdhm().wwaezpbzkn(ojitshcjhn.f37261pmvmpeiblj), dxjokdxxww.this.oxmwwwfdhm().wwaezpbzkn(ojitshcjhn.f37251istkbnxepw), dxjokdxxww.this.oxmwwwfdhm().wwaezpbzkn(ojitshcjhn.f37241cdpycssgdh), dxjokdxxww.this.oxmwwwfdhm().wwaezpbzkn(ojitshcjhn.f37272zynmafqrjb));
        }
    }

    class ppxfxbqfkf implements tg.draadjrbmk {
        ppxfxbqfkf() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public jh.eablkybsjg invoke(ii.gxszxtbevo gxszxtbevoVar) {
            jh.nufgyqmvbu nufgyqmvbuVarEablkybsjg = dxjokdxxww.this.kcexrzcfyt().eablkybsjg(gxszxtbevoVar, rh.wkgbmnqykc.FROM_BUILTINS);
            if (nufgyqmvbuVarEablkybsjg == null) {
                throw new AssertionError("Built-in class " + ojitshcjhn.f37261pmvmpeiblj.ppxfxbqfkf(gxszxtbevoVar) + " is not found");
            }
            if (nufgyqmvbuVarEablkybsjg instanceof jh.eablkybsjg) {
                return (jh.eablkybsjg) nufgyqmvbuVarEablkybsjg;
            }
            throw new AssertionError("Must be a class descriptor " + gxszxtbevoVar + ", but was " + nufgyqmvbuVarEablkybsjg);
        }
    }

    class wkgbmnqykc implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ iozdgvuglv f37225zdlpuopuiu;

        wkgbmnqykc(iozdgvuglv iozdgvuglvVar) {
            this.f37225zdlpuopuiu = iozdgvuglvVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (dxjokdxxww.this.f37215iobyxmoadg == null) {
                dxjokdxxww.this.f37215iobyxmoadg = this.f37225zdlpuopuiu;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + dxjokdxxww.this.f37215iobyxmoadg + " (attempting to reset to " + this.f37225zdlpuopuiu + ")");
        }
    }

    class zoijcleaow implements tg.iobyxmoadg {
        zoijcleaow() {
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public eablkybsjg invoke() {
            EnumMap enumMap = new EnumMap(draadjrbmk.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (draadjrbmk draadjrbmkVar : draadjrbmk.values()) {
                ikoacuggdj ikoacuggdjVarVdvldrhtss = dxjokdxxww.this.vdvldrhtss(draadjrbmkVar.agtfadlqog().zoijcleaow());
                ikoacuggdj ikoacuggdjVarVdvldrhtss2 = dxjokdxxww.this.vdvldrhtss(draadjrbmkVar.btonecajqb().zoijcleaow());
                enumMap.put(draadjrbmkVar, ikoacuggdjVarVdvldrhtss2);
                map.put(ikoacuggdjVarVdvldrhtss, ikoacuggdjVarVdvldrhtss2);
                map2.put(ikoacuggdjVarVdvldrhtss2, ikoacuggdjVarVdvldrhtss);
            }
            return new eablkybsjg(enumMap, map, map2, null);
        }
    }

    protected dxjokdxxww(yi.agtfadlqog agtfadlqogVar) {
        if (agtfadlqogVar == null) {
            iobyxmoadg(0);
        }
        this.f37214gxszxtbevo = agtfadlqogVar;
        this.f37217wkgbmnqykc = agtfadlqogVar.wkgbmnqykc(new iobyxmoadg());
        this.f37216ppxfxbqfkf = agtfadlqogVar.wkgbmnqykc(new zoijcleaow());
        this.f37213eablkybsjg = agtfadlqogVar.dxjokdxxww(new ppxfxbqfkf());
    }

    public static boolean auzgnhcxok(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(132);
        }
        return czzsidtyhn(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37301ipoelvxyzq.btonecajqb());
    }

    public static boolean bfopjjpdmp(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(141);
        }
        return jhduphickx(kegysxyocbVar) && kegysxyocbVar.mhtqkkgtqm();
    }

    public static draadjrbmk cllcsxoeiz(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(93);
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        if (nufgyqmvbuVarWkgbmnqykc == null) {
            return null;
        }
        return wypolnanlu(nufgyqmvbuVarWkgbmnqykc);
    }

    private static boolean czzsidtyhn(kegysxyocb kegysxyocbVar, ii.wkgbmnqykc wkgbmnqykcVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(135);
        }
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(136);
        }
        return rlfsiqarku(kegysxyocbVar, wkgbmnqykcVar) && !kegysxyocbVar.mhtqkkgtqm();
    }

    public static boolean dvvnrvtcbc(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(10);
        }
        while (wflxmlrfwpVar != null) {
            if (wflxmlrfwpVar instanceof hkdspvbjdz) {
                return ((hkdspvbjdz) wflxmlrfwpVar).gxszxtbevo().dxjokdxxww(ojitshcjhn.f37255lereixgezr);
            }
            wflxmlrfwpVar = wflxmlrfwpVar.zoijcleaow();
        }
        return false;
    }

    private static boolean eablkybsjg(jh.nufgyqmvbu nufgyqmvbuVar, ii.wkgbmnqykc wkgbmnqykcVar) {
        if (nufgyqmvbuVar == null) {
            iobyxmoadg(104);
        }
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(105);
        }
        return nufgyqmvbuVar.getName().equals(wkgbmnqykcVar.dxjokdxxww()) && wkgbmnqykcVar.equals(li.dxjokdxxww.wflxmlrfwp(nufgyqmvbuVar));
    }

    public static boolean igdgnonuha(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(133);
        }
        return roivzttewh(kegysxyocbVar) || iwxlajgraz(kegysxyocbVar) || uawqvzlxes(kegysxyocbVar) || auzgnhcxok(kegysxyocbVar);
    }

    public static boolean ikoacuggdj(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(89);
        }
        return rlfsiqarku(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37286dxjokdxxww);
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i14 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case BuildConfig.API_LEVEL /* 115 */:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i13) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case C4007z9.F /* 25 */:
                objArr[1] = "getKProperty0";
                break;
            case C4007z9.G /* 26 */:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case C4007z9.I /* 29 */:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                objArr[1] = "getMutableIterator";
                break;
            case C4007z9.J /* 35 */:
                objArr[1] = "getCollection";
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                objArr[1] = "getMutableCollection";
                break;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                objArr[1] = "getList";
                break;
            case C4007z9.K /* 38 */:
                objArr[1] = "getMutableList";
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                objArr[1] = "getMutableMapEntry";
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                objArr[1] = "getBooleanType";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i13) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case BuildConfig.API_LEVEL /* 115 */:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean iwxlajgraz(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(130);
        }
        return czzsidtyhn(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37273ageimvtcrz.btonecajqb());
    }

    public static boolean iyctptxqzt(jh.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            iobyxmoadg(97);
        }
        return tzroggbefp(eablkybsjgVar) != null;
    }

    public static boolean jhduphickx(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(140);
        }
        return rlfsiqarku(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37364zoijcleaow);
    }

    public static boolean jztzpxfvev(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(91);
        }
        return ikoacuggdj(kegysxyocbVar) || opjhrmiecq(kegysxyocbVar);
    }

    public static boolean lrnfpwlwnk(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(96);
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        return (nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg) && iyctptxqzt((jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc);
    }

    public static boolean metgxyhuhe(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(9);
        }
        return li.dxjokdxxww.oxmwwwfdhm(wflxmlrfwpVar, gh.ppxfxbqfkf.class, false) != null;
    }

    public static boolean nuxfzjnpeb(kegysxyocb kegysxyocbVar) {
        return kegysxyocbVar != null && sflfametgt(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37324nufgyqmvbu);
    }

    public static boolean oipsdeybqn(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(139);
        }
        return rlfsiqarku(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37333ppxfxbqfkf);
    }

    public static boolean okpsazkaxt(jh.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            iobyxmoadg(90);
        }
        return eablkybsjg(eablkybsjgVar, ojitshcjhn.iobyxmoadg.f37286dxjokdxxww) || wypolnanlu(eablkybsjgVar) != null;
    }

    public static boolean opjhrmiecq(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(92);
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        return (nufgyqmvbuVarWkgbmnqykc == null || wypolnanlu(nufgyqmvbuVarWkgbmnqykc) == null) ? false : true;
    }

    private static kegysxyocb pmvmpeiblj(kegysxyocb kegysxyocbVar, lmojexxdyd lmojexxdydVar) {
        ii.zoijcleaow zoijcleaowVarAgtfadlqog;
        ii.zoijcleaow zoijcleaowVarIobyxmoadg;
        jh.eablkybsjg eablkybsjgVarZoijcleaow;
        if (kegysxyocbVar == null) {
            iobyxmoadg(72);
        }
        if (lmojexxdydVar == null) {
            iobyxmoadg(73);
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        if (nufgyqmvbuVarWkgbmnqykc == null) {
            return null;
        }
        kcexrzcfyt kcexrzcfytVar = kcexrzcfyt.f37232iobyxmoadg;
        if (!kcexrzcfytVar.zoijcleaow(nufgyqmvbuVarWkgbmnqykc.getName()) || (zoijcleaowVarAgtfadlqog = pi.eablkybsjg.agtfadlqog(nufgyqmvbuVarWkgbmnqykc)) == null || (zoijcleaowVarIobyxmoadg = kcexrzcfytVar.iobyxmoadg(zoijcleaowVarAgtfadlqog)) == null || (eablkybsjgVarZoijcleaow = esjtqupxsv.zoijcleaow(lmojexxdydVar, zoijcleaowVarIobyxmoadg)) == null) {
            return null;
        }
        return eablkybsjgVarZoijcleaow.ojitshcjhn();
    }

    private jh.eablkybsjg rgvfuqvkyq(String str) {
        if (str == null) {
            iobyxmoadg(14);
        }
        jh.eablkybsjg eablkybsjgVar = (jh.eablkybsjg) this.f37213eablkybsjg.invoke(ii.gxszxtbevo.gxszxtbevo(str));
        if (eablkybsjgVar == null) {
            iobyxmoadg(15);
        }
        return eablkybsjgVar;
    }

    private static boolean rlfsiqarku(kegysxyocb kegysxyocbVar, ii.wkgbmnqykc wkgbmnqykcVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(98);
        }
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(99);
        }
        return tbqsvytpvh(kegysxyocbVar.grlcpdaxtj(), wkgbmnqykcVar);
    }

    public static boolean roivzttewh(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(129);
        }
        return czzsidtyhn(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37289fiwbwshyhd.btonecajqb());
    }

    private static boolean sflfametgt(kegysxyocb kegysxyocbVar, ii.wkgbmnqykc wkgbmnqykcVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(106);
        }
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(107);
        }
        return !kegysxyocbVar.mhtqkkgtqm() && rlfsiqarku(kegysxyocbVar, wkgbmnqykcVar);
    }

    public static boolean skhdrjzrfn(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(143);
        }
        return sflfametgt(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37293gxszxtbevo);
    }

    private jh.eablkybsjg stevsuqkhv(draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar == null) {
            iobyxmoadg(16);
        }
        return rgvfuqvkyq(draadjrbmkVar.agtfadlqog().zoijcleaow());
    }

    public static boolean tbqsvytpvh(zeieaojujs zeieaojujsVar, ii.wkgbmnqykc wkgbmnqykcVar) {
        if (zeieaojujsVar == null) {
            iobyxmoadg(102);
        }
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(103);
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = zeieaojujsVar.ylkuphrtab();
        return (nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg) && eablkybsjg(nufgyqmvbuVarWkgbmnqykc, wkgbmnqykcVar);
    }

    public static draadjrbmk tzroggbefp(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(77);
        }
        if (ojitshcjhn.iobyxmoadg.f37291grlcpdaxtj.contains(wflxmlrfwpVar.getName())) {
            return (draadjrbmk) ojitshcjhn.iobyxmoadg.f37305ixidwrxhsl.get(li.dxjokdxxww.wflxmlrfwp(wflxmlrfwpVar));
        }
        return null;
    }

    public static boolean uawqvzlxes(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(131);
        }
        return czzsidtyhn(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37290fyldjkxazc.btonecajqb());
    }

    public static boolean uwvvkdfqfp(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(142);
        }
        return bfopjjpdmp(kegysxyocbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ikoacuggdj vdvldrhtss(String str) {
        if (str == null) {
            iobyxmoadg(47);
        }
        ikoacuggdj ikoacuggdjVarOjitshcjhn = rgvfuqvkyq(str).ojitshcjhn();
        if (ikoacuggdjVarOjitshcjhn == null) {
            iobyxmoadg(48);
        }
        return ikoacuggdjVarOjitshcjhn;
    }

    public static boolean vipkmwdibw(jh.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            iobyxmoadg(109);
        }
        return eablkybsjg(eablkybsjgVar, ojitshcjhn.iobyxmoadg.f37364zoijcleaow);
    }

    public static boolean weqkydbzbr(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(95);
        }
        return !kegysxyocbVar.mhtqkkgtqm() && lrnfpwlwnk(kegysxyocbVar);
    }

    public static draadjrbmk wypolnanlu(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(78);
        }
        if (ojitshcjhn.iobyxmoadg.f37322mhtqkkgtqm.contains(wflxmlrfwpVar.getName())) {
            return (draadjrbmk) ojitshcjhn.iobyxmoadg.f37310jrbgnlbqoe.get(li.dxjokdxxww.wflxmlrfwp(wflxmlrfwpVar));
        }
        return null;
    }

    public static boolean xrmfcynszj(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(111);
        }
        return czzsidtyhn(kegysxyocbVar, ojitshcjhn.iobyxmoadg.f37277btonecajqb);
    }

    public static boolean ydmasvzmpa(jh.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            iobyxmoadg(159);
        }
        return eablkybsjg(eablkybsjgVar, ojitshcjhn.iobyxmoadg.f37357ydmasvzmpa);
    }

    public static boolean yfnezrywwk(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(162);
        }
        if (wflxmlrfwpVar.iobyxmoadg().getAnnotations().wizcaqwiak(ojitshcjhn.iobyxmoadg.f37288esjtqupxsv)) {
            return true;
        }
        if (!(wflxmlrfwpVar instanceof crxdokpmqz)) {
            return false;
        }
        crxdokpmqz crxdokpmqzVar = (crxdokpmqz) wflxmlrfwpVar;
        boolean zJpowsppfya = crxdokpmqzVar.jpowsppfya();
        jlmebxxoox jlmebxxooxVarWkgbmnqykc = crxdokpmqzVar.wkgbmnqykc();
        ribwqtqdhb ribwqtqdhbVarNufgyqmvbu = crxdokpmqzVar.nufgyqmvbu();
        if (jlmebxxooxVarWkgbmnqykc != null && yfnezrywwk(jlmebxxooxVarWkgbmnqykc)) {
            if (!zJpowsppfya) {
                return true;
            }
            if (ribwqtqdhbVarNufgyqmvbu != null && yfnezrywwk(ribwqtqdhbVarNufgyqmvbu)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zeieaojujs(jh.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            iobyxmoadg(108);
        }
        return eablkybsjg(eablkybsjgVar, ojitshcjhn.iobyxmoadg.f37364zoijcleaow) || eablkybsjg(eablkybsjgVar, ojitshcjhn.iobyxmoadg.f37333ppxfxbqfkf);
    }

    public static boolean zfvoamnweg(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(137);
        }
        return oipsdeybqn(kegysxyocbVar) && !ageimvtcrz.draadjrbmk(kegysxyocbVar);
    }

    public ikoacuggdj agtfadlqog() {
        ikoacuggdj ikoacuggdjVarKegysxyocb = kegysxyocb(draadjrbmk.BOOLEAN);
        if (ikoacuggdjVarKegysxyocb == null) {
            iobyxmoadg(64);
        }
        return ikoacuggdjVarKegysxyocb;
    }

    public jh.eablkybsjg btonecajqb() {
        return rgvfuqvkyq("Array");
    }

    public ikoacuggdj cdpycssgdh() {
        ikoacuggdj ikoacuggdjVarKegysxyocb = kegysxyocb(draadjrbmk.INT);
        if (ikoacuggdjVarKegysxyocb == null) {
            iobyxmoadg(59);
        }
        return ikoacuggdjVarKegysxyocb;
    }

    public jh.eablkybsjg cqumvgiudr() {
        return rgvfuqvkyq("Comparable");
    }

    public jh.eablkybsjg crxdokpmqz(int i13) {
        jh.eablkybsjg eablkybsjgVarOjitshcjhn = ojitshcjhn(ojitshcjhn.f37254kcexrzcfyt.ppxfxbqfkf(ii.gxszxtbevo.gxszxtbevo(ojitshcjhn.wkgbmnqykc(i13))));
        if (eablkybsjgVarOjitshcjhn == null) {
            iobyxmoadg(18);
        }
        return eablkybsjgVarOjitshcjhn;
    }

    public ikoacuggdj draadjrbmk(mhtqkkgtqm mhtqkkgtqmVar, kegysxyocb kegysxyocbVar) {
        if (mhtqkkgtqmVar == null) {
            iobyxmoadg(83);
        }
        if (kegysxyocbVar == null) {
            iobyxmoadg(84);
        }
        ikoacuggdj ikoacuggdjVarWflxmlrfwp = wflxmlrfwp(mhtqkkgtqmVar, kegysxyocbVar, kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow());
        if (ikoacuggdjVarWflxmlrfwp == null) {
            iobyxmoadg(85);
        }
        return ikoacuggdjVarWflxmlrfwp;
    }

    public ikoacuggdj dsvhmnatus(draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar == null) {
            iobyxmoadg(74);
        }
        ikoacuggdj ikoacuggdjVar = (ikoacuggdj) ((eablkybsjg) this.f37216ppxfxbqfkf.invoke()).f37219iobyxmoadg.get(draadjrbmkVar);
        if (ikoacuggdjVar == null) {
            iobyxmoadg(75);
        }
        return ikoacuggdjVar;
    }

    public ikoacuggdj dxjokdxxww() {
        ikoacuggdj ikoacuggdjVarOjitshcjhn = nufgyqmvbu().ojitshcjhn();
        if (ikoacuggdjVarOjitshcjhn == null) {
            iobyxmoadg(51);
        }
        return ikoacuggdjVarOjitshcjhn;
    }

    public ikoacuggdj esjtqupxsv() {
        ikoacuggdj ikoacuggdjVarYlkuphrtab = ylkuphrtab();
        if (ikoacuggdjVarYlkuphrtab == null) {
            iobyxmoadg(53);
        }
        return ikoacuggdjVarYlkuphrtab;
    }

    public kegysxyocb gtknphoqwx(kegysxyocb kegysxyocbVar) {
        kegysxyocb kegysxyocbVarPmvmpeiblj;
        if (kegysxyocbVar == null) {
            iobyxmoadg(68);
        }
        if (ikoacuggdj(kegysxyocbVar)) {
            if (kegysxyocbVar.fyldjkxazc().size() != 1) {
                throw new IllegalStateException();
            }
            kegysxyocb type = ((iwxlajgraz) kegysxyocbVar.fyldjkxazc().get(0)).getType();
            if (type == null) {
                iobyxmoadg(69);
            }
            return type;
        }
        kegysxyocb kegysxyocbVarAgtfadlqog = ageimvtcrz.agtfadlqog(kegysxyocbVar);
        kegysxyocb kegysxyocbVar2 = (kegysxyocb) ((eablkybsjg) this.f37216ppxfxbqfkf.invoke()).f37220ppxfxbqfkf.get(kegysxyocbVarAgtfadlqog);
        if (kegysxyocbVar2 != null) {
            return kegysxyocbVar2;
        }
        lmojexxdyd lmojexxdydVarDxjokdxxww = li.dxjokdxxww.dxjokdxxww(kegysxyocbVarAgtfadlqog);
        if (lmojexxdydVarDxjokdxxww != null && (kegysxyocbVarPmvmpeiblj = pmvmpeiblj(kegysxyocbVarAgtfadlqog, lmojexxdydVarDxjokdxxww)) != null) {
            return kegysxyocbVarPmvmpeiblj;
        }
        throw new IllegalStateException("not array: " + kegysxyocbVar);
    }

    protected void gxszxtbevo(boolean z13) {
        iozdgvuglv iozdgvuglvVar = new iozdgvuglv(f37212lqeggnwhkg, this.f37214gxszxtbevo, this, null);
        this.f37215iobyxmoadg = iozdgvuglvVar;
        iozdgvuglvVar.mhtqkkgtqm(gh.zoijcleaow.f37387iobyxmoadg.ppxfxbqfkf().iobyxmoadg(this.f37214gxszxtbevo, this.f37215iobyxmoadg, jyumaefscl(), hkdspvbjdz(), lqeggnwhkg(), z13));
        iozdgvuglv iozdgvuglvVar2 = this.f37215iobyxmoadg;
        iozdgvuglvVar2.krqnebusok(iozdgvuglvVar2);
    }

    public jh.eablkybsjg hcddaimhww() {
        return rgvfuqvkyq("Number");
    }

    protected lh.ppxfxbqfkf hkdspvbjdz() {
        lh.ppxfxbqfkf.zoijcleaow zoijcleaowVar = lh.ppxfxbqfkf.zoijcleaow.f62559iobyxmoadg;
        if (zoijcleaowVar == null) {
            iobyxmoadg(4);
        }
        return zoijcleaowVar;
    }

    public ikoacuggdj iozdgvuglv() {
        ikoacuggdj ikoacuggdjVarKegysxyocb = kegysxyocb(draadjrbmk.LONG);
        if (ikoacuggdjVarKegysxyocb == null) {
            iobyxmoadg(60);
        }
        return ikoacuggdjVarKegysxyocb;
    }

    public jh.eablkybsjg istkbnxepw(int i13) {
        return rgvfuqvkyq(ojitshcjhn.zoijcleaow(i13));
    }

    public jh.eablkybsjg iwizpuwonk() {
        jh.eablkybsjg eablkybsjgVarOjitshcjhn = ojitshcjhn(ojitshcjhn.iobyxmoadg.f37281crxdokpmqz);
        if (eablkybsjgVarOjitshcjhn == null) {
            iobyxmoadg(35);
        }
        return eablkybsjgVarOjitshcjhn;
    }

    public jh.eablkybsjg jlmebxxoox() {
        return rgvfuqvkyq("Unit");
    }

    public ikoacuggdj jpowsppfya() {
        ikoacuggdj ikoacuggdjVarOjitshcjhn = hcddaimhww().ojitshcjhn();
        if (ikoacuggdjVarOjitshcjhn == null) {
            iobyxmoadg(56);
        }
        return ikoacuggdjVarOjitshcjhn;
    }

    protected Iterable jyumaefscl() {
        List listSingletonList = Collections.singletonList(new hh.iobyxmoadg(this.f37214gxszxtbevo, oxmwwwfdhm()));
        if (listSingletonList == null) {
            iobyxmoadg(5);
        }
        return listSingletonList;
    }

    public si.gtknphoqwx kcexrzcfyt() {
        si.gtknphoqwx gtknphoqwxVarAgtfadlqog = oxmwwwfdhm().wwaezpbzkn(ojitshcjhn.f37261pmvmpeiblj).agtfadlqog();
        if (gtknphoqwxVarAgtfadlqog == null) {
            iobyxmoadg(11);
        }
        return gtknphoqwxVarAgtfadlqog;
    }

    public ikoacuggdj kegysxyocb(draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar == null) {
            iobyxmoadg(54);
        }
        ikoacuggdj ikoacuggdjVarOjitshcjhn = stevsuqkhv(draadjrbmkVar).ojitshcjhn();
        if (ikoacuggdjVarOjitshcjhn == null) {
            iobyxmoadg(55);
        }
        return ikoacuggdjVarOjitshcjhn;
    }

    public ikoacuggdj lereixgezr() {
        ikoacuggdj ikoacuggdjVarKegysxyocb = kegysxyocb(draadjrbmk.DOUBLE);
        if (ikoacuggdjVarKegysxyocb == null) {
            iobyxmoadg(62);
        }
        return ikoacuggdjVarKegysxyocb;
    }

    public jh.eablkybsjg lmojexxdyd() {
        return rgvfuqvkyq("Nothing");
    }

    protected lh.iobyxmoadg lqeggnwhkg() {
        lh.iobyxmoadg.C1269iobyxmoadg c1269iobyxmoadg = lh.iobyxmoadg.C1269iobyxmoadg.f62557iobyxmoadg;
        if (c1269iobyxmoadg == null) {
            iobyxmoadg(3);
        }
        return c1269iobyxmoadg;
    }

    public void lxfrhoxuzk(iozdgvuglv iozdgvuglvVar) {
        if (iozdgvuglvVar == null) {
            iobyxmoadg(1);
        }
        this.f37214gxszxtbevo.gxszxtbevo(new wkgbmnqykc(iozdgvuglvVar));
    }

    public ikoacuggdj mbcevpiqjq() {
        ikoacuggdj ikoacuggdjVarKegysxyocb = kegysxyocb(draadjrbmk.SHORT);
        if (ikoacuggdjVarKegysxyocb == null) {
            iobyxmoadg(58);
        }
        return ikoacuggdjVarKegysxyocb;
    }

    protected yi.agtfadlqog ntlheqmsrt() {
        yi.agtfadlqog agtfadlqogVar = this.f37214gxszxtbevo;
        if (agtfadlqogVar == null) {
            iobyxmoadg(6);
        }
        return agtfadlqogVar;
    }

    public jh.eablkybsjg nufgyqmvbu() {
        return rgvfuqvkyq("Any");
    }

    public jh.eablkybsjg ojitshcjhn(ii.ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(12);
        }
        jh.eablkybsjg eablkybsjgVarWkgbmnqykc = jh.kcexrzcfyt.wkgbmnqykc(oxmwwwfdhm(), ppxfxbqfkfVar, rh.wkgbmnqykc.FROM_BUILTINS);
        if (eablkybsjgVarWkgbmnqykc == null) {
            iobyxmoadg(13);
        }
        return eablkybsjgVarWkgbmnqykc;
    }

    public iozdgvuglv oxmwwwfdhm() {
        if (this.f37215iobyxmoadg == null) {
            this.f37215iobyxmoadg = (iozdgvuglv) this.f37218zoijcleaow.invoke();
        }
        iozdgvuglv iozdgvuglvVar = this.f37215iobyxmoadg;
        if (iozdgvuglvVar == null) {
            iobyxmoadg(7);
        }
        return iozdgvuglvVar;
    }

    public ikoacuggdj pkzmftpjix() {
        ikoacuggdj ikoacuggdjVarYzdjzghtvl = wwaezpbzkn().fmlbqenlif(true);
        if (ikoacuggdjVarYzdjzghtvl == null) {
            iobyxmoadg(50);
        }
        return ikoacuggdjVarYzdjzghtvl;
    }

    public ikoacuggdj ribwqtqdhb() {
        ikoacuggdj ikoacuggdjVarOjitshcjhn = jlmebxxoox().ojitshcjhn();
        if (ikoacuggdjVarOjitshcjhn == null) {
            iobyxmoadg(65);
        }
        return ikoacuggdjVarOjitshcjhn;
    }

    public ikoacuggdj sopmlzcsov() {
        ikoacuggdj ikoacuggdjVarOjitshcjhn = ulzqkzuiru().ojitshcjhn();
        if (ikoacuggdjVarOjitshcjhn == null) {
            iobyxmoadg(66);
        }
        return ikoacuggdjVarOjitshcjhn;
    }

    public jh.eablkybsjg ulzqkzuiru() {
        return rgvfuqvkyq("String");
    }

    public ikoacuggdj wflxmlrfwp(mhtqkkgtqm mhtqkkgtqmVar, kegysxyocb kegysxyocbVar, kh.nufgyqmvbu nufgyqmvbuVar) {
        if (mhtqkkgtqmVar == null) {
            iobyxmoadg(79);
        }
        if (kegysxyocbVar == null) {
            iobyxmoadg(80);
        }
        if (nufgyqmvbuVar == null) {
            iobyxmoadg(81);
        }
        ikoacuggdj ikoacuggdjVarNufgyqmvbu = ntlheqmsrt.nufgyqmvbu(iyctptxqzt.zoijcleaow(nufgyqmvbuVar), btonecajqb(), Collections.singletonList(new skhdrjzrfn(mhtqkkgtqmVar, kegysxyocbVar)));
        if (ikoacuggdjVarNufgyqmvbu == null) {
            iobyxmoadg(82);
        }
        return ikoacuggdjVarNufgyqmvbu;
    }

    public ikoacuggdj wwaezpbzkn() {
        ikoacuggdj ikoacuggdjVarOjitshcjhn = lmojexxdyd().ojitshcjhn();
        if (ikoacuggdjVarOjitshcjhn == null) {
            iobyxmoadg(49);
        }
        return ikoacuggdjVarOjitshcjhn;
    }

    public jh.eablkybsjg yadqdtsiqt() {
        jh.eablkybsjg eablkybsjgVarOjitshcjhn = ojitshcjhn(ojitshcjhn.iobyxmoadg.f37357ydmasvzmpa.draadjrbmk());
        if (eablkybsjgVarOjitshcjhn == null) {
            iobyxmoadg(21);
        }
        return eablkybsjgVarOjitshcjhn;
    }

    public ikoacuggdj yggfygwlhe() {
        ikoacuggdj ikoacuggdjVarKegysxyocb = kegysxyocb(draadjrbmk.CHAR);
        if (ikoacuggdjVarKegysxyocb == null) {
            iobyxmoadg(63);
        }
        return ikoacuggdjVarKegysxyocb;
    }

    public ikoacuggdj ylkuphrtab() {
        ikoacuggdj ikoacuggdjVarYzdjzghtvl = dxjokdxxww().fmlbqenlif(true);
        if (ikoacuggdjVarYzdjzghtvl == null) {
            iobyxmoadg(52);
        }
        return ikoacuggdjVarYzdjzghtvl;
    }

    public ikoacuggdj zdlpuopuiu() {
        ikoacuggdj ikoacuggdjVarKegysxyocb = kegysxyocb(draadjrbmk.BYTE);
        if (ikoacuggdjVarKegysxyocb == null) {
            iobyxmoadg(57);
        }
        return ikoacuggdjVarKegysxyocb;
    }

    public ikoacuggdj zynmafqrjb() {
        ikoacuggdj ikoacuggdjVarKegysxyocb = kegysxyocb(draadjrbmk.FLOAT);
        if (ikoacuggdjVarKegysxyocb == null) {
            iobyxmoadg(61);
        }
        return ikoacuggdjVarKegysxyocb;
    }
}
