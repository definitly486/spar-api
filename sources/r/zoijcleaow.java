package r;

import android.view.KeyEvent;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final KeyEvent f81325iobyxmoadg;

    private /* synthetic */ zoijcleaow(KeyEvent keyEvent) {
        this.f81325iobyxmoadg = keyEvent;
    }

    public static String eablkybsjg(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public static final /* synthetic */ zoijcleaow iobyxmoadg(KeyEvent keyEvent) {
        return new zoijcleaow(keyEvent);
    }

    public static boolean ppxfxbqfkf(KeyEvent keyEvent, Object obj) {
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(keyEvent, ((zoijcleaow) obj).gxszxtbevo());
    }

    public static int wkgbmnqykc(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static KeyEvent zoijcleaow(KeyEvent keyEvent) {
        return keyEvent;
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f81325iobyxmoadg, obj);
    }

    public final /* synthetic */ KeyEvent gxszxtbevo() {
        return this.f81325iobyxmoadg;
    }

    public int hashCode() {
        return wkgbmnqykc(this.f81325iobyxmoadg);
    }

    public String toString() {
        return eablkybsjg(this.f81325iobyxmoadg);
    }
}
