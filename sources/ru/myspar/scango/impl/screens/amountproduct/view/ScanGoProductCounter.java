package ru.myspar.scango.impl.screens.amountproduct.view;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import c60.nufgyqmvbu;
import k22.cqumvgiudr;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import s12.wkgbmnqykc;
import s40.gxszxtbevo;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u000eR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006'"}, d2 = {"Lru/myspar/scango/impl/screens/amountproduct/view/ScanGoProductCounter;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "amount", "Lgg/wwaezpbzkn;", "nufgyqmvbu", "(D)V", "Lk22/cqumvgiudr;", "zdlpuopuiu", "Lk22/cqumvgiudr;", "binding", "value", "yggfygwlhe", "D", "getAmount", "()D", "setAmount", "Lkotlin/Function0;", "jyumaefscl", "Ltg/iobyxmoadg;", "getOnDecreaseAmountClicked", "()Ltg/iobyxmoadg;", "setOnDecreaseAmountClicked", "(Ltg/iobyxmoadg;)V", "onDecreaseAmountClicked", "iwizpuwonk", "getOnIncreaseAmountClicked", "setOnIncreaseAmountClicked", "onIncreaseAmountClicked", "cqumvgiudr", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoProductCounter extends ConstraintLayout {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f103231esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg onIncreaseAmountClicked;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg onDecreaseAmountClicked;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private double amount;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final cqumvgiudr binding;

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ScanGoProductCounter f103236jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f103237yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f103238zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ScanGoProductCounter scanGoProductCounter) {
            this.f103238zdlpuopuiu = jpowsppfyaVar;
            this.f103237yggfygwlhe = j13;
            this.f103236jyumaefscl = scanGoProductCounter;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f103238zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f103237yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            iobyxmoadg onIncreaseAmountClicked = this.f103236jyumaefscl.getOnIncreaseAmountClicked();
            if (onIncreaseAmountClicked != null) {
                onIncreaseAmountClicked.invoke();
            }
        }
    }

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ScanGoProductCounter f103239jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f103240yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f103241zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, ScanGoProductCounter scanGoProductCounter) {
            this.f103241zdlpuopuiu = jpowsppfyaVar;
            this.f103240yggfygwlhe = j13;
            this.f103239jyumaefscl = scanGoProductCounter;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f103241zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f103240yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            iobyxmoadg onDecreaseAmountClicked = this.f103239jyumaefscl.getOnDecreaseAmountClicked();
            if (onDecreaseAmountClicked != null) {
                onDecreaseAmountClicked.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanGoProductCounter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void nufgyqmvbu(double amount) {
        cqumvgiudr cqumvgiudrVar = this.binding;
        cqumvgiudrVar.f53543zoijcleaow.setImageResource(amount == 1.0d ? gxszxtbevo.ic_delete_product : gxszxtbevo.ic_minus_product);
        cqumvgiudrVar.f53542wkgbmnqykc.setText(getContext().getString(wkgbmnqykc.measure_amount_format, n30.iobyxmoadg.f68492iobyxmoadg.wflxmlrfwp(Double.valueOf(amount))));
    }

    public final double getAmount() {
        return this.amount;
    }

    public final iobyxmoadg getOnDecreaseAmountClicked() {
        return this.onDecreaseAmountClicked;
    }

    public final iobyxmoadg getOnIncreaseAmountClicked() {
        return this.onIncreaseAmountClicked;
    }

    public final void setAmount(double d13) {
        if (d13 < 1.0d) {
            d13 = 1.0d;
        }
        this.amount = d13;
        nufgyqmvbu(d13);
    }

    public final void setOnDecreaseAmountClicked(iobyxmoadg iobyxmoadgVar) {
        this.onDecreaseAmountClicked = iobyxmoadgVar;
    }

    public final void setOnIncreaseAmountClicked(iobyxmoadg iobyxmoadgVar) {
        this.onIncreaseAmountClicked = iobyxmoadgVar;
    }

    public /* synthetic */ ScanGoProductCounter(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanGoProductCounter(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        cqumvgiudr cqumvgiudrVarPpxfxbqfkf = cqumvgiudr.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(cqumvgiudrVarPpxfxbqfkf, "inflate(...)");
        this.binding = cqumvgiudrVarPpxfxbqfkf;
        AppCompatImageButton btnMinusQuantity = cqumvgiudrVarPpxfxbqfkf.f53543zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnMinusQuantity, "btnMinusQuantity");
        btnMinusQuantity.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
        AppCompatImageButton btnPlusQuantity = cqumvgiudrVarPpxfxbqfkf.f53541ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnPlusQuantity, "btnPlusQuantity");
        btnPlusQuantity.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, this));
        this.amount = 1.0d;
    }
}
