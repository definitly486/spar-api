package sw0;

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

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg extends ntlheqmsrt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final hcddaimhww f108585eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cllcsxoeiz f108586gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zynmafqrjb f108587iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f108588ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final sj.lqeggnwhkg f108589wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wypolnanlu f108590zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ pw0.iobyxmoadg f108591jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f108593zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(pw0.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f108591jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return eablkybsjg.this.new iobyxmoadg(this.f108591jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f108593zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                eablkybsjg eablkybsjgVar = eablkybsjg.this;
                pw0.iobyxmoadg iobyxmoadgVar = this.f108591jyumaefscl;
                this.f108593zdlpuopuiu = 1;
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
        final /* synthetic */ eablkybsjg f108594zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(hcddaimhww.zoijcleaow zoijcleaowVar, eablkybsjg eablkybsjgVar) {
            super(zoijcleaowVar);
            this.f108594zdlpuopuiu = eablkybsjgVar;
        }

        @Override // pj.hcddaimhww
        public void handleException(btonecajqb btonecajqbVar, Throwable th2) {
            this.f108594zdlpuopuiu.zdlpuopuiu(th2);
        }
    }

    public eablkybsjg(Object obj) {
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(obj);
        this.f108587iobyxmoadg = zynmafqrjbVarIobyxmoadg;
        this.f108590zoijcleaow = zynmafqrjbVarIobyxmoadg;
        lqeggnwhkg lqeggnwhkgVarZoijcleaow = rj.btonecajqb.zoijcleaow(Integer.MAX_VALUE, rj.iobyxmoadg.DROP_OLDEST, null, 4, null);
        this.f108588ppxfxbqfkf = lqeggnwhkgVarZoijcleaow;
        this.f108589wkgbmnqykc = dxjokdxxww.mbcevpiqjq(lqeggnwhkgVarZoijcleaow);
        zoijcleaow zoijcleaowVar = new zoijcleaow(hcddaimhww.f76711btonecajqb, this);
        this.f108585eablkybsjg = zoijcleaowVar;
        this.f108586gxszxtbevo = dsvhmnatus.dxjokdxxww(ulzqkzuiru.iobyxmoadg(this), zoijcleaowVar);
        kr0.wkgbmnqykc.wkgbmnqykc(kr0.wkgbmnqykc.f60450iobyxmoadg, "LIFECYCLE_TAG", getClass().getSimpleName() + " onCreated", false, 4, null);
    }

    static /* synthetic */ Object oxmwwwfdhm(eablkybsjg eablkybsjgVar, pw0.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected final cllcsxoeiz agtfadlqog() {
        return this.f108586gxszxtbevo;
    }

    public final sj.lqeggnwhkg draadjrbmk() {
        return this.f108589wkgbmnqykc;
    }

    public final wypolnanlu getState() {
        return this.f108590zoijcleaow;
    }

    public final Object gtknphoqwx() {
        return this.f108590zoijcleaow.getValue();
    }

    public final void jyumaefscl(pw0.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        gtknphoqwx.wkgbmnqykc(this.f108586gxszxtbevo, null, null, new iobyxmoadg(event, null), 3, null);
    }

    protected final zynmafqrjb ojitshcjhn() {
        return this.f108587iobyxmoadg;
    }

    @Override // androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        kr0.wkgbmnqykc.wkgbmnqykc(kr0.wkgbmnqykc.f60450iobyxmoadg, "LIFECYCLE_TAG", getClass().getSimpleName() + " onCleared", false, 4, null);
        super.onCleared();
    }

    protected Object vdvldrhtss(pw0.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return oxmwwwfdhm(this, iobyxmoadgVar, gxszxtbevoVar);
    }

    protected final void yggfygwlhe(Object obj) {
        this.f108588ppxfxbqfkf.eablkybsjg(obj);
    }

    protected void zdlpuopuiu(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        w11.iobyxmoadg.f118559iobyxmoadg.zoijcleaow(error);
    }
}
