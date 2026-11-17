package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
final class metgxyhuhe implements b2 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f43423iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f43424ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f43425zoijcleaow;

    public /* synthetic */ metgxyhuhe(long j13, long j14, long j15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, j14, j15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || metgxyhuhe.class != obj.getClass()) {
            return false;
        }
        metgxyhuhe metgxyhuheVar = (metgxyhuhe) obj;
        return h.oipsdeybqn.ojitshcjhn(this.f43423iobyxmoadg, metgxyhuheVar.f43423iobyxmoadg) && h.oipsdeybqn.ojitshcjhn(this.f43425zoijcleaow, metgxyhuheVar.f43425zoijcleaow) && h.oipsdeybqn.ojitshcjhn(this.f43424ppxfxbqfkf, metgxyhuheVar.f43424ppxfxbqfkf);
    }

    public int hashCode() {
        return (((h.oipsdeybqn.yggfygwlhe(this.f43423iobyxmoadg) * 31) + h.oipsdeybqn.yggfygwlhe(this.f43425zoijcleaow)) * 31) + h.oipsdeybqn.yggfygwlhe(this.f43424ppxfxbqfkf);
    }

    @Override // igdgnonuha.b2
    public androidx.compose.runtime.i1 iobyxmoadg(boolean z13, boolean z14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        long j13;
        androidx.compose.runtime.i1 i1VarAgtfadlqog;
        draadjrbmkVar.sopmlzcsov(1243421834);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1243421834, i13, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:176)");
        }
        if (z13) {
            j13 = !z14 ? this.f43425zoijcleaow : this.f43423iobyxmoadg;
        } else {
            j13 = this.f43424ppxfxbqfkf;
        }
        long j14 = j13;
        if (z13) {
            draadjrbmkVar.sopmlzcsov(-1312642667);
            i1VarAgtfadlqog = ribwqtqdhb.oxmwwwfdhm.iobyxmoadg(j14, vipkmwdibw.draadjrbmk.draadjrbmk(100, 0, null, 6, null), null, null, draadjrbmkVar, 48, 12);
            draadjrbmkVar.stevsuqkhv();
        } else {
            draadjrbmkVar.sopmlzcsov(-1312539964);
            i1VarAgtfadlqog = androidx.compose.runtime.v0.agtfadlqog(h.oipsdeybqn.dxjokdxxww(j14), draadjrbmkVar, 0);
            draadjrbmkVar.stevsuqkhv();
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return i1VarAgtfadlqog;
    }

    private metgxyhuhe(long j13, long j14, long j15) {
        this.f43423iobyxmoadg = j13;
        this.f43425zoijcleaow = j14;
        this.f43424ppxfxbqfkf = j15;
    }
}
