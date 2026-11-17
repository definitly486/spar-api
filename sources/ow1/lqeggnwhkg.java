package ow1;

import java.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f74939ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74940zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74940zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iw1.iobyxmoadg iobyxmoadgVar = this.f74940zoijcleaow;
        iobyxmoadgVar.lqeggnwhkg(iobyxmoadgVar.yggfygwlhe() + 1);
        this.f74940zoijcleaow.eablkybsjg(LocalDate.now().plusDays(2L));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
