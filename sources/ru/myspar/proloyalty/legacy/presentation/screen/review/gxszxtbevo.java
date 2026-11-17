package ru.myspar.proloyalty.legacy.presentation.screen.review;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.domain.feature.review.store.ReviewProductArgs;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(String str, String str2, Double d13, ColorsModel colorsModel, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return ReviewProductFragment.INSTANCE.iobyxmoadg(new ReviewProductArgs(str, str2, d13, colorsModel));
    }

    public static final m9.wkgbmnqykc zoijcleaow(final String productArticle, final String productName, final Double d13, final ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(productName, "productName");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: cb1.kcexrzcfyt
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.review.gxszxtbevo.ppxfxbqfkf(productArticle, productName, d13, colorsModel, (androidx.fragment.app.jyumaefscl) obj);
            }
        }, 3, null);
    }
}
