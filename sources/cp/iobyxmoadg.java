package cp;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import k30.wflxmlrfwp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C0443iobyxmoadg f25462ppxfxbqfkf = new C0443iobyxmoadg(null);

    /* JADX INFO: renamed from: cp.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0443iobyxmoadg {
        public /* synthetic */ C0443iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0443iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f25464zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f25464zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.okpsazkaxt();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final void ikoacuggdj() {
        wflxmlrfwp.wkgbmnqykc(sopmlzcsov(), (110 & 2) != 0 ? 0L : 0L, (110 & 4) != 0 ? 1000L : 0L, (110 & 8) != 0 ? null : null, 5, (110 & 32) != 0 ? new wflxmlrfwp.iobyxmoadg(null) : null, (110 & 64) != 0 ? new wflxmlrfwp.zoijcleaow(null) : null, (110 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new wflxmlrfwp.ppxfxbqfkf(null) : new zoijcleaow(null), (110 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new wflxmlrfwp.wkgbmnqykc(null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void okpsazkaxt() {
        crxdokpmqz(eablkybsjg.iobyxmoadg.f25461iobyxmoadg);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f25468iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        okpsazkaxt();
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ikoacuggdj();
    }
}
