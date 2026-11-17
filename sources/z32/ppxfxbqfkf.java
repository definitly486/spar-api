package z32;

import android.app.Activity;
import kotlin.jvm.internal.zdlpuopuiu;
import qb2.eablkybsjg;
import rs.wkgbmnqykc;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import ru.rustore.sdk.review.model.ReviewInfo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements y32.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(draadjrbmk draadjrbmkVar, Throwable it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(it, new CrashlyticsKey[0]);
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        draadjrbmkVar.invoke(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(qb2.wkgbmnqykc wkgbmnqykcVar, ReviewInfo it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wkgbmnqykcVar.iobyxmoadg(it);
    }

    @Override // y32.iobyxmoadg
    public void iobyxmoadg(Activity activity, final draadjrbmk onError, draadjrbmk onShowCustomDialog) {
        zdlpuopuiu.btonecajqb(activity, "activity");
        zdlpuopuiu.btonecajqb(onError, "onError");
        zdlpuopuiu.btonecajqb(onShowCustomDialog, "onShowCustomDialog");
        final qb2.wkgbmnqykc wkgbmnqykcVarZoijcleaow = eablkybsjg.zoijcleaow(eablkybsjg.f78425iobyxmoadg, activity, null, 2, null);
        wkgbmnqykcVarZoijcleaow.zoijcleaow().gtknphoqwx(new kb2.eablkybsjg() { // from class: z32.iobyxmoadg
            @Override // kb2.eablkybsjg
            public final void onSuccess(Object obj) {
                ppxfxbqfkf.wkgbmnqykc(wkgbmnqykcVarZoijcleaow, (ReviewInfo) obj);
            }
        }).btonecajqb(new kb2.wkgbmnqykc() { // from class: z32.zoijcleaow
            @Override // kb2.wkgbmnqykc
            public final void onFailure(Throwable th2) {
                ppxfxbqfkf.eablkybsjg(onError, th2);
            }
        });
    }
}
