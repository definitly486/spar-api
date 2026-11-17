package wj;

import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf extends gxszxtbevo {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final ppxfxbqfkf f119970pmvmpeiblj = new ppxfxbqfkf();

    private ppxfxbqfkf() {
        super(btonecajqb.f119923ppxfxbqfkf, btonecajqb.f119924wkgbmnqykc, btonecajqb.f119920eablkybsjg, btonecajqb.f119922iobyxmoadg);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // pj.pkzmftpjix
    public pkzmftpjix jlmebxxoox(int i13, String str) {
        uj.gtknphoqwx.iobyxmoadg(i13);
        return i13 >= btonecajqb.f119923ppxfxbqfkf ? uj.gtknphoqwx.zoijcleaow(this, str) : super.jlmebxxoox(i13, str);
    }

    @Override // pj.pkzmftpjix
    public String toString() {
        return "Dispatchers.Default";
    }
}
