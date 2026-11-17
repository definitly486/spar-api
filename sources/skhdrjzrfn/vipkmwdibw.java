package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public final class vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final opjhrmiecq.ydmasvzmpa f107639iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ribwqtqdhb f107640ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f107641wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f107642zoijcleaow;

    public /* synthetic */ vipkmwdibw(opjhrmiecq.ydmasvzmpa ydmasvzmpaVar, long j13, ribwqtqdhb ribwqtqdhbVar, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(ydmasvzmpaVar, j13, ribwqtqdhbVar, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vipkmwdibw)) {
            return false;
        }
        vipkmwdibw vipkmwdibwVar = (vipkmwdibw) obj;
        return this.f107639iobyxmoadg == vipkmwdibwVar.f107639iobyxmoadg && g.eablkybsjg.btonecajqb(this.f107642zoijcleaow, vipkmwdibwVar.f107642zoijcleaow) && this.f107640ppxfxbqfkf == vipkmwdibwVar.f107640ppxfxbqfkf && this.f107641wkgbmnqykc == vipkmwdibwVar.f107641wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f107639iobyxmoadg.hashCode() * 31) + g.eablkybsjg.ojitshcjhn(this.f107642zoijcleaow)) * 31) + this.f107640ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f107641wkgbmnqykc);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f107639iobyxmoadg + ", position=" + ((Object) g.eablkybsjg.kcexrzcfyt(this.f107642zoijcleaow)) + ", anchor=" + this.f107640ppxfxbqfkf + ", visible=" + this.f107641wkgbmnqykc + ')';
    }

    private vipkmwdibw(opjhrmiecq.ydmasvzmpa ydmasvzmpaVar, long j13, ribwqtqdhb ribwqtqdhbVar, boolean z13) {
        this.f107639iobyxmoadg = ydmasvzmpaVar;
        this.f107642zoijcleaow = j13;
        this.f107640ppxfxbqfkf = ribwqtqdhbVar;
        this.f107641wkgbmnqykc = z13;
    }
}
