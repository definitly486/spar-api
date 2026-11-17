package ow1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74890zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74890zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iw1.iobyxmoadg iobyxmoadgVar = this.f74890zoijcleaow;
        if (!iobyxmoadgVar.rgvfuqvkyq()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Object objWypolnanlu = iobyxmoadgVar.wypolnanlu(gxszxtbevoVar);
        return objWypolnanlu == mg.zoijcleaow.gxszxtbevo() ? objWypolnanlu : (List) objWypolnanlu;
    }
}
