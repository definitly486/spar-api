package tf1;

import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final u01.iobyxmoadg f110459ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final uf1.iobyxmoadg f110460wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(u01.iobyxmoadg getDarkModeStateUseCase, uf1.iobyxmoadg changeDarkModeUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(getDarkModeStateUseCase, "getDarkModeStateUseCase");
        zdlpuopuiu.btonecajqb(changeDarkModeUseCase, "changeDarkModeUseCase");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f110459ppxfxbqfkf = getDarkModeStateUseCase;
        this.f110460wkgbmnqykc = changeDarkModeUseCase;
    }

    private final void jhduphickx(oz0.iobyxmoadg iobyxmoadgVar) {
        this.f110460wkgbmnqykc.zoijcleaow(new uf1.iobyxmoadg.C2813iobyxmoadg(iobyxmoadgVar));
        crxdokpmqz(gxszxtbevo.iobyxmoadg.f110449iobyxmoadg);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(wkgbmnqykc action) {
        zdlpuopuiu.btonecajqb(action, "action");
        if (!zdlpuopuiu.eablkybsjg(action, wkgbmnqykc.iobyxmoadg.f110458iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ulzqkzuiru(new lqeggnwhkg.iobyxmoadg((oz0.iobyxmoadg) this.f110459ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
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
