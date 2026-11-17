package ti0;

import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final l20.iobyxmoadg f110569ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ui0.iobyxmoadg f110570wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(l20.iobyxmoadg getDarkModeStateUseCase, ui0.iobyxmoadg changeDarkModeUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(getDarkModeStateUseCase, "getDarkModeStateUseCase");
        zdlpuopuiu.btonecajqb(changeDarkModeUseCase, "changeDarkModeUseCase");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f110569ppxfxbqfkf = getDarkModeStateUseCase;
        this.f110570wkgbmnqykc = changeDarkModeUseCase;
    }

    private final void jhduphickx(x00.iobyxmoadg iobyxmoadgVar) {
        this.f110570wkgbmnqykc.zoijcleaow(new ui0.iobyxmoadg.C2818iobyxmoadg(iobyxmoadgVar));
        crxdokpmqz(gxszxtbevo.iobyxmoadg.f110559iobyxmoadg);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(wkgbmnqykc action) {
        zdlpuopuiu.btonecajqb(action, "action");
        if (!zdlpuopuiu.eablkybsjg(action, wkgbmnqykc.iobyxmoadg.f110568iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ulzqkzuiru(new lqeggnwhkg.iobyxmoadg((x00.iobyxmoadg) this.f110569ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(eablkybsjg intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (!(intent instanceof eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        jhduphickx(((eablkybsjg.iobyxmoadg) intent).iobyxmoadg());
    }
}
