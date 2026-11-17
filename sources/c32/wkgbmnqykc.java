package c32;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final iobyxmoadg f18715cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f18716yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final f22.ppxfxbqfkf f18717esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final gg.gtknphoqwx f18718istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final zoijcleaow f18719lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f18720pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f18721zynmafqrjb;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();

        void zoijcleaow();
    }

    public /* synthetic */ wkgbmnqykc(Context context, f22.ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? f22.ppxfxbqfkf.AMOUNT : ppxfxbqfkfVar, zoijcleaowVar, (i13 & 8) != 0 ? false : z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k22.zoijcleaow btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.scango.impl.databinding.DialogScanExciseStickerBinding");
        return (k22.zoijcleaow) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f18719lereixgezr.iobyxmoadg();
        wkgbmnqykcVar.dismiss();
    }

    private final k22.zoijcleaow gtknphoqwx() {
        return (k22.zoijcleaow) this.f18718istkbnxepw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f18719lereixgezr.zoijcleaow();
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public k22.zoijcleaow iobyxmoadg() {
        k22.zoijcleaow zoijcleaowVarWkgbmnqykc = k22.zoijcleaow.wkgbmnqykc(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarWkgbmnqykc, "inflate(...)");
        return zoijcleaowVarWkgbmnqykc;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k22.zoijcleaow zoijcleaowVarGtknphoqwx = gtknphoqwx();
        if (this.f18717esjtqupxsv != f22.ppxfxbqfkf.WEIGHT) {
            zoijcleaowVarGtknphoqwx.f53661zoijcleaow.setText(getContext().getString(this.f18720pmvmpeiblj ? s12.wkgbmnqykc.scan_go_matrix_scan_skip_removing : s12.wkgbmnqykc.scan_go_matrix_scan_skip_adding));
        }
        zoijcleaowVarGtknphoqwx.f53659ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: c32.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f18709zdlpuopuiu, view);
            }
        });
        zoijcleaowVarGtknphoqwx.f53661zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: c32.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f18722zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f18721zynmafqrjb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, f22.ppxfxbqfkf scanGoProductType, zoijcleaow listener, boolean z13) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(scanGoProductType, "scanGoProductType");
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f18717esjtqupxsv = scanGoProductType;
        this.f18719lereixgezr = listener;
        this.f18720pmvmpeiblj = z13;
        this.f18721zynmafqrjb = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 20, null);
        this.f18718istkbnxepw = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: c32.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f18713zdlpuopuiu);
            }
        });
    }
}
