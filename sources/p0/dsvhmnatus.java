package p0;

/* JADX INFO: loaded from: classes.dex */
public final class dsvhmnatus implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j0.eablkybsjg f75189iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75190zoijcleaow;

    public dsvhmnatus(j0.eablkybsjg eablkybsjgVar, int i13) {
        this.f75189iobyxmoadg = eablkybsjgVar;
        this.f75190zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsvhmnatus)) {
            return false;
        }
        dsvhmnatus dsvhmnatusVar = (dsvhmnatus) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkf(), dsvhmnatusVar.ppxfxbqfkf()) && this.f75190zoijcleaow == dsvhmnatusVar.f75190zoijcleaow;
    }

    public int hashCode() {
        return (ppxfxbqfkf().hashCode() * 31) + this.f75190zoijcleaow;
    }

    @Override // p0.dxjokdxxww
    public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar.draadjrbmk()) {
            int iGxszxtbevo = wflxmlrfwpVar.gxszxtbevo();
            wflxmlrfwpVar.wflxmlrfwp(wflxmlrfwpVar.gxszxtbevo(), wflxmlrfwpVar.eablkybsjg(), ppxfxbqfkf());
            if (ppxfxbqfkf().length() > 0) {
                wflxmlrfwpVar.agtfadlqog(iGxszxtbevo, ppxfxbqfkf().length() + iGxszxtbevo);
            }
        } else {
            int iGtknphoqwx = wflxmlrfwpVar.gtknphoqwx();
            wflxmlrfwpVar.wflxmlrfwp(wflxmlrfwpVar.gtknphoqwx(), wflxmlrfwpVar.btonecajqb(), ppxfxbqfkf());
            if (ppxfxbqfkf().length() > 0) {
                wflxmlrfwpVar.agtfadlqog(iGtknphoqwx, ppxfxbqfkf().length() + iGtknphoqwx);
            }
        }
        int iLqeggnwhkg = wflxmlrfwpVar.lqeggnwhkg();
        int i13 = this.f75190zoijcleaow;
        wflxmlrfwpVar.ojitshcjhn(zg.gtknphoqwx.agtfadlqog(i13 > 0 ? (iLqeggnwhkg + i13) - 1 : (iLqeggnwhkg + i13) - ppxfxbqfkf().length(), 0, wflxmlrfwpVar.nufgyqmvbu()));
    }

    public final String ppxfxbqfkf() {
        return this.f75189iobyxmoadg.btonecajqb();
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + ppxfxbqfkf() + "', newCursorPosition=" + this.f75190zoijcleaow + ')';
    }

    public final int zoijcleaow() {
        return this.f75190zoijcleaow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dsvhmnatus(String str, int i13) {
        this(new j0.eablkybsjg(str, null, 2, 0 == true ? 1 : 0), i13);
    }
}
