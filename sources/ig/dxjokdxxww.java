package ig;

import hg.tzroggbefp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class dxjokdxxww implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f42489yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Map f42490zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public dxjokdxxww(Map map) {
        zdlpuopuiu.btonecajqb(map, "map");
        this.f42490zdlpuopuiu = map;
    }

    private final Object readResolve() {
        return this.f42490zdlpuopuiu;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        zdlpuopuiu.btonecajqb(input, "input");
        byte b13 = input.readByte();
        if (b13 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b13));
        }
        int i13 = input.readInt();
        if (i13 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i13 + '.');
        }
        Map mapWkgbmnqykc = tzroggbefp.wkgbmnqykc(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            mapWkgbmnqykc.put(input.readObject(), input.readObject());
        }
        this.f42490zdlpuopuiu = tzroggbefp.zoijcleaow(mapWkgbmnqykc);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        zdlpuopuiu.btonecajqb(output, "output");
        output.writeByte(0);
        output.writeInt(this.f42490zdlpuopuiu.size());
        for (Map.Entry entry : this.f42490zdlpuopuiu.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
