package p0;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j0.eablkybsjg f75228iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75229zoijcleaow;

    public iobyxmoadg(j0.eablkybsjg eablkybsjgVar, int i13) {
        this.f75228iobyxmoadg = eablkybsjgVar;
        this.f75229zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkf(), iobyxmoadgVar.ppxfxbqfkf()) && this.f75229zoijcleaow == iobyxmoadgVar.f75229zoijcleaow;
    }

    public int hashCode() {
        return (ppxfxbqfkf().hashCode() * 31) + this.f75229zoijcleaow;
    }

    @Override // p0.dxjokdxxww
    public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar.draadjrbmk()) {
            wflxmlrfwpVar.wflxmlrfwp(wflxmlrfwpVar.gxszxtbevo(), wflxmlrfwpVar.eablkybsjg(), ppxfxbqfkf());
        } else {
            wflxmlrfwpVar.wflxmlrfwp(wflxmlrfwpVar.gtknphoqwx(), wflxmlrfwpVar.btonecajqb(), ppxfxbqfkf());
        }
        int iLqeggnwhkg = wflxmlrfwpVar.lqeggnwhkg();
        int i13 = this.f75229zoijcleaow;
        wflxmlrfwpVar.ojitshcjhn(zg.gtknphoqwx.agtfadlqog(i13 > 0 ? (iLqeggnwhkg + i13) - 1 : (iLqeggnwhkg + i13) - ppxfxbqfkf().length(), 0, wflxmlrfwpVar.nufgyqmvbu()));
    }

    public final String ppxfxbqfkf() {
        return this.f75228iobyxmoadg.btonecajqb();
    }

    public String toString() {
        return "CommitTextCommand(text='" + ppxfxbqfkf() + "', newCursorPosition=" + this.f75229zoijcleaow + ')';
    }

    public final int zoijcleaow() {
        return this.f75229zoijcleaow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iobyxmoadg(String str, int i13) {
        this(new j0.eablkybsjg(str, null, 2, 0 == true ? 1 : 0), i13);
    }
}
