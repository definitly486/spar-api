package c3;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf implements Comparable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final File f18639cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final long f18640esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final boolean f18641iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final long f18642jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final long f18643yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f18644zdlpuopuiu;

    public ppxfxbqfkf(String str, long j13, long j14, long j15, File file) {
        this.f18644zdlpuopuiu = str;
        this.f18643yggfygwlhe = j13;
        this.f18642jyumaefscl = j14;
        this.f18641iwizpuwonk = file != null;
        this.f18639cqumvgiudr = file;
        this.f18640esjtqupxsv = j15;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compareTo(ppxfxbqfkf ppxfxbqfkfVar) {
        if (!this.f18644zdlpuopuiu.equals(ppxfxbqfkfVar.f18644zdlpuopuiu)) {
            return this.f18644zdlpuopuiu.compareTo(ppxfxbqfkfVar.f18644zdlpuopuiu);
        }
        long j13 = this.f18643yggfygwlhe - ppxfxbqfkfVar.f18643yggfygwlhe;
        if (j13 == 0) {
            return 0;
        }
        return j13 < 0 ? -1 : 1;
    }

    public boolean ppxfxbqfkf() {
        return this.f18642jyumaefscl == -1;
    }

    public String toString() {
        return "[" + this.f18643yggfygwlhe + ", " + this.f18642jyumaefscl + "]";
    }

    public boolean zoijcleaow() {
        return !this.f18641iwizpuwonk;
    }
}
