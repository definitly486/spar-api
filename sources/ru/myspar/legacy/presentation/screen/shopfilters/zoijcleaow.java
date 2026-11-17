package ru.myspar.legacy.presentation.screen.shopfilters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.shopfilters.store.ShopFiltersArgs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(List list, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return ShopFiltersFragment.INSTANCE.iobyxmoadg(new ShopFiltersArgs(list));
    }

    public static final m9.wkgbmnqykc zoijcleaow(final List list) {
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: od0.gxszxtbevo
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ru.myspar.legacy.presentation.screen.shopfilters.zoijcleaow.ppxfxbqfkf(list, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
