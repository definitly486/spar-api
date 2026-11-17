package x81;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f121504esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f121505lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f121506pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final iobyxmoadg f121503zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f121502istkbnxepw = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(Context context, String photoUrl) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        this.f121504esjtqupxsv = photoUrl;
        this.f121505lereixgezr = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 1.0f, -2, 0, false, false, 28, null);
        this.f121506pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x81.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gxszxtbevo.dxjokdxxww(this.f121531zdlpuopuiu);
            }
        });
    }

    private final z41.draadjrbmk btonecajqb() {
        return (z41.draadjrbmk) this.f121506pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z41.draadjrbmk dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogFullscreenPhotoProloyaltyBinding");
        return (z41.draadjrbmk) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public z41.draadjrbmk iobyxmoadg() {
        z41.draadjrbmk draadjrbmkVarPpxfxbqfkf = z41.draadjrbmk.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(draadjrbmkVarPpxfxbqfkf, "inflate(...)");
        return draadjrbmkVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z41.draadjrbmk draadjrbmkVarBtonecajqb = btonecajqb();
        draadjrbmkVarBtonecajqb.f127912zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: x81.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.gtknphoqwx(this.f121500zdlpuopuiu, view);
            }
        });
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(getContext()).eablkybsjg().grlcpdaxtj(this.f121504esjtqupxsv).wizcaqwiak(draadjrbmkVarBtonecajqb.f127911ppxfxbqfkf);
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121505lereixgezr;
    }
}
