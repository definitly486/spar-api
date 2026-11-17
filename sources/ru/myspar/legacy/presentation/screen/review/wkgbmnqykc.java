package ru.myspar.legacy.presentation.screen.review;

import android.view.View;
import android.widget.RatingBar;
import fd0.btonecajqb;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        m60.nufgyqmvbu nufgyqmvbuVar = (m60.nufgyqmvbu) binding.invoke();
        nufgyqmvbuVar.f65819btonecajqb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: fd0.gtknphoqwx
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f13, boolean z13) {
                ru.myspar.legacy.presentation.screen.review.wkgbmnqykc.btonecajqb(this.f33432iobyxmoadg, ratingBar, f13, z13);
            }
        });
        nufgyqmvbuVar.f65828ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: fd0.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.review.wkgbmnqykc.gtknphoqwx(this.f33428zdlpuopuiu, view);
            }
        });
        nufgyqmvbuVar.f65831zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: fd0.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.review.wkgbmnqykc.draadjrbmk(this.f33445zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, RatingBar ratingBar, float f13, boolean z13) {
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.eablkybsjg((int) f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f89589iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.wkgbmnqykc.f89590iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(m60.nufgyqmvbu binding, btonecajqb model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65828ppxfxbqfkf.setEnabled(model.iobyxmoadg());
    }
}
