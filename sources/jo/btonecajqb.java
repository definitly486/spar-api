package jo;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zn.iobyxmoadg iobyxmoadgVar = (zn.iobyxmoadg) binding.invoke();
        iobyxmoadgVar.f130455wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: jo.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btonecajqb.dxjokdxxww(this.f51839zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f130448gtknphoqwx.setOnClickListener(new View.OnClickListener() { // from class: jo.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btonecajqb.btonecajqb(this.f51830zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(btonecajqb btonecajqbVar, View view) {
        btonecajqbVar.ppxfxbqfkf(gxszxtbevo.iobyxmoadg.f51831iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(btonecajqb btonecajqbVar, View view) {
        btonecajqbVar.ppxfxbqfkf(gxszxtbevo.zoijcleaow.f51832iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(zn.iobyxmoadg binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        AppCompatImageView ivPhoto = binding.f130448gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        c60.wkgbmnqykc.zoijcleaow(ivPhoto, model.zoijcleaow());
        binding.f130454wflxmlrfwp.setData(new mb0.zoijcleaow(model.gxszxtbevo(), model.ppxfxbqfkf(), model.wkgbmnqykc(), model.eablkybsjg()));
        String strIobyxmoadg = model.iobyxmoadg();
        if (strIobyxmoadg != null) {
            binding.f130455wkgbmnqykc.setText(strIobyxmoadg);
        }
    }
}
