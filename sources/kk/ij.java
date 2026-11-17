package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ij implements xf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final sj.zynmafqrjb f57055iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final sj.wypolnanlu f57056zoijcleaow;

    public ij() {
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(new ln(p10.f58028iobyxmoadg, 6));
        this.f57055iobyxmoadg = zynmafqrjbVarIobyxmoadg;
        this.f57056zoijcleaow = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
    }

    public final ln iobyxmoadg() {
        return (ln) this.f57056zoijcleaow.getValue();
    }

    public final void ppxfxbqfkf(ln income) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(income, "income");
        ei block = new ei(income);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        if (iobyxmoadg().f57485iobyxmoadg instanceof l00) {
            return;
        }
        hl hlVar = income.f57485iobyxmoadg;
        if (!(iobyxmoadg().f57485iobyxmoadg instanceof ylkuphrtab) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(hlVar, yq.f59472iobyxmoadg)) {
            this.f57055iobyxmoadg.setValue(income);
        }
    }

    public final void zoijcleaow(hl income) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(income, "income");
        ch block = new ch(income);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        if (!(iobyxmoadg().f57485iobyxmoadg instanceof ylkuphrtab) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(income, yq.f59472iobyxmoadg)) {
            sj.zynmafqrjb zynmafqrjbVar = this.f57055iobyxmoadg;
            zynmafqrjbVar.setValue(ln.iobyxmoadg((ln) zynmafqrjbVar.getValue(), income, null, false, 6));
        }
    }
}
