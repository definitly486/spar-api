package ru.myspar.auth.impl.presentation.nonauthorized;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.NonAuthorizedPayload;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static /* synthetic */ m9.wkgbmnqykc ppxfxbqfkf(NonAuthorizedPayload nonAuthorizedPayload, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            nonAuthorizedPayload = new NonAuthorizedPayload(null, null, 3, null);
        }
        return zoijcleaow(nonAuthorizedPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(NonAuthorizedPayload nonAuthorizedPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return NonAuthorizedFragment.INSTANCE.iobyxmoadg(nonAuthorizedPayload);
    }

    public static final m9.wkgbmnqykc zoijcleaow(final NonAuthorizedPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: pp.gxszxtbevo
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ru.myspar.auth.impl.presentation.nonauthorized.zoijcleaow.wkgbmnqykc(payload, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
