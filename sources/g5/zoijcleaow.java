package g5;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;
import g.draadjrbmk;
import g.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import tg.rgvfuqvkyq;
import v2.cdpycssgdh;
import v2.esjtqupxsv;
import v2.jpowsppfya;
import v2.lereixgezr;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Object f36208eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final esjtqupxsv f36209iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iwxlajgraz f36210ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f36211wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwxlajgraz f36212zoijcleaow;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f36213jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f36215zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f36215zdlpuopuiu = obj;
            this.f36213jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.gxszxtbevo(this);
        }
    }

    public zoijcleaow(esjtqupxsv player) {
        zdlpuopuiu.btonecajqb(player, "player");
        this.f36209iobyxmoadg = player;
        this.f36212zoijcleaow = c1.ppxfxbqfkf(ppxfxbqfkf(player), null, 2, null);
        this.f36210ppxfxbqfkf = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
    }

    private final boolean btonecajqb(esjtqupxsv esjtqupxsvVar) {
        cdpycssgdh cdpycssgdhVarJyumaefscl = esjtqupxsvVar.kcexrzcfyt(17) ? esjtqupxsvVar.jyumaefscl() : cdpycssgdh.f115259iobyxmoadg;
        zdlpuopuiu.lqeggnwhkg(cdpycssgdhVarJyumaefscl);
        if (cdpycssgdhVarJyumaefscl.vdvldrhtss()) {
            this.f36208eablkybsjg = null;
            return false;
        }
        cdpycssgdh.zoijcleaow zoijcleaowVar = new cdpycssgdh.zoijcleaow();
        if (!esjtqupxsvVar.kcexrzcfyt(30) || esjtqupxsvVar.ojitshcjhn().zoijcleaow()) {
            Object obj = this.f36208eablkybsjg;
            if (obj != null) {
                int iZoijcleaow = cdpycssgdhVarJyumaefscl.zoijcleaow(obj);
                if (iZoijcleaow != -1) {
                    if (esjtqupxsvVar.mbcevpiqjq() == cdpycssgdhVarJyumaefscl.gxszxtbevo(iZoijcleaow, zoijcleaowVar).f115304ppxfxbqfkf) {
                        return true;
                    }
                }
                this.f36208eablkybsjg = null;
            }
        } else {
            this.f36208eablkybsjg = cdpycssgdhVarJyumaefscl.lqeggnwhkg(esjtqupxsvVar.pkzmftpjix(), zoijcleaowVar, true).f115306zoijcleaow;
        }
        return false;
    }

    private final void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
        this.f36212zoijcleaow.setValue(gtknphoqwxVar);
    }

    private final void eablkybsjg(esjtqupxsv esjtqupxsvVar) {
        boolean z13 = esjtqupxsvVar.kcexrzcfyt(30) && !esjtqupxsvVar.ojitshcjhn().zoijcleaow();
        if (btonecajqb(esjtqupxsvVar)) {
            return;
        }
        if (!this.f36211wkgbmnqykc && !z13) {
            nufgyqmvbu(true);
        }
        if (!z13 || wkgbmnqykc()) {
            return;
        }
        nufgyqmvbu(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(zoijcleaow zoijcleaowVar, esjtqupxsv listen, esjtqupxsv.ppxfxbqfkf events) {
        zdlpuopuiu.btonecajqb(listen, "$this$listen");
        zdlpuopuiu.btonecajqb(events, "events");
        if (events.iobyxmoadg(25) && !zdlpuopuiu.eablkybsjg(listen.jpowsppfya(), jpowsppfya.f115374eablkybsjg) && listen.tzroggbefp() != 1) {
            zoijcleaowVar.dxjokdxxww(zoijcleaowVar.ppxfxbqfkf(zoijcleaowVar.f36209iobyxmoadg));
        }
        if (events.iobyxmoadg(26)) {
            zoijcleaowVar.nufgyqmvbu(false);
        }
        if (events.iobyxmoadg(2)) {
            zoijcleaowVar.eablkybsjg(zoijcleaowVar.f36209iobyxmoadg);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void nufgyqmvbu(boolean z13) {
        this.f36210ppxfxbqfkf.setValue(Boolean.valueOf(z13));
    }

    private final gtknphoqwx ppxfxbqfkf(esjtqupxsv esjtqupxsvVar) {
        long jIobyxmoadg = draadjrbmk.iobyxmoadg(esjtqupxsvVar.jpowsppfya().f115378iobyxmoadg, esjtqupxsvVar.jpowsppfya().f115381zoijcleaow);
        if (gtknphoqwx.gtknphoqwx(jIobyxmoadg) == 0.0f || gtknphoqwx.dxjokdxxww(jIobyxmoadg) == 0.0f) {
            return null;
        }
        float f13 = esjtqupxsvVar.jpowsppfya().f115380wkgbmnqykc;
        double d13 = f13;
        if (d13 < 1.0d) {
            jIobyxmoadg = gtknphoqwx.gxszxtbevo(jIobyxmoadg, gtknphoqwx.gtknphoqwx(jIobyxmoadg) * f13, 0.0f, 2, null);
        } else if (d13 > 1.0d) {
            jIobyxmoadg = gtknphoqwx.gxszxtbevo(jIobyxmoadg, 0.0f, gtknphoqwx.dxjokdxxww(jIobyxmoadg) / f13, 1, null);
        }
        return gtknphoqwx.ppxfxbqfkf(jIobyxmoadg);
    }

    private final boolean wkgbmnqykc() {
        return this.f36209iobyxmoadg.kcexrzcfyt(30) && this.f36209iobyxmoadg.ojitshcjhn().ppxfxbqfkf(2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gxszxtbevo(gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f36213jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f36213jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f36215zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f36213jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            esjtqupxsv esjtqupxsvVar = this.f36209iobyxmoadg;
            rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq() { // from class: g5.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return zoijcleaow.lqeggnwhkg(this.f36205zdlpuopuiu, (esjtqupxsv) obj2, (esjtqupxsv.ppxfxbqfkf) obj3);
                }
            };
            iobyxmoadgVar.f36213jyumaefscl = 1;
            if (lereixgezr.zoijcleaow(esjtqupxsvVar, rgvfuqvkyqVar, iobyxmoadgVar) == objGxszxtbevo) {
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

    public final gtknphoqwx zoijcleaow() {
        return (gtknphoqwx) this.f36212zoijcleaow.getValue();
    }
}
