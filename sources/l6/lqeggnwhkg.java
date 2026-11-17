package l6;

import android.content.Context;
import android.net.ConnectivityManager;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import p6.yggfygwlhe;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.gtknphoqwx;
import pj.pkzmftpjix;
import pj.pmvmpeiblj;
import pj.skhdrjzrfn;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f61665iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f61666zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f61667iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f61668jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f61669yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61670zdlpuopuiu;

        /* JADX INFO: renamed from: l6.lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1245iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ yggfygwlhe f61671yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f61672zdlpuopuiu;

            C1245iobyxmoadg(eablkybsjg eablkybsjgVar, yggfygwlhe yggfygwlheVar) {
                this.f61672zdlpuopuiu = eablkybsjgVar;
                this.f61671yggfygwlhe = yggfygwlheVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                this.f61672zdlpuopuiu.wkgbmnqykc(this.f61671yggfygwlhe, zoijcleaowVar);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(gxszxtbevo gxszxtbevoVar, yggfygwlhe yggfygwlheVar, eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar2) {
            super(2, gxszxtbevoVar2);
            this.f61669yggfygwlhe = gxszxtbevoVar;
            this.f61668jyumaefscl = yggfygwlheVar;
            this.f61667iwizpuwonk = eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f61669yggfygwlhe, this.f61668jyumaefscl, this.f61667iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61670zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = this.f61669yggfygwlhe.zoijcleaow(this.f61668jyumaefscl);
                C1245iobyxmoadg c1245iobyxmoadg = new C1245iobyxmoadg(this.f61667iwizpuwonk, this.f61668jyumaefscl);
                this.f61670zdlpuopuiu = 1;
                if (lqeggnwhkgVarZoijcleaow.collect(c1245iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static {
        String strDxjokdxxww = g6.yggfygwlhe.dxjokdxxww("WorkConstraintsTracker");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f61665iobyxmoadg = strDxjokdxxww;
        f61666zoijcleaow = 1000L;
    }

    public static final ppxfxbqfkf iobyxmoadg(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new ppxfxbqfkf((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final auzgnhcxok wkgbmnqykc(gxszxtbevo gxszxtbevoVar, yggfygwlhe spec, pkzmftpjix dispatcher, eablkybsjg listener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spec, "spec");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        pmvmpeiblj pmvmpeibljVarZoijcleaow = skhdrjzrfn.zoijcleaow(null, 1, null);
        gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(dispatcher.plus(pmvmpeibljVarZoijcleaow)), null, null, new iobyxmoadg(gxszxtbevoVar, spec, listener, null), 3, null);
        return pmvmpeibljVarZoijcleaow;
    }
}
