package io1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import go1.yggfygwlhe;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk extends zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f49071eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Context f49072ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jo1.zoijcleaow f49073wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(Context context, final tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar) {
        super(context, iobyxmoadgVar);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f49072ppxfxbqfkf = context;
        this.f49073wkgbmnqykc = new jo1.zoijcleaow(new tg.draadjrbmk() { // from class: io1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.ojitshcjhn(this.f49070zdlpuopuiu, draadjrbmkVar, (ko1.iobyxmoadg) obj);
            }
        });
        this.f49071eablkybsjg = b31.gxszxtbevo.scan_and_go_tutorial_background;
        rgvfuqvkyq();
        setOutsideTouchable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, ko1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.dismiss();
        if (draadjrbmkVar2 != null) {
            draadjrbmkVar2.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final yggfygwlhe rgvfuqvkyq() {
        yggfygwlhe yggfygwlheVarPpxfxbqfkf = yggfygwlhe.ppxfxbqfkf(LayoutInflater.from(this.f49072ppxfxbqfkf));
        yggfygwlheVarPpxfxbqfkf.f38114ppxfxbqfkf.setHasFixedSize(true);
        RecyclerView rvTutorialItems = yggfygwlheVarPpxfxbqfkf.f38114ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvTutorialItems, "rvTutorialItems");
        jo1.zoijcleaow zoijcleaowVar = this.f49073wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(yggfygwlheVarPpxfxbqfkf);
        r41.zoijcleaow.ppxfxbqfkf(rvTutorialItems, zoijcleaowVar, yggfygwlheVarPpxfxbqfkf);
        yggfygwlheVarPpxfxbqfkf.f38116zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: io1.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.vdvldrhtss(this.f49077zdlpuopuiu, view);
            }
        });
        setContentView(yggfygwlheVarPpxfxbqfkf.getRoot());
        zdlpuopuiu.dxjokdxxww(yggfygwlheVarPpxfxbqfkf, "apply(...)");
        return yggfygwlheVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(draadjrbmk draadjrbmkVar, View view) {
        draadjrbmkVar.dismiss();
    }

    public final void oxmwwwfdhm(List value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.f49073wkgbmnqykc.wkgbmnqykc(value);
    }

    @Override // io1.zoijcleaow
    public int wkgbmnqykc() {
        return this.f49071eablkybsjg;
    }
}
