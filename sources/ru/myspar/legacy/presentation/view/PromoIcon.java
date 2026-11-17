package ru.myspar.legacy.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import c60.lqeggnwhkg;
import c60.nufgyqmvbu;
import c60.wkgbmnqykc;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.ixidwrxhsl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/myspar/legacy/presentation/view/PromoIcon;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/myspar/legacy/presentation/view/PromoIcon$iobyxmoadg;", "data", "Lgg/wwaezpbzkn;", "setData", "(Lru/myspar/legacy/presentation/view/PromoIcon$iobyxmoadg;)V", "Lm60/ixidwrxhsl;", "zdlpuopuiu", "Lm60/ixidwrxhsl;", "binding", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromoIcon extends FrameLayout {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private ixidwrxhsl binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public final void setData(iobyxmoadg data) {
        Integer numIobyxmoadg;
        zdlpuopuiu.btonecajqb(data, "data");
        ixidwrxhsl ixidwrxhslVar = this.binding;
        AppCompatImageView ivPromo = ixidwrxhslVar.f65628zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivPromo, "ivPromo");
        wkgbmnqykc.zoijcleaow(ivPromo, data.ppxfxbqfkf());
        MaterialTextView materialTextView = ixidwrxhslVar.f65627ppxfxbqfkf;
        Integer numIobyxmoadg2 = data.iobyxmoadg();
        materialTextView.setText(numIobyxmoadg2 != null ? numIobyxmoadg2.toString() : null);
        if (data.zoijcleaow().length() > 0) {
            MaterialTextView tvPromoIconCounter = ixidwrxhslVar.f65627ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(tvPromoIconCounter, "tvPromoIconCounter");
            lqeggnwhkg.lqeggnwhkg(tvPromoIconCounter, data.zoijcleaow());
        }
        MaterialTextView tvPromoIconCounter2 = ixidwrxhslVar.f65627ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvPromoIconCounter2, "tvPromoIconCounter");
        tvPromoIconCounter2.setVisibility(data.iobyxmoadg() != null && ((numIobyxmoadg = data.iobyxmoadg()) == null || numIobyxmoadg.intValue() != 0) ? 0 : 8);
    }

    public /* synthetic */ PromoIcon(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoIcon(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        ixidwrxhsl ixidwrxhslVarZoijcleaow = ixidwrxhsl.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(ixidwrxhslVarZoijcleaow, "inflate(...)");
        this.binding = ixidwrxhslVarZoijcleaow;
        setClipChildren(false);
        setClipToPadding(false);
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89970iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f89971ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Integer f89972zoijcleaow;

        public iobyxmoadg(String color, Integer num, String icon) {
            zdlpuopuiu.btonecajqb(color, "color");
            zdlpuopuiu.btonecajqb(icon, "icon");
            this.f89970iobyxmoadg = color;
            this.f89972zoijcleaow = num;
            this.f89971ppxfxbqfkf = icon;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f89970iobyxmoadg, iobyxmoadgVar.f89970iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89972zoijcleaow, iobyxmoadgVar.f89972zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89971ppxfxbqfkf, iobyxmoadgVar.f89971ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f89970iobyxmoadg.hashCode() * 31;
            Integer num = this.f89972zoijcleaow;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f89971ppxfxbqfkf.hashCode();
        }

        public final Integer iobyxmoadg() {
            return this.f89972zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f89971ppxfxbqfkf;
        }

        public String toString() {
            return "Data(color=" + this.f89970iobyxmoadg + ", balance=" + this.f89972zoijcleaow + ", icon=" + this.f89971ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f89970iobyxmoadg;
        }

        public /* synthetic */ iobyxmoadg(String str, Integer num, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? null : num, str2);
        }
    }
}
