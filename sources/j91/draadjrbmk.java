package j91;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class draadjrbmk extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        z41.gtknphoqwx gtknphoqwxVar = (z41.gtknphoqwx) binding.invoke();
        gtknphoqwxVar.f128032ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: j91.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.dxjokdxxww(this.f50902zdlpuopuiu, view);
            }
        });
        gtknphoqwxVar.f128033wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: j91.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.btonecajqb(this.f50905zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(draadjrbmk draadjrbmkVar, View view) {
        draadjrbmkVar.ppxfxbqfkf(lqeggnwhkg.zoijcleaow.f50907iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(draadjrbmk draadjrbmkVar, View view) {
        draadjrbmkVar.ppxfxbqfkf(lqeggnwhkg.iobyxmoadg.f50906iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(z41.gtknphoqwx binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f128024draadjrbmk.setText(model.eablkybsjg());
        binding.f128023btonecajqb.setText(model.ppxfxbqfkf());
        binding.f128027gtknphoqwx.setText(model.wkgbmnqykc());
        AppCompatImageView ivIcon = binding.f128025dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        p41.eablkybsjg.zoijcleaow(ivIcon, model.zoijcleaow());
        binding.f128033wkgbmnqykc.setText(model.iobyxmoadg());
    }
}
