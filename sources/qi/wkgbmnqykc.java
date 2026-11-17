package qi;

import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78874iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ii.ppxfxbqfkf f78875zoijcleaow;

    private wkgbmnqykc(String str) {
        if (str == null) {
            iobyxmoadg(7);
        }
        this.f78874iobyxmoadg = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str;
        int i14;
        if (i13 != 3 && i13 != 5) {
            switch (i13) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 3 && i13 != 5) {
            switch (i13) {
                case 8:
                case 9:
                case 10:
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
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i13 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i13 != 5) {
            switch (i13) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i13) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 3 && i13 != 5) {
            switch (i13) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static String nufgyqmvbu(ii.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar == null) {
            iobyxmoadg(2);
        }
        ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = zoijcleaowVar.gxszxtbevo();
        String strReplace = zoijcleaowVar.lqeggnwhkg().zoijcleaow().replace('.', '$');
        if (!ppxfxbqfkfVarGxszxtbevo.wkgbmnqykc()) {
            strReplace = ppxfxbqfkfVarGxszxtbevo.zoijcleaow().replace('.', '/') + CardDateFormatTextWatcher.DIVIDER_CHARACTER + strReplace;
        }
        if (strReplace == null) {
            iobyxmoadg(3);
        }
        return strReplace;
    }

    public static wkgbmnqykc ppxfxbqfkf(ii.ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(4);
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(ppxfxbqfkfVar.zoijcleaow().replace('.', '/'));
        wkgbmnqykcVar.f78875zoijcleaow = ppxfxbqfkfVar;
        return wkgbmnqykcVar;
    }

    public static wkgbmnqykc wkgbmnqykc(String str) {
        if (str == null) {
            iobyxmoadg(0);
        }
        return new wkgbmnqykc(str);
    }

    public static wkgbmnqykc zoijcleaow(ii.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar == null) {
            iobyxmoadg(1);
        }
        return new wkgbmnqykc(nufgyqmvbu(zoijcleaowVar));
    }

    public ii.ppxfxbqfkf eablkybsjg() {
        return new ii.ppxfxbqfkf(this.f78874iobyxmoadg.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f78874iobyxmoadg.equals(((wkgbmnqykc) obj).f78874iobyxmoadg);
    }

    public String gxszxtbevo() {
        String str = this.f78874iobyxmoadg;
        if (str == null) {
            iobyxmoadg(10);
        }
        return str;
    }

    public int hashCode() {
        return this.f78874iobyxmoadg.hashCode();
    }

    public ii.ppxfxbqfkf lqeggnwhkg() {
        int iLastIndexOf = this.f78874iobyxmoadg.lastIndexOf(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
        if (iLastIndexOf != -1) {
            return new ii.ppxfxbqfkf(this.f78874iobyxmoadg.substring(0, iLastIndexOf).replace('/', '.'));
        }
        ii.ppxfxbqfkf ppxfxbqfkfVar = ii.ppxfxbqfkf.f44478ppxfxbqfkf;
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(9);
        }
        return ppxfxbqfkfVar;
    }

    public String toString() {
        return this.f78874iobyxmoadg;
    }
}
