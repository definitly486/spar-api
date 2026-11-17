package zx;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements p00.iobyxmoadg.InterfaceC1646iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public eg.iobyxmoadg f131458iobyxmoadg;

    @Override // p00.iobyxmoadg.InterfaceC1646iobyxmoadg
    public p00.iobyxmoadg.InterfaceC1646iobyxmoadg iobyxmoadg(String stringVersion) {
        zdlpuopuiu.btonecajqb(stringVersion, "stringVersion");
        wkgbmnqykc(new eg.iobyxmoadg(stringVersion));
        return this;
    }

    public final eg.iobyxmoadg ppxfxbqfkf() {
        eg.iobyxmoadg iobyxmoadgVar = this.f131458iobyxmoadg;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("version");
        return null;
    }

    public final void wkgbmnqykc(eg.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<set-?>");
        this.f131458iobyxmoadg = iobyxmoadgVar;
    }

    @Override // p00.iobyxmoadg.InterfaceC1646iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public eablkybsjg build() {
        return new eablkybsjg(ppxfxbqfkf());
    }
}
