package ru.myspar.legacy.presentation.screen.shops;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.shops.store.ShopsArgs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static /* synthetic */ m9.wkgbmnqykc ppxfxbqfkf(ShopsArgs shopsArgs, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            shopsArgs = new ShopsArgs(null, null, null, 7, null);
        }
        return zoijcleaow(shopsArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(ShopsArgs shopsArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return ShopsFragment.INSTANCE.iobyxmoadg(shopsArgs);
    }

    public static final m9.wkgbmnqykc zoijcleaow(final ShopsArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: qd0.lqeggnwhkg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ru.myspar.legacy.presentation.screen.shops.zoijcleaow.wkgbmnqykc(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
