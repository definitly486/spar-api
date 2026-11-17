package z;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Map f126995dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f126996eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f126997gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f126998iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f126999lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private zoijcleaow f127000nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f127001ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f127002wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f127003zoijcleaow;

    /* JADX INFO: renamed from: z.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3248iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        C3248iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((zoijcleaow) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar.gtknphoqwx()) {
                if (zoijcleaowVar.agtfadlqog().lqeggnwhkg()) {
                    zoijcleaowVar.dsvhmnatus();
                }
                Map map = zoijcleaowVar.agtfadlqog().f126995dxjokdxxww;
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                for (Map.Entry entry : map.entrySet()) {
                    iobyxmoadgVar.ppxfxbqfkf((x.iobyxmoadg) entry.getKey(), ((Number) entry.getValue()).intValue(), zoijcleaowVar.metgxyhuhe());
                }
                xrmfcynszj xrmfcynszjVarX0 = zoijcleaowVar.metgxyhuhe().X0();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(xrmfcynszjVarX0);
                while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(xrmfcynszjVarX0, iobyxmoadg.this.gxszxtbevo().metgxyhuhe())) {
                    Set<x.iobyxmoadg> setKeySet = iobyxmoadg.this.eablkybsjg(xrmfcynszjVarX0).keySet();
                    iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                    for (x.iobyxmoadg iobyxmoadgVar3 : setKeySet) {
                        iobyxmoadgVar2.ppxfxbqfkf(iobyxmoadgVar3, iobyxmoadgVar2.dxjokdxxww(xrmfcynszjVarX0, iobyxmoadgVar3), xrmfcynszjVarX0);
                    }
                    xrmfcynszjVarX0 = xrmfcynszjVarX0.X0();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(xrmfcynszjVarX0);
                }
            }
        }
    }

    public /* synthetic */ iobyxmoadg(zoijcleaow zoijcleaowVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ppxfxbqfkf(x.iobyxmoadg iobyxmoadgVar, int i13, xrmfcynszj xrmfcynszjVar) {
        float f13 = i13;
        long jEablkybsjg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L));
        while (true) {
            jEablkybsjg = wkgbmnqykc(xrmfcynszjVar, jEablkybsjg);
            xrmfcynszjVar = xrmfcynszjVar.X0();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(xrmfcynszjVar);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(xrmfcynszjVar, this.f126998iobyxmoadg.metgxyhuhe())) {
                break;
            } else if (eablkybsjg(xrmfcynszjVar).containsKey(iobyxmoadgVar)) {
                float fDxjokdxxww = dxjokdxxww(xrmfcynszjVar, iobyxmoadgVar);
                jEablkybsjg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fDxjokdxxww)) << 32) | (((long) Float.floatToRawIntBits(fDxjokdxxww)) & 4294967295L));
            }
        }
        int iRound = Math.round(iobyxmoadgVar instanceof x.gtknphoqwx ? Float.intBitsToFloat((int) (jEablkybsjg & 4294967295L)) : Float.intBitsToFloat((int) (jEablkybsjg >> 32)));
        Map map = this.f126995dxjokdxxww;
        if (map.containsKey(iobyxmoadgVar)) {
            iRound = x.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar, ((Number) hg.tzroggbefp.btonecajqb(this.f126995dxjokdxxww, iobyxmoadgVar)).intValue(), iRound);
        }
        map.put(iobyxmoadgVar, Integer.valueOf(iRound));
    }

    public final void agtfadlqog() {
        this.f126995dxjokdxxww.clear();
        this.f126998iobyxmoadg.yfnezrywwk(new C3248iobyxmoadg());
        this.f126995dxjokdxxww.putAll(eablkybsjg(this.f126998iobyxmoadg.metgxyhuhe()));
        this.f127003zoijcleaow = false;
    }

    public final boolean btonecajqb() {
        return this.f127001ppxfxbqfkf || this.f126996eablkybsjg || this.f126997gxszxtbevo || this.f126999lqeggnwhkg;
    }

    public final boolean draadjrbmk() {
        return this.f127002wkgbmnqykc;
    }

    protected abstract int dxjokdxxww(xrmfcynszj xrmfcynszjVar, x.iobyxmoadg iobyxmoadgVar);

    protected abstract Map eablkybsjg(xrmfcynszj xrmfcynszjVar);

    public final boolean gtknphoqwx() {
        ojitshcjhn();
        return this.f127000nufgyqmvbu != null;
    }

    public final zoijcleaow gxszxtbevo() {
        return this.f126998iobyxmoadg;
    }

    public final void kcexrzcfyt(boolean z13) {
        this.f126997gxszxtbevo = z13;
    }

    public final boolean lqeggnwhkg() {
        return this.f127003zoijcleaow;
    }

    public final Map nufgyqmvbu() {
        return this.f126995dxjokdxxww;
    }

    public final void ojitshcjhn() {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVarAgtfadlqog;
        iobyxmoadg iobyxmoadgVarAgtfadlqog2;
        if (btonecajqb()) {
            zoijcleaowVar = this.f126998iobyxmoadg;
        } else {
            zoijcleaow zoijcleaowVarYadqdtsiqt = this.f126998iobyxmoadg.yadqdtsiqt();
            if (zoijcleaowVarYadqdtsiqt == null) {
                return;
            }
            zoijcleaowVar = zoijcleaowVarYadqdtsiqt.agtfadlqog().f127000nufgyqmvbu;
            if (zoijcleaowVar == null || !zoijcleaowVar.agtfadlqog().btonecajqb()) {
                zoijcleaow zoijcleaowVar2 = this.f127000nufgyqmvbu;
                if (zoijcleaowVar2 == null || zoijcleaowVar2.agtfadlqog().btonecajqb()) {
                    return;
                }
                zoijcleaow zoijcleaowVarYadqdtsiqt2 = zoijcleaowVar2.yadqdtsiqt();
                if (zoijcleaowVarYadqdtsiqt2 != null && (iobyxmoadgVarAgtfadlqog2 = zoijcleaowVarYadqdtsiqt2.agtfadlqog()) != null) {
                    iobyxmoadgVarAgtfadlqog2.ojitshcjhn();
                }
                zoijcleaow zoijcleaowVarYadqdtsiqt3 = zoijcleaowVar2.yadqdtsiqt();
                zoijcleaowVar = (zoijcleaowVarYadqdtsiqt3 == null || (iobyxmoadgVarAgtfadlqog = zoijcleaowVarYadqdtsiqt3.agtfadlqog()) == null) ? null : iobyxmoadgVarAgtfadlqog.f127000nufgyqmvbu;
            }
        }
        this.f127000nufgyqmvbu = zoijcleaowVar;
    }

    public final void oxmwwwfdhm(boolean z13) {
        this.f126999lqeggnwhkg = z13;
    }

    public final void rgvfuqvkyq() {
        this.f127003zoijcleaow = true;
        this.f127001ppxfxbqfkf = false;
        this.f126996eablkybsjg = false;
        this.f127002wkgbmnqykc = false;
        this.f126997gxszxtbevo = false;
        this.f126999lqeggnwhkg = false;
        this.f127000nufgyqmvbu = null;
    }

    public final void vdvldrhtss(boolean z13) {
        this.f126996eablkybsjg = z13;
    }

    public final void wflxmlrfwp() {
        this.f127003zoijcleaow = true;
        zoijcleaow zoijcleaowVarYadqdtsiqt = this.f126998iobyxmoadg.yadqdtsiqt();
        if (zoijcleaowVarYadqdtsiqt == null) {
            return;
        }
        if (this.f127001ppxfxbqfkf) {
            zoijcleaowVarYadqdtsiqt.iyctptxqzt();
        } else if (this.f126996eablkybsjg || this.f127002wkgbmnqykc) {
            zoijcleaowVarYadqdtsiqt.requestLayout();
        }
        if (this.f126997gxszxtbevo) {
            this.f126998iobyxmoadg.iyctptxqzt();
        }
        if (this.f126999lqeggnwhkg) {
            this.f126998iobyxmoadg.requestLayout();
        }
        zoijcleaowVarYadqdtsiqt.agtfadlqog().wflxmlrfwp();
    }

    protected abstract long wkgbmnqykc(xrmfcynszj xrmfcynszjVar, long j13);

    public final void yggfygwlhe(boolean z13) {
        this.f127001ppxfxbqfkf = z13;
    }

    public final void zdlpuopuiu(boolean z13) {
        this.f127002wkgbmnqykc = z13;
    }

    private iobyxmoadg(zoijcleaow zoijcleaowVar) {
        this.f126998iobyxmoadg = zoijcleaowVar;
        this.f127003zoijcleaow = true;
        this.f126995dxjokdxxww = new HashMap();
    }
}
