package p9;

/* JADX INFO: loaded from: classes2.dex */
final class draadjrbmk extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f76049iobyxmoadg;

    draadjrbmk(long j13) {
        this.f76049iobyxmoadg = j13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof jyumaefscl) && this.f76049iobyxmoadg == ((jyumaefscl) obj).ppxfxbqfkf();
    }

    public int hashCode() {
        long j13 = this.f76049iobyxmoadg;
        return ((int) (j13 ^ (j13 >>> 32))) ^ 1000003;
    }

    @Override // p9.jyumaefscl
    public long ppxfxbqfkf() {
        return this.f76049iobyxmoadg;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f76049iobyxmoadg + "}";
    }
}
