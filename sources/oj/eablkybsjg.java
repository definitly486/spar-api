package oj;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class eablkybsjg implements Externalizable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f72974jyumaefscl = new iobyxmoadg(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f72975yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f72976zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public eablkybsjg(long j13, long j14) {
        this.f72976zdlpuopuiu = j13;
        this.f72975yggfygwlhe = j14;
    }

    private final Object readResolve() {
        return zoijcleaow.f72979jyumaefscl.iobyxmoadg(this.f72976zdlpuopuiu, this.f72975yggfygwlhe);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        zdlpuopuiu.btonecajqb(input, "input");
        this.f72976zdlpuopuiu = input.readLong();
        this.f72975yggfygwlhe = input.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        zdlpuopuiu.btonecajqb(output, "output");
        output.writeLong(this.f72976zdlpuopuiu);
        output.writeLong(this.f72975yggfygwlhe);
    }
}
