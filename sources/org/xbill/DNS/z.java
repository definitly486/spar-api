package org.xbill.DNS;

import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f74602iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f74603zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final z f74600ppxfxbqfkf = new z(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final z f74601wkgbmnqykc = new z(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final z f74599eablkybsjg = new z(2);

    private z() {
    }

    static z gtknphoqwx(int i13) {
        switch (i13) {
            case 0:
                return f74600ppxfxbqfkf;
            case 1:
                return f74601wkgbmnqykc;
            case 2:
                return f74599eablkybsjg;
            case 3:
            case 4:
            case 5:
            case 6:
                z zVar = new z();
                zVar.f74602iobyxmoadg = i13;
                zVar.f74603zoijcleaow = null;
                return zVar;
            default:
                throw new IllegalArgumentException("invalid type");
        }
    }

    public boolean btonecajqb() {
        return this.f74602iobyxmoadg == 6;
    }

    public boolean dxjokdxxww() {
        return this.f74602iobyxmoadg == 2;
    }

    public boolean eablkybsjg() {
        return this.f74602iobyxmoadg == 4;
    }

    public boolean gxszxtbevo() {
        return this.f74602iobyxmoadg == 5;
    }

    void iobyxmoadg(b bVar) {
        if (this.f74603zoijcleaow == null) {
            this.f74603zoijcleaow = new ArrayList();
        }
        this.f74603zoijcleaow.add(bVar);
    }

    public boolean lqeggnwhkg() {
        return this.f74602iobyxmoadg == 3;
    }

    public boolean nufgyqmvbu() {
        return this.f74602iobyxmoadg == 1;
    }

    public gtknphoqwx ppxfxbqfkf() {
        return (gtknphoqwx) ((b) this.f74603zoijcleaow.get(0)).ojitshcjhn();
    }

    public String toString() {
        switch (this.f74602iobyxmoadg) {
            case 0:
                return CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
            case 1:
                return "NXDOMAIN";
            case 2:
                return "NXRRSET";
            case 3:
                return "delegation: " + this.f74603zoijcleaow.get(0);
            case 4:
                return "CNAME: " + this.f74603zoijcleaow.get(0);
            case 5:
                return "DNAME: " + this.f74603zoijcleaow.get(0);
            case 6:
                return "successful";
            default:
                throw new IllegalStateException();
        }
    }

    public kcexrzcfyt wkgbmnqykc() {
        return (kcexrzcfyt) ((b) this.f74603zoijcleaow.get(0)).ojitshcjhn();
    }

    public List zoijcleaow() {
        if (this.f74602iobyxmoadg != 6) {
            return null;
        }
        return this.f74603zoijcleaow;
    }

    z(int i13, b bVar) {
        if (i13 < 0 || i13 > 6) {
            throw new IllegalArgumentException("invalid type");
        }
        this.f74602iobyxmoadg = i13;
        ArrayList arrayList = new ArrayList();
        this.f74603zoijcleaow = arrayList;
        arrayList.add(bVar);
    }

    z(int i13) {
        if (i13 >= 0 && i13 <= 6) {
            this.f74602iobyxmoadg = i13;
            this.f74603zoijcleaow = null;
            return;
        }
        throw new IllegalArgumentException("invalid type");
    }
}
