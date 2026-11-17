package androidx.media3.datasource.cache;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import y2.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private c3.gxszxtbevo f9904eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f9905iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final TreeSet f9906ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ArrayList f9907wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f9908zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f9909iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f9910zoijcleaow;

        public iobyxmoadg(long j13, long j14) {
            this.f9909iobyxmoadg = j13;
            this.f9910zoijcleaow = j14;
        }

        public boolean iobyxmoadg(long j13, long j14) {
            long j15 = this.f9910zoijcleaow;
            if (j15 == -1) {
                return j13 >= this.f9909iobyxmoadg;
            }
            if (j14 == -1) {
                return false;
            }
            long j16 = this.f9909iobyxmoadg;
            return j16 <= j13 && j13 + j14 <= j16 + j15;
        }

        public boolean zoijcleaow(long j13, long j14) {
            long j15 = this.f9909iobyxmoadg;
            if (j15 > j13) {
                return j14 == -1 || j13 + j14 > j15;
            }
            long j16 = this.f9910zoijcleaow;
            return j16 == -1 || j15 + j16 > j13;
        }
    }

    public eablkybsjg(int i13, String str) {
        this(i13, str, c3.gxszxtbevo.f18633ppxfxbqfkf);
    }

    public boolean btonecajqb(c3.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!this.f9906ppxfxbqfkf.remove(ppxfxbqfkfVar)) {
            return false;
        }
        File file = ppxfxbqfkfVar.f18639cqumvgiudr;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public void draadjrbmk(long j13) {
        for (int i13 = 0; i13 < this.f9907wkgbmnqykc.size(); i13++) {
            if (((iobyxmoadg) this.f9907wkgbmnqykc.get(i13)).f9909iobyxmoadg == j13) {
                this.f9907wkgbmnqykc.remove(i13);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public boolean dxjokdxxww(long j13, long j14) {
        for (int i13 = 0; i13 < this.f9907wkgbmnqykc.size(); i13++) {
            if (((iobyxmoadg) this.f9907wkgbmnqykc.get(i13)).zoijcleaow(j13, j14)) {
                return false;
            }
        }
        this.f9907wkgbmnqykc.add(new iobyxmoadg(j13, j14));
        return true;
    }

    public TreeSet eablkybsjg() {
        return this.f9906ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eablkybsjg.class != obj.getClass()) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f9905iobyxmoadg == eablkybsjgVar.f9905iobyxmoadg && this.f9908zoijcleaow.equals(eablkybsjgVar.f9908zoijcleaow) && this.f9906ppxfxbqfkf.equals(eablkybsjgVar.f9906ppxfxbqfkf) && this.f9904eablkybsjg.equals(eablkybsjgVar.f9904eablkybsjg);
    }

    public dxjokdxxww gtknphoqwx(dxjokdxxww dxjokdxxwwVar, long j13, boolean z13) {
        y2.iobyxmoadg.lqeggnwhkg(this.f9906ppxfxbqfkf.remove(dxjokdxxwwVar));
        File file = (File) y2.iobyxmoadg.eablkybsjg(dxjokdxxwwVar.f18639cqumvgiudr);
        if (z13) {
            File fileDxjokdxxww = dxjokdxxww.dxjokdxxww((File) y2.iobyxmoadg.eablkybsjg(file.getParentFile()), this.f9905iobyxmoadg, dxjokdxxwwVar.f18643yggfygwlhe, j13);
            if (file.renameTo(fileDxjokdxxww)) {
                file = fileDxjokdxxww;
            } else {
                kcexrzcfyt.nufgyqmvbu("CachedContent", "Failed to rename " + file + " to " + fileDxjokdxxww);
            }
        }
        dxjokdxxww dxjokdxxwwVarWkgbmnqykc = dxjokdxxwwVar.wkgbmnqykc(file, j13);
        this.f9906ppxfxbqfkf.add(dxjokdxxwwVarWkgbmnqykc);
        return dxjokdxxwwVarWkgbmnqykc;
    }

    public boolean gxszxtbevo() {
        return this.f9906ppxfxbqfkf.isEmpty();
    }

    public int hashCode() {
        return (((this.f9905iobyxmoadg * 31) + this.f9908zoijcleaow.hashCode()) * 31) + this.f9904eablkybsjg.hashCode();
    }

    public void iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
        this.f9906ppxfxbqfkf.add(dxjokdxxwwVar);
    }

    public boolean lqeggnwhkg(long j13, long j14) {
        for (int i13 = 0; i13 < this.f9907wkgbmnqykc.size(); i13++) {
            if (((iobyxmoadg) this.f9907wkgbmnqykc.get(i13)).iobyxmoadg(j13, j14)) {
                return true;
            }
        }
        return false;
    }

    public boolean nufgyqmvbu() {
        return this.f9907wkgbmnqykc.isEmpty();
    }

    public c3.gxszxtbevo ppxfxbqfkf() {
        return this.f9904eablkybsjg;
    }

    public dxjokdxxww wkgbmnqykc(long j13, long j14) {
        dxjokdxxww dxjokdxxwwVarNufgyqmvbu = dxjokdxxww.nufgyqmvbu(this.f9908zoijcleaow, j13);
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) this.f9906ppxfxbqfkf.floor(dxjokdxxwwVarNufgyqmvbu);
        if (dxjokdxxwwVar != null && dxjokdxxwwVar.f18643yggfygwlhe + dxjokdxxwwVar.f18642jyumaefscl > j13) {
            return dxjokdxxwwVar;
        }
        dxjokdxxww dxjokdxxwwVar2 = (dxjokdxxww) this.f9906ppxfxbqfkf.ceiling(dxjokdxxwwVarNufgyqmvbu);
        if (dxjokdxxwwVar2 != null) {
            long j15 = dxjokdxxwwVar2.f18643yggfygwlhe - j13;
            j14 = j14 == -1 ? j15 : Math.min(j15, j14);
        }
        return dxjokdxxww.lqeggnwhkg(this.f9908zoijcleaow, j13, j14);
    }

    public boolean zoijcleaow(c3.eablkybsjg eablkybsjgVar) {
        c3.gxszxtbevo gxszxtbevoVar = this.f9904eablkybsjg;
        c3.gxszxtbevo gxszxtbevoVarLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg(eablkybsjgVar);
        this.f9904eablkybsjg = gxszxtbevoVarLqeggnwhkg;
        return !gxszxtbevoVarLqeggnwhkg.equals(gxszxtbevoVar);
    }

    public eablkybsjg(int i13, String str, c3.gxszxtbevo gxszxtbevoVar) {
        this.f9905iobyxmoadg = i13;
        this.f9908zoijcleaow = str;
        this.f9904eablkybsjg = gxszxtbevoVar;
        this.f9906ppxfxbqfkf = new TreeSet();
        this.f9907wkgbmnqykc = new ArrayList();
    }
}
