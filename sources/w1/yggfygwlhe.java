package w1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f118503iobyxmoadg;

    static class iobyxmoadg extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final yggfygwlhe f118504iobyxmoadg;

        iobyxmoadg(yggfygwlhe yggfygwlheVar) {
            this.f118504iobyxmoadg = yggfygwlheVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i13) {
            zdlpuopuiu zdlpuopuiuVarZoijcleaow = this.f118504iobyxmoadg.zoijcleaow(i13);
            if (zdlpuopuiuVarZoijcleaow == null) {
                return null;
            }
            return zdlpuopuiuVarZoijcleaow.f();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i13) {
            List listPpxfxbqfkf = this.f118504iobyxmoadg.ppxfxbqfkf(str, i13);
            if (listPpxfxbqfkf == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listPpxfxbqfkf.size();
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.add(((zdlpuopuiu) listPpxfxbqfkf.get(i14)).f());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i13) {
            zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = this.f118504iobyxmoadg.wkgbmnqykc(i13);
            if (zdlpuopuiuVarWkgbmnqykc == null) {
                return null;
            }
            return zdlpuopuiuVarWkgbmnqykc.f();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i13, int i14, Bundle bundle) {
            return this.f118504iobyxmoadg.gxszxtbevo(i13, i14, bundle);
        }
    }

    static class zoijcleaow extends iobyxmoadg {
        zoijcleaow(yggfygwlhe yggfygwlheVar) {
            super(yggfygwlheVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i13, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f118504iobyxmoadg.iobyxmoadg(i13, zdlpuopuiu.g(accessibilityNodeInfo), str, bundle);
        }
    }

    public yggfygwlhe() {
        this.f118503iobyxmoadg = new zoijcleaow(this);
    }

    public Object eablkybsjg() {
        return this.f118503iobyxmoadg;
    }

    public boolean gxszxtbevo(int i13, int i14, Bundle bundle) {
        return false;
    }

    public void iobyxmoadg(int i13, zdlpuopuiu zdlpuopuiuVar, String str, Bundle bundle) {
    }

    public List ppxfxbqfkf(String str, int i13) {
        return null;
    }

    public zdlpuopuiu wkgbmnqykc(int i13) {
        return null;
    }

    public zdlpuopuiu zoijcleaow(int i13) {
        return null;
    }

    public yggfygwlhe(Object obj) {
        this.f118503iobyxmoadg = obj;
    }
}
