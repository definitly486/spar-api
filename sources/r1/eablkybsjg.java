package r1;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f81439eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f81440gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f81441iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f81442ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f81443wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f81444zoijcleaow;

    public eablkybsjg(String str, String str2, String str3, List list) {
        this.f81441iobyxmoadg = (String) u1.nufgyqmvbu.gxszxtbevo(str);
        this.f81444zoijcleaow = (String) u1.nufgyqmvbu.gxszxtbevo(str2);
        this.f81442ppxfxbqfkf = (String) u1.nufgyqmvbu.gxszxtbevo(str3);
        this.f81443wkgbmnqykc = (List) u1.nufgyqmvbu.gxszxtbevo(list);
        this.f81439eablkybsjg = 0;
        this.f81440gxszxtbevo = iobyxmoadg(str, str2, str3);
    }

    private String iobyxmoadg(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public String eablkybsjg() {
        return this.f81441iobyxmoadg;
    }

    public String gxszxtbevo() {
        return this.f81444zoijcleaow;
    }

    public String lqeggnwhkg() {
        return this.f81442ppxfxbqfkf;
    }

    public int ppxfxbqfkf() {
        return this.f81439eablkybsjg;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("FontRequest {mProviderAuthority: " + this.f81441iobyxmoadg + ", mProviderPackage: " + this.f81444zoijcleaow + ", mQuery: " + this.f81442ppxfxbqfkf + ", mCertificates:");
        for (int i13 = 0; i13 < this.f81443wkgbmnqykc.size(); i13++) {
            sb3.append(" [");
            List list = (List) this.f81443wkgbmnqykc.get(i13);
            for (int i14 = 0; i14 < list.size(); i14++) {
                sb3.append(" \"");
                sb3.append(Base64.encodeToString((byte[]) list.get(i14), 0));
                sb3.append("\"");
            }
            sb3.append(" ]");
        }
        sb3.append("}");
        sb3.append("mCertificatesArray: " + this.f81439eablkybsjg);
        return sb3.toString();
    }

    String wkgbmnqykc() {
        return this.f81440gxszxtbevo;
    }

    public List zoijcleaow() {
        return this.f81443wkgbmnqykc;
    }

    public eablkybsjg(String str, String str2, String str3, int i13) {
        this.f81441iobyxmoadg = (String) u1.nufgyqmvbu.gxszxtbevo(str);
        this.f81444zoijcleaow = (String) u1.nufgyqmvbu.gxszxtbevo(str2);
        this.f81442ppxfxbqfkf = (String) u1.nufgyqmvbu.gxszxtbevo(str3);
        this.f81443wkgbmnqykc = null;
        u1.nufgyqmvbu.iobyxmoadg(i13 != 0);
        this.f81439eablkybsjg = i13;
        this.f81440gxszxtbevo = iobyxmoadg(str, str2, str3);
    }
}
