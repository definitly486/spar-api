package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import g6.yggfygwlhe;
import java.util.ArrayList;
import java.util.List;
import l6.gxszxtbevo;
import p6.lereixgezr;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f13913gxszxtbevo = yggfygwlhe.dxjokdxxww("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gxszxtbevo f13914eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f13915iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f13916ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final eablkybsjg f13917wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final g6.zoijcleaow f13918zoijcleaow;

    ppxfxbqfkf(Context context, g6.zoijcleaow zoijcleaowVar, int i13, eablkybsjg eablkybsjgVar) {
        this.f13915iobyxmoadg = context;
        this.f13918zoijcleaow = zoijcleaowVar;
        this.f13916ppxfxbqfkf = i13;
        this.f13917wkgbmnqykc = eablkybsjgVar;
        this.f13914eablkybsjg = new gxszxtbevo(eablkybsjgVar.lqeggnwhkg().zdlpuopuiu());
    }

    void iobyxmoadg() {
        List<p6.yggfygwlhe> listGxszxtbevo = this.f13917wkgbmnqykc.lqeggnwhkg().yggfygwlhe().ulzqkzuiru().gxszxtbevo();
        ConstraintProxy.iobyxmoadg(this.f13915iobyxmoadg, listGxszxtbevo);
        ArrayList<p6.yggfygwlhe> arrayList = new ArrayList(listGxszxtbevo.size());
        long jCurrentTimeMillis = this.f13918zoijcleaow.currentTimeMillis();
        for (p6.yggfygwlhe yggfygwlheVar : listGxszxtbevo) {
            if (jCurrentTimeMillis >= yggfygwlheVar.ppxfxbqfkf() && (!yggfygwlheVar.draadjrbmk() || this.f13914eablkybsjg.iobyxmoadg(yggfygwlheVar))) {
                arrayList.add(yggfygwlheVar);
            }
        }
        for (p6.yggfygwlhe yggfygwlheVar2 : arrayList) {
            String str = yggfygwlheVar2.f75796iobyxmoadg;
            Intent intentPpxfxbqfkf = zoijcleaow.ppxfxbqfkf(this.f13915iobyxmoadg, lereixgezr.iobyxmoadg(yggfygwlheVar2));
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13913gxszxtbevo, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f13917wkgbmnqykc.gxszxtbevo().iobyxmoadg().execute(new eablkybsjg.zoijcleaow(this.f13917wkgbmnqykc, intentPpxfxbqfkf, this.f13916ppxfxbqfkf));
        }
    }
}
