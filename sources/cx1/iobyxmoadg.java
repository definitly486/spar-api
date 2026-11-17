package cx1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.args.MySparWebViewTitle;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MySparWebViewTitle f26107iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f26108ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f26109wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f26110zoijcleaow;

    public iobyxmoadg(MySparWebViewTitle actionBarTitle, String url, boolean z13, String webViewToken) {
        zdlpuopuiu.btonecajqb(actionBarTitle, "actionBarTitle");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(webViewToken, "webViewToken");
        this.f26107iobyxmoadg = actionBarTitle;
        this.f26110zoijcleaow = url;
        this.f26108ppxfxbqfkf = z13;
        this.f26109wkgbmnqykc = webViewToken;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f26107iobyxmoadg, iobyxmoadgVar.f26107iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f26110zoijcleaow, iobyxmoadgVar.f26110zoijcleaow) && this.f26108ppxfxbqfkf == iobyxmoadgVar.f26108ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f26109wkgbmnqykc, iobyxmoadgVar.f26109wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f26107iobyxmoadg.hashCode() * 31) + this.f26110zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f26108ppxfxbqfkf)) * 31) + this.f26109wkgbmnqykc.hashCode();
    }

    public final MySparWebViewTitle iobyxmoadg() {
        return this.f26107iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f26110zoijcleaow;
    }

    public String toString() {
        return "Model(actionBarTitle=" + this.f26107iobyxmoadg + ", url=" + this.f26110zoijcleaow + ", loadWithOverviewMode=" + this.f26108ppxfxbqfkf + ", webViewToken=" + this.f26109wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f26109wkgbmnqykc;
    }

    public final boolean zoijcleaow() {
        return this.f26108ppxfxbqfkf;
    }
}
