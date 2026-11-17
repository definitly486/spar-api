package hj0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final iobyxmoadg f40467cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f40468yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f40469esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final gtknphoqwx f40470istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f40471lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f40472pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f40473zynmafqrjb;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, tg.iobyxmoadg deleteListener, int i13, int i14) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(deleteListener, "deleteListener");
        this.f40469esjtqupxsv = deleteListener;
        this.f40471lereixgezr = i13;
        this.f40472pmvmpeiblj = i14;
        this.f40473zynmafqrjb = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.65f, -2, 0, false, false, 28, null);
        this.f40470istkbnxepw = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: hj0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f40458zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kcexrzcfyt btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogReplacementDeleteProductBinding");
        return (kcexrzcfyt) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f40469esjtqupxsv.invoke();
        wkgbmnqykcVar.dismiss();
    }

    private final kcexrzcfyt gtknphoqwx() {
        return (kcexrzcfyt) this.f40470istkbnxepw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt iobyxmoadg() {
        kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = kcexrzcfyt.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(kcexrzcfytVarPpxfxbqfkf, "inflate(...)");
        return kcexrzcfytVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        gtknphoqwx().f65692ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: hj0.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f40474zdlpuopuiu, view);
            }
        });
        gtknphoqwx().f65694zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: hj0.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f40466zdlpuopuiu, view);
            }
        });
        gtknphoqwx().f65691lqeggnwhkg.setText(this.f40471lereixgezr);
        gtknphoqwx().f65689gxszxtbevo.setText(this.f40472pmvmpeiblj);
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f40473zynmafqrjb;
    }
}
