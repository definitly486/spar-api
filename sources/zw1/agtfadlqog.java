package zw1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f131443iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f131444ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f131445zoijcleaow;

    public agtfadlqog(String url, boolean z13, String str) {
        zdlpuopuiu.btonecajqb(url, "url");
        this.f131443iobyxmoadg = url;
        this.f131445zoijcleaow = z13;
        this.f131444ppxfxbqfkf = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f131443iobyxmoadg, agtfadlqogVar.f131443iobyxmoadg) && this.f131445zoijcleaow == agtfadlqogVar.f131445zoijcleaow && zdlpuopuiu.eablkybsjg(this.f131444ppxfxbqfkf, agtfadlqogVar.f131444ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f131443iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f131445zoijcleaow)) * 31;
        String str = this.f131444ppxfxbqfkf;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f131444ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f131445zoijcleaow;
    }

    public String toString() {
        return "Model(url=" + this.f131443iobyxmoadg + ", isChatOrderEnabled=" + this.f131445zoijcleaow + ", token=" + this.f131444ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f131443iobyxmoadg;
    }
}
