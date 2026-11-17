package ru.myspar.legacy.presentation.screen.editreceiver;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.editreceiver.store.EditReceiverArgs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(String str, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return EditReceiverFragment.INSTANCE.iobyxmoadg(new EditReceiverArgs(str));
    }

    public static final m9.wkgbmnqykc zoijcleaow(final String orderId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: jc0.gxszxtbevo
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ru.myspar.legacy.presentation.screen.editreceiver.zoijcleaow.ppxfxbqfkf(orderId, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
