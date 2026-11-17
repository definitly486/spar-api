package c90;

import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends ft.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final b90.iobyxmoadg f19336iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f19337zoijcleaow;

    public eablkybsjg(b90.iobyxmoadg echecksLocalSource, zoijcleaow disableEchecksDialogUseCase) {
        zdlpuopuiu.btonecajqb(echecksLocalSource, "echecksLocalSource");
        zdlpuopuiu.btonecajqb(disableEchecksDialogUseCase, "disableEchecksDialogUseCase");
        this.f19336iobyxmoadg = echecksLocalSource;
        this.f19337zoijcleaow = disableEchecksDialogUseCase;
    }

    private final void wkgbmnqykc() {
        b90.iobyxmoadg iobyxmoadgVar = this.f19336iobyxmoadg;
        iobyxmoadgVar.zoijcleaow(iobyxmoadgVar.wkgbmnqykc() + 1);
        this.f19336iobyxmoadg.iobyxmoadg(LocalDateTime.now().plusDays(2L));
    }

    @Override // ft.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((wwaezpbzkn) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(wwaezpbzkn parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        if (this.f19336iobyxmoadg.wkgbmnqykc() < 2) {
            wkgbmnqykc();
        } else {
            this.f19337zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        }
    }
}
