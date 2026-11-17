package m22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import k22.yggfygwlhe;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yggfygwlhe f64981ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f64982wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(Context context, tg.iobyxmoadg iobyxmoadgVar) {
        super(context, iobyxmoadgVar);
        zdlpuopuiu.btonecajqb(context, "context");
        yggfygwlhe yggfygwlheVarPpxfxbqfkf = yggfygwlhe.ppxfxbqfkf(LayoutInflater.from(context));
        yggfygwlheVarPpxfxbqfkf.f53651zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: m22.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.agtfadlqog(this.f65000zdlpuopuiu, view);
            }
        });
        setContentView(yggfygwlheVarPpxfxbqfkf.getRoot());
        zdlpuopuiu.dxjokdxxww(yggfygwlheVarPpxfxbqfkf, "apply(...)");
        this.f64981ppxfxbqfkf = yggfygwlheVarPpxfxbqfkf;
        this.f64982wkgbmnqykc = s40.gxszxtbevo.scan_go_tutorial_option_popup_background;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.dismiss();
    }

    public final void ojitshcjhn(o22.iobyxmoadg option) {
        zdlpuopuiu.btonecajqb(option, "option");
        yggfygwlhe yggfygwlheVar = this.f64981ppxfxbqfkf;
        yggfygwlheVar.f53647gxszxtbevo.setText(option.nufgyqmvbu());
        yggfygwlheVar.f53646eablkybsjg.setText(option.wkgbmnqykc());
        AppCompatImageView ivSwipe = yggfygwlheVar.f53650wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivSwipe, "ivSwipe");
        ivSwipe.setVisibility(option == o22.iobyxmoadg.DELETE_PRODUCT ? 0 : 8);
    }

    @Override // m22.zoijcleaow
    public int wkgbmnqykc() {
        return this.f64982wkgbmnqykc;
    }
}
