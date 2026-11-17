package ii;

import java.util.List;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final ppxfxbqfkf f44478ppxfxbqfkf = new ppxfxbqfkf("");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f44479iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private transient ppxfxbqfkf f44480zoijcleaow;

    public ppxfxbqfkf(String str) {
        if (str == null) {
            iobyxmoadg(1);
        }
        this.f44479iobyxmoadg = new wkgbmnqykc(str, this);
    }

    public static ppxfxbqfkf gtknphoqwx(gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(14);
        }
        return new ppxfxbqfkf(wkgbmnqykc.wflxmlrfwp(gxszxtbevoVar));
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i14 = 2;
                break;
            case 8:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public wkgbmnqykc btonecajqb() {
        wkgbmnqykc wkgbmnqykcVar = this.f44479iobyxmoadg;
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(5);
        }
        return wkgbmnqykcVar;
    }

    public boolean dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(12);
        }
        return this.f44479iobyxmoadg.gtknphoqwx(gxszxtbevoVar);
    }

    public ppxfxbqfkf eablkybsjg() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f44480zoijcleaow;
        if (ppxfxbqfkfVar != null) {
            if (ppxfxbqfkfVar == null) {
                iobyxmoadg(6);
            }
            return ppxfxbqfkfVar;
        }
        if (wkgbmnqykc()) {
            throw new IllegalStateException("root");
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(this.f44479iobyxmoadg.lqeggnwhkg());
        this.f44480zoijcleaow = ppxfxbqfkfVar2;
        return ppxfxbqfkfVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && this.f44479iobyxmoadg.equals(((ppxfxbqfkf) obj).f44479iobyxmoadg);
    }

    public List gxszxtbevo() {
        List listNufgyqmvbu = this.f44479iobyxmoadg.nufgyqmvbu();
        if (listNufgyqmvbu == null) {
            iobyxmoadg(11);
        }
        return listNufgyqmvbu;
    }

    public int hashCode() {
        return this.f44479iobyxmoadg.hashCode();
    }

    public gxszxtbevo lqeggnwhkg() {
        gxszxtbevo gxszxtbevoVarDxjokdxxww = this.f44479iobyxmoadg.dxjokdxxww();
        if (gxszxtbevoVarDxjokdxxww == null) {
            iobyxmoadg(9);
        }
        return gxszxtbevoVarDxjokdxxww;
    }

    public gxszxtbevo nufgyqmvbu() {
        gxszxtbevo gxszxtbevoVarBtonecajqb = this.f44479iobyxmoadg.btonecajqb();
        if (gxszxtbevoVarBtonecajqb == null) {
            iobyxmoadg(10);
        }
        return gxszxtbevoVarBtonecajqb;
    }

    public ppxfxbqfkf ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(8);
        }
        return new ppxfxbqfkf(this.f44479iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar), this);
    }

    public String toString() {
        return this.f44479iobyxmoadg.toString();
    }

    public boolean wkgbmnqykc() {
        return this.f44479iobyxmoadg.eablkybsjg();
    }

    public String zoijcleaow() {
        String strZoijcleaow = this.f44479iobyxmoadg.zoijcleaow();
        if (strZoijcleaow == null) {
            iobyxmoadg(4);
        }
        return strZoijcleaow;
    }

    public ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(2);
        }
        this.f44479iobyxmoadg = wkgbmnqykcVar;
    }

    private ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, ppxfxbqfkf ppxfxbqfkfVar) {
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(3);
        }
        this.f44479iobyxmoadg = wkgbmnqykcVar;
        this.f44480zoijcleaow = ppxfxbqfkfVar;
    }
}
