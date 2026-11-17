package com.google.gson.internal.bind;

import ce.ppxfxbqfkf;
import com.google.gson.btonecajqb;
import com.google.gson.dxjokdxxww;
import com.google.gson.eablkybsjg;
import com.google.gson.gtknphoqwx;
import com.google.gson.nufgyqmvbu;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final List f25106iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private String f25107lmojexxdyd;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private nufgyqmvbu f25108wwaezpbzkn;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private static final Writer f25105ylkuphrtab = new C0421iobyxmoadg();

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private static final gtknphoqwx f25104pkzmftpjix = new gtknphoqwx("closed");

    /* JADX INFO: renamed from: com.google.gson.internal.bind.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0421iobyxmoadg extends Writer {
        C0421iobyxmoadg() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i13, int i14) {
            throw new AssertionError();
        }
    }

    public iobyxmoadg() {
        super(f25105ylkuphrtab);
        this.f25106iozdgvuglv = new ArrayList();
        this.f25108wwaezpbzkn = dxjokdxxww.f24950zdlpuopuiu;
    }

    private void rlfsiqarku(nufgyqmvbu nufgyqmvbuVar) {
        if (this.f25107lmojexxdyd != null) {
            if (!nufgyqmvbuVar.btonecajqb() || agtfadlqog()) {
                ((btonecajqb) xrmfcynszj()).wflxmlrfwp(this.f25107lmojexxdyd, nufgyqmvbuVar);
            }
            this.f25107lmojexxdyd = null;
            return;
        }
        if (this.f25106iozdgvuglv.isEmpty()) {
            this.f25108wwaezpbzkn = nufgyqmvbuVar;
            return;
        }
        nufgyqmvbu nufgyqmvbuVarXrmfcynszj = xrmfcynszj();
        if (!(nufgyqmvbuVarXrmfcynszj instanceof eablkybsjg)) {
            throw new IllegalStateException();
        }
        ((eablkybsjg) nufgyqmvbuVarXrmfcynszj).wflxmlrfwp(nufgyqmvbuVar);
    }

    private nufgyqmvbu xrmfcynszj() {
        List list = this.f25106iozdgvuglv;
        return (nufgyqmvbu) list.get(list.size() - 1);
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf btonecajqb() {
        if (this.f25106iozdgvuglv.isEmpty() || this.f25107lmojexxdyd != null) {
            throw new IllegalStateException();
        }
        if (!(xrmfcynszj() instanceof eablkybsjg)) {
            throw new IllegalStateException();
        }
        List list = this.f25106iozdgvuglv;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // ce.ppxfxbqfkf, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f25106iozdgvuglv.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f25106iozdgvuglv.add(f25104pkzmftpjix);
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf crxdokpmqz(boolean z13) {
        rlfsiqarku(new gtknphoqwx(Boolean.valueOf(z13)));
        return this;
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf draadjrbmk() {
        if (this.f25106iozdgvuglv.isEmpty() || this.f25107lmojexxdyd != null) {
            throw new IllegalStateException();
        }
        if (!(xrmfcynszj() instanceof btonecajqb)) {
            throw new IllegalStateException();
        }
        List list = this.f25106iozdgvuglv;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // ce.ppxfxbqfkf, java.io.Flushable
    public void flush() {
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf jyumaefscl() {
        rlfsiqarku(dxjokdxxww.f24950zdlpuopuiu);
        return this;
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf kcexrzcfyt(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f25106iozdgvuglv.isEmpty() || this.f25107lmojexxdyd != null) {
            throw new IllegalStateException();
        }
        if (!(xrmfcynszj() instanceof btonecajqb)) {
            throw new IllegalStateException();
        }
        this.f25107lmojexxdyd = str;
        return this;
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf kegysxyocb(long j13) {
        rlfsiqarku(new gtknphoqwx(Long.valueOf(j13)));
        return this;
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf lqeggnwhkg() {
        eablkybsjg eablkybsjgVar = new eablkybsjg();
        rlfsiqarku(eablkybsjgVar);
        this.f25106iozdgvuglv.add(eablkybsjgVar);
        return this;
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf mbcevpiqjq(Boolean bool) {
        if (bool == null) {
            return jyumaefscl();
        }
        rlfsiqarku(new gtknphoqwx(bool));
        return this;
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf ntlheqmsrt(Number number) {
        if (number == null) {
            return jyumaefscl();
        }
        if (!rgvfuqvkyq()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        rlfsiqarku(new gtknphoqwx(number));
        return this;
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf nufgyqmvbu() {
        btonecajqb btonecajqbVar = new btonecajqb();
        rlfsiqarku(btonecajqbVar);
        this.f25106iozdgvuglv.add(btonecajqbVar);
        return this;
    }

    public nufgyqmvbu okpsazkaxt() {
        if (this.f25106iozdgvuglv.isEmpty()) {
            return this.f25108wwaezpbzkn;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f25106iozdgvuglv);
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf ulzqkzuiru(String str) {
        if (str == null) {
            return jyumaefscl();
        }
        rlfsiqarku(new gtknphoqwx(str));
        return this;
    }

    @Override // ce.ppxfxbqfkf
    public ppxfxbqfkf wypolnanlu(double d13) {
        if (rgvfuqvkyq() || !(Double.isNaN(d13) || Double.isInfinite(d13))) {
            rlfsiqarku(new gtknphoqwx(Double.valueOf(d13)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d13);
    }
}
