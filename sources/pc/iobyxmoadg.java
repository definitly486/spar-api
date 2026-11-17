package pc;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f76365iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private wkgbmnqykc.iobyxmoadg f76366zoijcleaow = wkgbmnqykc.iobyxmoadg.DEFAULT;

    /* JADX INFO: renamed from: pc.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1688iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f76367iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wkgbmnqykc.iobyxmoadg f76368zoijcleaow;

        C1688iobyxmoadg(int i13, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            this.f76367iobyxmoadg = i13;
            this.f76368zoijcleaow = iobyxmoadgVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return wkgbmnqykc.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return this.f76367iobyxmoadg == wkgbmnqykcVar.tag() && this.f76368zoijcleaow.equals(wkgbmnqykcVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f76367iobyxmoadg) + (this.f76368zoijcleaow.hashCode() ^ 2041407134);
        }

        @Override // pc.wkgbmnqykc
        public wkgbmnqykc.iobyxmoadg intEncoding() {
            return this.f76368zoijcleaow;
        }

        @Override // pc.wkgbmnqykc
        public int tag() {
            return this.f76367iobyxmoadg;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f76367iobyxmoadg + "intEncoding=" + this.f76368zoijcleaow + ')';
        }
    }

    public static iobyxmoadg zoijcleaow() {
        return new iobyxmoadg();
    }

    public wkgbmnqykc iobyxmoadg() {
        return new C1688iobyxmoadg(this.f76365iobyxmoadg, this.f76366zoijcleaow);
    }

    public iobyxmoadg ppxfxbqfkf(int i13) {
        this.f76365iobyxmoadg = i13;
        return this;
    }
}
