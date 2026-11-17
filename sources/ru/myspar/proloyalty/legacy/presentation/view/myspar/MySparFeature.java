package ru.myspar.proloyalty.legacy.presentation.view.myspar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b31.eablkybsjg;
import b31.gxszxtbevo;
import b31.ojitshcjhn;
import bc1.wkgbmnqykc;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.legacy.presentation.view.myspar.MySparFeature;
import tg.draadjrbmk;
import tg.iobyxmoadg;
import vk0.lqeggnwhkg;
import z41.grlcpdaxtj;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 22\u00020\u0001:\u00013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010,\u001a\u00020'2\u0006\u0010\n\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00101\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00064"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/myspar/MySparFeature;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "eablkybsjg", "(I)Ljava/lang/String;", "w", "h", "oldw", "oldh", "Lgg/wwaezpbzkn;", "onSizeChanged", "(IIII)V", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFeatureBannerClickListener", "(Ltg/iobyxmoadg;)V", "zdlpuopuiu", "Ljava/lang/String;", "getButtonImage", "()Ljava/lang/String;", "setButtonImage", "(Ljava/lang/String;)V", "buttonImage", "Lz41/grlcpdaxtj;", "yggfygwlhe", "Lz41/grlcpdaxtj;", "binding", "jyumaefscl", "Ltg/iobyxmoadg;", "onFeatureBannerClickListener", "", "getBadgeIsVisible", "()Z", "setBadgeIsVisible", "(Z)V", "badgeIsVisible", "getBadgeCount", "()I", "setBadgeCount", "(I)V", "badgeCount", "iwizpuwonk", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MySparFeature extends FrameLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg onFeatureBannerClickListener;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final grlcpdaxtj binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private String buttonImage;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f97616cqumvgiudr = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MySparFeature(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final String eablkybsjg(int value) {
        return value > 9 ? dxjokdxxww.wkgbmnqykc(this, lqeggnwhkg.proloyalty_title_short_max_badge) : String.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(MySparFeature mySparFeature, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        mySparFeature.setBadgeIsVisible(use.getBoolean(ojitshcjhn.MySparButton_badge, false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(MySparFeature mySparFeature, View view) {
        iobyxmoadg iobyxmoadgVar = mySparFeature.onFeatureBannerClickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    public final int getBadgeCount() {
        return Integer.parseInt(this.binding.f128021wkgbmnqykc.getText().toString());
    }

    public final boolean getBadgeIsVisible() {
        TextView tvBadge = this.binding.f128021wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvBadge, "tvBadge");
        return tvBadge.getVisibility() == 0;
    }

    public final String getButtonImage() {
        return this.buttonImage;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w13, int h13, int oldw, int oldh) {
        setOutlineProvider(new wkgbmnqykc(w13, h13, getResources().getDimensionPixelSize(eablkybsjg.corner_large)));
    }

    public final void setBadgeCount(int i13) {
        this.binding.f128021wkgbmnqykc.setText(eablkybsjg(i13));
    }

    public final void setBadgeIsVisible(boolean z13) {
        TextView tvBadge = this.binding.f128021wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvBadge, "tvBadge");
        tvBadge.setVisibility(z13 ? 0 : 8);
    }

    public final void setButtonImage(String str) {
        this.buttonImage = str;
        ImageView ivButtonImage = this.binding.f128020ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivButtonImage, "ivButtonImage");
        p41.eablkybsjg.ppxfxbqfkf(ivButtonImage, str, gxszxtbevo.placeholder);
    }

    public final void setOnFeatureBannerClickListener(iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.onFeatureBannerClickListener = listener;
    }

    public /* synthetic */ MySparFeature(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MySparFeature(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        grlcpdaxtj grlcpdaxtjVarZoijcleaow = grlcpdaxtj.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(grlcpdaxtjVarZoijcleaow, "inflate(...)");
        this.binding = grlcpdaxtjVarZoijcleaow;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ojitshcjhn.MySparButton, 0, 0);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        dxjokdxxww.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: ec1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MySparFeature.ppxfxbqfkf(this.f31112zdlpuopuiu, (TypedArray) obj);
            }
        });
        setElevation(getResources().getDimensionPixelSize(eablkybsjg.content_margin_2));
        grlcpdaxtjVarZoijcleaow.f128022zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ec1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MySparFeature.wkgbmnqykc(this.f31113zdlpuopuiu, view);
            }
        });
    }
}
