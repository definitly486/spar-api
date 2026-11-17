package vo;

import ca2.wkgbmnqykc;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.tzroggbefp;
import lg.gxszxtbevo;
import lk.cdpycssgdh;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements vo.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f117578iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cllcsxoeiz f117579ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wo.iobyxmoadg f117580zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f117577wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f117576eablkybsjg = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: vo.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C2923ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f117582zdlpuopuiu;

        C2923ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new C2923ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f117582zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wo.iobyxmoadg iobyxmoadgVar = ppxfxbqfkf.this.f117580zoijcleaow;
                so.iobyxmoadg.C2649iobyxmoadg c2649iobyxmoadg = so.iobyxmoadg.C2649iobyxmoadg.f107757iobyxmoadg;
                this.f117582zdlpuopuiu = 1;
                if (iobyxmoadgVar.iobyxmoadg(c2649iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C2923ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f117584zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f117584zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wo.iobyxmoadg iobyxmoadgVar = ppxfxbqfkf.this.f117580zoijcleaow;
                so.iobyxmoadg.zoijcleaow zoijcleaowVar = so.iobyxmoadg.zoijcleaow.f107758iobyxmoadg;
                this.f117584zdlpuopuiu = 1;
                if (iobyxmoadgVar.iobyxmoadg(zoijcleaowVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(wkgbmnqykc userSharedPreferences, wo.iobyxmoadg authEventsObserver, cllcsxoeiz scope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authEventsObserver, "authEventsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        this.f117578iobyxmoadg = userSharedPreferences;
        this.f117580zoijcleaow = authEventsObserver;
        this.f117579ppxfxbqfkf = scope;
    }

    @Override // vo.zoijcleaow
    public zynmafqrjb iobyxmoadg(zynmafqrjb request) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        if (this.f117578iobyxmoadg.lqeggnwhkg() == null) {
            return request;
        }
        zynmafqrjb.iobyxmoadg iobyxmoadgVarNufgyqmvbu = request.nufgyqmvbu();
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str = String.format("Bearer %s", Arrays.copyOf(new Object[]{this.f117578iobyxmoadg.lqeggnwhkg()}, 1));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return iobyxmoadgVarNufgyqmvbu.iobyxmoadg("Authorization", str).zoijcleaow();
    }

    @Override // vo.zoijcleaow
    public void zoijcleaow(cdpycssgdh response) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
        if (response.btonecajqb() == 401) {
            pj.gtknphoqwx.wkgbmnqykc(this.f117579ppxfxbqfkf, null, null, new zoijcleaow(null), 3, null);
            return;
        }
        String strAgtfadlqog = response.lereixgezr(2048L).agtfadlqog();
        if (kcexrzcfyt.sopmlzcsov(strAgtfadlqog, "invalid_token", false, 2, null) || kcexrzcfyt.sopmlzcsov(strAgtfadlqog, "empty_token", false, 2, null)) {
            pj.gtknphoqwx.wkgbmnqykc(this.f117579ppxfxbqfkf, null, null, new C2923ppxfxbqfkf(null), 3, null);
        }
    }
}
