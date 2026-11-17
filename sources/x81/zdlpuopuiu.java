package x81;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import z41.tbqsvytpvh;

/* JADX INFO: loaded from: classes5.dex */
public final class zdlpuopuiu extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final vz0.iobyxmoadg f121532esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f121533lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f121534pmvmpeiblj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdlpuopuiu(Context context, vz0.iobyxmoadg args) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        this.f121532esjtqupxsv = args;
        this.f121533lereixgezr = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -2, 0, false, false, 29, null);
        this.f121534pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x81.kcexrzcfyt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.dxjokdxxww(this.f121508zdlpuopuiu);
            }
        });
    }

    private final tbqsvytpvh btonecajqb() {
        return (tbqsvytpvh) this.f121534pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tbqsvytpvh dxjokdxxww(zdlpuopuiu zdlpuopuiuVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = zdlpuopuiuVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.PopupStickerPromotionProloyaltyBinding");
        return (tbqsvytpvh) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(zdlpuopuiu zdlpuopuiuVar, View view) {
        zdlpuopuiuVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public tbqsvytpvh iobyxmoadg() {
        tbqsvytpvh tbqsvytpvhVarPpxfxbqfkf = tbqsvytpvh.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tbqsvytpvhVarPpxfxbqfkf, "inflate(...)");
        return tbqsvytpvhVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(btonecajqb().getRoot());
        tbqsvytpvh tbqsvytpvhVarBtonecajqb = btonecajqb();
        tbqsvytpvhVarBtonecajqb.f128405zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: x81.oxmwwwfdhm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zdlpuopuiu.gtknphoqwx(this.f121512zdlpuopuiu, view);
            }
        });
        AppCompatImageView ivIcon = tbqsvytpvhVarBtonecajqb.f128403ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        p41.eablkybsjg.zoijcleaow(ivIcon, this.f121532esjtqupxsv.zoijcleaow());
        tbqsvytpvhVarBtonecajqb.f128401eablkybsjg.setText(this.f121532esjtqupxsv.ppxfxbqfkf());
        tbqsvytpvhVarBtonecajqb.f128404wkgbmnqykc.setText(this.f121532esjtqupxsv.iobyxmoadg());
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121533lereixgezr;
    }
}
