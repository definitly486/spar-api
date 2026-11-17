package hj0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final iobyxmoadg f40459cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f40460yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f40461esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final gtknphoqwx f40462istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f40463lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f40464pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f40465zynmafqrjb;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(Context context, tg.iobyxmoadg dismissListener, int i13, int i14) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(dismissListener, "dismissListener");
        this.f40461esjtqupxsv = dismissListener;
        this.f40463lereixgezr = i13;
        this.f40464pmvmpeiblj = i14;
        this.f40465zynmafqrjb = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.65f, -2, 0, false, false, 28, null);
        this.f40462istkbnxepw = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: hj0.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.dxjokdxxww(this.f40457zdlpuopuiu);
            }
        });
    }

    private final m60.zdlpuopuiu btonecajqb() {
        return (m60.zdlpuopuiu) this.f40462istkbnxepw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.zdlpuopuiu dxjokdxxww(lqeggnwhkg lqeggnwhkgVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogReplacementTimeIsOverBinding");
        return (m60.zdlpuopuiu) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f40461esjtqupxsv.invoke();
        lqeggnwhkgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public m60.zdlpuopuiu iobyxmoadg() {
        m60.zdlpuopuiu zdlpuopuiuVarPpxfxbqfkf = m60.zdlpuopuiu.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarPpxfxbqfkf, "inflate(...)");
        return zdlpuopuiuVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        btonecajqb().f66191zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: hj0.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.gtknphoqwx(this.f40456zdlpuopuiu, view);
            }
        });
        btonecajqb().f66186eablkybsjg.setText(this.f40463lereixgezr);
        btonecajqb().f66187gxszxtbevo.setText(this.f40464pmvmpeiblj);
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f40465zynmafqrjb;
    }
}
