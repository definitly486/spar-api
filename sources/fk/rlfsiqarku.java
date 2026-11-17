package fk;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class rlfsiqarku implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f34226iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f34227ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f34228zoijcleaow;

    public rlfsiqarku(final String serialName, Object objectInstance) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objectInstance, "objectInstance");
        this.f34226iobyxmoadg = objectInstance;
        this.f34228zoijcleaow = hg.jyumaefscl.wflxmlrfwp();
        this.f34227ppxfxbqfkf = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new tg.iobyxmoadg() { // from class: fk.xrmfcynszj
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return rlfsiqarku.nufgyqmvbu(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(rlfsiqarku rlfsiqarkuVar, dk.iobyxmoadg buildSerialDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.nufgyqmvbu(rlfsiqarkuVar.f34228zoijcleaow);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo nufgyqmvbu(String str, final rlfsiqarku rlfsiqarkuVar) {
        return dk.wflxmlrfwp.lqeggnwhkg(str, dk.ojitshcjhn.wkgbmnqykc.f29097iobyxmoadg, new dk.gxszxtbevo[0], new tg.draadjrbmk() { // from class: fk.metgxyhuhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return rlfsiqarku.dxjokdxxww(this.f34206zdlpuopuiu, (dk.iobyxmoadg) obj);
            }
        });
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return (dk.gxszxtbevo) this.f34227ppxfxbqfkf.getValue();
    }

    @Override // bk.agtfadlqog
    public void wkgbmnqykc(ek.gxszxtbevo encoder, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        encoder.ppxfxbqfkf(iobyxmoadg()).zoijcleaow(iobyxmoadg());
    }

    @Override // bk.iobyxmoadg
    public Object zoijcleaow(ek.eablkybsjg decoder) {
        int iYadqdtsiqt;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = iobyxmoadg();
        ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVarIobyxmoadg);
        if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt() || (iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(iobyxmoadg())) == -1) {
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVarIobyxmoadg);
            return this.f34226iobyxmoadg;
        }
        throw new SerializationException("Unexpected index " + iYadqdtsiqt);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rlfsiqarku(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objectInstance, "objectInstance");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classAnnotations, "classAnnotations");
        this.f34228zoijcleaow = hg.agtfadlqog.gxszxtbevo(classAnnotations);
    }
}
