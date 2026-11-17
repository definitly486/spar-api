package nr1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.agtfadlqog;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final iobyxmoadg f70900pmvmpeiblj = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f70901zynmafqrjb = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f70902esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f70903lereixgezr;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f70902esjtqupxsv = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.65f, -2, 0, false, false, 28, null);
        this.f70903lereixgezr = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: nr1.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.dxjokdxxww(this.f70897zdlpuopuiu);
            }
        });
    }

    private final agtfadlqog btonecajqb() {
        return (agtfadlqog) this.f70903lereixgezr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agtfadlqog dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogRegistrationFormSentProloyaltyBinding");
        return (agtfadlqog) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ppxfxbqfkf ppxfxbqfkfVar, View view) {
        ppxfxbqfkfVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public agtfadlqog iobyxmoadg() {
        agtfadlqog agtfadlqogVarPpxfxbqfkf = agtfadlqog.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(agtfadlqogVarPpxfxbqfkf, "inflate(...)");
        return agtfadlqogVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        btonecajqb().f127823zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: nr1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ppxfxbqfkf.gtknphoqwx(this.f70905zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f70902esjtqupxsv;
    }
}
