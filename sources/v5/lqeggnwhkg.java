package v5;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.zdlpuopuiu;
import u5.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg implements dxjokdxxww {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final SQLiteProgram f116064zdlpuopuiu;

    public lqeggnwhkg(SQLiteProgram delegate) {
        zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f116064zdlpuopuiu = delegate;
    }

    @Override // u5.dxjokdxxww
    public void N(int i13) {
        this.f116064zdlpuopuiu.bindNull(i13);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f116064zdlpuopuiu.close();
    }

    @Override // u5.dxjokdxxww
    public void e(int i13, String value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.f116064zdlpuopuiu.bindString(i13, value);
    }

    @Override // u5.dxjokdxxww
    public void jpowsppfya(int i13, double d13) {
        this.f116064zdlpuopuiu.bindDouble(i13, d13);
    }

    @Override // u5.dxjokdxxww
    public void s(int i13, long j13) {
        this.f116064zdlpuopuiu.bindLong(i13, j13);
    }

    @Override // u5.dxjokdxxww
    public void y(int i13, byte[] value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.f116064zdlpuopuiu.bindBlob(i13, value);
    }
}
