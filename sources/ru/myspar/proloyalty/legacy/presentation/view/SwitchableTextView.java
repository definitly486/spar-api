package ru.myspar.proloyalty.legacy.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import b31.ojitshcjhn;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.legacy.presentation.view.SwitchableTextView;
import tg.draadjrbmk;
import z41.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR.\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010$\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 ¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/SwitchableTextView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lz41/k;", "zdlpuopuiu", "Lz41/k;", "binding", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "yggfygwlhe", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "", "isChecked", "()Z", "setChecked", "(Z)V", "isOptionEnabled", "isToggleEnabled", "setToggleEnabled", "isMessageEnabled", "setMessageEnabled", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SwitchableTextView extends RelativeLayout {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private CompoundButton.OnCheckedChangeListener listener;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final k binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(SwitchableTextView switchableTextView, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        switchableTextView.setTitle(use.getString(ojitshcjhn.SwitchableTextView_title));
        switchableTextView.setChecked(use.getBoolean(ojitshcjhn.SwitchableTextView_checked, false));
        boolean z13 = use.getBoolean(ojitshcjhn.SwitchableTextView_enabled, true);
        switchableTextView.setToggleEnabled(z13);
        switchableTextView.setMessageEnabled(z13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final CompoundButton.OnCheckedChangeListener getListener() {
        return this.listener;
    }

    public final String getTitle() {
        return this.binding.f128206ppxfxbqfkf.getText().toString();
    }

    public final void setChecked(boolean z13) {
        this.binding.f128207zoijcleaow.setChecked(z13);
    }

    public final void setListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.binding.f128207zoijcleaow.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setMessageEnabled(boolean z13) {
        this.binding.f128206ppxfxbqfkf.setEnabled(z13);
    }

    public final void setTitle(String str) {
        this.binding.f128206ppxfxbqfkf.setText(str);
    }

    public final void setToggleEnabled(boolean z13) {
        this.binding.f128207zoijcleaow.setEnabled(z13);
    }

    public /* synthetic */ SwitchableTextView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchableTextView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        k kVarPpxfxbqfkf = k.ppxfxbqfkf(dxjokdxxww.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(kVarPpxfxbqfkf, "inflate(...)");
        this.binding = kVarPpxfxbqfkf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ojitshcjhn.SwitchableTextView);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        dxjokdxxww.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: bc1.zdlpuopuiu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SwitchableTextView.zoijcleaow(this.f15770zdlpuopuiu, (TypedArray) obj);
            }
        });
    }
}
