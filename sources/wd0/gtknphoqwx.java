package wd0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.wypolnanlu;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        wypolnanlu wypolnanluVar = (wypolnanlu) binding.invoke();
        ComposeView cvActionBar = wypolnanluVar.f66097zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(pm.dxjokdxxww.spar_club_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: wd0.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gtknphoqwx.dxjokdxxww(this.f119409zdlpuopuiu);
            }
        }, null, null, 109, null);
        wypolnanluVar.f66094rgvfuqvkyq.setOnClickListener(new View.OnClickListener() { // from class: wd0.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gtknphoqwx.btonecajqb(this.f119408zdlpuopuiu, view);
            }
        });
        AppCompatImageView ivHeader = wypolnanluVar.f66093ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivHeader, "ivHeader");
        c60.wkgbmnqykc.iobyxmoadg(ivHeader, s40.btonecajqb.spar_club_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(gtknphoqwx gtknphoqwxVar, View view) {
        gtknphoqwxVar.ppxfxbqfkf(lqeggnwhkg.zoijcleaow.f119412iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
        gtknphoqwxVar.ppxfxbqfkf(lqeggnwhkg.iobyxmoadg.f119411iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(wypolnanlu binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
    }
}
