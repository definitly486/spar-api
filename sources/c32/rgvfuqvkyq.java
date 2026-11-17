package c32;

import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgvfuqvkyq(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        k22.zoijcleaow zoijcleaowVar = (k22.zoijcleaow) binding.invoke();
        zoijcleaowVar.f53659ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: c32.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rgvfuqvkyq.dxjokdxxww(this.f18703zdlpuopuiu, view);
            }
        });
        zoijcleaowVar.f53661zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: c32.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rgvfuqvkyq.btonecajqb(this.f18712zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(rgvfuqvkyq rgvfuqvkyqVar, View view) {
        rgvfuqvkyqVar.ppxfxbqfkf(gtknphoqwx.iobyxmoadg.f18707iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(rgvfuqvkyq rgvfuqvkyqVar, View view) {
        rgvfuqvkyqVar.ppxfxbqfkf(gtknphoqwx.zoijcleaow.f18708iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(k22.zoijcleaow binding, draadjrbmk model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        if (model.zoijcleaow()) {
            return;
        }
        binding.f53661zoijcleaow.setText(wkgbmnqykc().getString(model.iobyxmoadg() ? s12.wkgbmnqykc.scan_go_matrix_scan_skip_removing : s12.wkgbmnqykc.scan_go_matrix_scan_skip_adding));
    }
}
