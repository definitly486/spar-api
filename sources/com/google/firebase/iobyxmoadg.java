package com.google.firebase;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f24300iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f24301ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f24302zoijcleaow;

    iobyxmoadg(long j13, long j14, long j15) {
        this.f24300iobyxmoadg = j13;
        this.f24302zoijcleaow = j14;
        this.f24301ppxfxbqfkf = j15;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return this.f24300iobyxmoadg == agtfadlqogVar.ppxfxbqfkf() && this.f24302zoijcleaow == agtfadlqogVar.zoijcleaow() && this.f24301ppxfxbqfkf == agtfadlqogVar.wkgbmnqykc();
    }

    public int hashCode() {
        long j13 = this.f24300iobyxmoadg;
        long j14 = this.f24302zoijcleaow;
        int i13 = (((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        long j15 = this.f24301ppxfxbqfkf;
        return i13 ^ ((int) ((j15 >>> 32) ^ j15));
    }

    @Override // com.google.firebase.agtfadlqog
    public long ppxfxbqfkf() {
        return this.f24300iobyxmoadg;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f24300iobyxmoadg + ", elapsedRealtime=" + this.f24302zoijcleaow + ", uptimeMillis=" + this.f24301ppxfxbqfkf + "}";
    }

    @Override // com.google.firebase.agtfadlqog
    public long wkgbmnqykc() {
        return this.f24301ppxfxbqfkf;
    }

    @Override // com.google.firebase.agtfadlqog
    public long zoijcleaow() {
        return this.f24302zoijcleaow;
    }
}
