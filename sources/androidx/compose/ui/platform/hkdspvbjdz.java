package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz implements h, pj.cllcsxoeiz {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final AtomicReference f6947iwizpuwonk = a.agtfadlqog.iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final pj.cllcsxoeiz f6948jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final p0.ntlheqmsrt f6949yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final View f6950zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f6951jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f6953zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f6953zdlpuopuiu = obj;
            this.f6951jyumaefscl |= Integer.MIN_VALUE;
            return hkdspvbjdz.this.iobyxmoadg(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f6955jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f6956yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f6957zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f6958yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ipoelvxyzq f6959zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ipoelvxyzq ipoelvxyzqVar, hkdspvbjdz hkdspvbjdzVar) {
                super(1);
                this.f6959zdlpuopuiu = ipoelvxyzqVar;
                this.f6958yggfygwlhe = hkdspvbjdzVar;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable th2) {
                this.f6959zdlpuopuiu.wkgbmnqykc();
                this.f6958yggfygwlhe.f6949yggfygwlhe.gxszxtbevo();
            }
        }

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = hkdspvbjdz.this.new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f6955jyumaefscl = obj;
            return ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f6956yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ipoelvxyzq ipoelvxyzqVar = (ipoelvxyzq) this.f6955jyumaefscl;
                hkdspvbjdz hkdspvbjdzVar = hkdspvbjdz.this;
                this.f6955jyumaefscl = ipoelvxyzqVar;
                this.f6957zdlpuopuiu = hkdspvbjdzVar;
                this.f6956yggfygwlhe = 1;
                pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(this), 1);
                rgvfuqvkyqVar.lereixgezr();
                hkdspvbjdzVar.f6949yggfygwlhe.eablkybsjg();
                rgvfuqvkyqVar.stevsuqkhv(new iobyxmoadg(ipoelvxyzqVar, hkdspvbjdzVar));
                Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
                if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(this);
                }
                if (objZdlpuopuiu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ipoelvxyzq ipoelvxyzqVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(ipoelvxyzqVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f6960yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ e f6961zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f6962zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(hkdspvbjdz hkdspvbjdzVar) {
                super(0);
                this.f6962zdlpuopuiu = hkdspvbjdzVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                pj.dsvhmnatus.eablkybsjg(this.f6962zdlpuopuiu.f6948jyumaefscl, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(e eVar, hkdspvbjdz hkdspvbjdzVar) {
            super(1);
            this.f6961zdlpuopuiu = eVar;
            this.f6960yggfygwlhe = hkdspvbjdzVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ipoelvxyzq invoke(pj.cllcsxoeiz cllcsxoeizVar) {
            return new ipoelvxyzq(this.f6961zdlpuopuiu, new iobyxmoadg(this.f6960yggfygwlhe));
        }
    }

    public hkdspvbjdz(View view, p0.ntlheqmsrt ntlheqmsrtVar, pj.cllcsxoeiz cllcsxoeizVar) {
        this.f6950zdlpuopuiu = view;
        this.f6949yggfygwlhe = ntlheqmsrtVar;
        this.f6948jyumaefscl = cllcsxoeizVar;
    }

    public final boolean eablkybsjg() {
        ipoelvxyzq ipoelvxyzqVar = (ipoelvxyzq) a.agtfadlqog.ppxfxbqfkf(this.f6947iwizpuwonk);
        return ipoelvxyzqVar != null && ipoelvxyzqVar.eablkybsjg();
    }

    @Override // pj.cllcsxoeiz
    public lg.btonecajqb getCoroutineContext() {
        return this.f6948jyumaefscl.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.h
    public View getView() {
        return this.f6950zdlpuopuiu;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.h
    public Object iobyxmoadg(e eVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f6951jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f6951jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f6953zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f6951jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            AtomicReference atomicReference = this.f6947iwizpuwonk;
            zoijcleaow zoijcleaowVar = new zoijcleaow(eVar, this);
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(null);
            iobyxmoadgVar.f6951jyumaefscl = 1;
            if (a.agtfadlqog.wkgbmnqykc(atomicReference, zoijcleaowVar, ppxfxbqfkfVar, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final InputConnection wkgbmnqykc(EditorInfo editorInfo) {
        ipoelvxyzq ipoelvxyzqVar = (ipoelvxyzq) a.agtfadlqog.ppxfxbqfkf(this.f6947iwizpuwonk);
        if (ipoelvxyzqVar != null) {
            return ipoelvxyzqVar.ppxfxbqfkf(editorInfo);
        }
        return null;
    }
}
