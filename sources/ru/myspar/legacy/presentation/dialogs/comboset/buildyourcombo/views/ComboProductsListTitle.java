package ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c60.nufgyqmvbu;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.eablkybsjg;
import ng.zoijcleaow;
import s40.agtfadlqog;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\fR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lru/myspar/legacy/presentation/dialogs/comboset/buildyourcombo/views/ComboProductsListTitle;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgg/wwaezpbzkn;", "zoijcleaow", "()V", "iobyxmoadg", "(Landroid/util/AttributeSet;)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "titleRes", "setTitleRes", "(I)V", "message", "setMessage", "messageRes", "setMessageRes", "wkgbmnqykc", "ppxfxbqfkf", "Lm60/eablkybsjg;", "zdlpuopuiu", "Lm60/eablkybsjg;", "binding", "yggfygwlhe", "Ljava/lang/String;", "jyumaefscl", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComboProductsListTitle extends FrameLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private String message;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final eablkybsjg binding;

    private enum iobyxmoadg {
        TITLE,
        MESSAGE,
        NOTHING;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f88588cqumvgiudr = zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComboProductsListTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void iobyxmoadg(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, agtfadlqog.ComboProductsListTitle);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.title = typedArrayObtainStyledAttributes.hasValue(agtfadlqog.ComboProductsListTitle_comboListTitle) ? typedArrayObtainStyledAttributes.getString(agtfadlqog.ComboProductsListTitle_comboListTitle) : null;
        this.message = typedArrayObtainStyledAttributes.hasValue(agtfadlqog.ComboProductsListTitle_comboListMessage) ? typedArrayObtainStyledAttributes.getString(agtfadlqog.ComboProductsListTitle_comboListMessage) : null;
        int i13 = typedArrayObtainStyledAttributes.getInt(agtfadlqog.ComboProductsListTitle_comboTitleContentVisible, iobyxmoadg.NOTHING.ordinal());
        if (i13 == iobyxmoadg.TITLE.ordinal()) {
            wkgbmnqykc();
        } else if (i13 == iobyxmoadg.MESSAGE.ordinal()) {
            ppxfxbqfkf();
        } else {
            zoijcleaow();
        }
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void zoijcleaow() {
        MaterialTextView tvTitle = this.binding.f65485ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
        tvTitle.setVisibility(8);
        MaterialTextView tvMessage = this.binding.f65486zoijcleaow;
        zdlpuopuiu.dxjokdxxww(tvMessage, "tvMessage");
        tvMessage.setVisibility(8);
    }

    public final void ppxfxbqfkf() {
        MaterialTextView tvTitle = this.binding.f65485ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
        tvTitle.setVisibility(8);
        this.binding.f65486zoijcleaow.setText(this.message);
        MaterialTextView tvMessage = this.binding.f65486zoijcleaow;
        zdlpuopuiu.dxjokdxxww(tvMessage, "tvMessage");
        tvMessage.setVisibility(0);
    }

    public final void setMessage(String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        this.message = message;
    }

    public final void setMessageRes(int messageRes) {
        String string = getContext().getString(messageRes);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        setMessage(string);
    }

    public final void setTitle(String title) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.title = title;
    }

    public final void setTitleRes(int titleRes) {
        String string = getContext().getString(titleRes);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        setTitle(string);
    }

    public final void wkgbmnqykc() {
        this.binding.f65485ppxfxbqfkf.setText(this.title);
        MaterialTextView tvTitle = this.binding.f65485ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
        tvTitle.setVisibility(0);
        MaterialTextView tvMessage = this.binding.f65486zoijcleaow;
        zdlpuopuiu.dxjokdxxww(tvMessage, "tvMessage");
        tvMessage.setVisibility(8);
    }

    public /* synthetic */ ComboProductsListTitle(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboProductsListTitle(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        eablkybsjg eablkybsjgVarPpxfxbqfkf = eablkybsjg.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(eablkybsjgVarPpxfxbqfkf, "inflate(...)");
        this.binding = eablkybsjgVarPpxfxbqfkf;
        iobyxmoadg(attributeSet);
    }
}
