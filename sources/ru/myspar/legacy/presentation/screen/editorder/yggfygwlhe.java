package ru.myspar.legacy.presentation.screen.editorder;

import androidx.fragment.app.Fragment;
import ru.myspar.core.domain.models.payload.EditOrderPayload;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yggfygwlhe {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(EditOrderPayload editOrderPayload, androidx.fragment.app.jyumaefscl it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return EditOrderFragment.INSTANCE.iobyxmoadg(editOrderPayload);
    }

    public static final m9.wkgbmnqykc zoijcleaow(final EditOrderPayload payload) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: ru.myspar.legacy.presentation.screen.editorder.zdlpuopuiu
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return yggfygwlhe.ppxfxbqfkf(payload, (androidx.fragment.app.jyumaefscl) obj);
            }
        }, 3, null);
    }
}
