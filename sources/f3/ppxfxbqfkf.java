package f3;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f32688eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f32689iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final androidx.media3.common.iobyxmoadg f32690ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f32691wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final androidx.media3.common.iobyxmoadg f32692zoijcleaow;

    public ppxfxbqfkf(String str, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2, int i13, int i14) {
        y2.iobyxmoadg.iobyxmoadg(i13 == 0 || i14 == 0);
        this.f32689iobyxmoadg = y2.iobyxmoadg.wkgbmnqykc(str);
        this.f32692zoijcleaow = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        this.f32690ppxfxbqfkf = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar2);
        this.f32691wkgbmnqykc = i13;
        this.f32688eablkybsjg = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ppxfxbqfkf.class != obj.getClass()) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f32691wkgbmnqykc == ppxfxbqfkfVar.f32691wkgbmnqykc && this.f32688eablkybsjg == ppxfxbqfkfVar.f32688eablkybsjg && this.f32689iobyxmoadg.equals(ppxfxbqfkfVar.f32689iobyxmoadg) && this.f32692zoijcleaow.equals(ppxfxbqfkfVar.f32692zoijcleaow) && this.f32690ppxfxbqfkf.equals(ppxfxbqfkfVar.f32690ppxfxbqfkf);
    }

    public int hashCode() {
        return ((((((((527 + this.f32691wkgbmnqykc) * 31) + this.f32688eablkybsjg) * 31) + this.f32689iobyxmoadg.hashCode()) * 31) + this.f32692zoijcleaow.hashCode()) * 31) + this.f32690ppxfxbqfkf.hashCode();
    }
}
