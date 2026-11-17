package ko;

import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((zn.ppxfxbqfkf) binding.invoke()).f130465zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ko.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.nufgyqmvbu(this.f59916zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(draadjrbmk draadjrbmkVar, View view) {
        draadjrbmkVar.ppxfxbqfkf(nufgyqmvbu.iobyxmoadg.f59917iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(zn.ppxfxbqfkf binding, dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f130457dxjokdxxww.setData(new mb0.zoijcleaow(model.eablkybsjg(), model.zoijcleaow(), model.ppxfxbqfkf(), model.wkgbmnqykc()));
        binding.f130462nufgyqmvbu.setText(model.iobyxmoadg());
    }
}
