package m80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p00.ppxfxbqfkf;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f66478iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final User f66479zoijcleaow;

    public iobyxmoadg(ppxfxbqfkf updateMessage, User user) {
        zdlpuopuiu.btonecajqb(updateMessage, "updateMessage");
        this.f66478iobyxmoadg = updateMessage;
        this.f66479zoijcleaow = user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f66478iobyxmoadg, iobyxmoadgVar.f66478iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66479zoijcleaow, iobyxmoadgVar.f66479zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f66478iobyxmoadg.hashCode() * 31;
        User user = this.f66479zoijcleaow;
        return iHashCode + (user == null ? 0 : user.hashCode());
    }

    public final ppxfxbqfkf iobyxmoadg() {
        return this.f66478iobyxmoadg;
    }

    public String toString() {
        return "UpdateData(updateMessage=" + this.f66478iobyxmoadg + ", user=" + this.f66479zoijcleaow + ")";
    }

    public final User zoijcleaow() {
        return this.f66479zoijcleaow;
    }

    public /* synthetic */ iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, User user, int i13, gtknphoqwx gtknphoqwxVar) {
        this(ppxfxbqfkfVar, (i13 & 2) != 0 ? null : user);
    }
}
