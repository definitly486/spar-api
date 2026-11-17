package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class iwizpuwonk extends v1.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iobyxmoadg f13021eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final RecyclerView f13022wkgbmnqykc;

    public static class iobyxmoadg extends v1.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Map f13023eablkybsjg = new WeakHashMap();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final iwizpuwonk f13024wkgbmnqykc;

        public iobyxmoadg(iwizpuwonk iwizpuwonkVar) {
            this.f13024wkgbmnqykc = iwizpuwonkVar;
        }

        v1.iobyxmoadg agtfadlqog(View view) {
            return (v1.iobyxmoadg) this.f13023eablkybsjg.remove(view);
        }

        @Override // v1.iobyxmoadg
        public boolean btonecajqb(View view, int i13, Bundle bundle) {
            if (this.f13024wkgbmnqykc.ojitshcjhn() || this.f13024wkgbmnqykc.f13022wkgbmnqykc.getLayoutManager() == null) {
                return super.btonecajqb(view, i13, bundle);
            }
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(view);
            if (iobyxmoadgVar != null) {
                if (iobyxmoadgVar.btonecajqb(view, i13, bundle)) {
                    return true;
                }
            } else if (super.btonecajqb(view, i13, bundle)) {
                return true;
            }
            return this.f13024wkgbmnqykc.f13022wkgbmnqykc.getLayoutManager().A(view, i13, bundle);
        }

        @Override // v1.iobyxmoadg
        public void draadjrbmk(View view, int i13) {
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(view);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.draadjrbmk(view, i13);
            } else {
                super.draadjrbmk(view, i13);
            }
        }

        @Override // v1.iobyxmoadg
        public boolean dxjokdxxww(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(viewGroup);
            return iobyxmoadgVar != null ? iobyxmoadgVar.dxjokdxxww(viewGroup, view, accessibilityEvent) : super.dxjokdxxww(viewGroup, view, accessibilityEvent);
        }

        @Override // v1.iobyxmoadg
        public void gxszxtbevo(View view, AccessibilityEvent accessibilityEvent) {
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(view);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.gxszxtbevo(view, accessibilityEvent);
            } else {
                super.gxszxtbevo(view, accessibilityEvent);
            }
        }

        @Override // v1.iobyxmoadg
        public boolean iobyxmoadg(View view, AccessibilityEvent accessibilityEvent) {
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(view);
            return iobyxmoadgVar != null ? iobyxmoadgVar.iobyxmoadg(view, accessibilityEvent) : super.iobyxmoadg(view, accessibilityEvent);
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, w1.zdlpuopuiu zdlpuopuiuVar) {
            if (this.f13024wkgbmnqykc.ojitshcjhn() || this.f13024wkgbmnqykc.f13022wkgbmnqykc.getLayoutManager() == null) {
                super.lqeggnwhkg(view, zdlpuopuiuVar);
                return;
            }
            this.f13024wkgbmnqykc.f13022wkgbmnqykc.getLayoutManager().g(view, zdlpuopuiuVar);
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(view);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.lqeggnwhkg(view, zdlpuopuiuVar);
            } else {
                super.lqeggnwhkg(view, zdlpuopuiuVar);
            }
        }

        @Override // v1.iobyxmoadg
        public void nufgyqmvbu(View view, AccessibilityEvent accessibilityEvent) {
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(view);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.nufgyqmvbu(view, accessibilityEvent);
            } else {
                super.nufgyqmvbu(view, accessibilityEvent);
            }
        }

        void ojitshcjhn(View view) {
            v1.iobyxmoadg iobyxmoadgVarDraadjrbmk = jhduphickx.draadjrbmk(view);
            if (iobyxmoadgVarDraadjrbmk == null || iobyxmoadgVarDraadjrbmk == this) {
                return;
            }
            this.f13023eablkybsjg.put(view, iobyxmoadgVarDraadjrbmk);
        }

        @Override // v1.iobyxmoadg
        public void wflxmlrfwp(View view, AccessibilityEvent accessibilityEvent) {
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(view);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.wflxmlrfwp(view, accessibilityEvent);
            } else {
                super.wflxmlrfwp(view, accessibilityEvent);
            }
        }

        @Override // v1.iobyxmoadg
        public w1.yggfygwlhe zoijcleaow(View view) {
            v1.iobyxmoadg iobyxmoadgVar = (v1.iobyxmoadg) this.f13023eablkybsjg.get(view);
            return iobyxmoadgVar != null ? iobyxmoadgVar.zoijcleaow(view) : super.zoijcleaow(view);
        }
    }

    public iwizpuwonk(RecyclerView recyclerView) {
        this.f13022wkgbmnqykc = recyclerView;
        v1.iobyxmoadg iobyxmoadgVarAgtfadlqog = agtfadlqog();
        if (iobyxmoadgVarAgtfadlqog == null || !(iobyxmoadgVarAgtfadlqog instanceof iobyxmoadg)) {
            this.f13021eablkybsjg = new iobyxmoadg(this);
        } else {
            this.f13021eablkybsjg = (iobyxmoadg) iobyxmoadgVarAgtfadlqog;
        }
    }

    public v1.iobyxmoadg agtfadlqog() {
        return this.f13021eablkybsjg;
    }

    @Override // v1.iobyxmoadg
    public boolean btonecajqb(View view, int i13, Bundle bundle) {
        if (super.btonecajqb(view, i13, bundle)) {
            return true;
        }
        if (ojitshcjhn() || this.f13022wkgbmnqykc.getLayoutManager() == null) {
            return false;
        }
        return this.f13022wkgbmnqykc.getLayoutManager().y(i13, bundle);
    }

    @Override // v1.iobyxmoadg
    public void gxszxtbevo(View view, AccessibilityEvent accessibilityEvent) {
        super.gxszxtbevo(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || ojitshcjhn()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().c(accessibilityEvent);
        }
    }

    @Override // v1.iobyxmoadg
    public void lqeggnwhkg(View view, w1.zdlpuopuiu zdlpuopuiuVar) {
        super.lqeggnwhkg(view, zdlpuopuiuVar);
        if (ojitshcjhn() || this.f13022wkgbmnqykc.getLayoutManager() == null) {
            return;
        }
        this.f13022wkgbmnqykc.getLayoutManager().f(zdlpuopuiuVar);
    }

    boolean ojitshcjhn() {
        return this.f13022wkgbmnqykc.nuxfzjnpeb();
    }
}
