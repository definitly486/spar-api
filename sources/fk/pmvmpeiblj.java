package fk;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class pmvmpeiblj implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Enum[] f34219iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f34220ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private dk.gxszxtbevo f34221zoijcleaow;

    public pmvmpeiblj(final String serialName, Enum[] values) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
        this.f34219iobyxmoadg = values;
        this.f34220ppxfxbqfkf = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: fk.lereixgezr
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return pmvmpeiblj.nufgyqmvbu(this.f34198zdlpuopuiu, serialName);
            }
        });
    }

    private final dk.gxszxtbevo lqeggnwhkg(String str) {
        esjtqupxsv esjtqupxsvVar = new esjtqupxsv(str, this.f34219iobyxmoadg.length);
        for (Enum r13 : this.f34219iobyxmoadg) {
            iyctptxqzt.rgvfuqvkyq(esjtqupxsvVar, r13.name(), false, 2, null);
        }
        return esjtqupxsvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo nufgyqmvbu(pmvmpeiblj pmvmpeibljVar, String str) {
        dk.gxszxtbevo gxszxtbevoVar = pmvmpeibljVar.f34221zoijcleaow;
        return gxszxtbevoVar == null ? pmvmpeibljVar.lqeggnwhkg(str) : gxszxtbevoVar;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, Enum value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        int iRoivzttewh = hg.agtfadlqog.roivzttewh(this.f34219iobyxmoadg, value);
        if (iRoivzttewh != -1) {
            encoder.wflxmlrfwp(iobyxmoadg(), iRoivzttewh);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(value);
        sb3.append(" is not a valid enum ");
        sb3.append(iobyxmoadg().nufgyqmvbu());
        sb3.append(", must be one of ");
        String string = Arrays.toString(this.f34219iobyxmoadg);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        sb3.append(string);
        throw new SerializationException(sb3.toString());
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public Enum zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        int iOxmwwwfdhm = decoder.oxmwwwfdhm(iobyxmoadg());
        if (iOxmwwwfdhm >= 0) {
            Enum[] enumArr = this.f34219iobyxmoadg;
            if (iOxmwwwfdhm < enumArr.length) {
                return enumArr[iOxmwwwfdhm];
            }
        }
        throw new SerializationException(iOxmwwwfdhm + " is not among valid " + iobyxmoadg().nufgyqmvbu() + " enum values, values size is " + this.f34219iobyxmoadg.length);
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return (dk.gxszxtbevo) this.f34220ppxfxbqfkf.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + iobyxmoadg().nufgyqmvbu() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pmvmpeiblj(String serialName, Enum[] values, dk.gxszxtbevo descriptor) {
        this(serialName, values);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        this.f34221zoijcleaow = descriptor;
    }
}
