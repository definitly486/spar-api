package m22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk extends zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f64978eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Context f64979ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final n22.zoijcleaow f64980wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(Context context, final tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar) {
        super(context, iobyxmoadgVar);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f64979ppxfxbqfkf = context;
        this.f64980wkgbmnqykc = new n22.zoijcleaow(new tg.draadjrbmk() { // from class: m22.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.ojitshcjhn(this.f64977zdlpuopuiu, draadjrbmkVar, (o22.iobyxmoadg) obj);
            }
        });
        this.f64978eablkybsjg = s40.gxszxtbevo.scan_and_go_tutorial_background;
        rgvfuqvkyq();
        setOutsideTouchable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, o22.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.dismiss();
        if (draadjrbmkVar2 != null) {
            draadjrbmkVar2.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final k22.zdlpuopuiu rgvfuqvkyq() {
        k22.zdlpuopuiu zdlpuopuiuVarPpxfxbqfkf = k22.zdlpuopuiu.ppxfxbqfkf(LayoutInflater.from(this.f64979ppxfxbqfkf));
        zdlpuopuiuVarPpxfxbqfkf.f53653ppxfxbqfkf.setHasFixedSize(true);
        RecyclerView rvTutorialItems = zdlpuopuiuVarPpxfxbqfkf.f53653ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvTutorialItems, "rvTutorialItems");
        n22.zoijcleaow zoijcleaowVar = this.f64980wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(zdlpuopuiuVarPpxfxbqfkf);
        e60.zoijcleaow.ppxfxbqfkf(rvTutorialItems, zoijcleaowVar, zdlpuopuiuVarPpxfxbqfkf);
        zdlpuopuiuVarPpxfxbqfkf.f53655zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: m22.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.vdvldrhtss(this.f64984zdlpuopuiu, view);
            }
        });
        setContentView(zdlpuopuiuVarPpxfxbqfkf.getRoot());
        zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarPpxfxbqfkf, "apply(...)");
        return zdlpuopuiuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(draadjrbmk draadjrbmkVar, View view) {
        draadjrbmkVar.dismiss();
    }

    public final void oxmwwwfdhm(List value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.f64980wkgbmnqykc.wkgbmnqykc(value);
    }

    @Override // m22.zoijcleaow
    public int wkgbmnqykc() {
        return this.f64978eablkybsjg;
    }
}
