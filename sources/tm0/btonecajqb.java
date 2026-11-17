package tm0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        km0.iobyxmoadg iobyxmoadgVar = (km0.iobyxmoadg) binding.invoke();
        iobyxmoadgVar.f59822wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: tm0.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btonecajqb.dxjokdxxww(this.f111063zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f59815gtknphoqwx.setOnClickListener(new View.OnClickListener() { // from class: tm0.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btonecajqb.btonecajqb(this.f111054zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(btonecajqb btonecajqbVar, View view) {
        btonecajqbVar.ppxfxbqfkf(gxszxtbevo.iobyxmoadg.f111055iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(btonecajqb btonecajqbVar, View view) {
        btonecajqbVar.ppxfxbqfkf(gxszxtbevo.zoijcleaow.f111056iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(km0.iobyxmoadg binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        AppCompatImageView ivPhoto = binding.f59815gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        p41.eablkybsjg.zoijcleaow(ivPhoto, model.zoijcleaow());
        binding.f59821wflxmlrfwp.setData(new l91.zoijcleaow(model.gxszxtbevo(), model.ppxfxbqfkf(), model.wkgbmnqykc(), model.eablkybsjg()));
        String strIobyxmoadg = model.iobyxmoadg();
        if (strIobyxmoadg != null) {
            binding.f59822wkgbmnqykc.setText(strIobyxmoadg);
        }
    }
}
