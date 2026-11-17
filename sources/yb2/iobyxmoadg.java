package yb2;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ub2.ppxfxbqfkf;
import vb2.zoijcleaow;
import wb2.eablkybsjg;
import wb2.wkgbmnqykc;
import xb2.btonecajqb;
import xb2.dxjokdxxww;
import xb2.gxszxtbevo;
import xb2.lqeggnwhkg;
import xb2.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static eablkybsjg f124338ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static xb2.eablkybsjg f124339wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f124337iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gtknphoqwx f124340zoijcleaow = draadjrbmk.zoijcleaow(C3146iobyxmoadg.f124341zdlpuopuiu);

    /* JADX INFO: renamed from: yb2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3146iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C3146iobyxmoadg f124341zdlpuopuiu = new C3146iobyxmoadg();

        C3146iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final cc2.iobyxmoadg invoke() {
            return iobyxmoadg.f124337iobyxmoadg.vdvldrhtss();
        }
    }

    private iobyxmoadg() {
    }

    private final dxjokdxxww agtfadlqog(Context context, tb2.iobyxmoadg iobyxmoadgVar) {
        return new btonecajqb(context, iobyxmoadgVar);
    }

    private final ppxfxbqfkf btonecajqb(tb2.iobyxmoadg iobyxmoadgVar) {
        return new ub2.eablkybsjg(iobyxmoadgVar, (cc2.iobyxmoadg) f124340zoijcleaow.getValue());
    }

    private final wb2.ppxfxbqfkf draadjrbmk(Context context, tb2.iobyxmoadg iobyxmoadgVar) {
        return new wkgbmnqykc(context, iobyxmoadgVar);
    }

    private final vb2.ppxfxbqfkf dxjokdxxww(Context context, tb2.iobyxmoadg iobyxmoadgVar) {
        return new vb2.wkgbmnqykc(draadjrbmk(context, iobyxmoadgVar), ojitshcjhn(context));
    }

    private final xb2.eablkybsjg eablkybsjg(Context context) {
        if (f124339wkgbmnqykc == null) {
            f124339wkgbmnqykc = new gxszxtbevo(context, wkgbmnqykc());
        }
        xb2.eablkybsjg eablkybsjgVar = f124339wkgbmnqykc;
        zdlpuopuiu.nufgyqmvbu(eablkybsjgVar, "null cannot be cast to non-null type ru.sber.platform.clickstream.clickstreamlite.internal.data.providers.helpers.DeviceIdProvider");
        return eablkybsjgVar;
    }

    private final lqeggnwhkg gtknphoqwx() {
        return new nufgyqmvbu();
    }

    private final vb2.iobyxmoadg gxszxtbevo(Context context, tb2.iobyxmoadg iobyxmoadgVar) {
        return new zoijcleaow(lqeggnwhkg(context, iobyxmoadgVar));
    }

    private final wb2.iobyxmoadg lqeggnwhkg(Context context, tb2.iobyxmoadg iobyxmoadgVar) {
        return new wb2.zoijcleaow(context, ppxfxbqfkf(context), gtknphoqwx(), agtfadlqog(context, iobyxmoadgVar));
    }

    private final eablkybsjg ojitshcjhn(Context context) {
        wb2.gxszxtbevo gxszxtbevoVar = new wb2.gxszxtbevo(context, eablkybsjg(context), rgvfuqvkyq(context));
        f124338ppxfxbqfkf = gxszxtbevoVar;
        return gxszxtbevoVar;
    }

    private final xb2.iobyxmoadg ppxfxbqfkf(Context context) {
        return new xb2.zoijcleaow(context);
    }

    private final xb2.gtknphoqwx rgvfuqvkyq(Context context) {
        return new xb2.draadjrbmk(eablkybsjg(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cc2.iobyxmoadg vdvldrhtss() {
        HandlerThread handlerThread = new HandlerThread("Timer thread");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        zdlpuopuiu.dxjokdxxww(looper, "timerThread.looper");
        return new cc2.zoijcleaow(looper);
    }

    private final ac2.iobyxmoadg wflxmlrfwp(tb2.iobyxmoadg iobyxmoadgVar, dc2.zoijcleaow zoijcleaowVar) {
        return new ac2.zoijcleaow(iobyxmoadgVar, zoijcleaowVar.buildNetworkClient());
    }

    private final xb2.ppxfxbqfkf wkgbmnqykc() {
        return new xb2.wkgbmnqykc();
    }

    private final sb2.iobyxmoadg zoijcleaow(Context context, tb2.iobyxmoadg iobyxmoadgVar, dc2.zoijcleaow zoijcleaowVar) {
        return new sb2.zoijcleaow(btonecajqb(iobyxmoadgVar), wflxmlrfwp(iobyxmoadgVar, zoijcleaowVar), dxjokdxxww(context, iobyxmoadgVar));
    }

    public final ub2.iobyxmoadg nufgyqmvbu(Context context, dc2.zoijcleaow networkClientBuilder, tb2.iobyxmoadg settings) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(networkClientBuilder, "networkClientBuilder");
        zdlpuopuiu.btonecajqb(settings, "settings");
        Context appContext = context.getApplicationContext();
        zdlpuopuiu.dxjokdxxww(appContext, "appContext");
        return new ub2.zoijcleaow(zoijcleaow(appContext, settings, networkClientBuilder), gxszxtbevo(appContext, settings));
    }

    public final eablkybsjg oxmwwwfdhm() {
        return f124338ppxfxbqfkf;
    }
}
