package j61;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.proloyalty.domain.feature.qrcode.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f50808ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f50809wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f50808ppxfxbqfkf = storeFactory;
        this.f50809wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f50808ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.f50810iobyxmoadg), this.f50809wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((QrCodeArgs) gxszxtbevo()).getTitle(), ((QrCodeArgs) gxszxtbevo()).getDesc(), ((QrCodeArgs) gxszxtbevo()).getQrCode(), ((QrCodeArgs) gxszxtbevo()).getProductTitle(), ((QrCodeArgs) gxszxtbevo()).getImage(), ((QrCodeArgs) gxszxtbevo()).getProductPrice(), ((QrCodeArgs) gxszxtbevo()).getOldPrice(), ((QrCodeArgs) gxszxtbevo()).getMeasure(), ((QrCodeArgs) gxszxtbevo()).getUnit(), ((QrCodeArgs) gxszxtbevo()).getUseUnit(), ((QrCodeArgs) gxszxtbevo()).getButton());
    }
}
