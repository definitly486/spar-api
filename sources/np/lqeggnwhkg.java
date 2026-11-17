package np;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f70483esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f70484lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f70485pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final iobyxmoadg f70482zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f70481istkbnxepw = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(Context context, tg.iobyxmoadg onDelete) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(onDelete, "onDelete");
        this.f70483esjtqupxsv = onDelete;
        this.f70484lereixgezr = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 28, null);
        this.f70485pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: np.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.btonecajqb(this.f70499zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.gxszxtbevo btonecajqb(lqeggnwhkg lqeggnwhkgVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogDeleteAccountConfirmBinding");
        return (m60.gxszxtbevo) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.dismiss();
    }

    private final m60.gxszxtbevo gtknphoqwx() {
        return (m60.gxszxtbevo) this.f70485pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f70483esjtqupxsv.invoke();
        lqeggnwhkgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public m60.gxszxtbevo iobyxmoadg() {
        m60.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = m60.gxszxtbevo.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarPpxfxbqfkf, "inflate(...)");
        return gxszxtbevoVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m60.gxszxtbevo gxszxtbevoVarGtknphoqwx = gtknphoqwx();
        gxszxtbevoVarGtknphoqwx.f65541zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: np.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.draadjrbmk(this.f70478zdlpuopuiu, view);
            }
        });
        gxszxtbevoVarGtknphoqwx.f65539ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: np.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.wflxmlrfwp(this.f70479zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f70484lereixgezr;
    }
}
