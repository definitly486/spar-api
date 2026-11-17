package kf1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.notification.impl.presentation.store.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final b01.iobyxmoadg f55372iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f55373zoijcleaow;

    public ppxfxbqfkf(b01.iobyxmoadg type, List notifications) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(notifications, "notifications");
        this.f55372iobyxmoadg = type;
        this.f55373zoijcleaow = notifications;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f55372iobyxmoadg == ppxfxbqfkfVar.f55372iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f55373zoijcleaow, ppxfxbqfkfVar.f55373zoijcleaow);
    }

    public int hashCode() {
        return (this.f55372iobyxmoadg.hashCode() * 31) + this.f55373zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f55373zoijcleaow;
    }

    public String toString() {
        return "Success(type=" + this.f55372iobyxmoadg + ", notifications=" + this.f55373zoijcleaow + ")";
    }

    public b01.iobyxmoadg zoijcleaow() {
        return this.f55372iobyxmoadg;
    }
}
