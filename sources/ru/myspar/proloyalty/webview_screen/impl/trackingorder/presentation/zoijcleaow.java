package ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.webview_screen.api.models.TrackingOrderArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(String str, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return TrackingOrderFragment.INSTANCE.iobyxmoadg(new TrackingOrderArgs(str));
    }

    public static final m9.wkgbmnqykc zoijcleaow(final String orderId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: ex1.lqeggnwhkg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.zoijcleaow.ppxfxbqfkf(orderId, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
