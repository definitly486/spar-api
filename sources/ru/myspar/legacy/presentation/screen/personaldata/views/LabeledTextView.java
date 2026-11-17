package ru.myspar.legacy.presentation.screen.personaldata.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import c60.nufgyqmvbu;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.m;
import ru.myspar.legacy.presentation.screen.personaldata.views.LabeledTextView;
import s40.agtfadlqog;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/myspar/legacy/presentation/screen/personaldata/views/LabeledTextView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm60/m;", "zdlpuopuiu", "Lm60/m;", "binding", "Lcom/google/android/material/textview/MaterialTextView;", "yggfygwlhe", "Lgg/gtknphoqwx;", "getTitleView", "()Lcom/google/android/material/textview/MaterialTextView;", "titleView", "", "value", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "getLabel", "setLabel", "label", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LabeledTextView extends RelativeLayout {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx titleView;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final m binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabeledTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(LabeledTextView labeledTextView, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        labeledTextView.setTitle(use.getString(agtfadlqog.LabeledTextView_title));
        labeledTextView.setLabel(use.getString(agtfadlqog.LabeledTextView_label));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialTextView wkgbmnqykc(LabeledTextView labeledTextView) {
        return labeledTextView.binding.f65784ppxfxbqfkf;
    }

    public final String getLabel() {
        return this.binding.f65785zoijcleaow.getText().toString();
    }

    public final String getTitle() {
        return this.binding.f65784ppxfxbqfkf.getText().toString();
    }

    public final MaterialTextView getTitleView() {
        return (MaterialTextView) this.titleView.getValue();
    }

    public final void setLabel(String str) {
        this.binding.f65785zoijcleaow.setText(str);
    }

    public final void setTitle(String str) {
        this.binding.f65784ppxfxbqfkf.setText(str);
    }

    public /* synthetic */ LabeledTextView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledTextView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        m mVarPpxfxbqfkf = m.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(mVarPpxfxbqfkf, "inflate(...)");
        this.binding = mVarPpxfxbqfkf;
        this.titleView = draadjrbmk.zoijcleaow(new iobyxmoadg() { // from class: rc0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return LabeledTextView.wkgbmnqykc(this.f82530zdlpuopuiu);
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agtfadlqog.LabeledTextView);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        nufgyqmvbu.draadjrbmk(typedArrayObtainStyledAttributes, new tg.draadjrbmk() { // from class: rc0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return LabeledTextView.ppxfxbqfkf(this.f82531zdlpuopuiu, (TypedArray) obj);
            }
        });
    }
}
