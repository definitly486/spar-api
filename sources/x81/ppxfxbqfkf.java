package x81;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import z41.zeieaojujs;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f121513esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gg.gtknphoqwx f121514lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f121515pmvmpeiblj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(Context context, String str) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f121513esjtqupxsv = str;
        this.f121514lereixgezr = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x81.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.dxjokdxxww(this.f121535zdlpuopuiu);
            }
        });
        this.f121515pmvmpeiblj = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -2, 0, false, false, 29, null);
    }

    private final zeieaojujs btonecajqb() {
        return (zeieaojujs) this.f121514lereixgezr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zeieaojujs dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.PopupDigitalChecksMailProloyaltyBinding");
        return (zeieaojujs) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ppxfxbqfkf ppxfxbqfkfVar, View view) {
        ppxfxbqfkfVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public zeieaojujs iobyxmoadg() {
        zeieaojujs zeieaojujsVarPpxfxbqfkf = zeieaojujs.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zeieaojujsVarPpxfxbqfkf, "inflate(...)");
        return zeieaojujsVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        btonecajqb().f128572wkgbmnqykc.setText(this.f121513esjtqupxsv);
        btonecajqb().f128573zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: x81.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ppxfxbqfkf.gtknphoqwx(this.f121507zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121515pmvmpeiblj;
    }
}
