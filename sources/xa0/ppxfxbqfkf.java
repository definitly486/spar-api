package xa0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import m60.ipoelvxyzq;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f121905esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gg.gtknphoqwx f121906lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f121907pmvmpeiblj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(Context context, String str) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f121905esjtqupxsv = str;
        this.f121906lereixgezr = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xa0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.dxjokdxxww(this.f121897zdlpuopuiu);
            }
        });
        this.f121907pmvmpeiblj = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -2, 0, false, false, 29, null);
    }

    private final ipoelvxyzq btonecajqb() {
        return (ipoelvxyzq) this.f121906lereixgezr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ipoelvxyzq dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.PopupDigitalChecksMailBinding");
        return (ipoelvxyzq) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ppxfxbqfkf ppxfxbqfkfVar, View view) {
        ppxfxbqfkfVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public ipoelvxyzq iobyxmoadg() {
        ipoelvxyzq ipoelvxyzqVarPpxfxbqfkf = ipoelvxyzq.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ipoelvxyzqVarPpxfxbqfkf, "inflate(...)");
        return ipoelvxyzqVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        btonecajqb().f65605wkgbmnqykc.setText(this.f121905esjtqupxsv);
        btonecajqb().f65606zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: xa0.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ppxfxbqfkf.gtknphoqwx(this.f121933zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121907pmvmpeiblj;
    }
}
