package p7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class agtfadlqog implements wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final List f75855iobyxmoadg;

    agtfadlqog(List list) {
        this.f75855iobyxmoadg = list;
    }

    @Override // p7.wflxmlrfwp
    public List gxszxtbevo() {
        return this.f75855iobyxmoadg;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        if (!this.f75855iobyxmoadg.isEmpty()) {
            sb3.append("values=");
            sb3.append(Arrays.toString(this.f75855iobyxmoadg.toArray()));
        }
        return sb3.toString();
    }

    @Override // p7.wflxmlrfwp
    public boolean wkgbmnqykc() {
        if (this.f75855iobyxmoadg.isEmpty()) {
            return true;
        }
        return this.f75855iobyxmoadg.size() == 1 && ((w7.iobyxmoadg) this.f75855iobyxmoadg.get(0)).dxjokdxxww();
    }
}
