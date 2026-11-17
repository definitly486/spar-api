package yo1;

import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgvfuqvkyq(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        go1.zoijcleaow zoijcleaowVar = (go1.zoijcleaow) binding.invoke();
        zoijcleaowVar.f38126ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: yo1.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rgvfuqvkyq.dxjokdxxww(this.f126022zdlpuopuiu, view);
            }
        });
        zoijcleaowVar.f38128zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: yo1.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rgvfuqvkyq.btonecajqb(this.f126031zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(rgvfuqvkyq rgvfuqvkyqVar, View view) {
        rgvfuqvkyqVar.ppxfxbqfkf(gtknphoqwx.iobyxmoadg.f126026iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(rgvfuqvkyq rgvfuqvkyqVar, View view) {
        rgvfuqvkyqVar.ppxfxbqfkf(gtknphoqwx.zoijcleaow.f126027iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(go1.zoijcleaow binding, draadjrbmk model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        if (model.zoijcleaow()) {
            return;
        }
        binding.f38128zoijcleaow.setText(wkgbmnqykc().getString(model.iobyxmoadg() ? on1.wkgbmnqykc.proloyalty_scan_go_matrix_scan_skip_removing : on1.wkgbmnqykc.proloyalty_scan_go_matrix_scan_skip_adding));
    }
}
