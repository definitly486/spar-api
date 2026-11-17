package kb0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.agtfadlqog;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        agtfadlqog agtfadlqogVar = (agtfadlqog) binding.invoke();
        agtfadlqogVar.f65346ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kb0.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.dxjokdxxww(this.f54380zdlpuopuiu, view);
            }
        });
        agtfadlqogVar.f65347wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kb0.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.btonecajqb(this.f54383zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(draadjrbmk draadjrbmkVar, View view) {
        draadjrbmkVar.ppxfxbqfkf(lqeggnwhkg.zoijcleaow.f54385iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(draadjrbmk draadjrbmkVar, View view) {
        draadjrbmkVar.ppxfxbqfkf(lqeggnwhkg.iobyxmoadg.f54384iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(agtfadlqog binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65338draadjrbmk.setText(model.eablkybsjg());
        binding.f65337btonecajqb.setText(model.ppxfxbqfkf());
        binding.f65341gtknphoqwx.setText(model.wkgbmnqykc());
        AppCompatImageView ivIcon = binding.f65339dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        c60.wkgbmnqykc.zoijcleaow(ivIcon, model.zoijcleaow());
        binding.f65347wkgbmnqykc.setText(model.iobyxmoadg());
    }
}
