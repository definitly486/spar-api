package sb1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.ylkuphrtab;

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ylkuphrtab ylkuphrtabVar = (ylkuphrtab) binding.invoke();
        ComposeView cvActionBar = ylkuphrtabVar.f128559zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(vk0.lqeggnwhkg.proloyalty_spar_club_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: sb1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gtknphoqwx.dxjokdxxww(this.f105955zdlpuopuiu);
            }
        }, null, null, 109, null);
        ylkuphrtabVar.f128556rgvfuqvkyq.setOnClickListener(new View.OnClickListener() { // from class: sb1.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gtknphoqwx.btonecajqb(this.f105954zdlpuopuiu, view);
            }
        });
        AppCompatImageView ivHeader = ylkuphrtabVar.f128555ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivHeader, "ivHeader");
        p41.eablkybsjg.iobyxmoadg(ivHeader, b31.btonecajqb.spar_club_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(gtknphoqwx gtknphoqwxVar, View view) {
        gtknphoqwxVar.ppxfxbqfkf(lqeggnwhkg.zoijcleaow.f105958iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
        gtknphoqwxVar.ppxfxbqfkf(lqeggnwhkg.iobyxmoadg.f105957iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ylkuphrtab binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
    }
}
