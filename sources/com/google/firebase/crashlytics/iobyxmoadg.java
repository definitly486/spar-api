package com.google.firebase.crashlytics;

import ac.agtfadlqog;
import ac.btonecajqb;
import ac.esjtqupxsv;
import ac.pkzmftpjix;
import ac.yadqdtsiqt;
import ac.zoijcleaow;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.gxszxtbevo;
import java.util.List;
import java.util.concurrent.ExecutorService;
import uc.eablkybsjg;
import xb.draadjrbmk;
import xb.lqeggnwhkg;
import xb.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final esjtqupxsv f24246iobyxmoadg;

    private iobyxmoadg(esjtqupxsv esjtqupxsvVar) {
        this.f24246iobyxmoadg = esjtqupxsvVar;
    }

    static iobyxmoadg ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, eablkybsjg eablkybsjgVar, tc.iobyxmoadg iobyxmoadgVar, tc.iobyxmoadg iobyxmoadgVar2, tc.iobyxmoadg iobyxmoadgVar3, ExecutorService executorService, ExecutorService executorService2) {
        Context contextGtknphoqwx = gxszxtbevoVar.gtknphoqwx();
        String packageName = contextGtknphoqwx.getPackageName();
        lqeggnwhkg.gxszxtbevo().lqeggnwhkg("Initializing Firebase Crashlytics " + esjtqupxsv.draadjrbmk() + " for " + packageName);
        bc.gxszxtbevo gxszxtbevoVar2 = new bc.gxszxtbevo(executorService, executorService2);
        gc.lqeggnwhkg lqeggnwhkgVar = new gc.lqeggnwhkg(contextGtknphoqwx);
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(gxszxtbevoVar);
        pkzmftpjix pkzmftpjixVar = new pkzmftpjix(contextGtknphoqwx, packageName, eablkybsjgVar, yadqdtsiqtVar);
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(iobyxmoadgVar);
        wb.wkgbmnqykc wkgbmnqykcVar2 = new wb.wkgbmnqykc(iobyxmoadgVar2);
        agtfadlqog agtfadlqogVar = new agtfadlqog(yadqdtsiqtVar, lqeggnwhkgVar);
        vd.iobyxmoadg.eablkybsjg(agtfadlqogVar);
        esjtqupxsv esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar, pkzmftpjixVar, wkgbmnqykcVar, yadqdtsiqtVar, wkgbmnqykcVar2.eablkybsjg(), wkgbmnqykcVar2.wkgbmnqykc(), lqeggnwhkgVar, agtfadlqogVar, new draadjrbmk(iobyxmoadgVar3), gxszxtbevoVar2);
        String strPpxfxbqfkf = gxszxtbevoVar.agtfadlqog().ppxfxbqfkf();
        String strWflxmlrfwp = btonecajqb.wflxmlrfwp(contextGtknphoqwx);
        List<ac.lqeggnwhkg> listBtonecajqb = btonecajqb.btonecajqb(contextGtknphoqwx);
        lqeggnwhkg.gxszxtbevo().zoijcleaow("Mapping file ID is: " + strWflxmlrfwp);
        for (ac.lqeggnwhkg lqeggnwhkgVar2 : listBtonecajqb) {
            lqeggnwhkg.gxszxtbevo().zoijcleaow(String.format("Build id for %s on %s: %s", lqeggnwhkgVar2.ppxfxbqfkf(), lqeggnwhkgVar2.iobyxmoadg(), lqeggnwhkgVar2.zoijcleaow()));
        }
        try {
            zoijcleaow zoijcleaowVarIobyxmoadg = zoijcleaow.iobyxmoadg(contextGtknphoqwx, pkzmftpjixVar, strPpxfxbqfkf, strWflxmlrfwp, listBtonecajqb, new xb.gxszxtbevo(contextGtknphoqwx));
            lqeggnwhkg.gxszxtbevo().dxjokdxxww("Installer package name is: " + zoijcleaowVarIobyxmoadg.f1491wkgbmnqykc);
            ic.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = ic.lqeggnwhkg.draadjrbmk(contextGtknphoqwx, strPpxfxbqfkf, pkzmftpjixVar, new fc.zoijcleaow(), zoijcleaowVarIobyxmoadg.f1486gxszxtbevo, zoijcleaowVarIobyxmoadg.f1488lqeggnwhkg, lqeggnwhkgVar, yadqdtsiqtVar);
            lqeggnwhkgVarDraadjrbmk.ojitshcjhn(gxszxtbevoVar2).addOnFailureListener(new OnFailureListener() { // from class: wb.lqeggnwhkg
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    com.google.firebase.crashlytics.iobyxmoadg.wkgbmnqykc(exc);
                }
            });
            if (esjtqupxsvVar.iwizpuwonk(zoijcleaowVarIobyxmoadg, lqeggnwhkgVarDraadjrbmk)) {
                esjtqupxsvVar.btonecajqb(lqeggnwhkgVarDraadjrbmk);
            }
            return new iobyxmoadg(esjtqupxsvVar);
        } catch (PackageManager.NameNotFoundException e13) {
            lqeggnwhkg.gxszxtbevo().eablkybsjg("Error retrieving app package info.", e13);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wkgbmnqykc(Exception exc) {
        lqeggnwhkg.gxszxtbevo().eablkybsjg("Error fetching settings.", exc);
    }

    public static iobyxmoadg zoijcleaow() {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) gxszxtbevo.draadjrbmk().btonecajqb(iobyxmoadg.class);
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public void eablkybsjg(Throwable th2) {
        if (th2 == null) {
            lqeggnwhkg.gxszxtbevo().gtknphoqwx("A null value was passed to recordException. Ignoring.");
        } else {
            this.f24246iobyxmoadg.zdlpuopuiu(th2);
        }
    }

    public void gxszxtbevo(String str, String str2) {
        this.f24246iobyxmoadg.cqumvgiudr(str, str2);
    }

    public void lqeggnwhkg(String str) {
        this.f24246iobyxmoadg.esjtqupxsv(str);
    }
}
