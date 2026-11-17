package qi;

import gh.draadjrbmk;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public enum eablkybsjg {
    BOOLEAN(draadjrbmk.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(draadjrbmk.CHAR, "char", "C", "java.lang.Character"),
    BYTE(draadjrbmk.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(draadjrbmk.SHORT, "short", "S", "java.lang.Short"),
    INT(draadjrbmk.INT, "int", "I", "java.lang.Integer"),
    FLOAT(draadjrbmk.FLOAT, "float", "F", "java.lang.Float"),
    LONG(draadjrbmk.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(draadjrbmk.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ii.ppxfxbqfkf f78864iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f78865jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f78866yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final draadjrbmk f78867zdlpuopuiu;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final Map f78854iozdgvuglv = new HashMap();

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final Map f78857lmojexxdyd = new EnumMap(draadjrbmk.class);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final Map f78860wwaezpbzkn = new HashMap();

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private static final Set f78862ylkuphrtab = new HashSet();

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private static final Map f78858pkzmftpjix = new HashMap();

    static {
        for (eablkybsjg eablkybsjgVar : values()) {
            f78854iozdgvuglv.put(eablkybsjgVar.dxjokdxxww(), eablkybsjgVar);
            f78857lmojexxdyd.put(eablkybsjgVar.btonecajqb(), eablkybsjgVar);
            f78860wwaezpbzkn.put(eablkybsjgVar.nufgyqmvbu(), eablkybsjgVar);
            String strReplace = eablkybsjgVar.f78864iwizpuwonk.zoijcleaow().replace('.', '/');
            f78862ylkuphrtab.add(strReplace);
            f78858pkzmftpjix.put(strReplace, "(" + eablkybsjgVar.f78865jyumaefscl + ")L" + strReplace + ";");
        }
    }

    eablkybsjg(draadjrbmk draadjrbmkVar, String str, String str2, String str3) {
        if (draadjrbmkVar == null) {
            iobyxmoadg(8);
        }
        if (str == null) {
            iobyxmoadg(9);
        }
        if (str2 == null) {
            iobyxmoadg(10);
        }
        if (str3 == null) {
            iobyxmoadg(11);
        }
        this.f78867zdlpuopuiu = draadjrbmkVar;
        this.f78866yggfygwlhe = str;
        this.f78865jyumaefscl = str2;
        this.f78864iwizpuwonk = new ii.ppxfxbqfkf(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str;
        int i14;
        if (i13 != 4 && i13 != 6) {
            switch (i13) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 4 && i13 != 6) {
            switch (i13) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i14 = 2;
                    break;
                default:
                    i14 = 3;
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i13 != 4 && i13 != 6) {
            switch (i13) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i13) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 6) {
            switch (i13) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static eablkybsjg lqeggnwhkg(String str) {
        if (str == null) {
            iobyxmoadg(3);
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) f78854iozdgvuglv.get(str);
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public static eablkybsjg wkgbmnqykc(draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar == null) {
            iobyxmoadg(5);
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) f78857lmojexxdyd.get(draadjrbmkVar);
        if (eablkybsjgVar == null) {
            iobyxmoadg(6);
        }
        return eablkybsjgVar;
    }

    public draadjrbmk btonecajqb() {
        draadjrbmk draadjrbmkVar = this.f78867zdlpuopuiu;
        if (draadjrbmkVar == null) {
            iobyxmoadg(12);
        }
        return draadjrbmkVar;
    }

    public ii.ppxfxbqfkf draadjrbmk() {
        ii.ppxfxbqfkf ppxfxbqfkfVar = this.f78864iwizpuwonk;
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(15);
        }
        return ppxfxbqfkfVar;
    }

    public String dxjokdxxww() {
        String str = this.f78866yggfygwlhe;
        if (str == null) {
            iobyxmoadg(13);
        }
        return str;
    }

    public String nufgyqmvbu() {
        String str = this.f78865jyumaefscl;
        if (str == null) {
            iobyxmoadg(14);
        }
        return str;
    }
}
