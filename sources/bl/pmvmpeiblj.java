package bl;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class pmvmpeiblj implements wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public boolean f16736jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final ppxfxbqfkf f16737yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final iozdgvuglv f16738zdlpuopuiu;

    public pmvmpeiblj(iozdgvuglv sink) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        this.f16738zdlpuopuiu = sink;
        this.f16737yggfygwlhe = new ppxfxbqfkf();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc I(long j13) {
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.I(j13);
        return iobyxmoadg();
    }

    @Override // bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f16736jyumaefscl) {
            return;
        }
        if (this.f16737yggfygwlhe.dsvhmnatus() > 0) {
            iozdgvuglv iozdgvuglvVar = this.f16738zdlpuopuiu;
            ppxfxbqfkf ppxfxbqfkfVar = this.f16737yggfygwlhe;
            iozdgvuglvVar.zeieaojujs(ppxfxbqfkfVar, ppxfxbqfkfVar.dsvhmnatus());
        }
        th = null;
        try {
            this.f16738zdlpuopuiu.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f16736jyumaefscl = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // bl.wkgbmnqykc, bl.iozdgvuglv, java.io.Flushable
    public void flush() {
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        if (this.f16737yggfygwlhe.dsvhmnatus() > 0) {
            iozdgvuglv iozdgvuglvVar = this.f16738zdlpuopuiu;
            ppxfxbqfkf ppxfxbqfkfVar = this.f16737yggfygwlhe;
            iozdgvuglvVar.zeieaojujs(ppxfxbqfkfVar, ppxfxbqfkfVar.dsvhmnatus());
        }
        this.f16738zdlpuopuiu.flush();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc gtknphoqwx(byte[] source, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.gtknphoqwx(source, i13, i14);
        return iobyxmoadg();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc hcddaimhww(int i13) {
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.hcddaimhww(i13);
        return iobyxmoadg();
    }

    public wkgbmnqykc iobyxmoadg() {
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        long jLqeggnwhkg = this.f16737yggfygwlhe.lqeggnwhkg();
        if (jLqeggnwhkg > 0) {
            this.f16738zdlpuopuiu.zeieaojujs(this.f16737yggfygwlhe, jLqeggnwhkg);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f16736jyumaefscl;
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc ixidwrxhsl(long j13) {
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.ixidwrxhsl(j13);
        return iobyxmoadg();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc j(int i13) {
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.j(i13);
        return iobyxmoadg();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc metgxyhuhe(String string) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.metgxyhuhe(string);
        return iobyxmoadg();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc o(int i13) {
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.o(i13);
        return iobyxmoadg();
    }

    @Override // bl.iozdgvuglv
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16738zdlpuopuiu.ppxfxbqfkf();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc sflfametgt(String string, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.sflfametgt(string, i13, i14);
        return iobyxmoadg();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc skhdrjzrfn(byte[] source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.skhdrjzrfn(source);
        return iobyxmoadg();
    }

    @Override // bl.wkgbmnqykc
    public wkgbmnqykc t(gxszxtbevo byteString) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(byteString, "byteString");
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.t(byteString);
        return iobyxmoadg();
    }

    public String toString() {
        return "buffer(" + this.f16738zdlpuopuiu + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f16737yggfygwlhe.write(source);
        iobyxmoadg();
        return iWrite;
    }

    @Override // bl.iozdgvuglv
    public void zeieaojujs(ppxfxbqfkf source, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        if (this.f16736jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        this.f16737yggfygwlhe.zeieaojujs(source, j13);
        iobyxmoadg();
    }

    @Override // bl.wkgbmnqykc
    public ppxfxbqfkf zoijcleaow() {
        return this.f16737yggfygwlhe;
    }
}
