package u52;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.oxmwwwfdhm;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final iobyxmoadg f112739pmvmpeiblj = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f112740zynmafqrjb = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f112741esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f112742lereixgezr;

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
        this.f112741esjtqupxsv = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.65f, -2, 0, false, false, 28, null);
        this.f112742lereixgezr = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: u52.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.dxjokdxxww(this.f112736zdlpuopuiu);
            }
        });
    }

    private final oxmwwwfdhm btonecajqb() {
        return (oxmwwwfdhm) this.f112742lereixgezr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oxmwwwfdhm dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogRegistrationFormSentBinding");
        return (oxmwwwfdhm) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ppxfxbqfkf ppxfxbqfkfVar, View view) {
        ppxfxbqfkfVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public oxmwwwfdhm iobyxmoadg() {
        oxmwwwfdhm oxmwwwfdhmVarPpxfxbqfkf = oxmwwwfdhm.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarPpxfxbqfkf, "inflate(...)");
        return oxmwwwfdhmVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        btonecajqb().f65870zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: u52.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ppxfxbqfkf.gtknphoqwx(this.f112744zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f112741esjtqupxsv;
    }
}
