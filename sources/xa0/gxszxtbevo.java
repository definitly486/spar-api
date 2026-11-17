package xa0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f121894esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f121895lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f121896pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final iobyxmoadg f121893zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f121892istkbnxepw = 8;

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
        this.f121894esjtqupxsv = photoUrl;
        this.f121895lereixgezr = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 1.0f, -2, 0, false, false, 28, null);
        this.f121896pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xa0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gxszxtbevo.dxjokdxxww(this.f121921zdlpuopuiu);
            }
        });
    }

    private final m60.rgvfuqvkyq btonecajqb() {
        return (m60.rgvfuqvkyq) this.f121896pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.rgvfuqvkyq dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogFullscreenPhotoBinding");
        return (m60.rgvfuqvkyq) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public m60.rgvfuqvkyq iobyxmoadg() {
        m60.rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = m60.rgvfuqvkyq.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(rgvfuqvkyqVarPpxfxbqfkf, "inflate(...)");
        return rgvfuqvkyqVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m60.rgvfuqvkyq rgvfuqvkyqVarBtonecajqb = btonecajqb();
        rgvfuqvkyqVarBtonecajqb.f65924zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: xa0.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.gtknphoqwx(this.f121890zdlpuopuiu, view);
            }
        });
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(getContext()).eablkybsjg().grlcpdaxtj(this.f121894esjtqupxsv).wizcaqwiak(rgvfuqvkyqVarBtonecajqb.f65923ppxfxbqfkf);
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121895lereixgezr;
    }
}
