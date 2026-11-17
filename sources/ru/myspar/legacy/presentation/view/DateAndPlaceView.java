package ru.myspar.legacy.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import c60.nufgyqmvbu;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.i;
import ru.myspar.legacy.presentation.view.DateAndPlaceView;
import s40.agtfadlqog;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/myspar/legacy/presentation/view/DateAndPlaceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lgg/wwaezpbzkn;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnArrowClickListener", "(Ltg/iobyxmoadg;)V", "Lm60/i;", "zdlpuopuiu", "Lm60/i;", "binding", "", "value", "getTextDate", "()Ljava/lang/String;", "setTextDate", "(Ljava/lang/String;)V", "textDate", "getTextPlace", "setTextPlace", "textPlace", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DateAndPlaceView extends ConstraintLayout {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final i binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateAndPlaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(tg.iobyxmoadg iobyxmoadgVar, View view) {
        iobyxmoadgVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(DateAndPlaceView dateAndPlaceView, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        i iVar = dateAndPlaceView.binding;
        iVar.f65567ppxfxbqfkf.setText(use.getString(agtfadlqog.DateAndPlaceView_text_date));
        iVar.f65567ppxfxbqfkf.setCompoundDrawablesWithIntrinsicBounds(use.getDrawable(agtfadlqog.DateAndPlaceView_image_date), (Drawable) null, (Drawable) null, (Drawable) null);
        iVar.f65568wkgbmnqykc.setText(use.getString(agtfadlqog.DateAndPlaceView_text_place));
        iVar.f65568wkgbmnqykc.setCompoundDrawablesWithIntrinsicBounds(use.getDrawable(agtfadlqog.DateAndPlaceView_image_place), (Drawable) null, (Drawable) null, (Drawable) null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final String getTextDate() {
        return this.binding.f65567ppxfxbqfkf.getText().toString();
    }

    public final String getTextPlace() {
        return this.binding.f65568wkgbmnqykc.getText().toString();
    }

    public final void setOnArrowClickListener(final tg.iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.binding.f65569zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ge0.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateAndPlaceView.kcexrzcfyt(listener, view);
            }
        });
    }

    public final void setTextDate(String value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.binding.f65567ppxfxbqfkf.setText(value);
    }

    public final void setTextPlace(String value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.binding.f65568wkgbmnqykc.setText(value);
    }

    public /* synthetic */ DateAndPlaceView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateAndPlaceView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        i iVarPpxfxbqfkf = i.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(iVarPpxfxbqfkf, "inflate(...)");
        this.binding = iVarPpxfxbqfkf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agtfadlqog.DateAndPlaceView);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        nufgyqmvbu.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: ge0.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return DateAndPlaceView.vdvldrhtss(this.f37006zdlpuopuiu, (TypedArray) obj);
            }
        });
    }
}
