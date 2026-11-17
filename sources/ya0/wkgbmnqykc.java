package ya0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f124279esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final tg.iobyxmoadg f124280lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gtknphoqwx f124281pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final iobyxmoadg f124278zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f124277istkbnxepw = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ wkgbmnqykc(Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, iobyxmoadgVar, (i13 & 4) != 0 ? null : iobyxmoadgVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f124279esjtqupxsv.invoke();
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.wkgbmnqykc btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogComboAfterAddProductsToBaketBinding");
        return (m60.wkgbmnqykc) iobyxmoadgVarPpxfxbqfkf;
    }

    private final int draadjrbmk() {
        int iWflxmlrfwp = wflxmlrfwp();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return iWflxmlrfwp - (ct.iobyxmoadg.iobyxmoadg(45, context) * 2);
    }

    private final m60.wkgbmnqykc gtknphoqwx() {
        return (m60.wkgbmnqykc) this.f124281pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(wkgbmnqykc wkgbmnqykcVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.f124280lereixgezr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        wkgbmnqykcVar.dismiss();
    }

    private final int wflxmlrfwp() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public m60.wkgbmnqykc iobyxmoadg() {
        m60.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = m60.wkgbmnqykc.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarPpxfxbqfkf, "inflate(...)");
        return wkgbmnqykcVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m60.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = gtknphoqwx();
        wkgbmnqykcVarGtknphoqwx.f66076ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ya0.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.agtfadlqog(this.f124275zdlpuopuiu, view);
            }
        });
        wkgbmnqykcVarGtknphoqwx.f66078zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ya0.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.ojitshcjhn(this.f124282zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, draadjrbmk(), 0, false, false, 29, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, tg.iobyxmoadg onBtnClickNavigateToBasket, tg.iobyxmoadg iobyxmoadgVar) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(onBtnClickNavigateToBasket, "onBtnClickNavigateToBasket");
        this.f124279esjtqupxsv = onBtnClickNavigateToBasket;
        this.f124280lereixgezr = iobyxmoadgVar;
        this.f124281pmvmpeiblj = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ya0.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f124276zdlpuopuiu);
            }
        });
    }
}
