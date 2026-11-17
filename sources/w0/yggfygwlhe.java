package w0;

/* JADX INFO: loaded from: classes.dex */
final class yggfygwlhe implements x0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f118278iobyxmoadg;

    public yggfygwlhe(float f13) {
        this.f118278iobyxmoadg = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yggfygwlhe) && Float.compare(this.f118278iobyxmoadg, ((yggfygwlhe) obj).f118278iobyxmoadg) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f118278iobyxmoadg);
    }

    @Override // x0.iobyxmoadg
    public float iobyxmoadg(float f13) {
        return f13 / this.f118278iobyxmoadg;
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f118278iobyxmoadg + ')';
    }

    @Override // x0.iobyxmoadg
    public float zoijcleaow(float f13) {
        return f13 * this.f118278iobyxmoadg;
    }
}
