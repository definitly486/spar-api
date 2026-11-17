package di0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f28993iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f28994ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f28995wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f28996zoijcleaow;

    public iobyxmoadg(String id2, String url, ppxfxbqfkf request, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(request, "request");
        this.f28993iobyxmoadg = id2;
        this.f28996zoijcleaow = url;
        this.f28994ppxfxbqfkf = request;
        this.f28995wkgbmnqykc = ppxfxbqfkfVar;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, String str2, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f28993iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f28996zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            ppxfxbqfkfVar = iobyxmoadgVar.f28994ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            ppxfxbqfkfVar2 = iobyxmoadgVar.f28995wkgbmnqykc;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str2, ppxfxbqfkfVar, ppxfxbqfkfVar2);
    }

    public final ppxfxbqfkf eablkybsjg() {
        return this.f28995wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f28993iobyxmoadg, iobyxmoadgVar.f28993iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f28996zoijcleaow, iobyxmoadgVar.f28996zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f28994ppxfxbqfkf, iobyxmoadgVar.f28994ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f28995wkgbmnqykc, iobyxmoadgVar.f28995wkgbmnqykc);
    }

    public final String gxszxtbevo() {
        return this.f28996zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = ((((this.f28993iobyxmoadg.hashCode() * 31) + this.f28996zoijcleaow.hashCode()) * 31) + this.f28994ppxfxbqfkf.hashCode()) * 31;
        ppxfxbqfkf ppxfxbqfkfVar = this.f28995wkgbmnqykc;
        return iHashCode + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode());
    }

    public final iobyxmoadg iobyxmoadg(String id2, String url, ppxfxbqfkf request, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(request, "request");
        return new iobyxmoadg(id2, url, request, ppxfxbqfkfVar);
    }

    public final String ppxfxbqfkf() {
        return this.f28993iobyxmoadg;
    }

    public String toString() {
        return "NetworkItemEntity(id=" + this.f28993iobyxmoadg + ", url=" + this.f28996zoijcleaow + ", request=" + this.f28994ppxfxbqfkf + ", response=" + this.f28995wkgbmnqykc + ")";
    }

    public final ppxfxbqfkf wkgbmnqykc() {
        return this.f28994ppxfxbqfkf;
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, ppxfxbqfkfVar, (i13 & 8) != 0 ? null : ppxfxbqfkfVar2);
    }
}
