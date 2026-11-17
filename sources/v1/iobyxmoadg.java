package v1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final View.AccessibilityDelegate f115130ppxfxbqfkf = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View.AccessibilityDelegate f115131iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final View.AccessibilityDelegate f115132zoijcleaow;

    /* JADX INFO: renamed from: v1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2869iobyxmoadg extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final iobyxmoadg f115133iobyxmoadg;

        C2869iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            this.f115133iobyxmoadg = iobyxmoadgVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f115133iobyxmoadg.iobyxmoadg(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            w1.yggfygwlhe yggfygwlheVarZoijcleaow = this.f115133iobyxmoadg.zoijcleaow(view);
            if (yggfygwlheVarZoijcleaow != null) {
                return (AccessibilityNodeProvider) yggfygwlheVarZoijcleaow.eablkybsjg();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f115133iobyxmoadg.gxszxtbevo(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            w1.zdlpuopuiu zdlpuopuiuVarG = w1.zdlpuopuiu.g(accessibilityNodeInfo);
            zdlpuopuiuVarG.grlcpdaxtj(jhduphickx.ulzqkzuiru(view));
            zdlpuopuiuVarG.tbqsvytpvh(jhduphickx.stevsuqkhv(view));
            zdlpuopuiuVarG.wizcaqwiak(jhduphickx.ojitshcjhn(view));
            zdlpuopuiuVarG.rhgxfdycjh(jhduphickx.wwaezpbzkn(view));
            this.f115133iobyxmoadg.lqeggnwhkg(view, zdlpuopuiuVarG);
            zdlpuopuiuVarG.eablkybsjg(accessibilityNodeInfo.getText(), view);
            List listPpxfxbqfkf = iobyxmoadg.ppxfxbqfkf(view);
            for (int i13 = 0; i13 < listPpxfxbqfkf.size(); i13++) {
                zdlpuopuiuVarG.zoijcleaow((w1.zdlpuopuiu.iobyxmoadg) listPpxfxbqfkf.get(i13));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f115133iobyxmoadg.nufgyqmvbu(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f115133iobyxmoadg.dxjokdxxww(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i13, Bundle bundle) {
            return this.f115133iobyxmoadg.btonecajqb(view, i13, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i13) {
            this.f115133iobyxmoadg.draadjrbmk(view, i13);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f115133iobyxmoadg.wflxmlrfwp(view, accessibilityEvent);
        }
    }

    public iobyxmoadg() {
        this(f115130ppxfxbqfkf);
    }

    private boolean eablkybsjg(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrRgvfuqvkyq = w1.zdlpuopuiu.rgvfuqvkyq(view.createAccessibilityNodeInfo().getText());
            for (int i13 = 0; clickableSpanArrRgvfuqvkyq != null && i13 < clickableSpanArrRgvfuqvkyq.length; i13++) {
                if (clickableSpan.equals(clickableSpanArrRgvfuqvkyq[i13])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean gtknphoqwx(int i13, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(g1.ppxfxbqfkf.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i13)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!eablkybsjg(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    static List ppxfxbqfkf(View view) {
        List list = (List) view.getTag(g1.ppxfxbqfkf.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean btonecajqb(View view, int i13, Bundle bundle) {
        List listPpxfxbqfkf = ppxfxbqfkf(view);
        boolean zPerformAccessibilityAction = false;
        for (int i14 = 0; i14 < listPpxfxbqfkf.size(); i14++) {
            w1.zdlpuopuiu.iobyxmoadg iobyxmoadgVar = (w1.zdlpuopuiu.iobyxmoadg) listPpxfxbqfkf.get(i14);
            if (iobyxmoadgVar.zoijcleaow() == i13) {
                zPerformAccessibilityAction = iobyxmoadgVar.wkgbmnqykc(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f115131iobyxmoadg.performAccessibilityAction(view, i13, bundle);
        }
        return (zPerformAccessibilityAction || i13 != g1.ppxfxbqfkf.accessibility_action_clickable_span || bundle == null) ? zPerformAccessibilityAction : gtknphoqwx(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void draadjrbmk(View view, int i13) {
        this.f115131iobyxmoadg.sendAccessibilityEvent(view, i13);
    }

    public boolean dxjokdxxww(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f115131iobyxmoadg.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void gxszxtbevo(View view, AccessibilityEvent accessibilityEvent) {
        this.f115131iobyxmoadg.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean iobyxmoadg(View view, AccessibilityEvent accessibilityEvent) {
        return this.f115131iobyxmoadg.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void lqeggnwhkg(View view, w1.zdlpuopuiu zdlpuopuiuVar) {
        this.f115131iobyxmoadg.onInitializeAccessibilityNodeInfo(view, zdlpuopuiuVar.f());
    }

    public void nufgyqmvbu(View view, AccessibilityEvent accessibilityEvent) {
        this.f115131iobyxmoadg.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void wflxmlrfwp(View view, AccessibilityEvent accessibilityEvent) {
        this.f115131iobyxmoadg.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    View.AccessibilityDelegate wkgbmnqykc() {
        return this.f115132zoijcleaow;
    }

    public w1.yggfygwlhe zoijcleaow(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f115131iobyxmoadg.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new w1.yggfygwlhe(accessibilityNodeProvider);
        }
        return null;
    }

    public iobyxmoadg(View.AccessibilityDelegate accessibilityDelegate) {
        this.f115131iobyxmoadg = accessibilityDelegate;
        this.f115132zoijcleaow = new C2869iobyxmoadg(this);
    }
}
