package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class ojitshcjhn extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74949zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojitshcjhn(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74949zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iw1.iobyxmoadg iobyxmoadgVar = this.f74949zoijcleaow;
        if (!iobyxmoadgVar.rgvfuqvkyq()) {
            return new nw1.nufgyqmvbu(hg.jyumaefscl.wflxmlrfwp(), hg.jyumaefscl.wflxmlrfwp());
        }
        Object objStevsuqkhv = iobyxmoadgVar.stevsuqkhv(gxszxtbevoVar);
        return objStevsuqkhv == mg.zoijcleaow.gxszxtbevo() ? objStevsuqkhv : (nw1.nufgyqmvbu) objStevsuqkhv;
    }
}
