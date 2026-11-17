package ru.myspar.catalog.impl.search;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import ru.myspar.catalog.api.model.SearchPayload;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wflxmlrfwp {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(SearchPayload searchPayload, jyumaefscl it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return SearchFragment.INSTANCE.iobyxmoadg(searchPayload);
    }

    public static final m9.wkgbmnqykc zoijcleaow(final SearchPayload payload) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: ru.myspar.catalog.impl.search.draadjrbmk
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wflxmlrfwp.ppxfxbqfkf(payload, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
