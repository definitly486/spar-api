package xa0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import m60.mhtqkkgtqm;

/* JADX INFO: loaded from: classes4.dex */
public final class cqumvgiudr extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final f10.iobyxmoadg f121879esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f121880lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f121881pmvmpeiblj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqumvgiudr(Context context, f10.iobyxmoadg args) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        this.f121879esjtqupxsv = args;
        this.f121880lereixgezr = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -2, 0, false, false, 29, null);
        this.f121881pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xa0.iwizpuwonk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return cqumvgiudr.dxjokdxxww(this.f121898zdlpuopuiu);
            }
        });
    }

    private final mhtqkkgtqm btonecajqb() {
        return (mhtqkkgtqm) this.f121881pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mhtqkkgtqm dxjokdxxww(cqumvgiudr cqumvgiudrVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = cqumvgiudrVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.PopupStickerPromotionBinding");
        return (mhtqkkgtqm) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(cqumvgiudr cqumvgiudrVar, View view) {
        cqumvgiudrVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public mhtqkkgtqm iobyxmoadg() {
        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = mhtqkkgtqm.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mhtqkkgtqmVarPpxfxbqfkf, "inflate(...)");
        return mhtqkkgtqmVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(btonecajqb().getRoot());
        mhtqkkgtqm mhtqkkgtqmVarBtonecajqb = btonecajqb();
        mhtqkkgtqmVarBtonecajqb.f65800zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: xa0.jyumaefscl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cqumvgiudr.gtknphoqwx(this.f121899zdlpuopuiu, view);
            }
        });
        AppCompatImageView ivIcon = mhtqkkgtqmVarBtonecajqb.f65798ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        c60.wkgbmnqykc.zoijcleaow(ivIcon, this.f121879esjtqupxsv.zoijcleaow());
        mhtqkkgtqmVarBtonecajqb.f65796eablkybsjg.setText(this.f121879esjtqupxsv.ppxfxbqfkf());
        mhtqkkgtqmVarBtonecajqb.f65799wkgbmnqykc.setText(this.f121879esjtqupxsv.iobyxmoadg());
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121880lereixgezr;
    }
}
