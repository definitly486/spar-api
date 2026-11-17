package ru.myspar.purchases.impl.specific.presentation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.specific.domain.store.SpecificPurchaseArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(SpecificPurchaseArgs specificPurchaseArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SpecificPurchaseFragment.INSTANCE.iobyxmoadg(specificPurchaseArgs);
    }

    public static final m9.wkgbmnqykc zoijcleaow(final SpecificPurchaseArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "SPECIFIC_PURCHASE_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: ry1.nufgyqmvbu
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ru.myspar.purchases.impl.specific.presentation.zoijcleaow.ppxfxbqfkf(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}
