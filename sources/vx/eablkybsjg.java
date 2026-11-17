package vx;

import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.btonecajqb;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.gtknphoqwx;
import pj.hcddaimhww;
import rj.lqeggnwhkg;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg extends ntlheqmsrt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final hcddaimhww f118140eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cllcsxoeiz f118141gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zynmafqrjb f118142iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f118143ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final sj.lqeggnwhkg f118144wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wypolnanlu f118145zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ sx.iobyxmoadg f118146jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f118148zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(sx.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f118146jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return eablkybsjg.this.new iobyxmoadg(this.f118146jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f118148zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                eablkybsjg eablkybsjgVar = eablkybsjg.this;
                sx.iobyxmoadg iobyxmoadgVar = this.f118146jyumaefscl;
                this.f118148zdlpuopuiu = 1;
                if (eablkybsjgVar.vdvldrhtss(iobyxmoadgVar, this) == objGxszxtbevo) {
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
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends lg.iobyxmoadg implements hcddaimhww {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f118149zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(hcddaimhww.zoijcleaow zoijcleaowVar, eablkybsjg eablkybsjgVar) {
            super(zoijcleaowVar);
            this.f118149zdlpuopuiu = eablkybsjgVar;
        }

        @Override // pj.hcddaimhww
        public void handleException(btonecajqb btonecajqbVar, Throwable th2) {
            this.f118149zdlpuopuiu.zdlpuopuiu(th2);
        }
    }

    public eablkybsjg(Object obj) {
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(obj);
        this.f118142iobyxmoadg = zynmafqrjbVarIobyxmoadg;
        this.f118145zoijcleaow = zynmafqrjbVarIobyxmoadg;
        lqeggnwhkg lqeggnwhkgVarZoijcleaow = rj.btonecajqb.zoijcleaow(Integer.MAX_VALUE, rj.iobyxmoadg.DROP_OLDEST, null, 4, null);
        this.f118143ppxfxbqfkf = lqeggnwhkgVarZoijcleaow;
        this.f118144wkgbmnqykc = dxjokdxxww.mbcevpiqjq(lqeggnwhkgVarZoijcleaow);
        zoijcleaow zoijcleaowVar = new zoijcleaow(hcddaimhww.f76711btonecajqb, this);
        this.f118140eablkybsjg = zoijcleaowVar;
        this.f118141gxszxtbevo = dsvhmnatus.dxjokdxxww(ulzqkzuiru.iobyxmoadg(this), zoijcleaowVar);
        rs.wkgbmnqykc.wkgbmnqykc(rs.wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", getClass().getSimpleName() + " onCreated", false, 4, null);
    }

    static /* synthetic */ Object oxmwwwfdhm(eablkybsjg eablkybsjgVar, sx.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected final cllcsxoeiz agtfadlqog() {
        return this.f118141gxszxtbevo;
    }

    public final sj.lqeggnwhkg draadjrbmk() {
        return this.f118144wkgbmnqykc;
    }

    public final wypolnanlu getState() {
        return this.f118145zoijcleaow;
    }

    public final Object gtknphoqwx() {
        return this.f118145zoijcleaow.getValue();
    }

    public final void jyumaefscl(sx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        gtknphoqwx.wkgbmnqykc(this.f118141gxszxtbevo, null, null, new iobyxmoadg(event, null), 3, null);
    }

    protected final zynmafqrjb ojitshcjhn() {
        return this.f118142iobyxmoadg;
    }

    @Override // androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        rs.wkgbmnqykc.wkgbmnqykc(rs.wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", getClass().getSimpleName() + " onCleared", false, 4, null);
        super.onCleared();
    }

    protected Object vdvldrhtss(sx.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return oxmwwwfdhm(this, iobyxmoadgVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void yggfygwlhe(Object obj) {
        this.f118143ppxfxbqfkf.eablkybsjg(obj);
    }

    protected void zdlpuopuiu(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        q30.iobyxmoadg.f77790iobyxmoadg.zoijcleaow(error);
    }
}
