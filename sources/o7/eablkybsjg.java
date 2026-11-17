package o7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final eablkybsjg f72189ppxfxbqfkf = new eablkybsjg("COMPOSITION");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f72190iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private gxszxtbevo f72191zoijcleaow;

    public eablkybsjg(String... strArr) {
        this.f72190iobyxmoadg = Arrays.asList(strArr);
    }

    private boolean gxszxtbevo(String str) {
        return "__container".equals(str);
    }

    private boolean zoijcleaow() {
        List list = this.f72190iobyxmoadg;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    public eablkybsjg dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar = new eablkybsjg(this);
        eablkybsjgVar.f72191zoijcleaow = gxszxtbevoVar;
        return eablkybsjgVar;
    }

    public int eablkybsjg(String str, int i13) {
        if (gxszxtbevo(str)) {
            return 0;
        }
        if (((String) this.f72190iobyxmoadg.get(i13)).equals("**")) {
            return (i13 != this.f72190iobyxmoadg.size() - 1 && ((String) this.f72190iobyxmoadg.get(i13 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        if (!this.f72190iobyxmoadg.equals(eablkybsjgVar.f72190iobyxmoadg)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = this.f72191zoijcleaow;
        gxszxtbevo gxszxtbevoVar2 = eablkybsjgVar.f72191zoijcleaow;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar.equals(gxszxtbevoVar2);
        }
        return gxszxtbevoVar2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f72190iobyxmoadg.hashCode() * 31;
        gxszxtbevo gxszxtbevoVar = this.f72191zoijcleaow;
        return iHashCode + (gxszxtbevoVar != null ? gxszxtbevoVar.hashCode() : 0);
    }

    public eablkybsjg iobyxmoadg(String str) {
        eablkybsjg eablkybsjgVar = new eablkybsjg(this);
        eablkybsjgVar.f72190iobyxmoadg.add(str);
        return eablkybsjgVar;
    }

    public boolean lqeggnwhkg(String str, int i13) {
        if (gxszxtbevo(str)) {
            return true;
        }
        if (i13 >= this.f72190iobyxmoadg.size()) {
            return false;
        }
        return ((String) this.f72190iobyxmoadg.get(i13)).equals(str) || ((String) this.f72190iobyxmoadg.get(i13)).equals("**") || ((String) this.f72190iobyxmoadg.get(i13)).equals("*");
    }

    public boolean nufgyqmvbu(String str, int i13) {
        return "__container".equals(str) || i13 < this.f72190iobyxmoadg.size() - 1 || ((String) this.f72190iobyxmoadg.get(i13)).equals("**");
    }

    public boolean ppxfxbqfkf(String str, int i13) {
        if (i13 >= this.f72190iobyxmoadg.size()) {
            return false;
        }
        boolean z13 = i13 == this.f72190iobyxmoadg.size() - 1;
        String str2 = (String) this.f72190iobyxmoadg.get(i13);
        if (!str2.equals("**")) {
            return (z13 || (i13 == this.f72190iobyxmoadg.size() + (-2) && zoijcleaow())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z13 && ((String) this.f72190iobyxmoadg.get(i13 + 1)).equals(str)) {
            return i13 == this.f72190iobyxmoadg.size() + (-2) || (i13 == this.f72190iobyxmoadg.size() + (-3) && zoijcleaow());
        }
        if (z13) {
            return true;
        }
        int i14 = i13 + 1;
        if (i14 < this.f72190iobyxmoadg.size() - 1) {
            return false;
        }
        return ((String) this.f72190iobyxmoadg.get(i14)).equals(str);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("KeyPath{keys=");
        sb3.append(this.f72190iobyxmoadg);
        sb3.append(",resolved=");
        sb3.append(this.f72191zoijcleaow != null);
        sb3.append('}');
        return sb3.toString();
    }

    public gxszxtbevo wkgbmnqykc() {
        return this.f72191zoijcleaow;
    }

    private eablkybsjg(eablkybsjg eablkybsjgVar) {
        this.f72190iobyxmoadg = new ArrayList(eablkybsjgVar.f72190iobyxmoadg);
        this.f72191zoijcleaow = eablkybsjgVar.f72191zoijcleaow;
    }
}
