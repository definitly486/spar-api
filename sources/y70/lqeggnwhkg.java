package y70;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.domain.feature.qrcode.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f124026ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f124027zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f124027zoijcleaow = storeFactory;
        this.f124026ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((QrCodeArgs) gxszxtbevo()).getTitle(), ((QrCodeArgs) gxszxtbevo()).getDesc(), ((QrCodeArgs) gxszxtbevo()).getQrCode(), ((QrCodeArgs) gxszxtbevo()).getProductTitle(), ((QrCodeArgs) gxszxtbevo()).getImage(), ((QrCodeArgs) gxszxtbevo()).getProductPrice(), ((QrCodeArgs) gxszxtbevo()).getOldPrice(), ((QrCodeArgs) gxszxtbevo()).getMeasure(), ((QrCodeArgs) gxszxtbevo()).getUnit(), ((QrCodeArgs) gxszxtbevo()).getUseUnit(), ((QrCodeArgs) gxszxtbevo()).getButton());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f124027zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.f124028iobyxmoadg), this.f124026ppxfxbqfkf, new zoijcleaow());
    }
}
