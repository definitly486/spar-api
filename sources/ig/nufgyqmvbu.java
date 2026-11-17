package ig;

import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu implements Externalizable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f42494jyumaefscl = new iobyxmoadg(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f42495yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Collection f42496zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public nufgyqmvbu(Collection collection, int i13) {
        zdlpuopuiu.btonecajqb(collection, "collection");
        this.f42496zdlpuopuiu = collection;
        this.f42495yggfygwlhe = i13;
    }

    private final Object readResolve() {
        return this.f42496zdlpuopuiu;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        Set setIobyxmoadg;
        zdlpuopuiu.btonecajqb(input, "input");
        byte b13 = input.readByte();
        int i13 = b13 & 1;
        if ((b13 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b13) + '.');
        }
        int i14 = input.readInt();
        if (i14 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i14 + '.');
        }
        int i15 = 0;
        if (i13 == 0) {
            List listWkgbmnqykc = jyumaefscl.wkgbmnqykc(i14);
            while (i15 < i14) {
                listWkgbmnqykc.add(input.readObject());
                i15++;
            }
            setIobyxmoadg = jyumaefscl.iobyxmoadg(listWkgbmnqykc);
        } else {
            if (i13 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i13 + '.');
            }
            Set setPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf(i14);
            while (i15 < i14) {
                setPpxfxbqfkf.add(input.readObject());
                i15++;
            }
            setIobyxmoadg = ikoacuggdj.iobyxmoadg(setPpxfxbqfkf);
        }
        this.f42496zdlpuopuiu = setIobyxmoadg;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        zdlpuopuiu.btonecajqb(output, "output");
        output.writeByte(this.f42495yggfygwlhe);
        output.writeInt(this.f42496zdlpuopuiu.size());
        Iterator it = this.f42496zdlpuopuiu.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
