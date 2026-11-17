package lw1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import nj.wkgbmnqykc;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.user.domain.model.UserNews;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements lw1.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final AtomicLong f64313eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iw1.iobyxmoadg f64314iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private auzgnhcxok f64315ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private auzgnhcxok f64316wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cllcsxoeiz f64317zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f64319yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64320zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = ppxfxbqfkf.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f64319yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f64320zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f64319yggfygwlhe;
                nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
                long jKcexrzcfyt = nj.ppxfxbqfkf.kcexrzcfyt(1, wkgbmnqykc.MINUTES);
                this.f64319yggfygwlhe = cllcsxoeizVar;
                this.f64320zdlpuopuiu = 1;
                if (crxdokpmqz.ppxfxbqfkf(jKcexrzcfyt, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ppxfxbqfkfVar.zoijcleaow();
                kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f64321jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64323zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(long j13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f64321jyumaefscl = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new zoijcleaow(this.f64321jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f64323zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    iw1.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkfVar.f64314iobyxmoadg;
                    this.f64323zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.nufgyqmvbu(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((UserNews) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            UserNews userNews = (UserNews) (this.f64321jyumaefscl >= ppxfxbqfkf.this.f64313eablkybsjg.get() ? objWkgbmnqykc : null);
            if (userNews != null) {
                ppxfxbqfkf.this.dxjokdxxww(userNews);
            }
            ppxfxbqfkf.this.nufgyqmvbu();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(iw1.iobyxmoadg userRepository, cllcsxoeiz coroutineScope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineScope, "coroutineScope");
        this.f64314iobyxmoadg = userRepository;
        this.f64317zoijcleaow = coroutineScope;
        this.f64313eablkybsjg = new AtomicLong(0L);
    }

    private final void btonecajqb() {
        auzgnhcxok auzgnhcxokVar = this.f64316wkgbmnqykc;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f64316wkgbmnqykc = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dxjokdxxww(UserNews userNews) {
        this.f64314iobyxmoadg.ntlheqmsrt(userNews);
    }

    private final void gtknphoqwx() {
        long jIncrementAndGet = this.f64313eablkybsjg.incrementAndGet();
        btonecajqb();
        this.f64316wkgbmnqykc = gtknphoqwx.wkgbmnqykc(this.f64317zoijcleaow, null, null, new zoijcleaow(jIncrementAndGet, null), 3, null);
    }

    private final boolean lqeggnwhkg() {
        return this.f64314iobyxmoadg.rgvfuqvkyq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nufgyqmvbu() {
        iobyxmoadg();
        if (lqeggnwhkg()) {
            this.f64315ppxfxbqfkf = gtknphoqwx.wkgbmnqykc(this.f64317zoijcleaow, null, null, new iobyxmoadg(null), 3, null);
        }
    }

    @Override // lw1.zoijcleaow
    public void iobyxmoadg() {
        auzgnhcxok auzgnhcxokVar = this.f64315ppxfxbqfkf;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f64315ppxfxbqfkf = null;
    }

    @Override // lw1.zoijcleaow
    public void zoijcleaow() {
        if (lqeggnwhkg()) {
            iobyxmoadg();
            gtknphoqwx();
        } else {
            iobyxmoadg();
            btonecajqb();
            this.f64313eablkybsjg.incrementAndGet();
            dxjokdxxww(UserNews.INSTANCE.iobyxmoadg());
        }
    }
}
