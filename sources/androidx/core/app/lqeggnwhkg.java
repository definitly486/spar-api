package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.jztzpxfvev;
import androidx.lifecycle.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg extends Activity implements androidx.lifecycle.vdvldrhtss, v1.yggfygwlhe.iobyxmoadg {
    private final jztzpxfvev extraDataMap = new jztzpxfvev(0, 1, null);
    private final androidx.lifecycle.kcexrzcfyt lifecycleRegistry = new androidx.lifecycle.kcexrzcfyt(this);

    public static class iobyxmoadg {
    }

    private final boolean wkgbmnqykc(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(decorView, "window.decorView");
        if (v1.yggfygwlhe.wkgbmnqykc(decorView, event)) {
            return true;
        }
        return v1.yggfygwlhe.eablkybsjg(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(decorView, "window.decorView");
        if (v1.yggfygwlhe.wkgbmnqykc(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @gg.eablkybsjg
    public <T extends iobyxmoadg> T getExtraData(Class<T> extraDataClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extraDataClass, "extraDataClass");
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.extraDataMap.get(extraDataClass));
        return null;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wwaezpbzkn.INSTANCE.zoijcleaow(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outState, "outState");
        this.lifecycleRegistry.agtfadlqog(androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED);
        super.onSaveInstanceState(outState);
    }

    @gg.eablkybsjg
    public void putExtraData(iobyxmoadg extraData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extraData, "extraData");
        throw null;
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !wkgbmnqykc(strArr);
    }

    @Override // v1.yggfygwlhe.iobyxmoadg
    public boolean superDispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
