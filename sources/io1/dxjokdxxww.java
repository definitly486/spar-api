package io1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import go1.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zdlpuopuiu f49074ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f49075wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(Context context, tg.iobyxmoadg iobyxmoadgVar) {
        super(context, iobyxmoadgVar);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu zdlpuopuiuVarPpxfxbqfkf = zdlpuopuiu.ppxfxbqfkf(LayoutInflater.from(context));
        zdlpuopuiuVarPpxfxbqfkf.f38122zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: io1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.agtfadlqog(this.f49093zdlpuopuiu, view);
            }
        });
        setContentView(zdlpuopuiuVarPpxfxbqfkf.getRoot());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarPpxfxbqfkf, "apply(...)");
        this.f49074ppxfxbqfkf = zdlpuopuiuVarPpxfxbqfkf;
        this.f49075wkgbmnqykc = b31.gxszxtbevo.scan_go_tutorial_option_popup_background;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.dismiss();
    }

    public final void ojitshcjhn(ko1.iobyxmoadg option) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(option, "option");
        zdlpuopuiu zdlpuopuiuVar = this.f49074ppxfxbqfkf;
        zdlpuopuiuVar.f38118gxszxtbevo.setText(option.nufgyqmvbu());
        zdlpuopuiuVar.f38117eablkybsjg.setText(option.wkgbmnqykc());
        AppCompatImageView ivSwipe = zdlpuopuiuVar.f38121wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivSwipe, "ivSwipe");
        ivSwipe.setVisibility(option == ko1.iobyxmoadg.DELETE_PRODUCT ? 0 : 8);
    }

    @Override // io1.zoijcleaow
    public int wkgbmnqykc() {
        return this.f49075wkgbmnqykc;
    }
}
