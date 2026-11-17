package gn0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import q11.btonecajqb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f37969ppxfxbqfkf;

    /* JADX INFO: renamed from: gn0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0862iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f37971zdlpuopuiu;

        C0862iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C0862iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f37971zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ikoacuggdj();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C0862iobyxmoadg) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f37969ppxfxbqfkf = dispatchersProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ikoacuggdj() {
        crxdokpmqz(eablkybsjg.iobyxmoadg.f37968iobyxmoadg);
    }

    private final void okpsazkaxt() {
        btonecajqb.wkgbmnqykc(sopmlzcsov(), (104 & 2) != 0 ? 0L : 0L, (104 & 4) != 0 ? 1000L : 0L, (104 & 8) != 0 ? null : null, 5, (104 & 32) != 0 ? new btonecajqb.iobyxmoadg(null) : null, (104 & 64) != 0 ? new btonecajqb.zoijcleaow(null) : null, (104 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new btonecajqb.ppxfxbqfkf(null) : new C0862iobyxmoadg(null), (104 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new btonecajqb.wkgbmnqykc(null) : null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f37975iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ikoacuggdj();
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ppxfxbqfkf.iobyxmoadg.f37974iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        okpsazkaxt();
    }
}
