package ii;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f44488wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f44489iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f44490ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f44491zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ zoijcleaow zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, boolean z13, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                z13 = false;
            }
            return iobyxmoadgVar.iobyxmoadg(str, z13);
        }

        public final zoijcleaow iobyxmoadg(String string, boolean z13) {
            String strHcddaimhww;
            String str;
            zdlpuopuiu.btonecajqb(string, "string");
            int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(string, '`', 0, false, 6, null);
            if (iYfnezrywwk == -1) {
                iYfnezrywwk = string.length();
            }
            int iIyctptxqzt = kcexrzcfyt.iyctptxqzt(string, CardDateFormatTextWatcher.DIVIDER_CHARACTER, iYfnezrywwk, false, 4, null);
            if (iIyctptxqzt == -1) {
                strHcddaimhww = kcexrzcfyt.hcddaimhww(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iIyctptxqzt);
                zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                String strPkzmftpjix = kcexrzcfyt.pkzmftpjix(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = string.substring(iIyctptxqzt + 1);
                zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
                strHcddaimhww = kcexrzcfyt.hcddaimhww(strSubstring2, "`", "", false, 4, null);
                str = strPkzmftpjix;
            }
            return new zoijcleaow(new ppxfxbqfkf(str), new ppxfxbqfkf(strHcddaimhww), z13);
        }

        public final zoijcleaow ppxfxbqfkf(ppxfxbqfkf topLevelFqName) {
            zdlpuopuiu.btonecajqb(topLevelFqName, "topLevelFqName");
            ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = topLevelFqName.eablkybsjg();
            zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "parent(...)");
            gxszxtbevo gxszxtbevoVarLqeggnwhkg = topLevelFqName.lqeggnwhkg();
            zdlpuopuiu.dxjokdxxww(gxszxtbevoVarLqeggnwhkg, "shortName(...)");
            return new zoijcleaow(ppxfxbqfkfVarEablkybsjg, gxszxtbevoVarLqeggnwhkg);
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(ppxfxbqfkf packageFqName, ppxfxbqfkf relativeClassName, boolean z13) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        zdlpuopuiu.btonecajqb(relativeClassName, "relativeClassName");
        this.f44489iobyxmoadg = packageFqName;
        this.f44491zoijcleaow = relativeClassName;
        this.f44490ppxfxbqfkf = z13;
        relativeClassName.wkgbmnqykc();
    }

    public static final zoijcleaow gtknphoqwx(ppxfxbqfkf ppxfxbqfkfVar) {
        return f44488wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar);
    }

    private static final String ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        String strZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        if (!kcexrzcfyt.ulzqkzuiru(strZoijcleaow, '/', false, 2, null)) {
            return strZoijcleaow;
        }
        return '`' + strZoijcleaow + '`';
    }

    public final boolean btonecajqb() {
        return !this.f44491zoijcleaow.eablkybsjg().wkgbmnqykc();
    }

    public final boolean dxjokdxxww() {
        return this.f44490ppxfxbqfkf;
    }

    public final zoijcleaow eablkybsjg() {
        ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = this.f44491zoijcleaow.eablkybsjg();
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "parent(...)");
        if (ppxfxbqfkfVarEablkybsjg.wkgbmnqykc()) {
            return null;
        }
        return new zoijcleaow(this.f44489iobyxmoadg, ppxfxbqfkfVarEablkybsjg, this.f44490ppxfxbqfkf);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f44489iobyxmoadg, zoijcleaowVar.f44489iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44491zoijcleaow, zoijcleaowVar.f44491zoijcleaow) && this.f44490ppxfxbqfkf == zoijcleaowVar.f44490ppxfxbqfkf;
    }

    public final ppxfxbqfkf gxszxtbevo() {
        return this.f44489iobyxmoadg;
    }

    public int hashCode() {
        return (((this.f44489iobyxmoadg.hashCode() * 31) + this.f44491zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f44490ppxfxbqfkf);
    }

    public final ppxfxbqfkf iobyxmoadg() {
        if (this.f44489iobyxmoadg.wkgbmnqykc()) {
            return this.f44491zoijcleaow;
        }
        return new ppxfxbqfkf(this.f44489iobyxmoadg.zoijcleaow() + '.' + this.f44491zoijcleaow.zoijcleaow());
    }

    public final ppxfxbqfkf lqeggnwhkg() {
        return this.f44491zoijcleaow;
    }

    public final gxszxtbevo nufgyqmvbu() {
        gxszxtbevo gxszxtbevoVarLqeggnwhkg = this.f44491zoijcleaow.lqeggnwhkg();
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarLqeggnwhkg, "shortName(...)");
        return gxszxtbevoVarLqeggnwhkg;
    }

    public String toString() {
        if (!this.f44489iobyxmoadg.wkgbmnqykc()) {
            return zoijcleaow();
        }
        return '/' + zoijcleaow();
    }

    public final zoijcleaow wkgbmnqykc(gxszxtbevo name) {
        zdlpuopuiu.btonecajqb(name, "name");
        ppxfxbqfkf ppxfxbqfkfVar = this.f44489iobyxmoadg;
        ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = this.f44491zoijcleaow.ppxfxbqfkf(name);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "child(...)");
        return new zoijcleaow(ppxfxbqfkfVar, ppxfxbqfkfVarPpxfxbqfkf, this.f44490ppxfxbqfkf);
    }

    public final String zoijcleaow() {
        if (this.f44489iobyxmoadg.wkgbmnqykc()) {
            return ppxfxbqfkf(this.f44491zoijcleaow);
        }
        StringBuilder sb3 = new StringBuilder();
        String strZoijcleaow = this.f44489iobyxmoadg.zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        sb3.append(kcexrzcfyt.pkzmftpjix(strZoijcleaow, '.', '/', false, 4, null));
        sb3.append(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
        sb3.append(ppxfxbqfkf(this.f44491zoijcleaow));
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zoijcleaow(ppxfxbqfkf packageFqName, gxszxtbevo topLevelName) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        zdlpuopuiu.btonecajqb(topLevelName, "topLevelName");
        ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = ppxfxbqfkf.gtknphoqwx(topLevelName);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarGtknphoqwx, "topLevel(...)");
        this(packageFqName, ppxfxbqfkfVarGtknphoqwx, false);
    }
}
