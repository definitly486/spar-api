package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f11758cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f11759esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private View f11760istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f11761iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f11762jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f11763lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f11764pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private d5.iobyxmoadg f11765yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private List f11766zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private iobyxmoadg f11767zynmafqrjb;

    interface iobyxmoadg {
        void iobyxmoadg(List list, d5.iobyxmoadg iobyxmoadgVar, float f13, int i13, float f14);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11766zdlpuopuiu = Collections.emptyList();
        this.f11765yggfygwlhe = d5.iobyxmoadg.f27055lqeggnwhkg;
        this.f11762jyumaefscl = 0;
        this.f11761iwizpuwonk = 0.0533f;
        this.f11758cqumvgiudr = 0.08f;
        this.f11759esjtqupxsv = true;
        this.f11763lereixgezr = true;
        androidx.media3.ui.iobyxmoadg iobyxmoadgVar = new androidx.media3.ui.iobyxmoadg(context);
        this.f11767zynmafqrjb = iobyxmoadgVar;
        this.f11760istkbnxepw = iobyxmoadgVar;
        addView(iobyxmoadgVar);
        this.f11764pmvmpeiblj = 1;
    }

    private List<x2.iobyxmoadg> getCuesWithStylingPreferencesApplied() {
        if (this.f11759esjtqupxsv && this.f11763lereixgezr) {
            return this.f11766zdlpuopuiu;
        }
        ArrayList arrayList = new ArrayList(this.f11766zdlpuopuiu.size());
        for (int i13 = 0; i13 < this.f11766zdlpuopuiu.size(); i13++) {
            arrayList.add(iobyxmoadg((x2.iobyxmoadg) this.f11766zdlpuopuiu.get(i13)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d5.iobyxmoadg getUserCaptionStyle() {
        if (isInEditMode()) {
            return d5.iobyxmoadg.f27055lqeggnwhkg;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? d5.iobyxmoadg.f27055lqeggnwhkg : d5.iobyxmoadg.iobyxmoadg(captioningManager.getUserStyle());
    }

    private void gxszxtbevo() {
        this.f11767zynmafqrjb.iobyxmoadg(getCuesWithStylingPreferencesApplied(), this.f11765yggfygwlhe, this.f11761iwizpuwonk, this.f11762jyumaefscl, this.f11758cqumvgiudr);
    }

    private x2.iobyxmoadg iobyxmoadg(x2.iobyxmoadg iobyxmoadgVar) {
        x2.iobyxmoadg.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if (!this.f11759esjtqupxsv) {
            iozdgvuglv.eablkybsjg(zoijcleaowVarIobyxmoadg);
        } else if (!this.f11763lereixgezr) {
            iozdgvuglv.gxszxtbevo(zoijcleaowVarIobyxmoadg);
        }
        return zoijcleaowVarIobyxmoadg.iobyxmoadg();
    }

    private void ppxfxbqfkf(int i13, float f13) {
        this.f11762jyumaefscl = i13;
        this.f11761iwizpuwonk = f13;
        gxszxtbevo();
    }

    private <T extends View & iobyxmoadg> void setView(T t13) {
        removeView(this.f11760istkbnxepw);
        View view = this.f11760istkbnxepw;
        if (view instanceof wwaezpbzkn) {
            ((wwaezpbzkn) view).lqeggnwhkg();
        }
        this.f11760istkbnxepw = t13;
        this.f11767zynmafqrjb = t13;
        addView(t13);
    }

    public void eablkybsjg() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z13) {
        this.f11763lereixgezr = z13;
        gxszxtbevo();
    }

    public void setApplyEmbeddedStyles(boolean z13) {
        this.f11759esjtqupxsv = z13;
        gxszxtbevo();
    }

    public void setBottomPaddingFraction(float f13) {
        this.f11758cqumvgiudr = f13;
        gxszxtbevo();
    }

    public void setCues(List<x2.iobyxmoadg> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f11766zdlpuopuiu = list;
        gxszxtbevo();
    }

    public void setFractionalTextSize(float f13) {
        zoijcleaow(f13, false);
    }

    public void setStyle(d5.iobyxmoadg iobyxmoadgVar) {
        this.f11765yggfygwlhe = iobyxmoadgVar;
        gxszxtbevo();
    }

    public void setViewType(int i13) {
        if (this.f11764pmvmpeiblj == i13) {
            return;
        }
        if (i13 == 1) {
            setView(new androidx.media3.ui.iobyxmoadg(getContext()));
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new wwaezpbzkn(getContext()));
        }
        this.f11764pmvmpeiblj = i13;
    }

    public void wkgbmnqykc() {
        setStyle(getUserCaptionStyle());
    }

    public void zoijcleaow(float f13, boolean z13) {
        ppxfxbqfkf(z13 ? 1 : 0, f13);
    }
}
