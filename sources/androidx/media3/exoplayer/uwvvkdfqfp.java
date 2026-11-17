package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uwvvkdfqfp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f11446iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long f11447ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final float f11448zoijcleaow;

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f11449iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f11450ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private float f11451zoijcleaow;

        public zoijcleaow eablkybsjg(long j13) {
            y2.iobyxmoadg.iobyxmoadg(j13 >= 0 || j13 == -9223372036854775807L);
            this.f11450ppxfxbqfkf = j13;
            return this;
        }

        public zoijcleaow gxszxtbevo(long j13) {
            this.f11449iobyxmoadg = j13;
            return this;
        }

        public zoijcleaow lqeggnwhkg(float f13) {
            y2.iobyxmoadg.iobyxmoadg(f13 > 0.0f || f13 == -3.4028235E38f);
            this.f11451zoijcleaow = f13;
            return this;
        }

        public uwvvkdfqfp wkgbmnqykc() {
            return new uwvvkdfqfp(this);
        }

        public zoijcleaow() {
            this.f11449iobyxmoadg = -9223372036854775807L;
            this.f11451zoijcleaow = -3.4028235E38f;
            this.f11450ppxfxbqfkf = -9223372036854775807L;
        }

        private zoijcleaow(uwvvkdfqfp uwvvkdfqfpVar) {
            this.f11449iobyxmoadg = uwvvkdfqfpVar.f11446iobyxmoadg;
            this.f11451zoijcleaow = uwvvkdfqfpVar.f11448zoijcleaow;
            this.f11450ppxfxbqfkf = uwvvkdfqfpVar.f11447ppxfxbqfkf;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwvvkdfqfp)) {
            return false;
        }
        uwvvkdfqfp uwvvkdfqfpVar = (uwvvkdfqfp) obj;
        return this.f11446iobyxmoadg == uwvvkdfqfpVar.f11446iobyxmoadg && this.f11448zoijcleaow == uwvvkdfqfpVar.f11448zoijcleaow && this.f11447ppxfxbqfkf == uwvvkdfqfpVar.f11447ppxfxbqfkf;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f11446iobyxmoadg), Float.valueOf(this.f11448zoijcleaow), Long.valueOf(this.f11447ppxfxbqfkf));
    }

    public zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    private uwvvkdfqfp(zoijcleaow zoijcleaowVar) {
        this.f11446iobyxmoadg = zoijcleaowVar.f11449iobyxmoadg;
        this.f11448zoijcleaow = zoijcleaowVar.f11451zoijcleaow;
        this.f11447ppxfxbqfkf = zoijcleaowVar.f11450ppxfxbqfkf;
    }
}
