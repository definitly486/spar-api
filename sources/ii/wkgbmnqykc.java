package ii;

import hg.agtfadlqog;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final gxszxtbevo f44481eablkybsjg = gxszxtbevo.dxjokdxxww("<root>");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Pattern f44482gxszxtbevo = Pattern.compile("\\.");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final draadjrbmk f44483lqeggnwhkg = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f44484iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private transient wkgbmnqykc f44485ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private transient gxszxtbevo f44486wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private transient ppxfxbqfkf f44487zoijcleaow;

    static class iobyxmoadg implements draadjrbmk {
        iobyxmoadg() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public gxszxtbevo invoke(String str) {
            return gxszxtbevo.eablkybsjg(str);
        }
    }

    wkgbmnqykc(String str, ppxfxbqfkf ppxfxbqfkfVar) {
        if (str == null) {
            iobyxmoadg(0);
        }
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(1);
        }
        this.f44484iobyxmoadg = str;
        this.f44487zoijcleaow = ppxfxbqfkfVar;
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i14 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        if (i13 != 1) {
            switch (i13) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = ExternalMetricsManagerImpl.NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i13) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static wkgbmnqykc wflxmlrfwp(gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(17);
        }
        return new wkgbmnqykc(gxszxtbevoVar.zoijcleaow(), ppxfxbqfkf.f44478ppxfxbqfkf.btonecajqb(), gxszxtbevoVar);
    }

    private void wkgbmnqykc() {
        int iLastIndexOf = this.f44484iobyxmoadg.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f44486wkgbmnqykc = gxszxtbevo.eablkybsjg(this.f44484iobyxmoadg.substring(iLastIndexOf + 1));
            this.f44485ppxfxbqfkf = new wkgbmnqykc(this.f44484iobyxmoadg.substring(0, iLastIndexOf));
        } else {
            this.f44486wkgbmnqykc = gxszxtbevo.eablkybsjg(this.f44484iobyxmoadg);
            this.f44485ppxfxbqfkf = ppxfxbqfkf.f44478ppxfxbqfkf.btonecajqb();
        }
    }

    public gxszxtbevo btonecajqb() {
        if (eablkybsjg()) {
            gxszxtbevo gxszxtbevoVar = f44481eablkybsjg;
            if (gxszxtbevoVar == null) {
                iobyxmoadg(12);
            }
            return gxszxtbevoVar;
        }
        gxszxtbevo gxszxtbevoVarDxjokdxxww = dxjokdxxww();
        if (gxszxtbevoVarDxjokdxxww == null) {
            iobyxmoadg(13);
        }
        return gxszxtbevoVarDxjokdxxww;
    }

    public ppxfxbqfkf draadjrbmk() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f44487zoijcleaow;
        if (ppxfxbqfkfVar != null) {
            if (ppxfxbqfkfVar == null) {
                iobyxmoadg(5);
            }
            return ppxfxbqfkfVar;
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(this);
        this.f44487zoijcleaow = ppxfxbqfkfVar2;
        return ppxfxbqfkfVar2;
    }

    public gxszxtbevo dxjokdxxww() {
        gxszxtbevo gxszxtbevoVar = this.f44486wkgbmnqykc;
        if (gxszxtbevoVar != null) {
            if (gxszxtbevoVar == null) {
                iobyxmoadg(10);
            }
            return gxszxtbevoVar;
        }
        if (eablkybsjg()) {
            throw new IllegalStateException("root");
        }
        wkgbmnqykc();
        gxszxtbevo gxszxtbevoVar2 = this.f44486wkgbmnqykc;
        if (gxszxtbevoVar2 == null) {
            iobyxmoadg(11);
        }
        return gxszxtbevoVar2;
    }

    public boolean eablkybsjg() {
        return this.f44484iobyxmoadg.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && this.f44484iobyxmoadg.equals(((wkgbmnqykc) obj).f44484iobyxmoadg);
    }

    public boolean gtknphoqwx(gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(15);
        }
        if (eablkybsjg()) {
            return false;
        }
        int iIndexOf = this.f44484iobyxmoadg.indexOf(46);
        if (iIndexOf == -1) {
            iIndexOf = this.f44484iobyxmoadg.length();
        }
        String strZoijcleaow = gxszxtbevoVar.zoijcleaow();
        return iIndexOf == strZoijcleaow.length() && this.f44484iobyxmoadg.regionMatches(0, strZoijcleaow, 0, iIndexOf);
    }

    public boolean gxszxtbevo() {
        return this.f44487zoijcleaow != null || zoijcleaow().indexOf(60) < 0;
    }

    public int hashCode() {
        return this.f44484iobyxmoadg.hashCode();
    }

    public wkgbmnqykc lqeggnwhkg() {
        wkgbmnqykc wkgbmnqykcVar = this.f44485ppxfxbqfkf;
        if (wkgbmnqykcVar != null) {
            if (wkgbmnqykcVar == null) {
                iobyxmoadg(7);
            }
            return wkgbmnqykcVar;
        }
        if (eablkybsjg()) {
            throw new IllegalStateException("root");
        }
        wkgbmnqykc();
        wkgbmnqykc wkgbmnqykcVar2 = this.f44485ppxfxbqfkf;
        if (wkgbmnqykcVar2 == null) {
            iobyxmoadg(8);
        }
        return wkgbmnqykcVar2;
    }

    public List nufgyqmvbu() {
        List listEmptyList = eablkybsjg() ? Collections.emptyList() : agtfadlqog.ipoelvxyzq(f44482gxszxtbevo.split(this.f44484iobyxmoadg), f44483lqeggnwhkg);
        if (listEmptyList == null) {
            iobyxmoadg(14);
        }
        return listEmptyList;
    }

    public wkgbmnqykc ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        String strZoijcleaow;
        if (gxszxtbevoVar == null) {
            iobyxmoadg(9);
        }
        if (eablkybsjg()) {
            strZoijcleaow = gxszxtbevoVar.zoijcleaow();
        } else {
            strZoijcleaow = this.f44484iobyxmoadg + "." + gxszxtbevoVar.zoijcleaow();
        }
        return new wkgbmnqykc(strZoijcleaow, this, gxszxtbevoVar);
    }

    public String toString() {
        String strZoijcleaow = eablkybsjg() ? f44481eablkybsjg.zoijcleaow() : this.f44484iobyxmoadg;
        if (strZoijcleaow == null) {
            iobyxmoadg(18);
        }
        return strZoijcleaow;
    }

    public String zoijcleaow() {
        String str = this.f44484iobyxmoadg;
        if (str == null) {
            iobyxmoadg(4);
        }
        return str;
    }

    public wkgbmnqykc(String str) {
        if (str == null) {
            iobyxmoadg(2);
        }
        this.f44484iobyxmoadg = str;
    }

    private wkgbmnqykc(String str, wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar) {
        if (str == null) {
            iobyxmoadg(3);
        }
        this.f44484iobyxmoadg = str;
        this.f44485ppxfxbqfkf = wkgbmnqykcVar;
        this.f44486wkgbmnqykc = gxszxtbevoVar;
    }
}
