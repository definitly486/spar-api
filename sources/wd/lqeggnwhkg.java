package wd;

import android.util.Log;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.btonecajqb;
import pj.cllcsxoeiz;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d2.eablkybsjg f119364iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private eablkybsjg f119365zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final zoijcleaow f119362ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final g2.wkgbmnqykc.iobyxmoadg f119363wkgbmnqykc = g2.gxszxtbevo.iobyxmoadg("firebase_sessions_enabled");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final g2.wkgbmnqykc.iobyxmoadg f119358eablkybsjg = g2.gxszxtbevo.zoijcleaow("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final g2.wkgbmnqykc.iobyxmoadg f119359gxszxtbevo = g2.gxszxtbevo.wkgbmnqykc("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final g2.wkgbmnqykc.iobyxmoadg f119360lqeggnwhkg = g2.gxszxtbevo.wkgbmnqykc("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final g2.wkgbmnqykc.iobyxmoadg f119361nufgyqmvbu = g2.gxszxtbevo.eablkybsjg("firebase_sessions_cache_updated_time");

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f119367yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f119368zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lqeggnwhkg.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            lqeggnwhkg lqeggnwhkgVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f119367yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVar2 = lqeggnwhkg.this;
                sj.lqeggnwhkg data = lqeggnwhkgVar2.f119364iobyxmoadg.getData();
                this.f119368zdlpuopuiu = lqeggnwhkgVar2;
                this.f119367yggfygwlhe = 1;
                Object objPmvmpeiblj = dxjokdxxww.pmvmpeiblj(data, this);
                if (objPmvmpeiblj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                lqeggnwhkgVar = lqeggnwhkgVar2;
                obj = objPmvmpeiblj;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lqeggnwhkgVar = (lqeggnwhkg) this.f119368zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            lqeggnwhkgVar.draadjrbmk(((g2.wkgbmnqykc) obj).wkgbmnqykc());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f119369jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f119371zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f119371zdlpuopuiu = obj;
            this.f119369jyumaefscl |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.nufgyqmvbu(null, null, this);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f119372cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ g2.wkgbmnqykc.iobyxmoadg f119373iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Object f119374jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f119375yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f119376zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(Object obj, g2.wkgbmnqykc.iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f119374jyumaefscl = obj;
            this.f119373iwizpuwonk = iobyxmoadgVar;
            this.f119372cqumvgiudr = lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f119374jyumaefscl, this.f119373iwizpuwonk, this.f119372cqumvgiudr, gxszxtbevoVar);
            wkgbmnqykcVar.f119375yggfygwlhe = obj;
            return wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f119376zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            g2.iobyxmoadg iobyxmoadgVar = (g2.iobyxmoadg) this.f119375yggfygwlhe;
            Object obj2 = this.f119374jyumaefscl;
            if (obj2 != null) {
                iobyxmoadgVar.dxjokdxxww(this.f119373iwizpuwonk, obj2);
            } else {
                iobyxmoadgVar.nufgyqmvbu(this.f119373iwizpuwonk);
            }
            this.f119372cqumvgiudr.draadjrbmk(iobyxmoadgVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g2.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public lqeggnwhkg(d2.eablkybsjg dataStore) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dataStore, "dataStore");
        this.f119364iobyxmoadg = dataStore;
        btonecajqb.zoijcleaow(null, new iobyxmoadg(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void draadjrbmk(g2.wkgbmnqykc wkgbmnqykcVar) {
        this.f119365zoijcleaow = new eablkybsjg((Boolean) wkgbmnqykcVar.zoijcleaow(f119363wkgbmnqykc), (Double) wkgbmnqykcVar.zoijcleaow(f119358eablkybsjg), (Integer) wkgbmnqykcVar.zoijcleaow(f119359gxszxtbevo), (Integer) wkgbmnqykcVar.zoijcleaow(f119360lqeggnwhkg), (Long) wkgbmnqykcVar.zoijcleaow(f119361nufgyqmvbu));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object nufgyqmvbu(g2.wkgbmnqykc.iobyxmoadg iobyxmoadgVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f119369jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f119369jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj2 = ppxfxbqfkfVar.f119371zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f119369jyumaefscl;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj2);
                d2.eablkybsjg eablkybsjgVar = this.f119364iobyxmoadg;
                wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(obj, iobyxmoadgVar, this, null);
                ppxfxbqfkfVar.f119369jyumaefscl = 1;
                if (g2.lqeggnwhkg.iobyxmoadg(eablkybsjgVar, wkgbmnqykcVar, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj2);
            }
        } catch (IOException e13) {
            Log.w("SettingsCache", "Failed to update cache config value: " + e13);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object agtfadlqog(Boolean bool, lg.gxszxtbevo gxszxtbevoVar) {
        Object objNufgyqmvbu = nufgyqmvbu(f119363wkgbmnqykc, bool, gxszxtbevoVar);
        return objNufgyqmvbu == mg.zoijcleaow.gxszxtbevo() ? objNufgyqmvbu : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object btonecajqb(Integer num, lg.gxszxtbevo gxszxtbevoVar) {
        Object objNufgyqmvbu = nufgyqmvbu(f119360lqeggnwhkg, num, gxszxtbevoVar);
        return objNufgyqmvbu == mg.zoijcleaow.gxszxtbevo() ? objNufgyqmvbu : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object dxjokdxxww(Double d13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objNufgyqmvbu = nufgyqmvbu(f119358eablkybsjg, d13, gxszxtbevoVar);
        return objNufgyqmvbu == mg.zoijcleaow.gxszxtbevo() ? objNufgyqmvbu : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Integer eablkybsjg() {
        eablkybsjg eablkybsjgVar = this.f119365zoijcleaow;
        if (eablkybsjgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("sessionConfigs");
            eablkybsjgVar = null;
        }
        return eablkybsjgVar.wkgbmnqykc();
    }

    public final Object gtknphoqwx(Long l13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objNufgyqmvbu = nufgyqmvbu(f119361nufgyqmvbu, l13, gxszxtbevoVar);
        return objNufgyqmvbu == mg.zoijcleaow.gxszxtbevo() ? objNufgyqmvbu : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Double gxszxtbevo() {
        eablkybsjg eablkybsjgVar = this.f119365zoijcleaow;
        if (eablkybsjgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("sessionConfigs");
            eablkybsjgVar = null;
        }
        return eablkybsjgVar.eablkybsjg();
    }

    public final Boolean lqeggnwhkg() {
        eablkybsjg eablkybsjgVar = this.f119365zoijcleaow;
        if (eablkybsjgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("sessionConfigs");
            eablkybsjgVar = null;
        }
        return eablkybsjgVar.ppxfxbqfkf();
    }

    public final Object wflxmlrfwp(Integer num, lg.gxszxtbevo gxszxtbevoVar) {
        Object objNufgyqmvbu = nufgyqmvbu(f119359gxszxtbevo, num, gxszxtbevoVar);
        return objNufgyqmvbu == mg.zoijcleaow.gxszxtbevo() ? objNufgyqmvbu : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final boolean wkgbmnqykc() {
        eablkybsjg eablkybsjgVar = this.f119365zoijcleaow;
        eablkybsjg eablkybsjgVar2 = null;
        if (eablkybsjgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("sessionConfigs");
            eablkybsjgVar = null;
        }
        Long lZoijcleaow = eablkybsjgVar.zoijcleaow();
        eablkybsjg eablkybsjgVar3 = this.f119365zoijcleaow;
        if (eablkybsjgVar3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("sessionConfigs");
        } else {
            eablkybsjgVar2 = eablkybsjgVar3;
        }
        Integer numIobyxmoadg = eablkybsjgVar2.iobyxmoadg();
        return lZoijcleaow == null || numIobyxmoadg == null || (System.currentTimeMillis() - lZoijcleaow.longValue()) / ((long) 1000) >= ((long) numIobyxmoadg.intValue());
    }
}
