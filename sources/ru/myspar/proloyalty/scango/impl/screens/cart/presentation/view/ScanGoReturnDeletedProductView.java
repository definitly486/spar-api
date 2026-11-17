package ru.myspar.proloyalty.scango.impl.screens.cart.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import go1.agtfadlqog;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.scango.impl.screens.cart.presentation.view.ScanGoReturnDeletedProductView;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R*\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010,\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lru/myspar/proloyalty/scango/impl/screens/cart/presentation/view/ScanGoReturnDeletedProductView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "Lgg/wwaezpbzkn;", "setEnabled", "(Z)V", "Lgo1/agtfadlqog;", "zdlpuopuiu", "Lgo1/agtfadlqog;", "binding", "yggfygwlhe", "I", "getDurationInSeconds", "()I", "setDurationInSeconds", "(I)V", "durationInSeconds", "value", "jyumaefscl", "getMax", "setMax", "max", "Lkotlin/Function0;", "iwizpuwonk", "Ltg/iobyxmoadg;", "getOnReturn", "()Ltg/iobyxmoadg;", "setOnReturn", "(Ltg/iobyxmoadg;)V", "onReturn", "", "getProgress", "()J", "setProgress", "(J)V", "progress", "cqumvgiudr", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoReturnDeletedProductView extends ConstraintLayout {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f100766esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg onReturn;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private int max;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private int durationInSeconds;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final agtfadlqog binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanGoReturnDeletedProductView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(ScanGoReturnDeletedProductView scanGoReturnDeletedProductView, View view) {
        iobyxmoadg iobyxmoadgVar = scanGoReturnDeletedProductView.onReturn;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    public final int getDurationInSeconds() {
        return this.durationInSeconds;
    }

    public final int getMax() {
        return this.max;
    }

    public final iobyxmoadg getOnReturn() {
        return this.onReturn;
    }

    public final long getProgress() {
        return (long) this.binding.f38002ppxfxbqfkf.getProgress();
    }

    public final void setDurationInSeconds(int i13) {
        this.durationInSeconds = i13;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setVisibility(enabled ? 0 : 8);
        if (isEnabled()) {
            return;
        }
        this.binding.f38002ppxfxbqfkf.setProgress(0.0f);
    }

    public final void setMax(int i13) {
        this.max = i13;
        this.binding.f38002ppxfxbqfkf.setMax(i13);
    }

    public final void setOnReturn(iobyxmoadg iobyxmoadgVar) {
        this.onReturn = iobyxmoadgVar;
    }

    public final void setProgress(long j13) {
        this.binding.f38002ppxfxbqfkf.setProgress(j13);
        this.binding.f38003wkgbmnqykc.setText(String.valueOf(TimeUnit.MILLISECONDS.toSeconds(((long) this.durationInSeconds) - getProgress())));
    }

    public /* synthetic */ ScanGoReturnDeletedProductView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanGoReturnDeletedProductView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        agtfadlqog agtfadlqogVarPpxfxbqfkf = agtfadlqog.ppxfxbqfkf(dxjokdxxww.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(agtfadlqogVarPpxfxbqfkf, "inflate(...)");
        this.binding = agtfadlqogVarPpxfxbqfkf;
        agtfadlqogVarPpxfxbqfkf.f38004zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: wo1.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanGoReturnDeletedProductView.draadjrbmk(this.f120339zdlpuopuiu, view);
            }
        });
        agtfadlqogVarPpxfxbqfkf.f38002ppxfxbqfkf.setMax(5000);
        this.durationInSeconds = 5000;
        this.max = 5000;
    }
}
