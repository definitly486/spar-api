package ru.myspar.proloyalty.legacy.presentation.screen.review;

import android.view.View;
import android.widget.RatingBar;
import cb1.btonecajqb;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        z41.eablkybsjg eablkybsjgVar = (z41.eablkybsjg) binding.invoke();
        eablkybsjgVar.f127945btonecajqb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: cb1.gtknphoqwx
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f13, boolean z13) {
                ru.myspar.proloyalty.legacy.presentation.screen.review.wkgbmnqykc.btonecajqb(this.f19526iobyxmoadg, ratingBar, f13, z13);
            }
        });
        eablkybsjgVar.f127954ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: cb1.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.review.wkgbmnqykc.gtknphoqwx(this.f19522zdlpuopuiu, view);
            }
        });
        eablkybsjgVar.f127957zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: cb1.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.review.wkgbmnqykc.draadjrbmk(this.f19539zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, RatingBar ratingBar, float f13, boolean z13) {
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.eablkybsjg((int) f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f97268iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.wkgbmnqykc.f97269iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(z41.eablkybsjg binding, btonecajqb model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f127954ppxfxbqfkf.setEnabled(model.iobyxmoadg());
    }
}
