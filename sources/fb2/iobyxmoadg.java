package fb2;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.webview_screen.impl.myspar.domain.args.MySparWebViewTitle;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MySparWebViewTitle f33401iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f33402ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f33403zoijcleaow;

    public iobyxmoadg(MySparWebViewTitle actionBarTitle, String url, boolean z13) {
        zdlpuopuiu.btonecajqb(actionBarTitle, "actionBarTitle");
        zdlpuopuiu.btonecajqb(url, "url");
        this.f33401iobyxmoadg = actionBarTitle;
        this.f33403zoijcleaow = url;
        this.f33402ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f33401iobyxmoadg, iobyxmoadgVar.f33401iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f33403zoijcleaow, iobyxmoadgVar.f33403zoijcleaow) && this.f33402ppxfxbqfkf == iobyxmoadgVar.f33402ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f33401iobyxmoadg.hashCode() * 31) + this.f33403zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f33402ppxfxbqfkf);
    }

    public final MySparWebViewTitle iobyxmoadg() {
        return this.f33401iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f33403zoijcleaow;
    }

    public String toString() {
        return "Model(actionBarTitle=" + this.f33401iobyxmoadg + ", url=" + this.f33403zoijcleaow + ", loadWithOverviewMode=" + this.f33402ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f33402ppxfxbqfkf;
    }
}
