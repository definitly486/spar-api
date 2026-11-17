package x6;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Drawable f121209iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f121210zoijcleaow;

    public eablkybsjg(Drawable drawable, boolean z13) {
        this.f121209iobyxmoadg = drawable;
        this.f121210zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eablkybsjg) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            if (zdlpuopuiu.eablkybsjg(this.f121209iobyxmoadg, eablkybsjgVar.f121209iobyxmoadg) && this.f121210zoijcleaow == eablkybsjgVar.f121210zoijcleaow) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f121209iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f121210zoijcleaow);
    }

    public final Drawable iobyxmoadg() {
        return this.f121209iobyxmoadg;
    }

    public final boolean zoijcleaow() {
        return this.f121210zoijcleaow;
    }
}
